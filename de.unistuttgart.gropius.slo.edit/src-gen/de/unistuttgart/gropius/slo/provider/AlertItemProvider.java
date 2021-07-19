/**
 */
package de.unistuttgart.gropius.slo.provider;

import de.unistuttgart.gropius.slo.Alert;
import de.unistuttgart.gropius.slo.SloPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.unistuttgart.gropius.slo.Alert} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AlertItemProvider extends ModelElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addSloIdPropertyDescriptor(object);
			addSloNamePropertyDescriptor(object);
			addGropiusComponentIdPropertyDescriptor(object);
			addGropiusProjectIdPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addGropiusComponentInterfaceIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Alert_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Alert_name_feature", "_UI_Alert_type"),
						SloPackage.Literals.ALERT__NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Slo Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSloIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Alert_sloId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Alert_sloId_feature", "_UI_Alert_type"),
						SloPackage.Literals.ALERT__SLO_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Slo Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSloNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Alert_sloName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Alert_sloName_feature", "_UI_Alert_type"),
						SloPackage.Literals.ALERT__SLO_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Gropius Component Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGropiusComponentIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Alert_gropiusComponentId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Alert_gropiusComponentId_feature",
								"_UI_Alert_type"),
						SloPackage.Literals.ALERT__GROPIUS_COMPONENT_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Gropius Project Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGropiusProjectIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Alert_gropiusProjectId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Alert_gropiusProjectId_feature",
								"_UI_Alert_type"),
						SloPackage.Literals.ALERT__GROPIUS_PROJECT_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Alert_value_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Alert_value_feature", "_UI_Alert_type"),
						SloPackage.Literals.ALERT__VALUE, true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Gropius Component Interface Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGropiusComponentInterfaceIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Alert_gropiusComponentInterfaceId_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Alert_gropiusComponentInterfaceId_feature",
								"_UI_Alert_type"),
						SloPackage.Literals.ALERT__GROPIUS_COMPONENT_INTERFACE_ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Alert.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Alert"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Alert) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Alert_type")
				: getString("_UI_Alert_type") + " " + label;
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

		switch (notification.getFeatureID(Alert.class)) {
		case SloPackage.ALERT__NAME:
		case SloPackage.ALERT__SLO_ID:
		case SloPackage.ALERT__SLO_NAME:
		case SloPackage.ALERT__GROPIUS_COMPONENT_ID:
		case SloPackage.ALERT__GROPIUS_PROJECT_ID:
		case SloPackage.ALERT__VALUE:
		case SloPackage.ALERT__GROPIUS_COMPONENT_INTERFACE_ID:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
