/**
 */
package org.eclipse.bpmn2.di.impl;

import org.eclipse.bpmn2.di.BpmnDiPackage;
import org.eclipse.bpmn2.di.Node;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NodeImpl extends DiagramElementImpl implements Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnDiPackage.Literals.NODE;
	}

} //NodeImpl
