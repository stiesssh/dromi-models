package de.unistuttgart.ma.importer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.unistuttgart.ma.saga.System;
import de.unistuttgart.ma.saga.presentation.Literals;

public class BackendImporter {

	private String hostUri;
	private HttpClient httpClient;

	public BackendImporter(String uri) {
		this.hostUri = uri;
		this.httpClient = HttpClient.newBuilder().build();
	}

	/**
	 * 
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public System getSystem(ImportRequest importRequest) throws IOException, InterruptedException {
		URI requestUri = URI.create(hostUri + Literals.backendPostModelEndpoint);

		ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		String importRequestJson = mapper.writeValueAsString(importRequest);

		HttpRequest request = HttpRequest.newBuilder().POST(BodyPublishers.ofString(importRequestJson)).uri(requestUri)
				.header("Content-Type", "application/json").build();
		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

		if (response.statusCode() != 200) {
			throw new IOException("Reuqest failed with " + response.statusCode() + ". Body:\n" + response.body());
		}

		String body = response.body();

		return parseSystem(body);
	}

	/**
	 * 
	 * @param xml
	 * @return
	 */
	public System parseSystem(String xml) {
		InputStream targetStream = new ByteArrayInputStream(xml.getBytes());
		// selbes set wie system, um proxies zu resolven.
		ResourceSet set = new ResourceSetImpl();
		Resource resource = set
				.getResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI("foo.saga", false), false);
		if (resource == null) {
			resource = set.createResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI("foo.saga", false));
		}

		try {
			resource.load(targetStream, null);
			for (EObject eObject : resource.getContents()) {
				if (eObject instanceof System) {
					return (System) eObject;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
