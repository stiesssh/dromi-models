/**
 */
package de.unistuttgart.gropius.impl;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.IMS;
import de.unistuttgart.gropius.Issue;
import de.unistuttgart.gropius.Label;
import de.unistuttgart.gropius.Project;
import de.unistuttgart.gropius.User;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentImpl#getIssueOnLocation <em>Issue On Location</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentImpl#getIms <em>Ims</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentImpl#getConsumedInterfaces <em>Consumed Interfaces</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ComponentImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
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
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GropiusPackage.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getIssueOnLocation() {
		if (issueOnLocation == null) {
			issueOnLocation = new EObjectResolvingEList<Issue>(Issue.class, this,
					GropiusPackage.COMPONENT__ISSUE_ON_LOCATION);
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
			InternalEObject oldOwner = (InternalEObject) owner;
			owner = (User) eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.COMPONENT__OWNER, oldOwner,
							owner));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMS getIms() {
		if (ims != null && ims.eIsProxy()) {
			InternalEObject oldIms = (InternalEObject) ims;
			ims = (IMS) eResolveProxy(oldIms);
			if (ims != oldIms) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.COMPONENT__IMS, oldIms,
							ims));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT__IMS, oldIms, ims));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getIssues() {
		if (issues == null) {
			issues = new EObjectResolvingEList<Issue>(Issue.class, this, GropiusPackage.COMPONENT__ISSUES);
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
			projects = new EObjectResolvingEList<Project>(Project.class, this, GropiusPackage.COMPONENT__PROJECTS);
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
			interfaces = new EObjectContainmentWithInverseEList<ComponentInterface>(ComponentInterface.class, this,
					GropiusPackage.COMPONENT__INTERFACES, GropiusPackage.COMPONENT_INTERFACE__COMPONENT);
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
			consumedInterfaces = new EObjectWithInverseResolvingEList.ManyInverse<ComponentInterface>(
					ComponentInterface.class, this, GropiusPackage.COMPONENT__CONSUMED_INTERFACES,
					GropiusPackage.COMPONENT_INTERFACE__CONSUMED_BY);
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
			labels = new EObjectWithInverseResolvingEList.ManyInverse<Label>(Label.class, this,
					GropiusPackage.COMPONENT__LABELS, GropiusPackage.LABEL__COMPONENTS);
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
		case GropiusPackage.COMPONENT__INTERFACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInterfaces()).basicAdd(otherEnd, msgs);
		case GropiusPackage.COMPONENT__CONSUMED_INTERFACES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getConsumedInterfaces()).basicAdd(otherEnd,
					msgs);
		case GropiusPackage.COMPONENT__LABELS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLabels()).basicAdd(otherEnd, msgs);
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
		case GropiusPackage.COMPONENT__INTERFACES:
			return ((InternalEList<?>) getInterfaces()).basicRemove(otherEnd, msgs);
		case GropiusPackage.COMPONENT__CONSUMED_INTERFACES:
			return ((InternalEList<?>) getConsumedInterfaces()).basicRemove(otherEnd, msgs);
		case GropiusPackage.COMPONENT__LABELS:
			return ((InternalEList<?>) getLabels()).basicRemove(otherEnd, msgs);
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
		case GropiusPackage.COMPONENT__ID:
			return getId();
		case GropiusPackage.COMPONENT__NAME:
			return getName();
		case GropiusPackage.COMPONENT__DESCRIPTION:
			return getDescription();
		case GropiusPackage.COMPONENT__ISSUE_ON_LOCATION:
			return getIssueOnLocation();
		case GropiusPackage.COMPONENT__OWNER:
			if (resolve)
				return getOwner();
			return basicGetOwner();
		case GropiusPackage.COMPONENT__IMS:
			if (resolve)
				return getIms();
			return basicGetIms();
		case GropiusPackage.COMPONENT__ISSUES:
			return getIssues();
		case GropiusPackage.COMPONENT__PROJECTS:
			return getProjects();
		case GropiusPackage.COMPONENT__INTERFACES:
			return getInterfaces();
		case GropiusPackage.COMPONENT__CONSUMED_INTERFACES:
			return getConsumedInterfaces();
		case GropiusPackage.COMPONENT__LABELS:
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
		case GropiusPackage.COMPONENT__ID:
			setId((String) newValue);
			return;
		case GropiusPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case GropiusPackage.COMPONENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GropiusPackage.COMPONENT__ISSUE_ON_LOCATION:
			getIssueOnLocation().clear();
			getIssueOnLocation().addAll((Collection<? extends Issue>) newValue);
			return;
		case GropiusPackage.COMPONENT__OWNER:
			setOwner((User) newValue);
			return;
		case GropiusPackage.COMPONENT__IMS:
			setIms((IMS) newValue);
			return;
		case GropiusPackage.COMPONENT__ISSUES:
			getIssues().clear();
			getIssues().addAll((Collection<? extends Issue>) newValue);
			return;
		case GropiusPackage.COMPONENT__PROJECTS:
			getProjects().clear();
			getProjects().addAll((Collection<? extends Project>) newValue);
			return;
		case GropiusPackage.COMPONENT__INTERFACES:
			getInterfaces().clear();
			getInterfaces().addAll((Collection<? extends ComponentInterface>) newValue);
			return;
		case GropiusPackage.COMPONENT__CONSUMED_INTERFACES:
			getConsumedInterfaces().clear();
			getConsumedInterfaces().addAll((Collection<? extends ComponentInterface>) newValue);
			return;
		case GropiusPackage.COMPONENT__LABELS:
			getLabels().clear();
			getLabels().addAll((Collection<? extends Label>) newValue);
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
		case GropiusPackage.COMPONENT__ID:
			setId(ID_EDEFAULT);
			return;
		case GropiusPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GropiusPackage.COMPONENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GropiusPackage.COMPONENT__ISSUE_ON_LOCATION:
			getIssueOnLocation().clear();
			return;
		case GropiusPackage.COMPONENT__OWNER:
			setOwner((User) null);
			return;
		case GropiusPackage.COMPONENT__IMS:
			setIms((IMS) null);
			return;
		case GropiusPackage.COMPONENT__ISSUES:
			getIssues().clear();
			return;
		case GropiusPackage.COMPONENT__PROJECTS:
			getProjects().clear();
			return;
		case GropiusPackage.COMPONENT__INTERFACES:
			getInterfaces().clear();
			return;
		case GropiusPackage.COMPONENT__CONSUMED_INTERFACES:
			getConsumedInterfaces().clear();
			return;
		case GropiusPackage.COMPONENT__LABELS:
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
		case GropiusPackage.COMPONENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GropiusPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GropiusPackage.COMPONENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GropiusPackage.COMPONENT__ISSUE_ON_LOCATION:
			return issueOnLocation != null && !issueOnLocation.isEmpty();
		case GropiusPackage.COMPONENT__OWNER:
			return owner != null;
		case GropiusPackage.COMPONENT__IMS:
			return ims != null;
		case GropiusPackage.COMPONENT__ISSUES:
			return issues != null && !issues.isEmpty();
		case GropiusPackage.COMPONENT__PROJECTS:
			return projects != null && !projects.isEmpty();
		case GropiusPackage.COMPONENT__INTERFACES:
			return interfaces != null && !interfaces.isEmpty();
		case GropiusPackage.COMPONENT__CONSUMED_INTERFACES:
			return consumedInterfaces != null && !consumedInterfaces.isEmpty();
		case GropiusPackage.COMPONENT__LABELS:
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

} //ComponentImpl
