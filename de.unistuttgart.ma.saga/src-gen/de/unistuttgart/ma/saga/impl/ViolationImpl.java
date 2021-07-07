/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.ma.saga.ChainLink;
import de.unistuttgart.ma.saga.SagaPackage;
import de.unistuttgart.ma.saga.Slo;
import de.unistuttgart.ma.saga.Violation;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Violation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ViolationImpl#getSlo <em>Slo</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ViolationImpl#getPassingImpacts <em>Passing Impacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViolationImpl extends ChainLinkImpl implements Violation {
	/**
	 * The cached value of the '{@link #getSlo() <em>Slo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlo()
	 * @generated
	 * @ordered
	 */
	protected EList<Slo> slo;

	/**
	 * The cached value of the '{@link #getPassingImpacts() <em>Passing Impacts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassingImpacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ChainLink> passingImpacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViolationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.VIOLATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slo> getSlo() {
		if (slo == null) {
			slo = new EObjectResolvingEList<Slo>(Slo.class, this, SagaPackage.VIOLATION__SLO);
		}
		return slo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChainLink> getPassingImpacts() {
		if (passingImpacts == null) {
			passingImpacts = new EObjectResolvingEList<ChainLink>(ChainLink.class, this,
					SagaPackage.VIOLATION__PASSING_IMPACTS);
		}
		return passingImpacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SagaPackage.VIOLATION__SLO:
			return getSlo();
		case SagaPackage.VIOLATION__PASSING_IMPACTS:
			return getPassingImpacts();
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
		case SagaPackage.VIOLATION__PASSING_IMPACTS:
			getPassingImpacts().clear();
			getPassingImpacts().addAll((Collection<? extends ChainLink>) newValue);
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
		case SagaPackage.VIOLATION__PASSING_IMPACTS:
			getPassingImpacts().clear();
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
		case SagaPackage.VIOLATION__SLO:
			return slo != null && !slo.isEmpty();
		case SagaPackage.VIOLATION__PASSING_IMPACTS:
			return passingImpacts != null && !passingImpacts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViolationImpl
