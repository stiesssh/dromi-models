/**
 */
package de.unistuttgart.gropius.impl;

import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.ReactionGroup;
import de.unistuttgart.gropius.User;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.impl.ReactionGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ReactionGroupImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.ReactionGroupImpl#getTotalUserCount <em>Total User Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactionGroupImpl extends MinimalEObjectImpl.Container implements ReactionGroup {
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
	 * The cached value of the '{@link #getUsers() <em>Users</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsers()
	 * @generated
	 * @ordered
	 */
	protected User users;

	/**
	 * The default value of the '{@link #getTotalUserCount() <em>Total User Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalUserCount()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_USER_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalUserCount() <em>Total User Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalUserCount()
	 * @generated
	 * @ordered
	 */
	protected int totalUserCount = TOTAL_USER_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactionGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GropiusPackage.Literals.REACTION_GROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.REACTION_GROUP__ID, oldId, id));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.REACTION_GROUP__USERS,
							oldUsers, users));
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
	public void setUsers(User newUsers) {
		User oldUsers = users;
		users = newUsers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.REACTION_GROUP__USERS, oldUsers,
					users));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalUserCount() {
		return totalUserCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalUserCount(int newTotalUserCount) {
		int oldTotalUserCount = totalUserCount;
		totalUserCount = newTotalUserCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.REACTION_GROUP__TOTAL_USER_COUNT,
					oldTotalUserCount, totalUserCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GropiusPackage.REACTION_GROUP__ID:
			return getId();
		case GropiusPackage.REACTION_GROUP__USERS:
			if (resolve)
				return getUsers();
			return basicGetUsers();
		case GropiusPackage.REACTION_GROUP__TOTAL_USER_COUNT:
			return getTotalUserCount();
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
		case GropiusPackage.REACTION_GROUP__ID:
			setId(newValue);
			return;
		case GropiusPackage.REACTION_GROUP__USERS:
			setUsers((User) newValue);
			return;
		case GropiusPackage.REACTION_GROUP__TOTAL_USER_COUNT:
			setTotalUserCount((Integer) newValue);
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
		case GropiusPackage.REACTION_GROUP__ID:
			setId((Object) null);
			return;
		case GropiusPackage.REACTION_GROUP__USERS:
			setUsers((User) null);
			return;
		case GropiusPackage.REACTION_GROUP__TOTAL_USER_COUNT:
			setTotalUserCount(TOTAL_USER_COUNT_EDEFAULT);
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
		case GropiusPackage.REACTION_GROUP__ID:
			return id != null;
		case GropiusPackage.REACTION_GROUP__USERS:
			return users != null;
		case GropiusPackage.REACTION_GROUP__TOTAL_USER_COUNT:
			return totalUserCount != TOTAL_USER_COUNT_EDEFAULT;
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
		result.append(", totalUserCount: ");
		result.append(totalUserCount);
		result.append(')');
		return result.toString();
	}

} //ReactionGroupImpl
