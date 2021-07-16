/**
 */
package de.unistuttgart.gropius.impl;

import de.unistuttgart.gropius.Comment;
import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.Issue;
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
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected Project projects;

	/**
	 * The cached value of the '{@link #getAssignedToIssues() <em>Assigned To Issues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedToIssues()
	 * @generated
	 * @ordered
	 */
	protected Issue assignedToIssues;

	/**
	 * The cached value of the '{@link #getParticipantOfIssue() <em>Participant Of Issue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantOfIssue()
	 * @generated
	 * @ordered
	 */
	protected Issue participantOfIssue;

	/**
	 * The cached value of the '{@link #getIssueComments() <em>Issue Comments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueComments()
	 * @generated
	 * @ordered
	 */
	protected Comment issueComments;

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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.USER__USERNAME, oldUsername,
					username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.USER__DISPLAYNAME, oldDisplayname,
					displayname));
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
	public Project getProjects() {
		if (projects != null && projects.eIsProxy()) {
			InternalEObject oldProjects = (InternalEObject) projects;
			projects = (Project) eResolveProxy(oldProjects);
			if (projects != oldProjects) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.USER__PROJECTS,
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
	public NotificationChain basicSetProjects(Project newProjects, NotificationChain msgs) {
		Project oldProjects = projects;
		projects = newProjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GropiusPackage.USER__PROJECTS, oldProjects, newProjects);
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
	public void setProjects(Project newProjects) {
		if (newProjects != projects) {
			NotificationChain msgs = null;
			if (projects != null)
				msgs = ((InternalEObject) projects).eInverseRemove(this, GropiusPackage.PROJECT__USERS, Project.class,
						msgs);
			if (newProjects != null)
				msgs = ((InternalEObject) newProjects).eInverseAdd(this, GropiusPackage.PROJECT__USERS, Project.class,
						msgs);
			msgs = basicSetProjects(newProjects, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.USER__PROJECTS, newProjects,
					newProjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue getAssignedToIssues() {
		if (assignedToIssues != null && assignedToIssues.eIsProxy()) {
			InternalEObject oldAssignedToIssues = (InternalEObject) assignedToIssues;
			assignedToIssues = (Issue) eResolveProxy(oldAssignedToIssues);
			if (assignedToIssues != oldAssignedToIssues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.USER__ASSIGNED_TO_ISSUES,
							oldAssignedToIssues, assignedToIssues));
			}
		}
		return assignedToIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue basicGetAssignedToIssues() {
		return assignedToIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedToIssues(Issue newAssignedToIssues, NotificationChain msgs) {
		Issue oldAssignedToIssues = assignedToIssues;
		assignedToIssues = newAssignedToIssues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GropiusPackage.USER__ASSIGNED_TO_ISSUES, oldAssignedToIssues, newAssignedToIssues);
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
	public void setAssignedToIssues(Issue newAssignedToIssues) {
		if (newAssignedToIssues != assignedToIssues) {
			NotificationChain msgs = null;
			if (assignedToIssues != null)
				msgs = ((InternalEObject) assignedToIssues).eInverseRemove(this, GropiusPackage.ISSUE__ASSIGNEES,
						Issue.class, msgs);
			if (newAssignedToIssues != null)
				msgs = ((InternalEObject) newAssignedToIssues).eInverseAdd(this, GropiusPackage.ISSUE__ASSIGNEES,
						Issue.class, msgs);
			msgs = basicSetAssignedToIssues(newAssignedToIssues, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.USER__ASSIGNED_TO_ISSUES,
					newAssignedToIssues, newAssignedToIssues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue getParticipantOfIssue() {
		if (participantOfIssue != null && participantOfIssue.eIsProxy()) {
			InternalEObject oldParticipantOfIssue = (InternalEObject) participantOfIssue;
			participantOfIssue = (Issue) eResolveProxy(oldParticipantOfIssue);
			if (participantOfIssue != oldParticipantOfIssue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.USER__PARTICIPANT_OF_ISSUE,
							oldParticipantOfIssue, participantOfIssue));
			}
		}
		return participantOfIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue basicGetParticipantOfIssue() {
		return participantOfIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipantOfIssue(Issue newParticipantOfIssue, NotificationChain msgs) {
		Issue oldParticipantOfIssue = participantOfIssue;
		participantOfIssue = newParticipantOfIssue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GropiusPackage.USER__PARTICIPANT_OF_ISSUE, oldParticipantOfIssue, newParticipantOfIssue);
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
	public void setParticipantOfIssue(Issue newParticipantOfIssue) {
		if (newParticipantOfIssue != participantOfIssue) {
			NotificationChain msgs = null;
			if (participantOfIssue != null)
				msgs = ((InternalEObject) participantOfIssue).eInverseRemove(this, GropiusPackage.ISSUE__PARTICIPANTS,
						Issue.class, msgs);
			if (newParticipantOfIssue != null)
				msgs = ((InternalEObject) newParticipantOfIssue).eInverseAdd(this, GropiusPackage.ISSUE__PARTICIPANTS,
						Issue.class, msgs);
			msgs = basicSetParticipantOfIssue(newParticipantOfIssue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.USER__PARTICIPANT_OF_ISSUE,
					newParticipantOfIssue, newParticipantOfIssue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getIssueComments() {
		if (issueComments != null && issueComments.eIsProxy()) {
			InternalEObject oldIssueComments = (InternalEObject) issueComments;
			issueComments = (Comment) eResolveProxy(oldIssueComments);
			if (issueComments != oldIssueComments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.USER__ISSUE_COMMENTS,
							oldIssueComments, issueComments));
			}
		}
		return issueComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetIssueComments() {
		return issueComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssueComments(Comment newIssueComments, NotificationChain msgs) {
		Comment oldIssueComments = issueComments;
		issueComments = newIssueComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GropiusPackage.USER__ISSUE_COMMENTS, oldIssueComments, newIssueComments);
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
	public void setIssueComments(Comment newIssueComments) {
		if (newIssueComments != issueComments) {
			NotificationChain msgs = null;
			if (issueComments != null)
				msgs = ((InternalEObject) issueComments).eInverseRemove(this, GropiusPackage.COMMENT__CREATED_BY,
						Comment.class, msgs);
			if (newIssueComments != null)
				msgs = ((InternalEObject) newIssueComments).eInverseAdd(this, GropiusPackage.COMMENT__CREATED_BY,
						Comment.class, msgs);
			msgs = basicSetIssueComments(newIssueComments, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.USER__ISSUE_COMMENTS, newIssueComments,
					newIssueComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GropiusPackage.USER__PROJECTS:
			if (projects != null)
				msgs = ((InternalEObject) projects).eInverseRemove(this, GropiusPackage.PROJECT__USERS, Project.class,
						msgs);
			return basicSetProjects((Project) otherEnd, msgs);
		case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
			if (assignedToIssues != null)
				msgs = ((InternalEObject) assignedToIssues).eInverseRemove(this, GropiusPackage.ISSUE__ASSIGNEES,
						Issue.class, msgs);
			return basicSetAssignedToIssues((Issue) otherEnd, msgs);
		case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
			if (participantOfIssue != null)
				msgs = ((InternalEObject) participantOfIssue).eInverseRemove(this, GropiusPackage.ISSUE__PARTICIPANTS,
						Issue.class, msgs);
			return basicSetParticipantOfIssue((Issue) otherEnd, msgs);
		case GropiusPackage.USER__ISSUE_COMMENTS:
			if (issueComments != null)
				msgs = ((InternalEObject) issueComments).eInverseRemove(this, GropiusPackage.COMMENT__CREATED_BY,
						Comment.class, msgs);
			return basicSetIssueComments((Comment) otherEnd, msgs);
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
			return basicSetProjects(null, msgs);
		case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
			return basicSetAssignedToIssues(null, msgs);
		case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
			return basicSetParticipantOfIssue(null, msgs);
		case GropiusPackage.USER__ISSUE_COMMENTS:
			return basicSetIssueComments(null, msgs);
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
			if (resolve)
				return getProjects();
			return basicGetProjects();
		case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
			if (resolve)
				return getAssignedToIssues();
			return basicGetAssignedToIssues();
		case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
			if (resolve)
				return getParticipantOfIssue();
			return basicGetParticipantOfIssue();
		case GropiusPackage.USER__ISSUE_COMMENTS:
			if (resolve)
				return getIssueComments();
			return basicGetIssueComments();
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
		case GropiusPackage.USER__ID:
			setId(newValue);
			return;
		case GropiusPackage.USER__USERNAME:
			setUsername((String) newValue);
			return;
		case GropiusPackage.USER__DISPLAYNAME:
			setDisplayname((String) newValue);
			return;
		case GropiusPackage.USER__EMAIL:
			setEmail((String) newValue);
			return;
		case GropiusPackage.USER__PROJECTS:
			setProjects((Project) newValue);
			return;
		case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
			setAssignedToIssues((Issue) newValue);
			return;
		case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
			setParticipantOfIssue((Issue) newValue);
			return;
		case GropiusPackage.USER__ISSUE_COMMENTS:
			setIssueComments((Comment) newValue);
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
			setId((Object) null);
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
			setProjects((Project) null);
			return;
		case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
			setAssignedToIssues((Issue) null);
			return;
		case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
			setParticipantOfIssue((Issue) null);
			return;
		case GropiusPackage.USER__ISSUE_COMMENTS:
			setIssueComments((Comment) null);
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
			return projects != null;
		case GropiusPackage.USER__ASSIGNED_TO_ISSUES:
			return assignedToIssues != null;
		case GropiusPackage.USER__PARTICIPANT_OF_ISSUE:
			return participantOfIssue != null;
		case GropiusPackage.USER__ISSUE_COMMENTS:
			return issueComments != null;
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
