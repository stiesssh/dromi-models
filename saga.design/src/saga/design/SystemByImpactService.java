package saga.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.bpmn2.Process;
import org.eclipse.emf.ecore.EObject;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.ma.saga.Saga;
import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.Notification;

/**
 * The services class used by VSM.
 * 
 * for each service call, a new instance of this service is created.
 * 
 * all 'self' are top level impact, because the view is restricted to top level
 * impacts.
 */
public class SystemByImpactService {
	
	public Collection<EObject> getImpactedElements(Impact self) {
		Set<EObject> elements = new HashSet<EObject>();

		Impact current = self;
		while (current != null) {
			elements.add(current.getLocation());

			if (current.getLocation() instanceof ComponentInterface) {
				elements.add(((ComponentInterface) current.getLocation()).getComponent());
			}
			
			current = current.getCause();
		}

		return elements;
	}

	public Collection<EObject> getNotImpactedElements(Impact self) {
		Set<EObject> elements = new HashSet<EObject>();
		// collect all elements
		de.unistuttgart.ma.saga.System system = ((Notification) self.eContainer()).getSystem();
		elements.addAll(system.getSagas());
		for (Saga saga : system.getSagas()) {
			elements.addAll(saga.getSteps());
		}
		elements.addAll(system.getProcesses());
		for (Process process : system.getProcesses()) {
			elements.addAll(process.getFlowElements());
		}
		elements.addAll(system.getArchitecture().getComponents());
		for (Component component : system.getArchitecture().getComponents()) {
			elements.addAll(component.getInterfaces());
		}

		elements.removeAll(getImpactedElements(self));

		return elements;
	}
}
