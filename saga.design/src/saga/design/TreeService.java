package saga.design;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;

import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.Violation;

/**
 * The services class used by VSM.
 */
public class TreeService {

	/**
	 * get the root cause
	 * 
	 * @param self current model element
	 * @return the root cause, or null if there is none
	 */
	public EObject getRootCause(EObject self) {
		if (self instanceof Violation) {
			return self;
		}
		if (self instanceof Impact) {
			Impact current = (Impact) self;
			while (current.getCause() != null) {
				current = current.getCause();
			}
			return current;
		}
		return null;
	}
	
	public Collection<EObject> getCausingImpacts(Impact self) {
		return new BasicEList<>();
	}
}
