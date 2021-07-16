/**
 */
package de.unistuttgart.gropius;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.ReactionGroup#getReaction <em>Reaction</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.ReactionGroup#getUsers <em>Users</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.ReactionGroup#getTotalUserCount <em>Total User Count</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.GropiusPackage#getReactionGroup()
 * @model
 * @generated
 */
public interface ReactionGroup extends Node {
	/**
	 * Returns the value of the '<em><b>Reaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaction</em>' attribute.
	 * @see #setReaction(String)
	 * @see de.unistuttgart.gropius.GropiusPackage#getReactionGroup_Reaction()
	 * @model
	 * @generated
	 */
	String getReaction();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.ReactionGroup#getReaction <em>Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reaction</em>' attribute.
	 * @see #getReaction()
	 * @generated
	 */
	void setReaction(String value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link de.unistuttgart.gropius.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see de.unistuttgart.gropius.GropiusPackage#getReactionGroup_Users()
	 * @model
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Total User Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total User Count</em>' attribute.
	 * @see #setTotalUserCount(int)
	 * @see de.unistuttgart.gropius.GropiusPackage#getReactionGroup_TotalUserCount()
	 * @model
	 * @generated
	 */
	int getTotalUserCount();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.ReactionGroup#getTotalUserCount <em>Total User Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total User Count</em>' attribute.
	 * @see #getTotalUserCount()
	 * @generated
	 */
	void setTotalUserCount(int value);

} // ReactionGroup
