package saga.design.actions;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Responsible for sending the selected System to the backend.
 *
 */
public class SendToBackendAction implements IExternalJavaAction {

	static Boolean beenThereDoneThat = true;

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {

		// TODO remove this hack and figure out for real, why every click triggers two
		// executions.
		beenThereDoneThat = !beenThereDoneThat;
		if (beenThereDoneThat) {
			return;
		}

		if (!selections.stream().anyMatch(o -> o instanceof de.unistuttgart.ma.saga.System)) {
			throw new IllegalArgumentException(
					String.format("selection contains not instance of %s", de.unistuttgart.ma.saga.System.class));
		}

		for (EObject eObject : selections) {
			if (eObject instanceof de.unistuttgart.ma.saga.System) {
				de.unistuttgart.ma.saga.System system = (de.unistuttgart.ma.saga.System) eObject;

				String systemXML;
				try {
					systemXML = serialize(system);
					post(systemXML, system.getId());
				} catch (IOException e) {
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

			// TODO make this less hacky.
			System.out
					.println("enter url of backend and confirm with [enter] (e.g. http://localhost:8083/api/model/):");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			String url = reader.readLine();
			java.net.URI uri = java.net.URI.create(url + filename);

			HttpRequest request = HttpRequest.newBuilder().POST(BodyPublishers.ofString(xml)).uri(uri).build();
			HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
			
			if (response.statusCode() != 200) {
				throw new IOException("Reuqest failed with " + response.statusCode() + ". Body:\n" + response.body());
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}