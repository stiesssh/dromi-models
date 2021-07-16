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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Object id;

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
	 * The cached value of the '{@link #getIssueOnLocation() <em>Issue On Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueOnLocation()
	 * @generated
	 * @ordered
	 */
	protected Issue issueOnLocation;

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
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected Issue issues;

	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected Project projects;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected ComponentInterface interfaces;

	/**
	 * The cached value of the '{@link #getConsumedInterfaces() <em>Consumed Interfaces</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected ComponentInterface consumedInterfaces;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected Label labels;

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
	public Object getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Object newId) {
		Object oldId = id;
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
	public Issue getIssueOnLocation() {
		if (issueOnLocation != null && issueOnLocation.eIsProxy()) {
			InternalEObject oldIssueOnLocation = (InternalEObject) issueOnLocation;
			issueOnLocation = (Issue) eResolveProxy(oldIssueOnLocation);
			if (issueOnLocation != oldIssueOnLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GropiusPackage.COMPONENT__ISSUE_ON_LOCATION, oldIssueOnLocation, issueOnLocation));
			}
		}
		return issueOnLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue basicGetIssueOnLocation() {
		return issueOnLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueOnLocation(Issue newIssueOnLocation) {
		Issue oldIssueOnLocation = issueOnLocation;
		issueOnLocation = newIssueOnLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT__ISSUE_ON_LOCATION,
					oldIssueOnLocation, issueOnLocation));
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
	public Issue getIssues() {
		if (issues != null && issues.eIsProxy()) {
			InternalEObject oldIssues = (InternalEObject) issues;
			issues = (Issue) eResolveProxy(oldIssues);
			if (issues != oldIssues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.COMPONENT__ISSUES,
							oldIssues, issues));
			}
		}
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue basicGetIssues() {
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssues(Issue newIssues) {
		Issue oldIssues = issues;
		issues = newIssues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT__ISSUES, oldIssues, issues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProjects() {
		if (projects != null && projects.eIsProxy()) {
			InternalEObject oldProjects = (InternalEObject) projects;
			projects = (Project) eResolveProxy(oldProjects);
			if (projects != oldProjects) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.COMPONENT__PROJECTS,
							oldProjects, projects));
			}
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProjects() {
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjects(Project newProjects) {
		Project oldProjects = projects;
		projects = newProjects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT__PROJECTS, oldProjects,
					projects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface getInterfaces() {
		if (interfaces != null && interfaces.eIsProxy()) {
			InternalEObject oldInterfaces = (InternalEObject) interfaces;
			interfaces = (ComponentInterface) eResolveProxy(oldInterfaces);
			if (interfaces != oldInterfaces) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.COMPONENT__INTERFACES,
							oldInterfaces, interfaces));
			}
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface basicGetInterfaces() {
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaces(ComponentInterface newInterfaces) {
		ComponentInterface oldInterfaces = interfaces;
		interfaces = newInterfaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT__INTERFACES, oldInterfaces,
					interfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface getConsumedInterfaces() {
		if (consumedInterfaces != null && consumedInterfaces.eIsProxy()) {
			InternalEObject oldConsumedInterfaces = (InternalEObject) consumedInterfaces;
			consumedInterfaces = (ComponentInterface) eResolveProxy(oldConsumedInterfaces);
			if (consumedInterfaces != oldConsumedInterfaces) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GropiusPackage.COMPONENT__CONSUMED_INTERFACES, oldConsumedInterfaces, consumedInterfaces));
			}
		}
		return consumedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface basicGetConsumedInterfaces() {
		return consumedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumedInterfaces(ComponentInterface newConsumedInterfaces) {
		ComponentInterface oldConsumedInterfaces = consumedInterfaces;
		consumedInterfaces = newConsumedInterfaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT__CONSUMED_INTERFACES,
					oldConsumedInterfaces, consumedInterfaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getLabels() {
		if (labels != null && labels.eIsProxy()) {
			InternalEObject oldLabels = (InternalEObject) labels;
			labels = (Label) eResolveProxy(oldLabels);
			if (labels != oldLabels) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.COMPONENT__LABELS,
							oldLabels, labels));
			}
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetLabels() {
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabels(Label newLabels, NotificationChain msgs) {
		Label oldLabels = labels;
		labels = newLabels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GropiusPackage.COMPONENT__LABELS, oldLabels, newLabels);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabels(Label newLabels) {
		if (newLabels != labels) {
			NotificationChain msgs = null;
			if (labels != null)
				msgs = ((InternalEObject) labels).eInverseRemove(this, GropiusPackage.LABEL__COMPONENTS, Label.class,
						msgs);
			if (newLabels != null)
				msgs = ((InternalEObject) newLabels).eInverseAdd(this, GropiusPackage.LABEL__COMPONENTS, Label.class,
						msgs);
			msgs = basicSetLabels(newLabels, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.COMPONENT__LABELS, newLabels,
					newLabels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GropiusPackage.COMPONENT__LABELS:
			if (labels != null)
				msgs = ((InternalEObject) labels).eInverseRemove(this, GropiusPackage.LABEL__COMPONENTS, Label.class,
						msgs);
			return basicSetLabels((Label) otherEnd, msgs);
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
		case GropiusPackage.COMPONENT__LABELS:
			return basicSetLabels(null, msgs);
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
			if (resolve)
				return getIssueOnLocation();
			return basicGetIssueOnLocation();
		case GropiusPackage.COMPONENT__OWNER:
			if (resolve)
				return getOwner();
			return basicGetOwner();
		case GropiusPackage.COMPONENT__IMS:
			if (resolve)
				return getIms();
			return basicGetIms();
		case GropiusPackage.COMPONENT__ISSUES:
			if (resolve)
				return getIssues();
			return basicGetIssues();
		case GropiusPackage.COMPONENT__PROJECTS:
			if (resolve)
				return getProjects();
			return basicGetProjects();
		case GropiusPackage.COMPONENT__INTERFACES:
			if (resolve)
				return getInterfaces();
			return basicGetInterfaces();
		case GropiusPackage.COMPONENT__CONSUMED_INTERFACES:
			if (resolve)
				return getConsumedInterfaces();
			return basicGetConsumedInterfaces();
		case GropiusPackage.COMPONENT__LABELS:
			if (resolve)
				return getLabels();
			return basicGetLabels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GropiusPackage.COMPONENT__ID:
			setId(newValue);
			return;
		case GropiusPackage.COMPONENT__NAME:
			setName((String) newValue);
			return;
		case GropiusPackage.COMPONENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GropiusPackage.COMPONENT__ISSUE_ON_LOCATION:
			setIssueOnLocation((Issue) newValue);
			return;
		case GropiusPackage.COMPONENT__OWNER:
			setOwner((User) newValue);
			return;
		case GropiusPackage.COMPONENT__IMS:
			setIms((IMS) newValue);
			return;
		case GropiusPackage.COMPONENT__ISSUES:
			setIssues((Issue) newValue);
			return;
		case GropiusPackage.COMPONENT__PROJECTS:
			setProjects((Project) newValue);
			return;
		case GropiusPackage.COMPONENT__INTERFACES:
			setInterfaces((ComponentInterface) newValue);
			return;
		case GropiusPackage.COMPONENT__CONSUMED_INTERFACES:
			setConsumedInterfaces((ComponentInterface) newValue);
			return;
		case GropiusPackage.COMPONENT__LABELS:
			setLabels((Label) newValue);
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
			setId((Object) null);
			return;
		case GropiusPackage.COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GropiusPackage.COMPONENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GropiusPackage.COMPONENT__ISSUE_ON_LOCATION:
			setIssueOnLocation((Issue) null);
			return;
		case GropiusPackage.COMPONENT__OWNER:
			setOwner((User) null);
			return;
		case GropiusPackage.COMPONENT__IMS:
			setIms((IMS) null);
			return;
		case GropiusPackage.COMPONENT__ISSUES:
			setIssues((Issue) null);
			return;
		case GropiusPackage.COMPONENT__PROJECTS:
			setProjects((Project) null);
			return;
		case GropiusPackage.COMPONENT__INTERFACES:
			setInterfaces((ComponentInterface) null);
			return;
		case GropiusPackage.COMPONENT__CONSUMED_INTERFACES:
			setConsumedInterfaces((ComponentInterface) null);
			return;
		case GropiusPackage.COMPONENT__LABELS:
			setLabels((Label) null);
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
			return id != null;
		case GropiusPackage.COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GropiusPackage.COMPONENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GropiusPackage.COMPONENT__ISSUE_ON_LOCATION:
			return issueOnLocation != null;
		case GropiusPackage.COMPONENT__OWNER:
			return owner != null;
		case GropiusPackage.COMPONENT__IMS:
			return ims != null;
		case GropiusPackage.COMPONENT__ISSUES:
			return issues != null;
		case GropiusPackage.COMPONENT__PROJECTS:
			return projects != null;
		case GropiusPackage.COMPONENT__INTERFACES:
			return interfaces != null;
		case GropiusPackage.COMPONENT__CONSUMED_INTERFACES:
			return consumedInterfaces != null;
		case GropiusPackage.COMPONENT__LABELS:
			return labels != null;
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
