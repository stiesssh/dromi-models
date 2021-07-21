/**
 */
package de.unistuttgart.gropius.impl;

import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.Issue;
import de.unistuttgart.gropius.IssueComment;
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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.impl.UserImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.UserImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.UserImpl#getDisplayname <em>Displayname</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.UserImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.UserImpl#getAssignedToIssues <em>Assigned To Issues</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.UserImpl#getParticipantOfIssue <em>Participant Of Issue</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.UserImpl#getIssueComments <em>Issue Comments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
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
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayname() <em>Displayname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayname()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAYNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayname() <em>Displayname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayname()
	 * @generated
	 * @ordered
	 */
	protected String displayname = DISPLAYNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

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
	 * The cached value of the '{@link #getAssignedToIssues() <em>Assigned To Issues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedToIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> assignedToIssues;

	/**
	 * The cached value of the '{@link #getParticipantOfIssue() <em>Participant Of Issue</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantOfIssue()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> participantOfIssue;

	/**
	 * The cached value of the '{@link #getIssueComments() <em>Issue Comments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueComments()
	 * @generated
	 * @ordered
	 */
	protected EList<IssueComment> issueComments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GropiusPackage.Literals.USER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.USER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.USER__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayname() {
		return displayname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayname(String newDisplayname) {
		String oldDisplayname = displayname;
		displayname = newDisplayname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.USER__DISPLAYNAME, oldDisplayname, displayname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getProjects() {
		if (projects == null) {
			projects = new EObjectWithInverseResolvingEList.ManyInverse<Project>(Project.class, this, GropiusPackage.USER__PROJECTS, GropiusPackage.PROJECT__USERS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getAssignedToIssues() {
		if (assignedToIssues == null) {
			assignedToIssues = new EObjectWithInverseResolvingEList.ManyInverse<Issue>(Issue.class, this, GropiusPackage.USER__ASSIGNED_TO_ISSUES, GropiusPackage.ISSUE__ASSIGNEES);
		}
		return assignedToIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Issue> getParticipantOfIssue() {
		if (participantOfIssue == null) {
			participantOfIssue = new EObjectWithInverseResolvingEList.ManyInverse<Issue>(Issue.class, this, GropiusPackage.USER__PARTICIPANT_OF_ISSUE, GropiusPackage.ISSUE__PARTICIPANTS);
		}
		return participantOfIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IssueComment> getIssueComments() {
		if (issueComments == null) {
			issueComments = new EObjectResolvingEList<IssueComment>(IssueComment.class, this, GropiusPackage.USER__ISSUE_COMMENTS);
		}
		return issueComments;
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
			case GropiusPackage.USER__PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProjects()).basicAdd(otherEnd, msgs);
			case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssignedToIssues()).basicAdd(otherEnd, msgs);
			case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipantOfIssue()).basicAdd(otherEnd, msgs);
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
			case GropiusPackage.USER__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
				return ((InternalEList<?>)getAssignedToIssues()).basicRemove(otherEnd, msgs);
			case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
				return ((InternalEList<?>)getParticipantOfIssue()).basicRemove(otherEnd, msgs);
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
			case GropiusPackage.USER__ID:
				return getId();
			case GropiusPackage.USER__USERNAME:
				return getUsername();
			case GropiusPackage.USER__DISPLAYNAME:
				return getDisplayname();
			case GropiusPackage.USER__EMAIL:
				return getEmail();
			case GropiusPackage.USER__PROJECTS:
				return getProjects();
			case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
				return getAssignedToIssues();
			case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
				return getParticipantOfIssue();
			case GropiusPackage.USER__ISSUE_COMMENTS:
				return getIssueComments();
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
			case GropiusPackage.USER__ID:
				setId(newValue);
				return;
			case GropiusPackage.USER__USERNAME:
				setUsername((String)newValue);
				return;
			case GropiusPackage.USER__DISPLAYNAME:
				setDisplayname((String)newValue);
				return;
			case GropiusPackage.USER__EMAIL:
				setEmail((String)newValue);
				return;
			case GropiusPackage.USER__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
				getAssignedToIssues().clear();
				getAssignedToIssues().addAll((Collection<? extends Issue>)newValue);
				return;
			case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
				getParticipantOfIssue().clear();
				getParticipantOfIssue().addAll((Collection<? extends Issue>)newValue);
				return;
			case GropiusPackage.USER__ISSUE_COMMENTS:
				getIssueComments().clear();
				getIssueComments().addAll((Collection<? extends IssueComment>)newValue);
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
			case GropiusPackage.USER__ID:
				setId((Object)null);
				return;
			case GropiusPackage.USER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case GropiusPackage.USER__DISPLAYNAME:
				setDisplayname(DISPLAYNAME_EDEFAULT);
				return;
			case GropiusPackage.USER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case GropiusPackage.USER__PROJECTS:
				getProjects().clear();
				return;
			case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
				getAssignedToIssues().clear();
				return;
			case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
				getParticipantOfIssue().clear();
				return;
			case GropiusPackage.USER__ISSUE_COMMENTS:
				getIssueComments().clear();
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
			case GropiusPackage.USER__ID:
				return id != null;
			case GropiusPackage.USER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case GropiusPackage.USER__DISPLAYNAME:
				return DISPLAYNAME_EDEFAULT == null ? displayname != null : !DISPLAYNAME_EDEFAULT.equals(displayname);
			case GropiusPackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case GropiusPackage.USER__PROJECTS:
				return projects != null && !projects.isEmpty();
			case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
				return assignedToIssues != null && !assignedToIssues.isEmpty();
			case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
				return participantOfIssue != null && !participantOfIssue.isEmpty();
			case GropiusPackage.USER__ISSUE_COMMENTS:
				return issueComments != null && !issueComments.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", username: ");
		result.append(username);
		result.append(", displayname: ");
		result.append(displayname);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //UserImpl
