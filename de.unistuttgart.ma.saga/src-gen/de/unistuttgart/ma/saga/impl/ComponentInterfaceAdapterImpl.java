/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.Issue;
import de.unistuttgart.gropius.IssueLocation;
import de.unistuttgart.gropius.Node;

import de.unistuttgart.gropius.slo.SloRule;

import de.unistuttgart.ma.saga.ComponentInterfaceAdapter;
import de.unistuttgart.ma.saga.SagaPackage;
import de.unistuttgart.ma.saga.SagaStep;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Interface Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl#getSloRules <em>Slo Rules</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl#getIssueOnLocation <em>Issue On Location</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl#getConsumedBy <em>Consumed By</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentInterfaceAdapterImpl#getNextLevelElements <em>Next Level Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentInterfaceAdapterImpl extends MinimalEObjectImpl.Container implements ComponentInterfaceAdapter {
	/**
	 * The cached value of the '{@link #getSloRules() <em>Slo Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSloRules()
	 * @generated
	 * @ordered
	 */
	protected EList<SloRule> sloRules;

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
	 * The cached value of the '{@link #getNextLevelElements() <em>Next Level Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextLevelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SagaStep> nextLevelElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.COMPONENT_INTERFACE_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SloRule> getSloRules() {
		if (sloRules == null) {
			sloRules = new EObjectContainmentEList<SloRule>(SloRule.class, this, SagaPackage.COMPONENT_INTERFACE_ADAPTER__SLO_RULES);
		}
		return sloRules;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.COMPONENT_INTERFACE_ADAPTER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.COMPONENT_INTERFACE_ADAPTER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.COMPONENT_INTERFACE_ADAPTER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getIssueOnLocation() {
		if (issueOnLocation == null) {
			issueOnLocation = new EObjectResolvingEList<Issue>(Issue.class, this, SagaPackage.COMPONENT_INTERFACE_ADAPTER__ISSUE_ON_LOCATION);
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
			InternalEObject oldComponent = (InternalEObject)component;
			component = (Component)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.COMPONENT_INTERFACE_ADAPTER__COMPONENT, oldComponent, component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.COMPONENT_INTERFACE_ADAPTER__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getConsumedBy() {
		if (consumedBy == null) {
			consumedBy = new EObjectResolvingEList<Component>(Component.class, this, SagaPackage.COMPONENT_INTERFACE_ADAPTER__CONSUMED_BY);
		}
		return consumedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SagaStep> getNextLevelElements() {
		if (nextLevelElements == null) {
			nextLevelElements = new EObjectResolvingEList<SagaStep>(SagaStep.class, this, SagaPackage.COMPONENT_INTERFACE_ADAPTER__NEXT_LEVEL_ELEMENTS);
		}
		return nextLevelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__SLO_RULES:
				return ((InternalEList<?>)getSloRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__SLO_RULES:
				return getSloRules();
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__ID:
				return getId();
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__NAME:
				return getName();
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__DESCRIPTION:
				return getDescription();
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__ISSUE_ON_LOCATION:
				return getIssueOnLocation();
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__CONSUMED_BY:
				return getConsumedBy();
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__NEXT_LEVEL_ELEMENTS:
				return getNextLevelElements();
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
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__SLO_RULES:
				getSloRules().clear();
				getSloRules().addAll((Collection<? extends SloRule>)newValue);
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__ID:
				setId((String)newValue);
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__NAME:
				setName((String)newValue);
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__ISSUE_ON_LOCATION:
				getIssueOnLocation().clear();
				getIssueOnLocation().addAll((Collection<? extends Issue>)newValue);
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__COMPONENT:
				setComponent((Component)newValue);
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__CONSUMED_BY:
				getConsumedBy().clear();
				getConsumedBy().addAll((Collection<? extends Component>)newValue);
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__NEXT_LEVEL_ELEMENTS:
				getNextLevelElements().clear();
				getNextLevelElements().addAll((Collection<? extends SagaStep>)newValue);
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
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__SLO_RULES:
				getSloRules().clear();
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__ID:
				setId(ID_EDEFAULT);
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__ISSUE_ON_LOCATION:
				getIssueOnLocation().clear();
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__COMPONENT:
				setComponent((Component)null);
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__CONSUMED_BY:
				getConsumedBy().clear();
				return;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__NEXT_LEVEL_ELEMENTS:
				getNextLevelElements().clear();
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
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__SLO_RULES:
				return sloRules != null && !sloRules.isEmpty();
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__ISSUE_ON_LOCATION:
				return issueOnLocation != null && !issueOnLocation.isEmpty();
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__COMPONENT:
				return component != null;
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__CONSUMED_BY:
				return consumedBy != null && !consumedBy.isEmpty();
			case SagaPackage.COMPONENT_INTERFACE_ADAPTER__NEXT_LEVEL_ELEMENTS:
				return nextLevelElements != null && !nextLevelElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case SagaPackage.COMPONENT_INTERFACE_ADAPTER__ID: return GropiusPackage.NODE__ID;
				default: return -1;
			}
		}
		if (baseClass == IssueLocation.class) {
			switch (derivedFeatureID) {
				case SagaPackage.COMPONENT_INTERFACE_ADAPTER__NAME: return GropiusPackage.ISSUE_LOCATION__NAME;
				case SagaPackage.COMPONENT_INTERFACE_ADAPTER__DESCRIPTION: return GropiusPackage.ISSUE_LOCATION__DESCRIPTION;
				case SagaPackage.COMPONENT_INTERFACE_ADAPTER__ISSUE_ON_LOCATION: return GropiusPackage.ISSUE_LOCATION__ISSUE_ON_LOCATION;
				default: return -1;
			}
		}
		if (baseClass == ComponentInterface.class) {
			switch (derivedFeatureID) {
				case SagaPackage.COMPONENT_INTERFACE_ADAPTER__COMPONENT: return GropiusPackage.COMPONENT_INTERFACE__COMPONENT;
				case SagaPackage.COMPONENT_INTERFACE_ADAPTER__CONSUMED_BY: return GropiusPackage.COMPONENT_INTERFACE__CONSUMED_BY;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case GropiusPackage.NODE__ID: return SagaPackage.COMPONENT_INTERFACE_ADAPTER__ID;
				default: return -1;
			}
		}
		if (baseClass == IssueLocation.class) {
			switch (baseFeatureID) {
				case GropiusPackage.ISSUE_LOCATION__NAME: return SagaPackage.COMPONENT_INTERFACE_ADAPTER__NAME;
				case GropiusPackage.ISSUE_LOCATION__DESCRIPTION: return SagaPackage.COMPONENT_INTERFACE_ADAPTER__DESCRIPTION;
				case GropiusPackage.ISSUE_LOCATION__ISSUE_ON_LOCATION: return SagaPackage.COMPONENT_INTERFACE_ADAPTER__ISSUE_ON_LOCATION;
				default: return -1;
			}
		}
		if (baseClass == ComponentInterface.class) {
			switch (baseFeatureID) {
				case GropiusPackage.COMPONENT_INTERFACE__COMPONENT: return SagaPackage.COMPONENT_INTERFACE_ADAPTER__COMPONENT;
				case GropiusPackage.COMPONENT_INTERFACE__CONSUMED_BY: return SagaPackage.COMPONENT_INTERFACE_ADAPTER__CONSUMED_BY;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

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

} //ComponentInterfaceAdapterImpl