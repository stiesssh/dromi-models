/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.ma.saga.ChainLink;
import de.unistuttgart.ma.saga.ChainStart;
import de.unistuttgart.ma.saga.SagaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chain Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ChainStartImpl#getChainlink <em>Chainlink</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChainStartImpl extends MinimalEObjectImpl.Container implements ChainStart {
	/**
	 * The cached value of the '{@link #getChainlink() <em>Chainlink</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainlink()
	 * @generated
	 * @ordered
	 */
	protected EList<ChainLink> chainlink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.CHAIN_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChainLink> getChainlink() {
		if (chainlink == null) {
			chainlink = new EObjectContainmentEList<ChainLink>(ChainLink.class, this,
					SagaPackage.CHAIN_START__CHAINLINK);
		}
		return chainlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SagaPackage.CHAIN_START__CHAINLINK:
			return ((InternalEList<?>) getChainlink()).basicRemove(otherEnd, msgs);
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
		case SagaPackage.CHAIN_START__CHAINLINK:
			return getChainlink();
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
		case SagaPackage.CHAIN_START__CHAINLINK:
			getChainlink().clear();
			getChainlink().addAll((Collection<? extends ChainLink>) newValue);
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
		case SagaPackage.CHAIN_START__CHAINLINK:
			getChainlink().clear();
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
		case SagaPackage.CHAIN_START__CHAINLINK:
			return chainlink != null && !chainlink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ChainStartImpl
