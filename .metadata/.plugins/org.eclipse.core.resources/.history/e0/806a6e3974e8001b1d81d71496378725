/**
 */
package de.unistuttgart.ma.saga.impact.impl;

import de.unistuttgart.ma.saga.impact.Impact;
import de.unistuttgart.ma.saga.impact.ImpactPackage;
import de.unistuttgart.ma.saga.impact.Notification;

import de.unistuttgart.ma.saga.impl.IdentifiableElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.NotificationImpl#getImpacts <em>Impacts</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impact.impl.NotificationImpl#getTopLevelImpacts <em>Top Level Impacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationImpl extends IdentifiableElementImpl implements Notification {
	/**
	 * The cached value of the '{@link #getImpacts() <em>Impacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Impact> impacts;

	/**
	 * The cached value of the '{@link #getTopLevelImpacts() <em>Top Level Impacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelImpacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Impact> topLevelImpacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ImpactPackage.Literals.NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Impact> getImpacts() {
		if (impacts == null) {
			impacts = new EObjectContainmentEList<Impact>(Impact.class, this, ImpactPackage.NOTIFICATION__IMPACTS);
		}
		return impacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Impact> getTopLevelImpacts() {
		if (topLevelImpacts == null) {
			topLevelImpacts = new EObjectResolvingEList<Impact>(Impact.class, this, ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS);
		}
		return topLevelImpacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ImpactPackage.NOTIFICATION__IMPACTS:
				return ((InternalEList<?>)getImpacts()).basicRemove(otherEnd, msgs);
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
			case ImpactPackage.NOTIFICATION__IMPACTS:
				return getImpacts();
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				return getTopLevelImpacts();
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
			case ImpactPackage.NOTIFICATION__IMPACTS:
				getImpacts().clear();
				getImpacts().addAll((Collection<? extends Impact>)newValue);
				return;
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				getTopLevelImpacts().clear();
				getTopLevelImpacts().addAll((Collection<? extends Impact>)newValue);
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
			case ImpactPackage.NOTIFICATION__IMPACTS:
				getImpacts().clear();
				return;
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				getTopLevelImpacts().clear();
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
			case ImpactPackage.NOTIFICATION__IMPACTS:
				return impacts != null && !impacts.isEmpty();
			case ImpactPackage.NOTIFICATION__TOP_LEVEL_IMPACTS:
				return topLevelImpacts != null && !topLevelImpacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NotificationImpl
