/**
 */
package org.eclipse.dd.di;

import org.eclipse.bpmn2.BaseElement;

import org.eclipse.bpmn2.di.Plane;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Plane</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.dd.di.BPMNPlane#getBpmnElement <em>Bpmn Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.dd.di.DiPackage#getBPMNPlane()
 * @model extendedMetaData="name='BPMNPlane' kind='elementOnly'"
 * @generated
 */
public interface BPMNPlane extends Plane {
	/**
	 * Returns the value of the '<em><b>Bpmn Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Element</em>' reference.
	 * @see #setBpmnElement(BaseElement)
	 * @see org.eclipse.dd.di.DiPackage#getBPMNPlane_BpmnElement()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='bpmnElement'"
	 * @generated
	 */
	BaseElement getBpmnElement();

	/**
	 * Sets the value of the '{@link org.eclipse.dd.di.BPMNPlane#getBpmnElement <em>Bpmn Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpmn Element</em>' reference.
	 * @see #getBpmnElement()
	 * @generated
	 */
	void setBpmnElement(BaseElement value);

} // BPMNPlane