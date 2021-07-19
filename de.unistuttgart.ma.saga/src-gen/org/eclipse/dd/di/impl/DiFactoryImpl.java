/**
 * <copyright>
 * 
 * Copyright (c) 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Reiner Hille-Doering (SAP AG) - initial API and implementation and/or initial documentation
 * 
 * </copyright>
 */
package org.eclipse.dd.di.impl;

import org.eclipse.dd.di.*;
import org.eclipse.dd.di.DiFactory;
import org.eclipse.dd.di.DiPackage;
import org.eclipse.dd.di.DocumentRoot;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiFactoryImpl extends EFactoryImpl implements DiFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static DiFactory init() {
		try {
			DiFactory theDiFactory = (DiFactory)EPackage.Registry.INSTANCE.getEFactory(DiPackage.eNS_URI);
			if (theDiFactory != null) {
				return theDiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DiFactoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DiPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DiPackage.BPMN_DIAGRAM: return createBPMNDiagram();
			case DiPackage.BPMN_EDGE: return createBPMNEdge();
			case DiPackage.BPMN_LABEL: return createBPMNLabel();
			case DiPackage.BPMN_LABEL_STYLE: return createBPMNLabelStyle();
			case DiPackage.BPMN_PLANE: return createBPMNPlane();
			case DiPackage.BPMN_SHAPE: return createBPMNShape();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DiPackage.MESSAGE_VISIBLE_KIND:
				return createMessageVisibleKindFromString(eDataType, initialValue);
			case DiPackage.PARTICIPANT_BAND_KIND:
				return createParticipantBandKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DiPackage.MESSAGE_VISIBLE_KIND:
				return convertMessageVisibleKindToString(eDataType, instanceValue);
			case DiPackage.PARTICIPANT_BAND_KIND:
				return convertParticipantBandKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNDiagram createBPMNDiagram() {
		BPMNDiagramImpl bpmnDiagram = new BPMNDiagramImpl();
		return bpmnDiagram;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNEdge createBPMNEdge() {
		BPMNEdgeImpl bpmnEdge = new BPMNEdgeImpl();
		return bpmnEdge;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabel createBPMNLabel() {
		BPMNLabelImpl bpmnLabel = new BPMNLabelImpl();
		return bpmnLabel;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNLabelStyle createBPMNLabelStyle() {
		BPMNLabelStyleImpl bpmnLabelStyle = new BPMNLabelStyleImpl();
		return bpmnLabelStyle;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNPlane createBPMNPlane() {
		BPMNPlaneImpl bpmnPlane = new BPMNPlaneImpl();
		return bpmnPlane;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNShape createBPMNShape() {
		BPMNShapeImpl bpmnShape = new BPMNShapeImpl();
		return bpmnShape;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageVisibleKind createMessageVisibleKindFromString(EDataType eDataType, String initialValue) {
		MessageVisibleKind result = MessageVisibleKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageVisibleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantBandKind createParticipantBandKindFromString(EDataType eDataType, String initialValue) {
		ParticipantBandKind result = ParticipantBandKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParticipantBandKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public DiPackage getDiPackage() {
		return (DiPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static DiPackage getPackage() {
		return DiPackage.eINSTANCE;
	}

} //DiFactoryImpl