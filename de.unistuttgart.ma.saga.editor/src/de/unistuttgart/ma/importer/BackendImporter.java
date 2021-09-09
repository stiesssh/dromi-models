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

/**
 * The {@code BackendImporter} handles communication with the back end.
 */
public class BackendImporter {

	private String hostUri;
	private HttpClient httpClient;

	public BackendImporter(String uri) {
		this.hostUri = uri;
		this.httpClient = HttpClient.newBuilder().build();
	}

	/**
	 * Get a model of the system from the backend.
	 * 
	 * The back end does the importing of architecture, process and slo rules and
	 * returns the merged model to this editor.
	 * 
	 * @param importRequest Request with all the information for the backend.
	 * @return model of the system
	 * @throws IOException
	 * @throws InterruptedException
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
	 * Deserialize a {@link System} from its xml representation.
	 * 
	 * @param xml xml representation of the system
	 * @return model of the system
	 */
	public System parseSystem(String xml) {
		InputStream targetStream = new ByteArrayInputStream(xml.getBytes());

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
			e.printStackTrace();
		}
		return null;
	}
}
