/**
 */
package org.eclipse.bpmn2.di;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.bpmn2.di.LabeledEdge#getOwnedLabel <em>Owned Label</em>}</li>
 * </ul>
 *
 * @see org.eclipse.bpmn2.di.BpmnDiPackage#getLabeledEdge()
 * @model abstract="true"
 *        extendedMetaData="name='LabeledEdge' kind='elementOnly'"
 * @generated
 */
public interface LabeledEdge extends Edge {
	/**
	 * Returns the value of the '<em><b>Owned Label</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.bpmn2.di.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Label</em>' reference list.
	 * @see org.eclipse.bpmn2.di.BpmnDiPackage#getLabeledEdge_OwnedLabel()
	 * @model transient="true" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	EList<Label> getOwnedLabel();

} // LabeledEdge