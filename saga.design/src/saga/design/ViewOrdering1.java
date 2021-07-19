package saga.design;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.ui.tools.api.layout.ordering.AbstractViewOrdering;
import org.eclipse.sirius.diagram.ui.tools.api.layout.ordering.GridView;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

import de.unistuttgart.ma.saga.Saga;

public class ViewOrdering1 extends AbstractViewOrdering {
	@Override
	public GridView getSortedViewsAsGrid() {
		View[][] grid = new View[3][3];
		
		List<View> sortViews = this.getSortedViews();
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				grid[i][j] = sortViews.get(i * grid.length + j);
			}
		}
		return GridView.create(grid);
	}
	
	@Override
	protected List<View> sortViews(List<View> views) {
		Comparator<View> comparing = Comparator.comparing(new Function<View, String>() {
			@Override
			public String apply(View t) {
				DDiagramElement element = (DDiagramElement) t.getElement();
				return element.getName();
			}
		});
		Collections.sort(views, comparing);
		return views;
	}

	@Override
	public boolean isAbleToManageView(View view) {
		// TODO Auto-generated method stub
		EObject businessObject = view.getElement();
		if (businessObject instanceof DRepresentationElement) {
			EObject target = ((DRepresentationElement) businessObject).getTarget();
			if (target instanceof Saga) {
				return true;
			}
			//System.out.println(target.getClass());
			// and now i can separate between types with instance of and only sort one type...
		}
		return true;
	}
}