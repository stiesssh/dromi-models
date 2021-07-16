package saga.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.ui.PlatformUI;

import de.unistuttgart.ma.saga.Project;
import de.unistuttgart.ma.saga.SagaFactory;



public class JavaActions1 implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		// TODO Auto-generated method stub
//		Project p = (Project) selections.stream().filter(o -> o instanceof Project).findFirst().get();
//		
//		p.getComponents().add(SagaFactory.eINSTANCE.createComponentAdapter());
		
		System.out.println("hello world");
		
		
		

	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		// TODO Auto-generated method stub
		return selections.stream().anyMatch(o -> o instanceof Project);
	}

}
