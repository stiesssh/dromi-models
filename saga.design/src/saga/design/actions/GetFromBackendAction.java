package saga.design.actions;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import de.unistuttgart.ma.saga.impact.ImpactPackage;
import de.unistuttgart.ma.saga.impact.Notification;

/**
 * Responsible for sending the selected System to the backend.
 * 
 * @author maumau
 *
 */
public class GetFromBackendAction implements IExternalJavaAction {
	
	private static java.net.URI uri = java.net.URI.create("http://localhost:8083/api/notification");
	
	public static void setUri(String uriAsString) {
		GetFromBackendAction.uri = java.net.URI.create(uriAsString);
	}
	

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		if (!selections.stream().anyMatch(o -> o instanceof de.unistuttgart.ma.saga.System)) {
			throw new IllegalArgumentException(String.format("selection contains not instance of %s", de.unistuttgart.ma.saga.System.class));
		}

		Notification n = getNotification();
		if (n == null) {
			return;
		}
		
		for (EObject eObject : selections) {
			if (eObject instanceof de.unistuttgart.ma.saga.System) {
				de.unistuttgart.ma.saga.System system = (de.unistuttgart.ma.saga.System) eObject;
				system.getNotifications().add(n);
			}
		}
		
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return true;// selections.stream().anyMatch(o -> o instanceof System);
	}

	/**
	 * Get notification from to the back end.
	 * 
	 * @param System
	 */
	private Notification getNotification() {
		Notification notification = null;
		try {

			HttpClient httpClient = HttpClient.newBuilder().build();

			HttpRequest request = HttpRequest.newBuilder().GET().uri(uri).build();
			HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

			// check status code
			if (response.statusCode() != 200) {
				System.out.println("Request failed");
				// TODO handle properly 
			}
			
			String body = response.body();
			notification = parse(body);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return notification;
	}

	private Notification parse(String xml) {

		InputStream targetStream = new ByteArrayInputStream(xml.getBytes());

		// RessourceSet necessacry because it still manages the ressources
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("impact", new EcoreResourceFactoryImpl());
		ImpactPackage packageInstance = ImpactPackage.eINSTANCE;
		ResourceSet set = new ResourceSetImpl();

		Notification newNotification = null;
		URI uri = URI.createFileURI("foo.impact"); // only file extension is of relevance, because we change ressource later on.
		Resource resource = set.createResource(uri);
		try {
			resource.load(targetStream, null);

			for (EObject eObject : resource.getContents()) {
				if (eObject instanceof Notification) {
					newNotification = (Notification) eObject;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return newNotification;
	}

}
