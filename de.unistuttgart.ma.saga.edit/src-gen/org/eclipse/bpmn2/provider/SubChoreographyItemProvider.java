/**
 */
package org.eclipse.bpmn2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.SubChoreography;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.SubChoreography} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubChoreographyItemProvider extends ChoreographyActivityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubChoreographyItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getFlowElementsContainer_LaneSets());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getSubChoreography_Artifacts());
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
	 * This returns SubChoreography.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SubChoreography"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SubChoreography)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SubChoreography_type") :
			getString("_UI_SubChoreography_type") + " " + label;
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

		switch (notification.getFeatureID(SubChoreography.class)) {
			case Bpmn2Package.SUB_CHOREOGRAPHY__LANE_SETS:
			case Bpmn2Package.SUB_CHOREOGRAPHY__FLOW_ELEMENTS:
			case Bpmn2Package.SUB_CHOREOGRAPHY__ARTIFACTS:
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
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_LaneSets(),
				 Bpmn2Factory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getFlowElementsContainer_FlowElements(),
				 Bpmn2Factory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getSubChoreography_Artifacts(),
				 Bpmn2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getSubChoreography_Artifacts(),
				 Bpmn2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getSubChoreography_Artifacts(),
				 Bpmn2Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getSubChoreography_Artifacts(),
				 Bpmn2Factory.eINSTANCE.createTextAnnotation()));
	}

}