package de.unistuttgart.ma.importer.backend;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.Notification;
import de.unistuttgart.ma.saga.presentation.Literals;

public class BackendImporter{
		
	private String hostUri;
	private HttpClient httpClient;
	
	
	public BackendImporter(String uri) {
		this.hostUri = uri;
		this.httpClient = HttpClient.newBuilder().build();
	}
	
	/**
	 * 
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public String getId(org.eclipse.emf.common.util.URI ressourceURI) throws IOException, InterruptedException {
		
		String path = ressourceURI.toPlatformString(false);
		
		URI requestUri = URI.create(hostUri + Literals.backendGetModelIdEndpoint);

		HttpRequest request = HttpRequest.newBuilder().POST(BodyPublishers.ofString(hostUri)).uri(requestUri).build();
		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
		
		if(response.statusCode() != 200) {
			throw new IOException("Reuqest failed with " + response.statusCode() + ". Body:\n" + response.body());
		}
		
		String body = response.body();
		
		return body;
	}
	
	/**
	 * 
	 * @return
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public Notification getNotification(String systemId) throws IOException, InterruptedException {
		URI requestUri = URI.create(hostUri + Literals.backendGetNotificationEndpoint + systemId);

		HttpRequest request = HttpRequest.newBuilder().GET().uri(requestUri).build();
		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
		
		if(response.statusCode() != 200) {
			throw new IOException("Reuqest failed with " + response.statusCode() + ". Body:\n" + response.body());
		}
		
		String body = response.body();
		// loop ... 
		//return parseImpact(body);
		return parseNotification(body);
	}
	
	/**
	 * 
	 * @param xml
	 * @return
	 */
	public Impact parseImpact(String xml) {
		InputStream targetStream = new ByteArrayInputStream(xml.getBytes());
		// selbes set wie system, um proxies zu resolven. 
		ResourceSet set = new ResourceSetImpl(); 
		Resource resource = set.getResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI("foo.impact", false), false);
		if (resource == null) {
			resource = set.createResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI("foo.impact", false));
		}
		
		try {
			resource.load(targetStream, null);	
			for (EObject eObject : resource.getContents()) {
				if (eObject instanceof Impact) {
					return (Impact) eObject;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	/**
	 * 
	 * @param xml
	 * @return
	 */
	public Notification parseNotification(String xml) {
		InputStream targetStream = new ByteArrayInputStream(xml.getBytes());
		// selbes set wie system, um proxies zu resolven. 
		ResourceSet set = new ResourceSetImpl(); 
		Resource resource = set.getResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI("foo.impact", false), false);
		if (resource == null) {
			resource = set.createResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI("foo.impact", false));
		}
		
		try {
			resource.load(targetStream, null);	
			for (EObject eObject : resource.getContents()) {
				if (eObject instanceof Notification) {
					return (Notification) eObject;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	

}
