/**
 */
package de.unistuttgart.gropius;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue Timeline Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.IssueTimelineItem#getIssue <em>Issue</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.IssueTimelineItem#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.IssueTimelineItem#getCreatedAt <em>Created At</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.GropiusPackage#getIssueTimelineItem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IssueTimelineItem extends Node {
	/**
	 * Returns the value of the '<em><b>Issue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' reference.
	 * @see #setIssue(Issue)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssueTimelineItem_Issue()
	 * @model
	 * @generated
	 */
	Issue getIssue();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.IssueTimelineItem#getIssue <em>Issue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' reference.
	 * @see #getIssue()
	 * @generated
	 */
	void setIssue(Issue value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(User)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssueTimelineItem_CreatedBy()
	 * @model
	 * @generated
	 */
	User getCreatedBy();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.IssueTimelineItem#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(User value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see de.unistuttgart.gropius.GropiusPackage#getIssueTimelineItem_CreatedAt()
	 * @model dataType="de.unistuttgart.gropius.Date"
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.IssueTimelineItem#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

} // IssueTimelineItem
