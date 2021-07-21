/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.ma.saga.ElementWithSLO;
import de.unistuttgart.ma.saga.SagaPackage;
import de.unistuttgart.ma.saga.Slo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element With SLO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ElementWithSLOImpl#getSlos <em>Slos</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementWithSLOImpl extends NamedElementImpl implements ElementWithSLO {
	/**
	 * The cached value of the '{@link #getSlos() <em>Slos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlos()
	 * @generated
	 * @ordered
	 */
	protected EList<Slo> slos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementWithSLOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.ELEMENT_WITH_SLO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slo> getSlos() {
		if (slos == null) {
			slos = new EObjectContainmentEList<Slo>(Slo.class, this, SagaPackage.ELEMENT_WITH_SLO__SLOS);
		}
		return slos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SagaPackage.ELEMENT_WITH_SLO__SLOS:
			return ((InternalEList<?>) getSlos()).basicRemove(otherEnd, msgs);
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
		case SagaPackage.ELEMENT_WITH_SLO__SLOS:
			return getSlos();
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
		case SagaPackage.ELEMENT_WITH_SLO__SLOS:
			getSlos().clear();
			getSlos().addAll((Collection<? extends Slo>) newValue);
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
		case SagaPackage.ELEMENT_WITH_SLO__SLOS:
			getSlos().clear();
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
		case SagaPackage.ELEMENT_WITH_SLO__SLOS:
			return slos != null && !slos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ElementWithSLOImpl
