package de.unistuttgart.ma.importer.backend;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import de.unistuttgart.ma.saga.presentation.Literals;

public class BackendImporter{
		
	private URI requestUri;
	private HttpClient httpClient;
	
	
	public BackendImporter(String uri, String filename) {
		this.requestUri = URI.create(uri + Literals.backendGetModelIdEndpoint + filename);
		this.httpClient = HttpClient.newBuilder().build();
	}
	
	public String getId() throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder().GET().uri(requestUri).build();
		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
		
		if(response.statusCode() != 200) {
			throw new IOException("Reuqest failed with " + response.statusCode() + ". Body:\n" + response.body());
		}
		
		String body = response.body();
		
		return body;
	}
	

}
