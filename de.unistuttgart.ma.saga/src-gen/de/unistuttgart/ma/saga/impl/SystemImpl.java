/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.gropius.Project;

import de.unistuttgart.gropius.slo.SloRule;

import de.unistuttgart.ma.saga.Saga;
import de.unistuttgart.ma.saga.SagaPackage;

import de.unistuttgart.ma.saga.impact.Notification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.SystemImpl#getSagas <em>Sagas</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.SystemImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.SystemImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.SystemImpl#getSloRules <em>Slo Rules</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.SystemImpl#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends IdentifiableElementImpl implements de.unistuttgart.ma.saga.System {
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
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected Project architecture;

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
	 * The cached value of the '{@link #getNotifications() <em>Notifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> notifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Saga> getSagas() {
		if (sagas == null) {
			sagas = new EObjectContainmentEList<Saga>(Saga.class, this, SagaPackage.SYSTEM__SAGAS);
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
			processes = new EObjectContainmentEList<org.eclipse.bpmn2.Process>(org.eclipse.bpmn2.Process.class, this, SagaPackage.SYSTEM__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArchitecture(Project newArchitecture, NotificationChain msgs) {
		Project oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, SagaPackage.SYSTEM__ARCHITECTURE, oldArchitecture, newArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(Project newArchitecture) {
		if (newArchitecture != architecture) {
			NotificationChain msgs = null;
			if (architecture != null)
				msgs = ((InternalEObject)architecture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SagaPackage.SYSTEM__ARCHITECTURE, null, msgs);
			if (newArchitecture != null)
				msgs = ((InternalEObject)newArchitecture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SagaPackage.SYSTEM__ARCHITECTURE, null, msgs);
			msgs = basicSetArchitecture(newArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, SagaPackage.SYSTEM__ARCHITECTURE, newArchitecture, newArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SloRule> getSloRules() {
		if (sloRules == null) {
			sloRules = new EObjectContainmentEList<SloRule>(SloRule.class, this, SagaPackage.SYSTEM__SLO_RULES);
		}
		return sloRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Notification> getNotifications() {
		if (notifications == null) {
			notifications = new EObjectContainmentEList<Notification>(Notification.class, this, SagaPackage.SYSTEM__NOTIFICATIONS);
		}
		return notifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SagaPackage.SYSTEM__SAGAS:
				return ((InternalEList<?>)getSagas()).basicRemove(otherEnd, msgs);
			case SagaPackage.SYSTEM__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case SagaPackage.SYSTEM__ARCHITECTURE:
				return basicSetArchitecture(null, msgs);
			case SagaPackage.SYSTEM__SLO_RULES:
				return ((InternalEList<?>)getSloRules()).basicRemove(otherEnd, msgs);
			case SagaPackage.SYSTEM__NOTIFICATIONS:
				return ((InternalEList<?>)getNotifications()).basicRemove(otherEnd, msgs);
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
			case SagaPackage.SYSTEM__SAGAS:
				return getSagas();
			case SagaPackage.SYSTEM__PROCESSES:
				return getProcesses();
			case SagaPackage.SYSTEM__ARCHITECTURE:
				return getArchitecture();
			case SagaPackage.SYSTEM__SLO_RULES:
				return getSloRules();
			case SagaPackage.SYSTEM__NOTIFICATIONS:
				return getNotifications();
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
			case SagaPackage.SYSTEM__SAGAS:
				getSagas().clear();
				getSagas().addAll((Collection<? extends Saga>)newValue);
				return;
			case SagaPackage.SYSTEM__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends org.eclipse.bpmn2.Process>)newValue);
				return;
			case SagaPackage.SYSTEM__ARCHITECTURE:
				setArchitecture((Project)newValue);
				return;
			case SagaPackage.SYSTEM__SLO_RULES:
				getSloRules().clear();
				getSloRules().addAll((Collection<? extends SloRule>)newValue);
				return;
			case SagaPackage.SYSTEM__NOTIFICATIONS:
				getNotifications().clear();
				getNotifications().addAll((Collection<? extends Notification>)newValue);
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
			case SagaPackage.SYSTEM__SAGAS:
				getSagas().clear();
				return;
			case SagaPackage.SYSTEM__PROCESSES:
				getProcesses().clear();
				return;
			case SagaPackage.SYSTEM__ARCHITECTURE:
				setArchitecture((Project)null);
				return;
			case SagaPackage.SYSTEM__SLO_RULES:
				getSloRules().clear();
				return;
			case SagaPackage.SYSTEM__NOTIFICATIONS:
				getNotifications().clear();
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
			case SagaPackage.SYSTEM__SAGAS:
				return sagas != null && !sagas.isEmpty();
			case SagaPackage.SYSTEM__PROCESSES:
				return processes != null && !processes.isEmpty();
			case SagaPackage.SYSTEM__ARCHITECTURE:
				return architecture != null;
			case SagaPackage.SYSTEM__SLO_RULES:
				return sloRules != null && !sloRules.isEmpty();
			case SagaPackage.SYSTEM__NOTIFICATIONS:
				return notifications != null && !notifications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemImpl
