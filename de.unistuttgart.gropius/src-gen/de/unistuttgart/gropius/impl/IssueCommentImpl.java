/**
 */
package de.unistuttgart.gropius.impl;

import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.Issue;
import de.unistuttgart.gropius.IssueComment;
import de.unistuttgart.gropius.IssueTimelineItem;
import de.unistuttgart.gropius.ReactionGroup;
import de.unistuttgart.gropius.User;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#getBodyRendered <em>Body Rendered</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#getCommentCreatedBy <em>Comment Created By</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#getEditedBy <em>Edited By</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#getCommentCreatedAt <em>Comment Created At</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#getLastEditedAt <em>Last Edited At</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#isCurrentUserCanEdit <em>Current User Can Edit</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#getReactions <em>Reactions</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueCommentImpl#getCreatedAt <em>Created At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueCommentImpl extends MinimalEObjectImpl.Container implements IssueComment {
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
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBodyRendered() <em>Body Rendered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyRendered()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_RENDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBodyRendered() <em>Body Rendered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyRendered()
	 * @generated
	 * @ordered
	 */
	protected String bodyRendered = BODY_RENDERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommentCreatedBy() <em>Comment Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected User commentCreatedBy;

	/**
	 * The cached value of the '{@link #getEditedBy() <em>Edited By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<User> editedBy;

	/**
	 * The default value of the '{@link #getCommentCreatedAt() <em>Comment Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date COMMENT_CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommentCreatedAt() <em>Comment Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date commentCreatedAt = COMMENT_CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastEditedAt() <em>Last Edited At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastEditedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_EDITED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastEditedAt() <em>Last Edited At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastEditedAt()
	 * @generated
	 * @ordered
	 */
	protected Date lastEditedAt = LAST_EDITED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCurrentUserCanEdit() <em>Current User Can Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentUserCanEdit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURRENT_USER_CAN_EDIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurrentUserCanEdit() <em>Current User Can Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentUserCanEdit()
	 * @generated
	 * @ordered
	 */
	protected boolean currentUserCanEdit = CURRENT_USER_CAN_EDIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReactions() <em>Reactions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReactionGroup> reactions;

	/**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
	protected Issue issue;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected User createdBy;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date createdAt = CREATED_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueCommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GropiusPackage.Literals.ISSUE_COMMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE_COMMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE_COMMENT__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBodyRendered() {
		return bodyRendered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyRendered(String newBodyRendered) {
		String oldBodyRendered = bodyRendered;
		bodyRendered = newBodyRendered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE_COMMENT__BODY_RENDERED,
					oldBodyRendered, bodyRendered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getCommentCreatedBy() {
		if (commentCreatedBy != null && commentCreatedBy.eIsProxy()) {
			InternalEObject oldCommentCreatedBy = (InternalEObject) commentCreatedBy;
			commentCreatedBy = (User) eResolveProxy(oldCommentCreatedBy);
			if (commentCreatedBy != oldCommentCreatedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_BY, oldCommentCreatedBy, commentCreatedBy));
			}
		}
		return commentCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetCommentCreatedBy() {
		return commentCreatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentCreatedBy(User newCommentCreatedBy) {
		User oldCommentCreatedBy = commentCreatedBy;
		commentCreatedBy = newCommentCreatedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_BY,
					oldCommentCreatedBy, commentCreatedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getEditedBy() {
		if (editedBy == null) {
			editedBy = new EObjectResolvingEList<User>(User.class, this, GropiusPackage.ISSUE_COMMENT__EDITED_BY);
		}
		return editedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCommentCreatedAt() {
		return commentCreatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommentCreatedAt(Date newCommentCreatedAt) {
		Date oldCommentCreatedAt = commentCreatedAt;
		commentCreatedAt = newCommentCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_AT,
					oldCommentCreatedAt, commentCreatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastEditedAt() {
		return lastEditedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastEditedAt(Date newLastEditedAt) {
		Date oldLastEditedAt = lastEditedAt;
		lastEditedAt = newLastEditedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE_COMMENT__LAST_EDITED_AT,
					oldLastEditedAt, lastEditedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCurrentUserCanEdit() {
		return currentUserCanEdit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentUserCanEdit(boolean newCurrentUserCanEdit) {
		boolean oldCurrentUserCanEdit = currentUserCanEdit;
		currentUserCanEdit = newCurrentUserCanEdit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE_COMMENT__CURRENT_USER_CAN_EDIT,
					oldCurrentUserCanEdit, currentUserCanEdit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReactionGroup> getReactions() {
		if (reactions == null) {
			reactions = new EObjectResolvingEList<ReactionGroup>(ReactionGroup.class, this,
					GropiusPackage.ISSUE_COMMENT__REACTIONS);
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue getIssue() {
		if (issue != null && issue.eIsProxy()) {
			InternalEObject oldIssue = (InternalEObject) issue;
			issue = (Issue) eResolveProxy(oldIssue);
			if (issue != oldIssue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE_COMMENT__ISSUE,
							oldIssue, issue));
			}
		}
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue basicGetIssue() {
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssue(Issue newIssue) {
		Issue oldIssue = issue;
		issue = newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE_COMMENT__ISSUE, oldIssue,
					issue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getCreatedBy() {
		if (createdBy != null && createdBy.eIsProxy()) {
			InternalEObject oldCreatedBy = (InternalEObject) createdBy;
			createdBy = (User) eResolveProxy(oldCreatedBy);
			if (createdBy != oldCreatedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE_COMMENT__CREATED_BY,
							oldCreatedBy, createdBy));
			}
		}
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(User newCreatedBy) {
		User oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE_COMMENT__CREATED_BY,
					oldCreatedBy, createdBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(Date newCreatedAt) {
		Date oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE_COMMENT__CREATED_AT,
					oldCreatedAt, createdAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GropiusPackage.ISSUE_COMMENT__ID:
			return getId();
		case GropiusPackage.ISSUE_COMMENT__BODY:
			return getBody();
		case GropiusPackage.ISSUE_COMMENT__BODY_RENDERED:
			return getBodyRendered();
		case GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_BY:
			if (resolve)
				return getCommentCreatedBy();
			return basicGetCommentCreatedBy();
		case GropiusPackage.ISSUE_COMMENT__EDITED_BY:
			return getEditedBy();
		case GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_AT:
			return getCommentCreatedAt();
		case GropiusPackage.ISSUE_COMMENT__LAST_EDITED_AT:
			return getLastEditedAt();
		case GropiusPackage.ISSUE_COMMENT__CURRENT_USER_CAN_EDIT:
			return isCurrentUserCanEdit();
		case GropiusPackage.ISSUE_COMMENT__REACTIONS:
			return getReactions();
		case GropiusPackage.ISSUE_COMMENT__ISSUE:
			if (resolve)
				return getIssue();
			return basicGetIssue();
		case GropiusPackage.ISSUE_COMMENT__CREATED_BY:
			if (resolve)
				return getCreatedBy();
			return basicGetCreatedBy();
		case GropiusPackage.ISSUE_COMMENT__CREATED_AT:
			return getCreatedAt();
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
		case GropiusPackage.ISSUE_COMMENT__ID:
			setId((String) newValue);
			return;
		case GropiusPackage.ISSUE_COMMENT__BODY:
			setBody((String) newValue);
			return;
		case GropiusPackage.ISSUE_COMMENT__BODY_RENDERED:
			setBodyRendered((String) newValue);
			return;
		case GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_BY:
			setCommentCreatedBy((User) newValue);
			return;
		case GropiusPackage.ISSUE_COMMENT__EDITED_BY:
			getEditedBy().clear();
			getEditedBy().addAll((Collection<? extends User>) newValue);
			return;
		case GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_AT:
			setCommentCreatedAt((Date) newValue);
			return;
		case GropiusPackage.ISSUE_COMMENT__LAST_EDITED_AT:
			setLastEditedAt((Date) newValue);
			return;
		case GropiusPackage.ISSUE_COMMENT__CURRENT_USER_CAN_EDIT:
			setCurrentUserCanEdit((Boolean) newValue);
			return;
		case GropiusPackage.ISSUE_COMMENT__REACTIONS:
			getReactions().clear();
			getReactions().addAll((Collection<? extends ReactionGroup>) newValue);
			return;
		case GropiusPackage.ISSUE_COMMENT__ISSUE:
			setIssue((Issue) newValue);
			return;
		case GropiusPackage.ISSUE_COMMENT__CREATED_BY:
			setCreatedBy((User) newValue);
			return;
		case GropiusPackage.ISSUE_COMMENT__CREATED_AT:
			setCreatedAt((Date) newValue);
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
		case GropiusPackage.ISSUE_COMMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case GropiusPackage.ISSUE_COMMENT__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case GropiusPackage.ISSUE_COMMENT__BODY_RENDERED:
			setBodyRendered(BODY_RENDERED_EDEFAULT);
			return;
		case GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_BY:
			setCommentCreatedBy((User) null);
			return;
		case GropiusPackage.ISSUE_COMMENT__EDITED_BY:
			getEditedBy().clear();
			return;
		case GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_AT:
			setCommentCreatedAt(COMMENT_CREATED_AT_EDEFAULT);
			return;
		case GropiusPackage.ISSUE_COMMENT__LAST_EDITED_AT:
			setLastEditedAt(LAST_EDITED_AT_EDEFAULT);
			return;
		case GropiusPackage.ISSUE_COMMENT__CURRENT_USER_CAN_EDIT:
			setCurrentUserCanEdit(CURRENT_USER_CAN_EDIT_EDEFAULT);
			return;
		case GropiusPackage.ISSUE_COMMENT__REACTIONS:
			getReactions().clear();
			return;
		case GropiusPackage.ISSUE_COMMENT__ISSUE:
			setIssue((Issue) null);
			return;
		case GropiusPackage.ISSUE_COMMENT__CREATED_BY:
			setCreatedBy((User) null);
			return;
		case GropiusPackage.ISSUE_COMMENT__CREATED_AT:
			setCreatedAt(CREATED_AT_EDEFAULT);
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
		case GropiusPackage.ISSUE_COMMENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GropiusPackage.ISSUE_COMMENT__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
		case GropiusPackage.ISSUE_COMMENT__BODY_RENDERED:
			return BODY_RENDERED_EDEFAULT == null ? bodyRendered != null : !BODY_RENDERED_EDEFAULT.equals(bodyRendered);
		case GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_BY:
			return commentCreatedBy != null;
		case GropiusPackage.ISSUE_COMMENT__EDITED_BY:
			return editedBy != null && !editedBy.isEmpty();
		case GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_AT:
			return COMMENT_CREATED_AT_EDEFAULT == null ? commentCreatedAt != null
					: !COMMENT_CREATED_AT_EDEFAULT.equals(commentCreatedAt);
		case GropiusPackage.ISSUE_COMMENT__LAST_EDITED_AT:
			return LAST_EDITED_AT_EDEFAULT == null ? lastEditedAt != null
					: !LAST_EDITED_AT_EDEFAULT.equals(lastEditedAt);
		case GropiusPackage.ISSUE_COMMENT__CURRENT_USER_CAN_EDIT:
			return currentUserCanEdit != CURRENT_USER_CAN_EDIT_EDEFAULT;
		case GropiusPackage.ISSUE_COMMENT__REACTIONS:
			return reactions != null && !reactions.isEmpty();
		case GropiusPackage.ISSUE_COMMENT__ISSUE:
			return issue != null;
		case GropiusPackage.ISSUE_COMMENT__CREATED_BY:
			return createdBy != null;
		case GropiusPackage.ISSUE_COMMENT__CREATED_AT:
			return CREATED_AT_EDEFAULT == null ? createdAt != null : !CREATED_AT_EDEFAULT.equals(createdAt);
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
		if (baseClass == IssueTimelineItem.class) {
			switch (derivedFeatureID) {
			case GropiusPackage.ISSUE_COMMENT__ISSUE:
				return GropiusPackage.ISSUE_TIMELINE_ITEM__ISSUE;
			case GropiusPackage.ISSUE_COMMENT__CREATED_BY:
				return GropiusPackage.ISSUE_TIMELINE_ITEM__CREATED_BY;
			case GropiusPackage.ISSUE_COMMENT__CREATED_AT:
				return GropiusPackage.ISSUE_TIMELINE_ITEM__CREATED_AT;
			default:
				return -1;
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
		if (baseClass == IssueTimelineItem.class) {
			switch (baseFeatureID) {
			case GropiusPackage.ISSUE_TIMELINE_ITEM__ISSUE:
				return GropiusPackage.ISSUE_COMMENT__ISSUE;
			case GropiusPackage.ISSUE_TIMELINE_ITEM__CREATED_BY:
				return GropiusPackage.ISSUE_COMMENT__CREATED_BY;
			case GropiusPackage.ISSUE_TIMELINE_ITEM__CREATED_AT:
				return GropiusPackage.ISSUE_COMMENT__CREATED_AT;
			default:
				return -1;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", body: ");
		result.append(body);
		result.append(", bodyRendered: ");
		result.append(bodyRendered);
		result.append(", commentCreatedAt: ");
		result.append(commentCreatedAt);
		result.append(", lastEditedAt: ");
		result.append(lastEditedAt);
		result.append(", currentUserCanEdit: ");
		result.append(currentUserCanEdit);
		result.append(", createdAt: ");
		result.append(createdAt);
		result.append(')');
		return result.toString();
	}

} //IssueCommentImpl
