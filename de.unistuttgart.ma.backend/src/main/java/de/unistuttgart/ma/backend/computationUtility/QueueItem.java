package de.unistuttgart.ma.backend.computationUtility;
 
import org.eclipse.bpmn2.Task;
import org.eclipse.emf.ecore.EObject;

import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.slo.Alert;
import de.unistuttgart.ma.saga.SagaStep;
import de.unistuttgart.ma.saga.impact.Impact;

/**
 * 
 * The sole reason of existens of this class is, that the impact caclulcation at
 * the CoreService happens in the opposite direction to the linking of the
 * impact chain and thus at each iteration of the calculation the precious
 * impact must be known. and the easiest ways to achiev this seemed to also put
 * it into the queue.
 * 
 * @author maumau
 *
 */
public class QueueItem {
	public final EObject cause;
	public final EObject location;
	
	public QueueItem(EObject cause, EObject location) {
		super();
		this.cause = cause;
		this.location = location;
	}
	
	// TODO : what about those class cast exceptions??
	public EObject getCause() {
		return cause;
	}
	public Alert getCauseAsAlert() {
		return (Alert) cause;
	}
	public Impact getCauseAsImpact() {
		return (Impact) cause;
	}
	public ComponentInterface getLocationAsFace() {
		return (ComponentInterface) location;
	}
	public SagaStep getLocationAsStep() {
		return (SagaStep) location;
	}
	public Task getLocationAsTask() {
		return (Task) location;
	}
}
