/**
 */
package de.unistuttgart.ma.saga.impl;

import de.unistuttgart.gropius.ComponentInterface;

import de.unistuttgart.ma.saga.Connector;
import de.unistuttgart.ma.saga.SagaPackage;

import org.eclipse.bpmn2.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ConnectorImpl#getComponentinterface <em>Componentinterface</em>}</li>
 *   <li>{@link de.unistuttgart.ma.saga.impl.ConnectorImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends MinimalEObjectImpl.Container implements Connector {
	/**
	 * The cached value of the '{@link #getComponentinterface() <em>Componentinterface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentinterface()
	 * @generated
	 * @ordered
	 */
	protected ComponentInterface componentinterface;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SagaPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface getComponentinterface() {
		if (componentinterface != null && componentinterface.eIsProxy()) {
			InternalEObject oldComponentinterface = (InternalEObject)componentinterface;
			componentinterface = (ComponentInterface)eResolveProxy(oldComponentinterface);
			if (componentinterface != oldComponentinterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.CONNECTOR__COMPONENTINTERFACE, oldComponentinterface, componentinterface));
			}
		}
		return componentinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface basicGetComponentinterface() {
		return componentinterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentinterface(ComponentInterface newComponentinterface) {
		ComponentInterface oldComponentinterface = componentinterface;
		componentinterface = newComponentinterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.CONNECTOR__COMPONENTINTERFACE, oldComponentinterface, componentinterface));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SagaPackage.CONNECTOR__TASK, oldTask, task));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SagaPackage.CONNECTOR__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SagaPackage.CONNECTOR__COMPONENTINTERFACE:
				if (resolve) return getComponentinterface();
				return basicGetComponentinterface();
			case SagaPackage.CONNECTOR__TASK:
				if (resolve) return getTask();
				return basicGetTask();
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
			case SagaPackage.CONNECTOR__COMPONENTINTERFACE:
				setComponentinterface((ComponentInterface)newValue);
				return;
			case SagaPackage.CONNECTOR__TASK:
				setTask((Task)newValue);
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
			case SagaPackage.CONNECTOR__COMPONENTINTERFACE:
				setComponentinterface((ComponentInterface)null);
				return;
			case SagaPackage.CONNECTOR__TASK:
				setTask((Task)null);
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
			case SagaPackage.CONNECTOR__COMPONENTINTERFACE:
				return componentinterface != null;
			case SagaPackage.CONNECTOR__TASK:
				return task != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
