package saga.design;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.AbstractLayoutEditPartProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.ordering.ViewOrdering;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.AbstractLayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.CompoundLayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.GridLayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.LayoutProvider;
import org.eclipse.sirius.diagram.ui.tools.api.layout.provider.LineLayoutProvider;


/**
 * Layout edit parts in line according to the {@link ViewOrdering} to use.
 * 
 * @author ymortier
 */
//public class FooLayoutProvider extends LineLayoutProvider implements LayoutProvider {
public class FooLayoutProvider implements LayoutProvider {

	private AbstractLayoutEditPartProvider layoutNodeProvider; 
	
	@Override
	public boolean provides(IGraphicalEditPart container) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public AbstractLayoutEditPartProvider getLayoutNodeProvider(IGraphicalEditPart container) {
		// TODO Auto-generated method stub
		 if (this.layoutNodeProvider == null) {
	            this.layoutNodeProvider = new LineLayoutProvider();
	        }
	        return this.layoutNodeProvider;
	}

	@Override
	public boolean isDiagramLayoutProvider() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
