/**
 */
package de.unistuttgart.gropius.impl;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.Issue;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentInterfaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentInterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentInterfaceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentInterfaceImpl#getIssueOnLocation <em>Issue On Location</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentInterfaceImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentInterfaceImpl#getConsumedBy <em>Consumed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInterfaceImpl extends MinimalEObjectImpl.Container implements ComponentInterface {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssueOnLocation() <em>Issue On Location</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueOnLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issueOnLocation;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Component component;

	/**
	 * The cached value of the '{@link #getConsumedBy() <em>Consumed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> consumedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GropiusPackage.Literals.COMPONENT_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT_INTERFACE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT_INTERFACE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT_INTERFACE__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getIssueOnLocation() {
		if (issueOnLocation == null) {
			issueOnLocation = new EObjectResolvingEList<Issue>(Issue.class, this,
					GropiusPackage.COMPONENT_INTERFACE__ISSUE_ON_LOCATION);
		}
		return issueOnLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (Component) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GropiusPackage.COMPONENT_INTERFACE__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Component newComponent) {
		Component oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT_INTERFACE__COMPONENT,
					oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getConsumedBy() {
		if (consumedBy == null) {
			consumedBy = new EObjectResolvingEList<Component>(Component.class, this,
					GropiusPackage.COMPONENT_INTERFACE__CONSUMED_BY);
		}
		return consumedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GropiusPackage.COMPONENT_INTERFACE__ID:
			return getId();
		case GropiusPackage.COMPONENT_INTERFACE__NAME:
			return getName();
		case GropiusPackage.COMPONENT_INTERFACE__DESCRIPTION:
			return getDescription();
		case GropiusPackage.COMPONENT_INTERFACE__ISSUE_ON_LOCATION:
			return getIssueOnLocation();
		case GropiusPackage.COMPONENT_INTERFACE__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case GropiusPackage.COMPONENT_INTERFACE__CONSUMED_BY:
			return getConsumedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GropiusPackage.COMPONENT_INTERFACE__ID:
			setId((String) newValue);
			return;
		case GropiusPackage.COMPONENT_INTERFACE__NAME:
			setName((String) newValue);
			return;
		case GropiusPackage.COMPONENT_INTERFACE__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GropiusPackage.COMPONENT_INTERFACE__ISSUE_ON_LOCATION:
			getIssueOnLocation().clear();
			getIssueOnLocation().addAll((Collection<? extends Issue>) newValue);
			return;
		case GropiusPackage.COMPONENT_INTERFACE__COMPONENT:
			setComponent((Component) newValue);
			return;
		case GropiusPackage.COMPONENT_INTERFACE__CONSUMED_BY:
			getConsumedBy().clear();
			getConsumedBy().addAll((Collection<? extends Component>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GropiusPackage.COMPONENT_INTERFACE__ID:
			setId(ID_EDEFAULT);
			return;
		case GropiusPackage.COMPONENT_INTERFACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GropiusPackage.COMPONENT_INTERFACE__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GropiusPackage.COMPONENT_INTERFACE__ISSUE_ON_LOCATION:
			getIssueOnLocation().clear();
			return;
		case GropiusPackage.COMPONENT_INTERFACE__COMPONENT:
			setComponent((Component) null);
			return;
		case GropiusPackage.COMPONENT_INTERFACE__CONSUMED_BY:
			getConsumedBy().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GropiusPackage.COMPONENT_INTERFACE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GropiusPackage.COMPONENT_INTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GropiusPackage.COMPONENT_INTERFACE__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GropiusPackage.COMPONENT_INTERFACE__ISSUE_ON_LOCATION:
			return issueOnLocation != null && !issueOnLocation.isEmpty();
		case GropiusPackage.COMPONENT_INTERFACE__COMPONENT:
			return component != null;
		case GropiusPackage.COMPONENT_INTERFACE__CONSUMED_BY:
			return consumedBy != null && !consumedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ComponentInterfaceImpl
