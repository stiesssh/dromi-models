/**
 */
package de.unistuttgart.gropius.impl;

import de.unistuttgart.gropius.Comment;
import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.Issue;
import de.unistuttgart.gropius.IssueCategory;
import de.unistuttgart.gropius.IssueLocation;
import de.unistuttgart.gropius.IssueTimelineItem;
import de.unistuttgart.gropius.Label;
import de.unistuttgart.gropius.Node;
import de.unistuttgart.gropius.ReactionGroup;
import de.unistuttgart.gropius.User;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getBodyRendered <em>Body Rendered</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getEditedBy <em>Edited By</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getLastEditedAt <em>Last Edited At</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#isCurrentUserCanEdit <em>Current User Can Edit</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getReactions <em>Reactions</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#isIsOpen <em>Is Open</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#isIsDuplicate <em>Is Duplicate</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#isCurrentUserCanComment <em>Current User Can Comment</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getEstimatedTime <em>Estimated Time</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getSpentTime <em>Spent Time</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getIssueComments <em>Issue Comments</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getLinksToIssues <em>Links To Issues</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getLinkedByIssues <em>Linked By Issues</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getAssignees <em>Assignees</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getPinnedOn <em>Pinned On</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getTimeline <em>Timeline</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.IssueImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends MinimalEObjectImpl.Container implements Issue {
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
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected User createdBy;

	/**
	 * The cached value of the '{@link #getEditedBy() <em>Edited By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditedBy()
	 * @generated
	 * @ordered
	 */
	protected User editedBy;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected Object createdAt;

	/**
	 * The cached value of the '{@link #getLastEditedAt() <em>Last Edited At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastEditedAt()
	 * @generated
	 * @ordered
	 */
	protected Object lastEditedAt;

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
	 * The cached value of the '{@link #getReactions() <em>Reactions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactions()
	 * @generated
	 * @ordered
	 */
	protected ReactionGroup reactions;

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
	 * The cached value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected Object updatedAt;

	/**
	 * The default value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOpen() <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean isOpen = IS_OPEN_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDuplicate() <em>Is Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDuplicate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DUPLICATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDuplicate() <em>Is Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDuplicate()
	 * @generated
	 * @ordered
	 */
	protected boolean isDuplicate = IS_DUPLICATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final IssueCategory CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected IssueCategory category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCurrentUserCanComment() <em>Current User Can Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentUserCanComment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CURRENT_USER_CAN_COMMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCurrentUserCanComment() <em>Current User Can Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCurrentUserCanComment()
	 * @generated
	 * @ordered
	 */
	protected boolean currentUserCanComment = CURRENT_USER_CAN_COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Object startDate;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Object dueDate;

	/**
	 * The cached value of the '{@link #getEstimatedTime() <em>Estimated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedTime()
	 * @generated
	 * @ordered
	 */
	protected Object estimatedTime;

	/**
	 * The cached value of the '{@link #getSpentTime() <em>Spent Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpentTime()
	 * @generated
	 * @ordered
	 */
	protected Object spentTime;

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
	 * The cached value of the '{@link #getLinksToIssues() <em>Links To Issues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinksToIssues()
	 * @generated
	 * @ordered
	 */
	protected Issue linksToIssues;

	/**
	 * The cached value of the '{@link #getLinkedByIssues() <em>Linked By Issues</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedByIssues()
	 * @generated
	 * @ordered
	 */
	protected Issue linkedByIssues;

	/**
	 * The cached value of the '{@link #getAssignees() <em>Assignees</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignees()
	 * @generated
	 * @ordered
	 */
	protected User assignees;

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
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected User participants;

	/**
	 * The cached value of the '{@link #getPinnedOn() <em>Pinned On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinnedOn()
	 * @generated
	 * @ordered
	 */
	protected Component pinnedOn;

	/**
	 * The cached value of the '{@link #getTimeline() <em>Timeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeline()
	 * @generated
	 * @ordered
	 */
	protected IssueTimelineItem timeline;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected IssueLocation location;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GropiusPackage.Literals.ISSUE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__BODY, oldBody, body));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__BODY_RENDERED, oldBodyRendered,
					bodyRendered));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__CREATED_BY,
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
	public NotificationChain basicSetCreatedBy(User newCreatedBy, NotificationChain msgs) {
		User oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GropiusPackage.ISSUE__CREATED_BY, oldCreatedBy, newCreatedBy);
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
	public void setCreatedBy(User newCreatedBy) {
		if (newCreatedBy != createdBy) {
			NotificationChain msgs = null;
			if (createdBy != null)
				msgs = ((InternalEObject) createdBy).eInverseRemove(this, GropiusPackage.USER__ISSUE_COMMENTS,
						User.class, msgs);
			if (newCreatedBy != null)
				msgs = ((InternalEObject) newCreatedBy).eInverseAdd(this, GropiusPackage.USER__ISSUE_COMMENTS,
						User.class, msgs);
			msgs = basicSetCreatedBy(newCreatedBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__CREATED_BY, newCreatedBy,
					newCreatedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getEditedBy() {
		if (editedBy != null && editedBy.eIsProxy()) {
			InternalEObject oldEditedBy = (InternalEObject) editedBy;
			editedBy = (User) eResolveProxy(oldEditedBy);
			if (editedBy != oldEditedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__EDITED_BY,
							oldEditedBy, editedBy));
			}
		}
		return editedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetEditedBy() {
		return editedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditedBy(User newEditedBy) {
		User oldEditedBy = editedBy;
		editedBy = newEditedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__EDITED_BY, oldEditedBy,
					editedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(Object newCreatedAt) {
		Object oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__CREATED_AT, oldCreatedAt,
					createdAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLastEditedAt() {
		return lastEditedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastEditedAt(Object newLastEditedAt) {
		Object oldLastEditedAt = lastEditedAt;
		lastEditedAt = newLastEditedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__LAST_EDITED_AT, oldLastEditedAt,
					lastEditedAt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__CURRENT_USER_CAN_EDIT,
					oldCurrentUserCanEdit, currentUserCanEdit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionGroup getReactions() {
		if (reactions != null && reactions.eIsProxy()) {
			InternalEObject oldReactions = (InternalEObject) reactions;
			reactions = (ReactionGroup) eResolveProxy(oldReactions);
			if (reactions != oldReactions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__REACTIONS,
							oldReactions, reactions));
			}
		}
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReactionGroup basicGetReactions() {
		return reactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactions(ReactionGroup newReactions) {
		ReactionGroup oldReactions = reactions;
		reactions = newReactions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__REACTIONS, oldReactions,
					reactions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatedAt(Object newUpdatedAt) {
		Object oldUpdatedAt = updatedAt;
		updatedAt = newUpdatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__UPDATED_AT, oldUpdatedAt,
					updatedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOpen() {
		return isOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOpen(boolean newIsOpen) {
		boolean oldIsOpen = isOpen;
		isOpen = newIsOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__IS_OPEN, oldIsOpen, isOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDuplicate() {
		return isDuplicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDuplicate(boolean newIsDuplicate) {
		boolean oldIsDuplicate = isDuplicate;
		isDuplicate = newIsDuplicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__IS_DUPLICATE, oldIsDuplicate,
					isDuplicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(IssueCategory newCategory) {
		IssueCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__CATEGORY, oldCategory,
					category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCurrentUserCanComment() {
		return currentUserCanComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentUserCanComment(boolean newCurrentUserCanComment) {
		boolean oldCurrentUserCanComment = currentUserCanComment;
		currentUserCanComment = newCurrentUserCanComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__CURRENT_USER_CAN_COMMENT,
					oldCurrentUserCanComment, currentUserCanComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Object newStartDate) {
		Object oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__START_DATE, oldStartDate,
					startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(Object newDueDate) {
		Object oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getEstimatedTime() {
		return estimatedTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimatedTime(Object newEstimatedTime) {
		Object oldEstimatedTime = estimatedTime;
		estimatedTime = newEstimatedTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__ESTIMATED_TIME,
					oldEstimatedTime, estimatedTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSpentTime() {
		return spentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpentTime(Object newSpentTime) {
		Object oldSpentTime = spentTime;
		spentTime = newSpentTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__SPENT_TIME, oldSpentTime,
					spentTime));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__ISSUE_COMMENTS,
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
	public void setIssueComments(Comment newIssueComments) {
		Comment oldIssueComments = issueComments;
		issueComments = newIssueComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__ISSUE_COMMENTS,
					oldIssueComments, issueComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue getLinksToIssues() {
		if (linksToIssues != null && linksToIssues.eIsProxy()) {
			InternalEObject oldLinksToIssues = (InternalEObject) linksToIssues;
			linksToIssues = (Issue) eResolveProxy(oldLinksToIssues);
			if (linksToIssues != oldLinksToIssues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__LINKS_TO_ISSUES,
							oldLinksToIssues, linksToIssues));
			}
		}
		return linksToIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue basicGetLinksToIssues() {
		return linksToIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinksToIssues(Issue newLinksToIssues) {
		Issue oldLinksToIssues = linksToIssues;
		linksToIssues = newLinksToIssues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__LINKS_TO_ISSUES,
					oldLinksToIssues, linksToIssues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue getLinkedByIssues() {
		if (linkedByIssues != null && linkedByIssues.eIsProxy()) {
			InternalEObject oldLinkedByIssues = (InternalEObject) linkedByIssues;
			linkedByIssues = (Issue) eResolveProxy(oldLinkedByIssues);
			if (linkedByIssues != oldLinkedByIssues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__LINKED_BY_ISSUES,
							oldLinkedByIssues, linkedByIssues));
			}
		}
		return linkedByIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Issue basicGetLinkedByIssues() {
		return linkedByIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedByIssues(Issue newLinkedByIssues) {
		Issue oldLinkedByIssues = linkedByIssues;
		linkedByIssues = newLinkedByIssues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__LINKED_BY_ISSUES,
					oldLinkedByIssues, linkedByIssues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getAssignees() {
		if (assignees != null && assignees.eIsProxy()) {
			InternalEObject oldAssignees = (InternalEObject) assignees;
			assignees = (User) eResolveProxy(oldAssignees);
			if (assignees != oldAssignees) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__ASSIGNEES,
							oldAssignees, assignees));
			}
		}
		return assignees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAssignees() {
		return assignees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignees(User newAssignees, NotificationChain msgs) {
		User oldAssignees = assignees;
		assignees = newAssignees;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GropiusPackage.ISSUE__ASSIGNEES, oldAssignees, newAssignees);
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
	public void setAssignees(User newAssignees) {
		if (newAssignees != assignees) {
			NotificationChain msgs = null;
			if (assignees != null)
				msgs = ((InternalEObject) assignees).eInverseRemove(this, GropiusPackage.USER__ASSIGNED_TO_ISSUES,
						User.class, msgs);
			if (newAssignees != null)
				msgs = ((InternalEObject) newAssignees).eInverseAdd(this, GropiusPackage.USER__ASSIGNED_TO_ISSUES,
						User.class, msgs);
			msgs = basicSetAssignees(newAssignees, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__ASSIGNEES, newAssignees,
					newAssignees));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__LABELS, oldLabels,
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__LABELS, oldLabels, labels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getParticipants() {
		if (participants != null && participants.eIsProxy()) {
			InternalEObject oldParticipants = (InternalEObject) participants;
			participants = (User) eResolveProxy(oldParticipants);
			if (participants != oldParticipants) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__PARTICIPANTS,
							oldParticipants, participants));
			}
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetParticipants() {
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipants(User newParticipants, NotificationChain msgs) {
		User oldParticipants = participants;
		participants = newParticipants;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GropiusPackage.ISSUE__PARTICIPANTS, oldParticipants, newParticipants);
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
	public void setParticipants(User newParticipants) {
		if (newParticipants != participants) {
			NotificationChain msgs = null;
			if (participants != null)
				msgs = ((InternalEObject) participants).eInverseRemove(this, GropiusPackage.USER__PARTICIPANT_OF_ISSUE,
						User.class, msgs);
			if (newParticipants != null)
				msgs = ((InternalEObject) newParticipants).eInverseAdd(this, GropiusPackage.USER__PARTICIPANT_OF_ISSUE,
						User.class, msgs);
			msgs = basicSetParticipants(newParticipants, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__PARTICIPANTS, newParticipants,
					newParticipants));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getPinnedOn() {
		if (pinnedOn != null && pinnedOn.eIsProxy()) {
			InternalEObject oldPinnedOn = (InternalEObject) pinnedOn;
			pinnedOn = (Component) eResolveProxy(oldPinnedOn);
			if (pinnedOn != oldPinnedOn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__PINNED_ON,
							oldPinnedOn, pinnedOn));
			}
		}
		return pinnedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetPinnedOn() {
		return pinnedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinnedOn(Component newPinnedOn) {
		Component oldPinnedOn = pinnedOn;
		pinnedOn = newPinnedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__PINNED_ON, oldPinnedOn,
					pinnedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTimelineItem getTimeline() {
		if (timeline != null && timeline.eIsProxy()) {
			InternalEObject oldTimeline = (InternalEObject) timeline;
			timeline = (IssueTimelineItem) eResolveProxy(oldTimeline);
			if (timeline != oldTimeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__TIMELINE,
							oldTimeline, timeline));
			}
		}
		return timeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueTimelineItem basicGetTimeline() {
		return timeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeline(IssueTimelineItem newTimeline) {
		IssueTimelineItem oldTimeline = timeline;
		timeline = newTimeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__TIMELINE, oldTimeline,
					timeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueLocation getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject) location;
			location = (IssueLocation) eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.ISSUE__LOCATION,
							oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueLocation basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(IssueLocation newLocation) {
		IssueLocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.ISSUE__LOCATION, oldLocation,
					location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GropiusPackage.ISSUE__CREATED_BY:
			if (createdBy != null)
				msgs = ((InternalEObject) createdBy).eInverseRemove(this, GropiusPackage.USER__ISSUE_COMMENTS,
						User.class, msgs);
			return basicSetCreatedBy((User) otherEnd, msgs);
		case GropiusPackage.ISSUE__ASSIGNEES:
			if (assignees != null)
				msgs = ((InternalEObject) assignees).eInverseRemove(this, GropiusPackage.USER__ASSIGNED_TO_ISSUES,
						User.class, msgs);
			return basicSetAssignees((User) otherEnd, msgs);
		case GropiusPackage.ISSUE__PARTICIPANTS:
			if (participants != null)
				msgs = ((InternalEObject) participants).eInverseRemove(this, GropiusPackage.USER__PARTICIPANT_OF_ISSUE,
						User.class, msgs);
			return basicSetParticipants((User) otherEnd, msgs);
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
		case GropiusPackage.ISSUE__CREATED_BY:
			return basicSetCreatedBy(null, msgs);
		case GropiusPackage.ISSUE__ASSIGNEES:
			return basicSetAssignees(null, msgs);
		case GropiusPackage.ISSUE__PARTICIPANTS:
			return basicSetParticipants(null, msgs);
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
		case GropiusPackage.ISSUE__BODY:
			return getBody();
		case GropiusPackage.ISSUE__BODY_RENDERED:
			return getBodyRendered();
		case GropiusPackage.ISSUE__CREATED_BY:
			if (resolve)
				return getCreatedBy();
			return basicGetCreatedBy();
		case GropiusPackage.ISSUE__EDITED_BY:
			if (resolve)
				return getEditedBy();
			return basicGetEditedBy();
		case GropiusPackage.ISSUE__CREATED_AT:
			return getCreatedAt();
		case GropiusPackage.ISSUE__LAST_EDITED_AT:
			return getLastEditedAt();
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_EDIT:
			return isCurrentUserCanEdit();
		case GropiusPackage.ISSUE__REACTIONS:
			if (resolve)
				return getReactions();
			return basicGetReactions();
		case GropiusPackage.ISSUE__ID:
			return getId();
		case GropiusPackage.ISSUE__UPDATED_AT:
			return getUpdatedAt();
		case GropiusPackage.ISSUE__IS_OPEN:
			return isIsOpen();
		case GropiusPackage.ISSUE__IS_DUPLICATE:
			return isIsDuplicate();
		case GropiusPackage.ISSUE__CATEGORY:
			return getCategory();
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_COMMENT:
			return isCurrentUserCanComment();
		case GropiusPackage.ISSUE__START_DATE:
			return getStartDate();
		case GropiusPackage.ISSUE__DUE_DATE:
			return getDueDate();
		case GropiusPackage.ISSUE__ESTIMATED_TIME:
			return getEstimatedTime();
		case GropiusPackage.ISSUE__SPENT_TIME:
			return getSpentTime();
		case GropiusPackage.ISSUE__ISSUE_COMMENTS:
			if (resolve)
				return getIssueComments();
			return basicGetIssueComments();
		case GropiusPackage.ISSUE__LINKS_TO_ISSUES:
			if (resolve)
				return getLinksToIssues();
			return basicGetLinksToIssues();
		case GropiusPackage.ISSUE__LINKED_BY_ISSUES:
			if (resolve)
				return getLinkedByIssues();
			return basicGetLinkedByIssues();
		case GropiusPackage.ISSUE__ASSIGNEES:
			if (resolve)
				return getAssignees();
			return basicGetAssignees();
		case GropiusPackage.ISSUE__LABELS:
			if (resolve)
				return getLabels();
			return basicGetLabels();
		case GropiusPackage.ISSUE__PARTICIPANTS:
			if (resolve)
				return getParticipants();
			return basicGetParticipants();
		case GropiusPackage.ISSUE__PINNED_ON:
			if (resolve)
				return getPinnedOn();
			return basicGetPinnedOn();
		case GropiusPackage.ISSUE__TIMELINE:
			if (resolve)
				return getTimeline();
			return basicGetTimeline();
		case GropiusPackage.ISSUE__LOCATION:
			if (resolve)
				return getLocation();
			return basicGetLocation();
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
		case GropiusPackage.ISSUE__BODY:
			setBody((String) newValue);
			return;
		case GropiusPackage.ISSUE__BODY_RENDERED:
			setBodyRendered((String) newValue);
			return;
		case GropiusPackage.ISSUE__CREATED_BY:
			setCreatedBy((User) newValue);
			return;
		case GropiusPackage.ISSUE__EDITED_BY:
			setEditedBy((User) newValue);
			return;
		case GropiusPackage.ISSUE__CREATED_AT:
			setCreatedAt(newValue);
			return;
		case GropiusPackage.ISSUE__LAST_EDITED_AT:
			setLastEditedAt(newValue);
			return;
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_EDIT:
			setCurrentUserCanEdit((Boolean) newValue);
			return;
		case GropiusPackage.ISSUE__REACTIONS:
			setReactions((ReactionGroup) newValue);
			return;
		case GropiusPackage.ISSUE__ID:
			setId(newValue);
			return;
		case GropiusPackage.ISSUE__UPDATED_AT:
			setUpdatedAt(newValue);
			return;
		case GropiusPackage.ISSUE__IS_OPEN:
			setIsOpen((Boolean) newValue);
			return;
		case GropiusPackage.ISSUE__IS_DUPLICATE:
			setIsDuplicate((Boolean) newValue);
			return;
		case GropiusPackage.ISSUE__CATEGORY:
			setCategory((IssueCategory) newValue);
			return;
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_COMMENT:
			setCurrentUserCanComment((Boolean) newValue);
			return;
		case GropiusPackage.ISSUE__START_DATE:
			setStartDate(newValue);
			return;
		case GropiusPackage.ISSUE__DUE_DATE:
			setDueDate(newValue);
			return;
		case GropiusPackage.ISSUE__ESTIMATED_TIME:
			setEstimatedTime(newValue);
			return;
		case GropiusPackage.ISSUE__SPENT_TIME:
			setSpentTime(newValue);
			return;
		case GropiusPackage.ISSUE__ISSUE_COMMENTS:
			setIssueComments((Comment) newValue);
			return;
		case GropiusPackage.ISSUE__LINKS_TO_ISSUES:
			setLinksToIssues((Issue) newValue);
			return;
		case GropiusPackage.ISSUE__LINKED_BY_ISSUES:
			setLinkedByIssues((Issue) newValue);
			return;
		case GropiusPackage.ISSUE__ASSIGNEES:
			setAssignees((User) newValue);
			return;
		case GropiusPackage.ISSUE__LABELS:
			setLabels((Label) newValue);
			return;
		case GropiusPackage.ISSUE__PARTICIPANTS:
			setParticipants((User) newValue);
			return;
		case GropiusPackage.ISSUE__PINNED_ON:
			setPinnedOn((Component) newValue);
			return;
		case GropiusPackage.ISSUE__TIMELINE:
			setTimeline((IssueTimelineItem) newValue);
			return;
		case GropiusPackage.ISSUE__LOCATION:
			setLocation((IssueLocation) newValue);
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
		case GropiusPackage.ISSUE__BODY:
			setBody(BODY_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__BODY_RENDERED:
			setBodyRendered(BODY_RENDERED_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__CREATED_BY:
			setCreatedBy((User) null);
			return;
		case GropiusPackage.ISSUE__EDITED_BY:
			setEditedBy((User) null);
			return;
		case GropiusPackage.ISSUE__CREATED_AT:
			setCreatedAt((Object) null);
			return;
		case GropiusPackage.ISSUE__LAST_EDITED_AT:
			setLastEditedAt((Object) null);
			return;
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_EDIT:
			setCurrentUserCanEdit(CURRENT_USER_CAN_EDIT_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__REACTIONS:
			setReactions((ReactionGroup) null);
			return;
		case GropiusPackage.ISSUE__ID:
			setId((Object) null);
			return;
		case GropiusPackage.ISSUE__UPDATED_AT:
			setUpdatedAt((Object) null);
			return;
		case GropiusPackage.ISSUE__IS_OPEN:
			setIsOpen(IS_OPEN_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__IS_DUPLICATE:
			setIsDuplicate(IS_DUPLICATE_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_COMMENT:
			setCurrentUserCanComment(CURRENT_USER_CAN_COMMENT_EDEFAULT);
			return;
		case GropiusPackage.ISSUE__START_DATE:
			setStartDate((Object) null);
			return;
		case GropiusPackage.ISSUE__DUE_DATE:
			setDueDate((Object) null);
			return;
		case GropiusPackage.ISSUE__ESTIMATED_TIME:
			setEstimatedTime((Object) null);
			return;
		case GropiusPackage.ISSUE__SPENT_TIME:
			setSpentTime((Object) null);
			return;
		case GropiusPackage.ISSUE__ISSUE_COMMENTS:
			setIssueComments((Comment) null);
			return;
		case GropiusPackage.ISSUE__LINKS_TO_ISSUES:
			setLinksToIssues((Issue) null);
			return;
		case GropiusPackage.ISSUE__LINKED_BY_ISSUES:
			setLinkedByIssues((Issue) null);
			return;
		case GropiusPackage.ISSUE__ASSIGNEES:
			setAssignees((User) null);
			return;
		case GropiusPackage.ISSUE__LABELS:
			setLabels((Label) null);
			return;
		case GropiusPackage.ISSUE__PARTICIPANTS:
			setParticipants((User) null);
			return;
		case GropiusPackage.ISSUE__PINNED_ON:
			setPinnedOn((Component) null);
			return;
		case GropiusPackage.ISSUE__TIMELINE:
			setTimeline((IssueTimelineItem) null);
			return;
		case GropiusPackage.ISSUE__LOCATION:
			setLocation((IssueLocation) null);
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
		case GropiusPackage.ISSUE__BODY:
			return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
		case GropiusPackage.ISSUE__BODY_RENDERED:
			return BODY_RENDERED_EDEFAULT == null ? bodyRendered != null : !BODY_RENDERED_EDEFAULT.equals(bodyRendered);
		case GropiusPackage.ISSUE__CREATED_BY:
			return createdBy != null;
		case GropiusPackage.ISSUE__EDITED_BY:
			return editedBy != null;
		case GropiusPackage.ISSUE__CREATED_AT:
			return createdAt != null;
		case GropiusPackage.ISSUE__LAST_EDITED_AT:
			return lastEditedAt != null;
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_EDIT:
			return currentUserCanEdit != CURRENT_USER_CAN_EDIT_EDEFAULT;
		case GropiusPackage.ISSUE__REACTIONS:
			return reactions != null;
		case GropiusPackage.ISSUE__ID:
			return id != null;
		case GropiusPackage.ISSUE__UPDATED_AT:
			return updatedAt != null;
		case GropiusPackage.ISSUE__IS_OPEN:
			return isOpen != IS_OPEN_EDEFAULT;
		case GropiusPackage.ISSUE__IS_DUPLICATE:
			return isDuplicate != IS_DUPLICATE_EDEFAULT;
		case GropiusPackage.ISSUE__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case GropiusPackage.ISSUE__CURRENT_USER_CAN_COMMENT:
			return currentUserCanComment != CURRENT_USER_CAN_COMMENT_EDEFAULT;
		case GropiusPackage.ISSUE__START_DATE:
			return startDate != null;
		case GropiusPackage.ISSUE__DUE_DATE:
			return dueDate != null;
		case GropiusPackage.ISSUE__ESTIMATED_TIME:
			return estimatedTime != null;
		case GropiusPackage.ISSUE__SPENT_TIME:
			return spentTime != null;
		case GropiusPackage.ISSUE__ISSUE_COMMENTS:
			return issueComments != null;
		case GropiusPackage.ISSUE__LINKS_TO_ISSUES:
			return linksToIssues != null;
		case GropiusPackage.ISSUE__LINKED_BY_ISSUES:
			return linkedByIssues != null;
		case GropiusPackage.ISSUE__ASSIGNEES:
			return assignees != null;
		case GropiusPackage.ISSUE__LABELS:
			return labels != null;
		case GropiusPackage.ISSUE__PARTICIPANTS:
			return participants != null;
		case GropiusPackage.ISSUE__PINNED_ON:
			return pinnedOn != null;
		case GropiusPackage.ISSUE__TIMELINE:
			return timeline != null;
		case GropiusPackage.ISSUE__LOCATION:
			return location != null;
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
			case GropiusPackage.ISSUE__ID:
				return GropiusPackage.NODE__ID;
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
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
			case GropiusPackage.NODE__ID:
				return GropiusPackage.ISSUE__ID;
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
		result.append(" (body: ");
		result.append(body);
		result.append(", bodyRendered: ");
		result.append(bodyRendered);
		result.append(", createdAt: ");
		result.append(createdAt);
		result.append(", lastEditedAt: ");
		result.append(lastEditedAt);
		result.append(", currentUserCanEdit: ");
		result.append(currentUserCanEdit);
		result.append(", id: ");
		result.append(id);
		result.append(", updatedAt: ");
		result.append(updatedAt);
		result.append(", isOpen: ");
		result.append(isOpen);
		result.append(", isDuplicate: ");
		result.append(isDuplicate);
		result.append(", category: ");
		result.append(category);
		result.append(", currentUserCanComment: ");
		result.append(currentUserCanComment);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", estimatedTime: ");
		result.append(estimatedTime);
		result.append(", spentTime: ");
		result.append(spentTime);
		result.append(')');
		return result.toString();
	}

} //IssueImpl
