/**
 */
package de.unistuttgart.gropius.impl;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.GropiusPackage;
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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.impl.ProjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ProjectImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ProjectImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ProjectImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ProjectImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ProjectImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
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
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected Component components;

	/**
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected User users;

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
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected Issue issues;

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
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GropiusPackage.Literals.PROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.PROJECT__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.PROJECT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.PROJECT__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponents() {
		if (components != null && components.eIsProxy()) {
			InternalEObject oldComponents = (InternalEObject) components;
			components = (Component) eResolveProxy(oldComponents);
			if (components != oldComponents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.PROJECT__COMPONENTS,
							oldComponents, components));
			}
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponents(Component newComponents) {
		Component oldComponents = components;
		components = newComponents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.PROJECT__COMPONENTS, oldComponents,
					components));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getUsers() {
		if (users != null && users.eIsProxy()) {
			InternalEObject oldUsers = (InternalEObject) users;
			users = (User) eResolveProxy(oldUsers);
			if (users != oldUsers) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.PROJECT__USERS, oldUsers,
							users));
			}
		}
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUsers() {
		return users;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsers(User newUsers, NotificationChain msgs) {
		User oldUsers = users;
		users = newUsers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GropiusPackage.PROJECT__USERS, oldUsers, newUsers);
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
	public void setUsers(User newUsers) {
		if (newUsers != users) {
			NotificationChain msgs = null;
			if (users != null)
				msgs = ((InternalEObject) users).eInverseRemove(this, GropiusPackage.USER__PROJECTS, User.class, msgs);
			if (newUsers != null)
				msgs = ((InternalEObject) newUsers).eInverseAdd(this, GropiusPackage.USER__PROJECTS, User.class, msgs);
			msgs = basicSetUsers(newUsers, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.PROJECT__USERS, newUsers, newUsers));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.PROJECT__OWNER, oldOwner,
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.PROJECT__OWNER, oldOwner, owner));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.PROJECT__ISSUES, oldIssues,
							issues));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.PROJECT__ISSUES, oldIssues, issues));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.PROJECT__LABELS, oldLabels,
							labels));
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
	public void setLabels(Label newLabels) {
		Label oldLabels = labels;
		labels = newLabels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.PROJECT__LABELS, oldLabels, labels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GropiusPackage.PROJECT__USERS:
			if (users != null)
				msgs = ((InternalEObject) users).eInverseRemove(this, GropiusPackage.USER__PROJECTS, User.class, msgs);
			return basicSetUsers((User) otherEnd, msgs);
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
		case GropiusPackage.PROJECT__USERS:
			return basicSetUsers(null, msgs);
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
		case GropiusPackage.PROJECT__ID:
			return getId();
		case GropiusPackage.PROJECT__NAME:
			return getName();
		case GropiusPackage.PROJECT__DESCRIPTION:
			return getDescription();
		case GropiusPackage.PROJECT__COMPONENTS:
			if (resolve)
				return getComponents();
			return basicGetComponents();
		case GropiusPackage.PROJECT__USERS:
			if (resolve)
				return getUsers();
			return basicGetUsers();
		case GropiusPackage.PROJECT__OWNER:
			if (resolve)
				return getOwner();
			return basicGetOwner();
		case GropiusPackage.PROJECT__ISSUES:
			if (resolve)
				return getIssues();
			return basicGetIssues();
		case GropiusPackage.PROJECT__LABELS:
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
		case GropiusPackage.PROJECT__ID:
			setId(newValue);
			return;
		case GropiusPackage.PROJECT__NAME:
			setName((String) newValue);
			return;
		case GropiusPackage.PROJECT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GropiusPackage.PROJECT__COMPONENTS:
			setComponents((Component) newValue);
			return;
		case GropiusPackage.PROJECT__USERS:
			setUsers((User) newValue);
			return;
		case GropiusPackage.PROJECT__OWNER:
			setOwner((User) newValue);
			return;
		case GropiusPackage.PROJECT__ISSUES:
			setIssues((Issue) newValue);
			return;
		case GropiusPackage.PROJECT__LABELS:
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
		case GropiusPackage.PROJECT__ID:
			setId((Object) null);
			return;
		case GropiusPackage.PROJECT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GropiusPackage.PROJECT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GropiusPackage.PROJECT__COMPONENTS:
			setComponents((Component) null);
			return;
		case GropiusPackage.PROJECT__USERS:
			setUsers((User) null);
			return;
		case GropiusPackage.PROJECT__OWNER:
			setOwner((User) null);
			return;
		case GropiusPackage.PROJECT__ISSUES:
			setIssues((Issue) null);
			return;
		case GropiusPackage.PROJECT__LABELS:
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
		case GropiusPackage.PROJECT__ID:
			return id != null;
		case GropiusPackage.PROJECT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GropiusPackage.PROJECT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GropiusPackage.PROJECT__COMPONENTS:
			return components != null;
		case GropiusPackage.PROJECT__USERS:
			return users != null;
		case GropiusPackage.PROJECT__OWNER:
			return owner != null;
		case GropiusPackage.PROJECT__ISSUES:
			return issues != null;
		case GropiusPackage.PROJECT__LABELS:
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

} //ProjectImpl
