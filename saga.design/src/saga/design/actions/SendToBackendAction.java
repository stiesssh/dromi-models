package saga.design.actions;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Responsible for sending the selected System to the backend.
 * 
 * @author maumau
 *
 */
public class SendToBackendAction implements IExternalJavaAction {

//	// endpoint to post model to
//	private static java.net.URI uri = java.net.URI.create("http://localhost:8083/api/model");
//	// path where the model is saved
//	static Path path = Paths.get("/runtime-EclipseApplication/asdfghjkl/My.saga", ""); ///home/maumau/runtime-EclipseApplication/
	
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		if (!selections.stream().anyMatch(o -> o instanceof de.unistuttgart.ma.saga.System)) {
			throw new IllegalArgumentException(String.format("selection contains not instance of %s", de.unistuttgart.ma.saga.System.class));
		}
		
		for (EObject eObject : selections) {
			if (eObject instanceof de.unistuttgart.ma.saga.System) {
				de.unistuttgart.ma.saga.System system = (de.unistuttgart.ma.saga.System) eObject;
				
				String systemXML;
				try {
					systemXML = serialize(system);
					URI ressourceUri = system.eResource().getURI();
					post(systemXML, ressourceUri.segment(ressourceUri.segmentCount() - 1));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return selections.stream().anyMatch(o -> o instanceof de.unistuttgart.ma.saga.System);
	}
	
	/**
	 *
	 * Serialises the System to String
	 * 
	 * @param System
	 * @return
	 * @throws IOException 
	 */
	private String serialize(de.unistuttgart.ma.saga.System system) throws IOException {   
	
		Resource resource = system.eResource(); 
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(); 
		resource.getContents().add(system);

		resource.save(outputStream, null);
		
		String xml = outputStream.toString(StandardCharsets.UTF_8);
		
		return xml;
	}
	
	/**
	 * Posts a serialised System to the back end.
	 * 
	 * @param xml
	 */
	private void post(String xml, String filename) {
		try {
			HttpClient httpClient = HttpClient.newBuilder().build();
			
			//java.net.URI uri = java.net.URI.create(Literals.backendGetModelIdEndpoint + filename);
			java.net.URI uri = java.net.URI.create("http://localhost:8083/api/model/" + filename);
			
			HttpRequest request = HttpRequest.newBuilder().POST(BodyPublishers.ofString(xml)).uri(uri).build();
			httpClient.send(request, BodyHandlers.ofString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
