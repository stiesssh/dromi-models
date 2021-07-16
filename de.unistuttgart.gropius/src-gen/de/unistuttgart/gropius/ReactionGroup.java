/**
 */
package de.unistuttgart.gropius;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reaction Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
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
	 * Returns the value of the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference.
	 * @see #setUsers(User)
	 * @see de.unistuttgart.gropius.GropiusPackage#getReactionGroup_Users()
	 * @model
	 * @generated
	 */
	User getUsers();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.ReactionGroup#getUsers <em>Users</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Users</em>' reference.
	 * @see #getUsers()
	 * @generated
	 */
	void setUsers(User value);

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
