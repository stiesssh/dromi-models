/**
 */
package org.eclipse.bpmn2.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.ThrowEvent;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.ThrowEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThrowEventItemProvider extends EventItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowEventItemProvider(AdapterFactory adapterFactory) {
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

			addEventDefinitionRefsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Event Definition Refs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventDefinitionRefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThrowEvent_eventDefinitionRefs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThrowEvent_eventDefinitionRefs_feature", "_UI_ThrowEvent_type"),
				 Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitionRefs(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getThrowEvent_DataInputs());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getThrowEvent_DataInputAssociation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getThrowEvent_InputSet());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions());
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ThrowEvent)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ThrowEvent_type") :
			getString("_UI_ThrowEvent_type") + " " + label;
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

		switch (notification.getFeatureID(ThrowEvent.class)) {
			case Bpmn2Package.THROW_EVENT__DATA_INPUTS:
			case Bpmn2Package.THROW_EVENT__DATA_INPUT_ASSOCIATION:
			case Bpmn2Package.THROW_EVENT__INPUT_SET:
			case Bpmn2Package.THROW_EVENT__EVENT_DEFINITIONS:
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
				(Bpmn2Package.eINSTANCE.getThrowEvent_DataInputs(),
				 Bpmn2Factory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_DataInputAssociation(),
				 Bpmn2Factory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_InputSet(),
				 Bpmn2Factory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions(),
				 Bpmn2Factory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions(),
				 Bpmn2Factory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions(),
				 Bpmn2Factory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions(),
				 Bpmn2Factory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions(),
				 Bpmn2Factory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions(),
				 Bpmn2Factory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions(),
				 Bpmn2Factory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions(),
				 Bpmn2Factory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions(),
				 Bpmn2Factory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions(),
				 Bpmn2Factory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getThrowEvent_EventDefinitions(),
				 Bpmn2Factory.eINSTANCE.createTimerEventDefinition()));
	}

}