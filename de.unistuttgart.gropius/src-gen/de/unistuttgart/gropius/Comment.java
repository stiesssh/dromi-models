/**
 */
package de.unistuttgart.gropius;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.Comment#getBody <em>Body</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Comment#getBodyRendered <em>Body Rendered</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Comment#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Comment#getEditedBy <em>Edited By</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Comment#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Comment#getLastEditedAt <em>Last Edited At</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Comment#isCurrentUserCanEdit <em>Current User Can Edit</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.Comment#getReactions <em>Reactions</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.GropiusPackage#getComment()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Comment extends EObject {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see de.unistuttgart.gropius.GropiusPackage#getComment_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Body Rendered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Rendered</em>' attribute.
	 * @see #setBodyRendered(String)
	 * @see de.unistuttgart.gropius.GropiusPackage#getComment_BodyRendered()
	 * @model
	 * @generated
	 */
	String getBodyRendered();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Comment#getBodyRendered <em>Body Rendered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Rendered</em>' attribute.
	 * @see #getBodyRendered()
	 * @generated
	 */
	void setBodyRendered(String value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.unistuttgart.gropius.User#getIssueComments <em>Issue Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(User)
	 * @see de.unistuttgart.gropius.GropiusPackage#getComment_CreatedBy()
	 * @see de.unistuttgart.gropius.User#getIssueComments
	 * @model opposite="issueComments"
	 * @generated
	 */
	User getCreatedBy();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Comment#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(User value);

	/**
	 * Returns the value of the '<em><b>Edited By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edited By</em>' reference.
	 * @see #setEditedBy(User)
	 * @see de.unistuttgart.gropius.GropiusPackage#getComment_EditedBy()
	 * @model
	 * @generated
	 */
	User getEditedBy();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Comment#getEditedBy <em>Edited By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edited By</em>' reference.
	 * @see #getEditedBy()
	 * @generated
	 */
	void setEditedBy(User value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Object)
	 * @see de.unistuttgart.gropius.GropiusPackage#getComment_CreatedAt()
	 * @model dataType="de.unistuttgart.gropius.Date"
	 * @generated
	 */
	Object getCreatedAt();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Comment#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Object value);

	/**
	 * Returns the value of the '<em><b>Last Edited At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Edited At</em>' attribute.
	 * @see #setLastEditedAt(Object)
	 * @see de.unistuttgart.gropius.GropiusPackage#getComment_LastEditedAt()
	 * @model dataType="de.unistuttgart.gropius.Date"
	 * @generated
	 */
	Object getLastEditedAt();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Comment#getLastEditedAt <em>Last Edited At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Edited At</em>' attribute.
	 * @see #getLastEditedAt()
	 * @generated
	 */
	void setLastEditedAt(Object value);

	/**
	 * Returns the value of the '<em><b>Current User Can Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current User Can Edit</em>' attribute.
	 * @see #setCurrentUserCanEdit(boolean)
	 * @see de.unistuttgart.gropius.GropiusPackage#getComment_CurrentUserCanEdit()
	 * @model
	 * @generated
	 */
	boolean isCurrentUserCanEdit();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Comment#isCurrentUserCanEdit <em>Current User Can Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current User Can Edit</em>' attribute.
	 * @see #isCurrentUserCanEdit()
	 * @generated
	 */
	void setCurrentUserCanEdit(boolean value);

	/**
	 * Returns the value of the '<em><b>Reactions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactions</em>' reference.
	 * @see #setReactions(ReactionGroup)
	 * @see de.unistuttgart.gropius.GropiusPackage#getComment_Reactions()
	 * @model
	 * @generated
	 */
	ReactionGroup getReactions();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.Comment#getReactions <em>Reactions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactions</em>' reference.
	 * @see #getReactions()
	 * @generated
	 */
	void setReactions(ReactionGroup value);

} // Comment
