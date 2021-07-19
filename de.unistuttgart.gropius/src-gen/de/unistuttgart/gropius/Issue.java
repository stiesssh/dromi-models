/**
 */
package de.unistuttgart.gropius;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.Issue#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#isIsOpen <em>Is Open</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#isIsDuplicate <em>Is Duplicate</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getCategory <em>Category</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#isCurrentUserCanComment <em>Current User Can Comment</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getEstimatedTime <em>Estimated Time</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getSpentTime <em>Spent Time</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getIssueComments <em>Issue Comments</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getLinksToIssues <em>Links To Issues</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getLinkedByIssues <em>Linked By Issues</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getAssignees <em>Assignees</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getLabels <em>Labels</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getParticipants <em>Participants</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getPinnedOn <em>Pinned On</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getTimeline <em>Timeline</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Issue#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.GropiusPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends Comment, Node {
	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(Date)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_UpdatedAt()
	 * @model dataType="de.unistuttgart.gropius.Date"
	 * @generated
	 */
	Date getUpdatedAt();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Issue#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Is Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Open</em>' attribute.
	 * @see #setIsOpen(boolean)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_IsOpen()
	 * @model
	 * @generated
	 */
	boolean isIsOpen();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Issue#isIsOpen <em>Is Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Open</em>' attribute.
	 * @see #isIsOpen()
	 * @generated
	 */
	void setIsOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Duplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Duplicate</em>' attribute.
	 * @see #setIsDuplicate(boolean)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_IsDuplicate()
	 * @model
	 * @generated
	 */
	boolean isIsDuplicate();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Issue#isIsDuplicate <em>Is Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Duplicate</em>' attribute.
	 * @see #isIsDuplicate()
	 * @generated
	 */
	void setIsDuplicate(boolean value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link de.unistuttgart.gropius.IssueCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see de.unistuttgart.gropius.IssueCategory
	 * @see #setCategory(IssueCategory)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_Category()
	 * @model
	 * @generated
	 */
	IssueCategory getCategory();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Issue#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see de.unistuttgart.gropius.IssueCategory
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(IssueCategory value);

	/**
	 * Returns the value of the '<em><b>Current User Can Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current User Can Comment</em>' attribute.
	 * @see #setCurrentUserCanComment(boolean)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_CurrentUserCanComment()
	 * @model
	 * @generated
	 */
	boolean isCurrentUserCanComment();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Issue#isCurrentUserCanComment <em>Current User Can Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current User Can Comment</em>' attribute.
	 * @see #isCurrentUserCanComment()
	 * @generated
	 */
	void setCurrentUserCanComment(boolean value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_StartDate()
	 * @model dataType="de.unistuttgart.gropius.Date"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Issue#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_DueDate()
	 * @model dataType="de.unistuttgart.gropius.Date"
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Issue#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Estimated Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Time</em>' attribute.
	 * @see #setEstimatedTime(Integer)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_EstimatedTime()
	 * @model dataType="de.unistuttgart.gropius.TimeSpan"
	 * @generated
	 */
	Integer getEstimatedTime();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Issue#getEstimatedTime <em>Estimated Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Time</em>' attribute.
	 * @see #getEstimatedTime()
	 * @generated
	 */
	void setEstimatedTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Spent Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spent Time</em>' attribute.
	 * @see #setSpentTime(Integer)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_SpentTime()
	 * @model dataType="de.unistuttgart.gropius.TimeSpan"
	 * @generated
	 */
	Integer getSpentTime();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Issue#getSpentTime <em>Spent Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spent Time</em>' attribute.
	 * @see #getSpentTime()
	 * @generated
	 */
	void setSpentTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Issue Comments</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Comments</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_IssueComments()
	 * @model
	 * @generated
	 */
	EList<Comment> getIssueComments();

	/**
	 * Returns the value of the '<em><b>Links To Issues</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links To Issues</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_LinksToIssues()
	 * @model
	 * @generated
	 */
	EList<Issue> getLinksToIssues();

	/**
	 * Returns the value of the '<em><b>Linked By Issues</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked By Issues</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_LinkedByIssues()
	 * @model
	 * @generated
	 */
	EList<Issue> getLinkedByIssues();

	/**
	 * Returns the value of the '<em><b>Assignees</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.User}.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.gropius.User#getAssignedToIssues <em>Assigned To Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignees</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_Assignees()
	 * @see de.unistuttgart.gropius.User#getAssignedToIssues
	 * @model opposite="assignedToIssues"
	 * @generated
	 */
	EList<User> getAssignees();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_Labels()
	 * @model
	 * @generated
	 */
	EList<Label> getLabels();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.User}.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.gropius.User#getParticipantOfIssue <em>Participant Of Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_Participants()
	 * @see de.unistuttgart.gropius.User#getParticipantOfIssue
	 * @model opposite="participantOfIssue"
	 * @generated
	 */
	EList<User> getParticipants();

	/**
	 * Returns the value of the '<em><b>Pinned On</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pinned On</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_PinnedOn()
	 * @model
	 * @generated
	 */
	EList<Component> getPinnedOn();

	/**
	 * Returns the value of the '<em><b>Timeline</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.IssueTimelineItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeline</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_Timeline()
	 * @model
	 * @generated
	 */
	EList<IssueTimelineItem> getTimeline();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.IssueLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssue_Location()
	 * @model
	 * @generated
	 */
	EList<IssueLocation> getLocation();

} // Issue
