/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.IMS;
import de.unistuttgart.gropius.Issue;
import de.unistuttgart.gropius.IssueLocation;
import de.unistuttgart.gropius.Label;
import de.unistuttgart.gropius.Node;
import de.unistuttgart.gropius.Project;
import de.unistuttgart.gropius.User;

import de.unistuttgart.gropius.slo.SloRule;

import de.unistuttgart.ma.saga.ComponentAdapter;
import de.unistuttgart.ma.saga.SagaPackage;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Adapter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getSloRules <em>Slo Rules</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getIssueOnLocation <em>Issue On Location</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getIms <em>Ims</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getConsumedInterfaces <em>Consumed Interfaces</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ComponentAdapterImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentAdapterImpl extends MinimalEObjectImpl.Container implements ComponentAdapter {
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
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected User owner;

	/**
	 * The cached value of the '{@link #getIms() <em>Ims</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIms()
	 * @generated
	 * @ordered
	 */
	protected IMS ims;

	/**
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issues;

	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> projects;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInterface> interfaces;

	/**
	 * The cached value of the '{@link #getConsumedInterfaces() <em>Consumed Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentInterface> consumedInterfaces;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> labels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.COMPONENT_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SloRule> getSloRules() {
		if (sloRules == null) {
			sloRules = new EObjectContainmentEList<SloRule>(SloRule.class, this, SagaPackage.COMPONENT_ADAPTER__SLO_RULES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.COMPONENT_ADAPTER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.COMPONENT_ADAPTER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.COMPONENT_ADAPTER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getIssueOnLocation() {
		if (issueOnLocation == null) {
			issueOnLocation = new EObjectResolvingEList<Issue>(Issue.class, this, SagaPackage.COMPONENT_ADAPTER__ISSUE_ON_LOCATION);
		}
		return issueOnLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (User)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.COMPONENT_ADAPTER__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(User newOwner) {
		User oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.COMPONENT_ADAPTER__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMS getIms() {
		if (ims != null && ims.eIsProxy()) {
			InternalEObject oldIms = (InternalEObject)ims;
			ims = (IMS)eResolveProxy(oldIms);
			if (ims != oldIms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.COMPONENT_ADAPTER__IMS, oldIms, ims));
			}
		}
		return ims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMS basicGetIms() {
		return ims;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIms(IMS newIms) {
		IMS oldIms = ims;
		ims = newIms;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.COMPONENT_ADAPTER__IMS, oldIms, ims));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getIssues() {
		if (issues == null) {
			issues = new EObjectResolvingEList<Issue>(Issue.class, this, SagaPackage.COMPONENT_ADAPTER__ISSUES);
		}
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectResolvingEList<Project>(Project.class, this, SagaPackage.COMPONENT_ADAPTER__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<ComponentInterface>(ComponentInterface.class, this, SagaPackage.COMPONENT_ADAPTER__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentInterface> getConsumedInterfaces() {
		if (consumedInterfaces == null) {
			consumedInterfaces = new EObjectResolvingEList<ComponentInterface>(ComponentInterface.class, this, SagaPackage.COMPONENT_ADAPTER__CONSUMED_INTERFACES);
		}
		return consumedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabels() {
		if (labels == null) {
			labels = new EObjectWithInverseResolvingEList.ManyInverse<Label>(Label.class, this, SagaPackage.COMPONENT_ADAPTER__LABELS, GropiusPackage.LABEL__COMPONENTS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SagaPackage.COMPONENT_ADAPTER__LABELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabels()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SagaPackage.COMPONENT_ADAPTER__SLO_RULES:
				return ((InternalEList<?>)getSloRules()).basicRemove(otherEnd, msgs);
			case SagaPackage.COMPONENT_ADAPTER__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case SagaPackage.COMPONENT_ADAPTER__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
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
			case SagaPackage.COMPONENT_ADAPTER__SLO_RULES:
				return getSloRules();
			case SagaPackage.COMPONENT_ADAPTER__ID:
				return getId();
			case SagaPackage.COMPONENT_ADAPTER__NAME:
				return getName();
			case SagaPackage.COMPONENT_ADAPTER__DESCRIPTION:
				return getDescription();
			case SagaPackage.COMPONENT_ADAPTER__ISSUE_ON_LOCATION:
				return getIssueOnLocation();
			case SagaPackage.COMPONENT_ADAPTER__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case SagaPackage.COMPONENT_ADAPTER__IMS:
				if (resolve) return getIms();
				return basicGetIms();
			case SagaPackage.COMPONENT_ADAPTER__ISSUES:
				return getIssues();
			case SagaPackage.COMPONENT_ADAPTER__PROJECTS:
				return getProjects();
			case SagaPackage.COMPONENT_ADAPTER__INTERFACES:
				return getInterfaces();
			case SagaPackage.COMPONENT_ADAPTER__CONSUMED_INTERFACES:
				return getConsumedInterfaces();
			case SagaPackage.COMPONENT_ADAPTER__LABELS:
				return getLabels();
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
			case SagaPackage.COMPONENT_ADAPTER__SLO_RULES:
				getSloRules().clear();
				getSloRules().addAll((Collection<? extends SloRule>)newValue);
				return;
			case SagaPackage.COMPONENT_ADAPTER__ID:
				setId((String)newValue);
				return;
			case SagaPackage.COMPONENT_ADAPTER__NAME:
				setName((String)newValue);
				return;
			case SagaPackage.COMPONENT_ADAPTER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SagaPackage.COMPONENT_ADAPTER__ISSUE_ON_LOCATION:
				getIssueOnLocation().clear();
				getIssueOnLocation().addAll((Collection<? extends Issue>)newValue);
				return;
			case SagaPackage.COMPONENT_ADAPTER__OWNER:
				setOwner((User)newValue);
				return;
			case SagaPackage.COMPONENT_ADAPTER__IMS:
				setIms((IMS)newValue);
				return;
			case SagaPackage.COMPONENT_ADAPTER__ISSUES:
				getIssues().clear();
				getIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case SagaPackage.COMPONENT_ADAPTER__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case SagaPackage.COMPONENT_ADAPTER__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends ComponentInterface>)newValue);
				return;
			case SagaPackage.COMPONENT_ADAPTER__CONSUMED_INTERFACES:
				getConsumedInterfaces().clear();
				getConsumedInterfaces().addAll((Collection<? extends ComponentInterface>)newValue);
				return;
			case SagaPackage.COMPONENT_ADAPTER__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends Label>)newValue);
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
			case SagaPackage.COMPONENT_ADAPTER__SLO_RULES:
				getSloRules().clear();
				return;
			case SagaPackage.COMPONENT_ADAPTER__ID:
				setId(ID_EDEFAULT);
				return;
			case SagaPackage.COMPONENT_ADAPTER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SagaPackage.COMPONENT_ADAPTER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SagaPackage.COMPONENT_ADAPTER__ISSUE_ON_LOCATION:
				getIssueOnLocation().clear();
				return;
			case SagaPackage.COMPONENT_ADAPTER__OWNER:
				setOwner((User)null);
				return;
			case SagaPackage.COMPONENT_ADAPTER__IMS:
				setIms((IMS)null);
				return;
			case SagaPackage.COMPONENT_ADAPTER__ISSUES:
				getIssues().clear();
				return;
			case SagaPackage.COMPONENT_ADAPTER__PROJECTS:
				getProjects().clear();
				return;
			case SagaPackage.COMPONENT_ADAPTER__INTERFACES:
				getInterfaces().clear();
				return;
			case SagaPackage.COMPONENT_ADAPTER__CONSUMED_INTERFACES:
				getConsumedInterfaces().clear();
				return;
			case SagaPackage.COMPONENT_ADAPTER__LABELS:
				getLabels().clear();
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
			case SagaPackage.COMPONENT_ADAPTER__SLO_RULES:
				return sloRules != null && !sloRules.isEmpty();
			case SagaPackage.COMPONENT_ADAPTER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SagaPackage.COMPONENT_ADAPTER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SagaPackage.COMPONENT_ADAPTER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SagaPackage.COMPONENT_ADAPTER__ISSUE_ON_LOCATION:
				return issueOnLocation != null && !issueOnLocation.isEmpty();
			case SagaPackage.COMPONENT_ADAPTER__OWNER:
				return owner != null;
			case SagaPackage.COMPONENT_ADAPTER__IMS:
				return ims != null;
			case SagaPackage.COMPONENT_ADAPTER__ISSUES:
				return issues != null && !issues.isEmpty();
			case SagaPackage.COMPONENT_ADAPTER__PROJECTS:
				return projects != null && !projects.isEmpty();
			case SagaPackage.COMPONENT_ADAPTER__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case SagaPackage.COMPONENT_ADAPTER__CONSUMED_INTERFACES:
				return consumedInterfaces != null && !consumedInterfaces.isEmpty();
			case SagaPackage.COMPONENT_ADAPTER__LABELS:
				return labels != null && !labels.isEmpty();
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
				case SagaPackage.COMPONENT_ADAPTER__ID: return GropiusPackage.NODE__ID;
				default: return -1;
			}
		}
		if (baseClass == IssueLocation.class) {
			switch (derivedFeatureID) {
				case SagaPackage.COMPONENT_ADAPTER__NAME: return GropiusPackage.ISSUE_LOCATION__NAME;
				case SagaPackage.COMPONENT_ADAPTER__DESCRIPTION: return GropiusPackage.ISSUE_LOCATION__DESCRIPTION;
				case SagaPackage.COMPONENT_ADAPTER__ISSUE_ON_LOCATION: return GropiusPackage.ISSUE_LOCATION__ISSUE_ON_LOCATION;
				default: return -1;
			}
		}
		if (baseClass == Component.class) {
			switch (derivedFeatureID) {
				case SagaPackage.COMPONENT_ADAPTER__OWNER: return GropiusPackage.COMPONENT__OWNER;
				case SagaPackage.COMPONENT_ADAPTER__IMS: return GropiusPackage.COMPONENT__IMS;
				case SagaPackage.COMPONENT_ADAPTER__ISSUES: return GropiusPackage.COMPONENT__ISSUES;
				case SagaPackage.COMPONENT_ADAPTER__PROJECTS: return GropiusPackage.COMPONENT__PROJECTS;
				case SagaPackage.COMPONENT_ADAPTER__INTERFACES: return GropiusPackage.COMPONENT__INTERFACES;
				case SagaPackage.COMPONENT_ADAPTER__CONSUMED_INTERFACES: return GropiusPackage.COMPONENT__CONSUMED_INTERFACES;
				case SagaPackage.COMPONENT_ADAPTER__LABELS: return GropiusPackage.COMPONENT__LABELS;
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
				case GropiusPackage.NODE__ID: return SagaPackage.COMPONENT_ADAPTER__ID;
				default: return -1;
			}
		}
		if (baseClass == IssueLocation.class) {
			switch (baseFeatureID) {
				case GropiusPackage.ISSUE_LOCATION__NAME: return SagaPackage.COMPONENT_ADAPTER__NAME;
				case GropiusPackage.ISSUE_LOCATION__DESCRIPTION: return SagaPackage.COMPONENT_ADAPTER__DESCRIPTION;
				case GropiusPackage.ISSUE_LOCATION__ISSUE_ON_LOCATION: return SagaPackage.COMPONENT_ADAPTER__ISSUE_ON_LOCATION;
				default: return -1;
			}
		}
		if (baseClass == Component.class) {
			switch (baseFeatureID) {
				case GropiusPackage.COMPONENT__OWNER: return SagaPackage.COMPONENT_ADAPTER__OWNER;
				case GropiusPackage.COMPONENT__IMS: return SagaPackage.COMPONENT_ADAPTER__IMS;
				case GropiusPackage.COMPONENT__ISSUES: return SagaPackage.COMPONENT_ADAPTER__ISSUES;
				case GropiusPackage.COMPONENT__PROJECTS: return SagaPackage.COMPONENT_ADAPTER__PROJECTS;
				case GropiusPackage.COMPONENT__INTERFACES: return SagaPackage.COMPONENT_ADAPTER__INTERFACES;
				case GropiusPackage.COMPONENT__CONSUMED_INTERFACES: return SagaPackage.COMPONENT_ADAPTER__CONSUMED_INTERFACES;
				case GropiusPackage.COMPONENT__LABELS: return SagaPackage.COMPONENT_ADAPTER__LABELS;
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

} //ComponentAdapterImpl