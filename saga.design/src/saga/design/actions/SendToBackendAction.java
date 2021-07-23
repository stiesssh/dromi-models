package saga.design.actions;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Responsible for sending the selected System to the backend.
 * 
 * @author maumau
 *
 */
public class SendToBackendAction implements IExternalJavaAction {

	// endpoint to post model to
	private static java.net.URI uri = java.net.URI.create("http://localhost:8083/api/model");
	// path where the model is saved
	static Path path = Paths.get("/runtime-EclipseApplication/asdfghjkl/My.saga", ""); ///home/maumau/runtime-EclipseApplication/
	
	public static void setUri(String uriAsString) {
		SendToBackendAction.uri = java.net.URI.create(uriAsString);
	}
	
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
					post(systemXML);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		System.out.println("fuck you send oto backend");
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;// selections.stream().anyMatch(o -> o instanceof System);
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
	private void post(String xml) {
		try {
			HttpClient httpClient = HttpClient.newBuilder().build();
			
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
