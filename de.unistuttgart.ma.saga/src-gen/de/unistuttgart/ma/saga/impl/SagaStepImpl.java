/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.gropius.ComponentInterface;

import de.unistuttgart.ma.saga.SagaPackage;
import de.unistuttgart.ma.saga.SagaStep;

import org.eclipse.bpmn2.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.SagaStepImpl#getTask <em>Task</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.SagaStepImpl#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.SagaStepImpl#getComponentInterface <em>Component Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SagaStepImpl extends IdentifiableElementImpl implements SagaStep {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The cached value of the '{@link #getNextStep() <em>Next Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStep()
	 * @generated
	 * @ordered
	 */
	protected SagaStep nextStep;

	/**
	 * The cached value of the '{@link #getComponentInterface() <em>Component Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInterface()
	 * @generated
	 * @ordered
	 */
	protected ComponentInterface componentInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SagaStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.SAGA_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (Task)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.SAGA_STEP__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task newTask) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.SAGA_STEP__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaStep getNextStep() {
		if (nextStep != null && nextStep.eIsProxy()) {
			InternalEObject oldNextStep = (InternalEObject)nextStep;
			nextStep = (SagaStep)eResolveProxy(oldNextStep);
			if (nextStep != oldNextStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.SAGA_STEP__NEXT_STEP, oldNextStep, nextStep));
			}
		}
		return nextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SagaStep basicGetNextStep() {
		return nextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextStep(SagaStep newNextStep) {
		SagaStep oldNextStep = nextStep;
		nextStep = newNextStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.SAGA_STEP__NEXT_STEP, oldNextStep, nextStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface getComponentInterface() {
		if (componentInterface != null && componentInterface.eIsProxy()) {
			InternalEObject oldComponentInterface = (InternalEObject)componentInterface;
			componentInterface = (ComponentInterface)eResolveProxy(oldComponentInterface);
			if (componentInterface != oldComponentInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.SAGA_STEP__COMPONENT_INTERFACE, oldComponentInterface, componentInterface));
			}
		}
		return componentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface basicGetComponentInterface() {
		return componentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInterface(ComponentInterface newComponentInterface) {
		ComponentInterface oldComponentInterface = componentInterface;
		componentInterface = newComponentInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.SAGA_STEP__COMPONENT_INTERFACE, oldComponentInterface, componentInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SagaPackage.SAGA_STEP__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case SagaPackage.SAGA_STEP__NEXT_STEP:
				if (resolve) return getNextStep();
				return basicGetNextStep();
			case SagaPackage.SAGA_STEP__COMPONENT_INTERFACE:
				if (resolve) return getComponentInterface();
				return basicGetComponentInterface();
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
			case SagaPackage.SAGA_STEP__TASK:
				setTask((Task)newValue);
				return;
			case SagaPackage.SAGA_STEP__NEXT_STEP:
				setNextStep((SagaStep)newValue);
				return;
			case SagaPackage.SAGA_STEP__COMPONENT_INTERFACE:
				setComponentInterface((ComponentInterface)newValue);
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
			case SagaPackage.SAGA_STEP__TASK:
				setTask((Task)null);
				return;
			case SagaPackage.SAGA_STEP__NEXT_STEP:
				setNextStep((SagaStep)null);
				return;
			case SagaPackage.SAGA_STEP__COMPONENT_INTERFACE:
				setComponentInterface((ComponentInterface)null);
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
			case SagaPackage.SAGA_STEP__TASK:
				return task != null;
			case SagaPackage.SAGA_STEP__NEXT_STEP:
				return nextStep != null;
			case SagaPackage.SAGA_STEP__COMPONENT_INTERFACE:
				return componentInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //SagaStepImpl
