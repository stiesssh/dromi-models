/**
 */
package org.eclipse.bpmn2.di.provider;


import de.unistuttgart.ma.saga.provider.SagaEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn2.di.BpmnDiFactory;
import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.bpmn2.di.DocumentRoot;

import org.eclipse.dd.di.DiFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.di.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BpmnDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT);
			childrenFeatures.add(BpmnDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM);
			childrenFeatures.add(BpmnDiPackage.Literals.DOCUMENT_ROOT__EDGE);
			childrenFeatures.add(BpmnDiPackage.Literals.DOCUMENT_ROOT__LABEL);
			childrenFeatures.add(BpmnDiPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE);
			childrenFeatures.add(BpmnDiPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE);
			childrenFeatures.add(BpmnDiPackage.Literals.DOCUMENT_ROOT__NODE);
			childrenFeatures.add(BpmnDiPackage.Literals.DOCUMENT_ROOT__PLANE);
			childrenFeatures.add(BpmnDiPackage.Literals.DOCUMENT_ROOT__SHAPE);
			childrenFeatures.add(BpmnDiPackage.Literals.DOCUMENT_ROOT__STYLE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case BpmnDiPackage.DOCUMENT_ROOT__DIAGRAM_ELEMENT:
			case BpmnDiPackage.DOCUMENT_ROOT__DIAGRAM:
			case BpmnDiPackage.DOCUMENT_ROOT__EDGE:
			case BpmnDiPackage.DOCUMENT_ROOT__LABEL:
			case BpmnDiPackage.DOCUMENT_ROOT__LABELED_EDGE:
			case BpmnDiPackage.DOCUMENT_ROOT__LABELED_SHAPE:
			case BpmnDiPackage.DOCUMENT_ROOT__NODE:
			case BpmnDiPackage.DOCUMENT_ROOT__PLANE:
			case BpmnDiPackage.DOCUMENT_ROOT__SHAPE:
			case BpmnDiPackage.DOCUMENT_ROOT__STYLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
				 BpmnDiFactory.eINSTANCE.createDiagramElement()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
				 DiFactory.eINSTANCE.createBPMNEdge()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
				 DiFactory.eINSTANCE.createBPMNLabel()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
				 DiFactory.eINSTANCE.createBPMNPlane()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT,
				 DiFactory.eINSTANCE.createBPMNShape()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM,
				 DiFactory.eINSTANCE.createBPMNDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__EDGE,
				 DiFactory.eINSTANCE.createBPMNEdge()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__LABEL,
				 DiFactory.eINSTANCE.createBPMNLabel()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE,
				 DiFactory.eINSTANCE.createBPMNEdge()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE,
				 DiFactory.eINSTANCE.createBPMNShape()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__NODE,
				 DiFactory.eINSTANCE.createBPMNLabel()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__NODE,
				 DiFactory.eINSTANCE.createBPMNPlane()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__NODE,
				 DiFactory.eINSTANCE.createBPMNShape()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__PLANE,
				 DiFactory.eINSTANCE.createBPMNPlane()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__SHAPE,
				 DiFactory.eINSTANCE.createBPMNShape()));

		newChildDescriptors.add
			(createChildParameter
				(BpmnDiPackage.Literals.DOCUMENT_ROOT__STYLE,
				 DiFactory.eINSTANCE.createBPMNLabelStyle()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__DIAGRAM_ELEMENT ||
			childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__EDGE ||
			childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__LABELED_EDGE ||
			childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__LABEL ||
			childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__NODE ||
			childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__PLANE ||
			childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__LABELED_SHAPE ||
			childFeature == BpmnDiPackage.Literals.DOCUMENT_ROOT__SHAPE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SagaEditPlugin.INSTANCE;
	}

}
