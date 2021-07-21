/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.gropius.Project;

import de.unistuttgart.gropius.slo.SloRule;

import de.unistuttgart.ma.saga.Model;
import de.unistuttgart.ma.saga.Saga;
import de.unistuttgart.ma.saga.SagaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ModelImpl#getSagas <em>Sagas</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ModelImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ModelImpl#getGropiusProject <em>Gropius Project</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ModelImpl#getSloRules <em>Slo Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends IdentifiableElementImpl implements Model {
	/**
	 * The cached value of the '{@link #getSagas() <em>Sagas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSagas()
	 * @generated
	 * @ordered
	 */
	protected EList<Saga> sagas;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.bpmn2.Process> processes;

	/**
	 * The cached value of the '{@link #getGropiusProject() <em>Gropius Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGropiusProject()
	 * @generated
	 * @ordered
	 */
	protected Project gropiusProject;

	/**
	 * The cached value of the '{@link #getSloRules() <em>Slo Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSloRules()
	 * @generated
	 * @ordered
	 */
	protected EList<SloRule> sloRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Saga> getSagas() {
		if (sagas == null) {
			sagas = new EObjectContainmentEList<Saga>(Saga.class, this, SagaPackage.MODEL__SAGAS);
		}
		return sagas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.bpmn2.Process> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentEList<org.eclipse.bpmn2.Process>(org.eclipse.bpmn2.Process.class, this, SagaPackage.MODEL__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getGropiusProject() {
		return gropiusProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGropiusProject(Project newGropiusProject, NotificationChain msgs) {
		Project oldGropiusProject = gropiusProject;
		gropiusProject = newGropiusProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SagaPackage.MODEL__GROPIUS_PROJECT, oldGropiusProject, newGropiusProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGropiusProject(Project newGropiusProject) {
		if (newGropiusProject != gropiusProject) {
			NotificationChain msgs = null;
			if (gropiusProject != null)
				msgs = ((InternalEObject)gropiusProject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SagaPackage.MODEL__GROPIUS_PROJECT, null, msgs);
			if (newGropiusProject != null)
				msgs = ((InternalEObject)newGropiusProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SagaPackage.MODEL__GROPIUS_PROJECT, null, msgs);
			msgs = basicSetGropiusProject(newGropiusProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.MODEL__GROPIUS_PROJECT, newGropiusProject, newGropiusProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SloRule> getSloRules() {
		if (sloRules == null) {
			sloRules = new EObjectContainmentEList<SloRule>(SloRule.class, this, SagaPackage.MODEL__SLO_RULES);
		}
		return sloRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SagaPackage.MODEL__SAGAS:
				return ((InternalEList<?>)getSagas()).basicRemove(otherEnd, msgs);
			case SagaPackage.MODEL__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case SagaPackage.MODEL__GROPIUS_PROJECT:
				return basicSetGropiusProject(null, msgs);
			case SagaPackage.MODEL__SLO_RULES:
				return ((InternalEList<?>)getSloRules()).basicRemove(otherEnd, msgs);
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
			case SagaPackage.MODEL__SAGAS:
				return getSagas();
			case SagaPackage.MODEL__PROCESSES:
				return getProcesses();
			case SagaPackage.MODEL__GROPIUS_PROJECT:
				return getGropiusProject();
			case SagaPackage.MODEL__SLO_RULES:
				return getSloRules();
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
			case SagaPackage.MODEL__SAGAS:
				getSagas().clear();
				getSagas().addAll((Collection<? extends Saga>)newValue);
				return;
			case SagaPackage.MODEL__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends org.eclipse.bpmn2.Process>)newValue);
				return;
			case SagaPackage.MODEL__GROPIUS_PROJECT:
				setGropiusProject((Project)newValue);
				return;
			case SagaPackage.MODEL__SLO_RULES:
				getSloRules().clear();
				getSloRules().addAll((Collection<? extends SloRule>)newValue);
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
			case SagaPackage.MODEL__SAGAS:
				getSagas().clear();
				return;
			case SagaPackage.MODEL__PROCESSES:
				getProcesses().clear();
				return;
			case SagaPackage.MODEL__GROPIUS_PROJECT:
				setGropiusProject((Project)null);
				return;
			case SagaPackage.MODEL__SLO_RULES:
				getSloRules().clear();
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
			case SagaPackage.MODEL__SAGAS:
				return sagas != null && !sagas.isEmpty();
			case SagaPackage.MODEL__PROCESSES:
				return processes != null && !processes.isEmpty();
			case SagaPackage.MODEL__GROPIUS_PROJECT:
				return gropiusProject != null;
			case SagaPackage.MODEL__SLO_RULES:
				return sloRules != null && !sloRules.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
