/**
 */
package de.unistuttgart.ma.saga.provider;


import de.unistuttgart.gropius.GropiusFactory;

import de.unistuttgart.gropius.slo.SloFactory;

import de.unistuttgart.ma.saga.SagaFactory;
import de.unistuttgart.ma.saga.SagaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn2.Bpmn2Factory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.unistuttgart.ma.saga.System} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemItemProvider extends IdentifiableElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SagaPackage.Literals.SYSTEM__SAGAS);
			childrenFeatures.add(SagaPackage.Literals.SYSTEM__PROCESSES);
			childrenFeatures.add(SagaPackage.Literals.SYSTEM__ARCHITECTURE);
			childrenFeatures.add(SagaPackage.Literals.SYSTEM__SLO_RULES);
			childrenFeatures.add(SagaPackage.Literals.SYSTEM__CONNECTORS);
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
	 * This returns System.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/System"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((de.unistuttgart.ma.saga.System)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_System_type") :
			getString("_UI_System_type") + " " + label;
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

		switch (notification.getFeatureID(de.unistuttgart.ma.saga.System.class)) {
			case SagaPackage.SYSTEM__SAGAS:
			case SagaPackage.SYSTEM__PROCESSES:
			case SagaPackage.SYSTEM__ARCHITECTURE:
			case SagaPackage.SYSTEM__SLO_RULES:
			case SagaPackage.SYSTEM__CONNECTORS:
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
				(SagaPackage.Literals.SYSTEM__SAGAS,
				 SagaFactory.eINSTANCE.createSaga()));

		newChildDescriptors.add
			(createChildParameter
				(SagaPackage.Literals.SYSTEM__PROCESSES,
				 Bpmn2Factory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(SagaPackage.Literals.SYSTEM__ARCHITECTURE,
				 GropiusFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(SagaPackage.Literals.SYSTEM__SLO_RULES,
				 SloFactory.eINSTANCE.createSloRule()));

		newChildDescriptors.add
			(createChildParameter
				(SagaPackage.Literals.SYSTEM__CONNECTORS,
				 SagaFactory.eINSTANCE.createConnector()));
	}

}
