/**
 */
package org.eclipse.bpmn2.provider;


import de.unistuttgart.gropius.GropiusFactory;

import de.unistuttgart.gropius.slo.SloFactory;

import de.unistuttgart.ma.saga.SagaFactory;

import de.unistuttgart.ma.saga.provider.SagaEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.bpmn2.Bpmn2Factory;
import org.eclipse.bpmn2.Bpmn2Package;
import org.eclipse.bpmn2.DocumentRoot;

import org.eclipse.bpmn2.di.BpmnDiFactory;

import org.eclipse.dd.dc.DcFactory;

import org.eclipse.dd.di.DiFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.bpmn2.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_AdHocSubProcess());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Artifact());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Assignment());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Association());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Auditing());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_BoundaryEvent());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_BusinessRuleTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CallActivity());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CallChoreography());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CallConversation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationNode());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CancelEventDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CatchEvent());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Category());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CategoryValue());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Choreography());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Collaboration());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyActivity());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CompensateEventDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ComplexBehaviorDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ComplexGateway());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ConditionalEventDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Conversation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationAssociation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationLink());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationKey());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationProperty());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationPropertyBinding());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationPropertyRetrievalExpression());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationSubscription());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_DataAssociation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_DataInput());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_DataInputAssociation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_DataObject());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_DataObjectReference());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_DataOutput());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_DataOutputAssociation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_DataState());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_DataStore());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_DataStoreReference());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Definitions());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Documentation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_EndEvent());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_EndPoint());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Error());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ErrorEventDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Escalation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_EscalationEventDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Event());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_EventBasedGateway());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ExclusiveGateway());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Expression());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Extension());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ExtensionElements());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_FormalExpression());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Gateway());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalChoreographyTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalConversation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalManualTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalScriptTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalUserTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Group());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_HumanPerformer());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Performer());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceRole());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ImplicitThrowEvent());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Import());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_InclusiveGateway());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_InputSet());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Interface());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_IntermediateCatchEvent());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_IntermediateThrowEvent());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_IoBinding());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_IoSpecification());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ItemDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Lane());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_LaneSet());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_LinkEventDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_LoopCharacteristics());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ManualTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Message());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_MessageEventDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_MessageFlow());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_MessageFlowAssociation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Monitoring());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_MultiInstanceLoopCharacteristics());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Operation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_OutputSet());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ParallelGateway());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Participant());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ParticipantAssociation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ParticipantMultiplicity());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_PartnerEntity());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_PartnerRole());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_PotentialOwner());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Process());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Property());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ReceiveTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Relationship());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Rendering());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Resource());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceAssignmentExpression());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceParameter());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceParameterBinding());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Script());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ScriptTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_SendTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_SequenceFlow());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ServiceTask());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Signal());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_SignalEventDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_StandardLoopCharacteristics());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_StartEvent());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_SubChoreography());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_SubConversation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_SubProcess());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Task());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_TerminateEventDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Text());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_TextAnnotation());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_ThrowEvent());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_TimerEventDefinition());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_Transaction());
			childrenFeatures.add(Bpmn2Package.eINSTANCE.getDocumentRoot_UserTask());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case Bpmn2Package.DOCUMENT_ROOT__ACTIVITY:
			case Bpmn2Package.DOCUMENT_ROOT__AD_HOC_SUB_PROCESS:
			case Bpmn2Package.DOCUMENT_ROOT__FLOW_ELEMENT:
			case Bpmn2Package.DOCUMENT_ROOT__ARTIFACT:
			case Bpmn2Package.DOCUMENT_ROOT__ASSIGNMENT:
			case Bpmn2Package.DOCUMENT_ROOT__ASSOCIATION:
			case Bpmn2Package.DOCUMENT_ROOT__AUDITING:
			case Bpmn2Package.DOCUMENT_ROOT__BASE_ELEMENT:
			case Bpmn2Package.DOCUMENT_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT:
			case Bpmn2Package.DOCUMENT_ROOT__BOUNDARY_EVENT:
			case Bpmn2Package.DOCUMENT_ROOT__BUSINESS_RULE_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__CALLABLE_ELEMENT:
			case Bpmn2Package.DOCUMENT_ROOT__CALL_ACTIVITY:
			case Bpmn2Package.DOCUMENT_ROOT__CALL_CHOREOGRAPHY:
			case Bpmn2Package.DOCUMENT_ROOT__CALL_CONVERSATION:
			case Bpmn2Package.DOCUMENT_ROOT__CONVERSATION_NODE:
			case Bpmn2Package.DOCUMENT_ROOT__CANCEL_EVENT_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__EVENT_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__ROOT_ELEMENT:
			case Bpmn2Package.DOCUMENT_ROOT__CATCH_EVENT:
			case Bpmn2Package.DOCUMENT_ROOT__CATEGORY:
			case Bpmn2Package.DOCUMENT_ROOT__CATEGORY_VALUE:
			case Bpmn2Package.DOCUMENT_ROOT__CHOREOGRAPHY:
			case Bpmn2Package.DOCUMENT_ROOT__COLLABORATION:
			case Bpmn2Package.DOCUMENT_ROOT__CHOREOGRAPHY_ACTIVITY:
			case Bpmn2Package.DOCUMENT_ROOT__CHOREOGRAPHY_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__COMPENSATE_EVENT_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__COMPLEX_BEHAVIOR_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__COMPLEX_GATEWAY:
			case Bpmn2Package.DOCUMENT_ROOT__CONDITIONAL_EVENT_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__CONVERSATION:
			case Bpmn2Package.DOCUMENT_ROOT__CONVERSATION_ASSOCIATION:
			case Bpmn2Package.DOCUMENT_ROOT__CONVERSATION_LINK:
			case Bpmn2Package.DOCUMENT_ROOT__CORRELATION_KEY:
			case Bpmn2Package.DOCUMENT_ROOT__CORRELATION_PROPERTY:
			case Bpmn2Package.DOCUMENT_ROOT__CORRELATION_PROPERTY_BINDING:
			case Bpmn2Package.DOCUMENT_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
			case Bpmn2Package.DOCUMENT_ROOT__CORRELATION_SUBSCRIPTION:
			case Bpmn2Package.DOCUMENT_ROOT__DATA_ASSOCIATION:
			case Bpmn2Package.DOCUMENT_ROOT__DATA_INPUT:
			case Bpmn2Package.DOCUMENT_ROOT__DATA_INPUT_ASSOCIATION:
			case Bpmn2Package.DOCUMENT_ROOT__DATA_OBJECT:
			case Bpmn2Package.DOCUMENT_ROOT__DATA_OBJECT_REFERENCE:
			case Bpmn2Package.DOCUMENT_ROOT__DATA_OUTPUT:
			case Bpmn2Package.DOCUMENT_ROOT__DATA_OUTPUT_ASSOCIATION:
			case Bpmn2Package.DOCUMENT_ROOT__DATA_STATE:
			case Bpmn2Package.DOCUMENT_ROOT__DATA_STORE:
			case Bpmn2Package.DOCUMENT_ROOT__DATA_STORE_REFERENCE:
			case Bpmn2Package.DOCUMENT_ROOT__DEFINITIONS:
			case Bpmn2Package.DOCUMENT_ROOT__DOCUMENTATION:
			case Bpmn2Package.DOCUMENT_ROOT__END_EVENT:
			case Bpmn2Package.DOCUMENT_ROOT__END_POINT:
			case Bpmn2Package.DOCUMENT_ROOT__ERROR:
			case Bpmn2Package.DOCUMENT_ROOT__ERROR_EVENT_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__ESCALATION:
			case Bpmn2Package.DOCUMENT_ROOT__ESCALATION_EVENT_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__EVENT:
			case Bpmn2Package.DOCUMENT_ROOT__EVENT_BASED_GATEWAY:
			case Bpmn2Package.DOCUMENT_ROOT__EXCLUSIVE_GATEWAY:
			case Bpmn2Package.DOCUMENT_ROOT__EXPRESSION:
			case Bpmn2Package.DOCUMENT_ROOT__EXTENSION:
			case Bpmn2Package.DOCUMENT_ROOT__EXTENSION_ELEMENTS:
			case Bpmn2Package.DOCUMENT_ROOT__FLOW_NODE:
			case Bpmn2Package.DOCUMENT_ROOT__FORMAL_EXPRESSION:
			case Bpmn2Package.DOCUMENT_ROOT__GATEWAY:
			case Bpmn2Package.DOCUMENT_ROOT__GLOBAL_BUSINESS_RULE_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__GLOBAL_CHOREOGRAPHY_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__GLOBAL_CONVERSATION:
			case Bpmn2Package.DOCUMENT_ROOT__GLOBAL_MANUAL_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__GLOBAL_SCRIPT_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__GLOBAL_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__GLOBAL_USER_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__GROUP:
			case Bpmn2Package.DOCUMENT_ROOT__HUMAN_PERFORMER:
			case Bpmn2Package.DOCUMENT_ROOT__PERFORMER:
			case Bpmn2Package.DOCUMENT_ROOT__RESOURCE_ROLE:
			case Bpmn2Package.DOCUMENT_ROOT__IMPLICIT_THROW_EVENT:
			case Bpmn2Package.DOCUMENT_ROOT__IMPORT:
			case Bpmn2Package.DOCUMENT_ROOT__INCLUSIVE_GATEWAY:
			case Bpmn2Package.DOCUMENT_ROOT__INPUT_SET:
			case Bpmn2Package.DOCUMENT_ROOT__INTERFACE:
			case Bpmn2Package.DOCUMENT_ROOT__INTERMEDIATE_CATCH_EVENT:
			case Bpmn2Package.DOCUMENT_ROOT__INTERMEDIATE_THROW_EVENT:
			case Bpmn2Package.DOCUMENT_ROOT__IO_BINDING:
			case Bpmn2Package.DOCUMENT_ROOT__IO_SPECIFICATION:
			case Bpmn2Package.DOCUMENT_ROOT__ITEM_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__LANE:
			case Bpmn2Package.DOCUMENT_ROOT__LANE_SET:
			case Bpmn2Package.DOCUMENT_ROOT__LINK_EVENT_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__LOOP_CHARACTERISTICS:
			case Bpmn2Package.DOCUMENT_ROOT__MANUAL_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__MESSAGE:
			case Bpmn2Package.DOCUMENT_ROOT__MESSAGE_EVENT_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__MESSAGE_FLOW:
			case Bpmn2Package.DOCUMENT_ROOT__MESSAGE_FLOW_ASSOCIATION:
			case Bpmn2Package.DOCUMENT_ROOT__MONITORING:
			case Bpmn2Package.DOCUMENT_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS:
			case Bpmn2Package.DOCUMENT_ROOT__OPERATION:
			case Bpmn2Package.DOCUMENT_ROOT__OUTPUT_SET:
			case Bpmn2Package.DOCUMENT_ROOT__PARALLEL_GATEWAY:
			case Bpmn2Package.DOCUMENT_ROOT__PARTICIPANT:
			case Bpmn2Package.DOCUMENT_ROOT__PARTICIPANT_ASSOCIATION:
			case Bpmn2Package.DOCUMENT_ROOT__PARTICIPANT_MULTIPLICITY:
			case Bpmn2Package.DOCUMENT_ROOT__PARTNER_ENTITY:
			case Bpmn2Package.DOCUMENT_ROOT__PARTNER_ROLE:
			case Bpmn2Package.DOCUMENT_ROOT__POTENTIAL_OWNER:
			case Bpmn2Package.DOCUMENT_ROOT__PROCESS:
			case Bpmn2Package.DOCUMENT_ROOT__PROPERTY:
			case Bpmn2Package.DOCUMENT_ROOT__RECEIVE_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__RELATIONSHIP:
			case Bpmn2Package.DOCUMENT_ROOT__RENDERING:
			case Bpmn2Package.DOCUMENT_ROOT__RESOURCE:
			case Bpmn2Package.DOCUMENT_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION:
			case Bpmn2Package.DOCUMENT_ROOT__RESOURCE_PARAMETER:
			case Bpmn2Package.DOCUMENT_ROOT__RESOURCE_PARAMETER_BINDING:
			case Bpmn2Package.DOCUMENT_ROOT__SCRIPT:
			case Bpmn2Package.DOCUMENT_ROOT__SCRIPT_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__SEND_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__SEQUENCE_FLOW:
			case Bpmn2Package.DOCUMENT_ROOT__SERVICE_TASK:
			case Bpmn2Package.DOCUMENT_ROOT__SIGNAL:
			case Bpmn2Package.DOCUMENT_ROOT__SIGNAL_EVENT_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__STANDARD_LOOP_CHARACTERISTICS:
			case Bpmn2Package.DOCUMENT_ROOT__START_EVENT:
			case Bpmn2Package.DOCUMENT_ROOT__SUB_CHOREOGRAPHY:
			case Bpmn2Package.DOCUMENT_ROOT__SUB_CONVERSATION:
			case Bpmn2Package.DOCUMENT_ROOT__SUB_PROCESS:
			case Bpmn2Package.DOCUMENT_ROOT__TASK:
			case Bpmn2Package.DOCUMENT_ROOT__TERMINATE_EVENT_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__TEXT:
			case Bpmn2Package.DOCUMENT_ROOT__TEXT_ANNOTATION:
			case Bpmn2Package.DOCUMENT_ROOT__THROW_EVENT:
			case Bpmn2Package.DOCUMENT_ROOT__TIMER_EVENT_DEFINITION:
			case Bpmn2Package.DOCUMENT_ROOT__TRANSACTION:
			case Bpmn2Package.DOCUMENT_ROOT__USER_TASK:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Activity(),
				 Bpmn2Factory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_AdHocSubProcess(),
				 Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement(),
				 Bpmn2Factory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Artifact(),
				 Bpmn2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Artifact(),
				 Bpmn2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Artifact(),
				 Bpmn2Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Artifact(),
				 Bpmn2Factory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Assignment(),
				 Bpmn2Factory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Association(),
				 Bpmn2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Auditing(),
				 Bpmn2Factory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createBaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createConversationNode()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createRootElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createItemAwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createEscalation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createInputOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createParticipantMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createResourceAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createResourceParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement(),
				 Bpmn2Factory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createBaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createConversationNode()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createRootElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createItemAwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createEscalation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createInputOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createParticipantMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createResourceAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createResourceParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent(),
				 Bpmn2Factory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BoundaryEvent(),
				 Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_BusinessRuleTask(),
				 Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
				 Bpmn2Factory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement(),
				 Bpmn2Factory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CallActivity(),
				 Bpmn2Factory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CallChoreography(),
				 Bpmn2Factory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CallConversation(),
				 Bpmn2Factory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationNode(),
				 Bpmn2Factory.eINSTANCE.createConversationNode()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationNode(),
				 Bpmn2Factory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationNode(),
				 Bpmn2Factory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationNode(),
				 Bpmn2Factory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CancelEventDefinition(),
				 Bpmn2Factory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
				 Bpmn2Factory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
				 Bpmn2Factory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
				 Bpmn2Factory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
				 Bpmn2Factory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
				 Bpmn2Factory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
				 Bpmn2Factory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
				 Bpmn2Factory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
				 Bpmn2Factory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
				 Bpmn2Factory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
				 Bpmn2Factory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition(),
				 Bpmn2Factory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createRootElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createEscalation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement(),
				 Bpmn2Factory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CatchEvent(),
				 Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CatchEvent(),
				 Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CatchEvent(),
				 Bpmn2Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Category(),
				 Bpmn2Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CategoryValue(),
				 Bpmn2Factory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Choreography(),
				 Bpmn2Factory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Choreography(),
				 Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Collaboration(),
				 Bpmn2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Collaboration(),
				 Bpmn2Factory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Collaboration(),
				 Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Collaboration(),
				 Bpmn2Factory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
				 Bpmn2Factory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
				 Bpmn2Factory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyActivity(),
				 Bpmn2Factory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyTask(),
				 Bpmn2Factory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CompensateEventDefinition(),
				 Bpmn2Factory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ComplexBehaviorDefinition(),
				 Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ComplexGateway(),
				 Bpmn2Factory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ConditionalEventDefinition(),
				 Bpmn2Factory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Conversation(),
				 Bpmn2Factory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationAssociation(),
				 Bpmn2Factory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationLink(),
				 Bpmn2Factory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationKey(),
				 Bpmn2Factory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationProperty(),
				 Bpmn2Factory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationPropertyBinding(),
				 Bpmn2Factory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationPropertyRetrievalExpression(),
				 Bpmn2Factory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationSubscription(),
				 Bpmn2Factory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataAssociation(),
				 Bpmn2Factory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataAssociation(),
				 Bpmn2Factory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataAssociation(),
				 Bpmn2Factory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataInput(),
				 Bpmn2Factory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataInputAssociation(),
				 Bpmn2Factory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataObject(),
				 Bpmn2Factory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataObjectReference(),
				 Bpmn2Factory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataOutput(),
				 Bpmn2Factory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataOutputAssociation(),
				 Bpmn2Factory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataState(),
				 Bpmn2Factory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataStore(),
				 Bpmn2Factory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_DataStoreReference(),
				 Bpmn2Factory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Definitions(),
				 Bpmn2Factory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Documentation(),
				 Bpmn2Factory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EndEvent(),
				 Bpmn2Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EndPoint(),
				 Bpmn2Factory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Error(),
				 Bpmn2Factory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ErrorEventDefinition(),
				 Bpmn2Factory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Escalation(),
				 Bpmn2Factory.eINSTANCE.createEscalation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EscalationEventDefinition(),
				 Bpmn2Factory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
				 Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
				 Bpmn2Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
				 Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
				 Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
				 Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Event(),
				 Bpmn2Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_EventBasedGateway(),
				 Bpmn2Factory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ExclusiveGateway(),
				 Bpmn2Factory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Expression(),
				 Bpmn2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Expression(),
				 Bpmn2Factory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Extension(),
				 Bpmn2Factory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ExtensionElements(),
				 Bpmn2Factory.eINSTANCE.createExtensionAttributeValue()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode(),
				 Bpmn2Factory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_FormalExpression(),
				 Bpmn2Factory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask(),
				 Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalChoreographyTask(),
				 Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalConversation(),
				 Bpmn2Factory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalManualTask(),
				 Bpmn2Factory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalScriptTask(),
				 Bpmn2Factory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
				 Bpmn2Factory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
				 Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
				 Bpmn2Factory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
				 Bpmn2Factory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask(),
				 Bpmn2Factory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalUserTask(),
				 Bpmn2Factory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Group(),
				 Bpmn2Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_HumanPerformer(),
				 Bpmn2Factory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_HumanPerformer(),
				 Bpmn2Factory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Performer(),
				 Bpmn2Factory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Performer(),
				 Bpmn2Factory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Performer(),
				 Bpmn2Factory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceRole(),
				 Bpmn2Factory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceRole(),
				 Bpmn2Factory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceRole(),
				 Bpmn2Factory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceRole(),
				 Bpmn2Factory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ImplicitThrowEvent(),
				 Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Import(),
				 Bpmn2Factory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_InclusiveGateway(),
				 Bpmn2Factory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_InputSet(),
				 Bpmn2Factory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Interface(),
				 Bpmn2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_IntermediateCatchEvent(),
				 Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_IntermediateThrowEvent(),
				 Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_IoBinding(),
				 Bpmn2Factory.eINSTANCE.createInputOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_IoSpecification(),
				 Bpmn2Factory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ItemDefinition(),
				 Bpmn2Factory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Lane(),
				 Bpmn2Factory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_LaneSet(),
				 Bpmn2Factory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_LinkEventDefinition(),
				 Bpmn2Factory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_LoopCharacteristics(),
				 Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_LoopCharacteristics(),
				 Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ManualTask(),
				 Bpmn2Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Message(),
				 Bpmn2Factory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_MessageEventDefinition(),
				 Bpmn2Factory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_MessageFlow(),
				 Bpmn2Factory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_MessageFlowAssociation(),
				 Bpmn2Factory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Monitoring(),
				 Bpmn2Factory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_MultiInstanceLoopCharacteristics(),
				 Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Operation(),
				 Bpmn2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_OutputSet(),
				 Bpmn2Factory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ParallelGateway(),
				 Bpmn2Factory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Participant(),
				 Bpmn2Factory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ParticipantAssociation(),
				 Bpmn2Factory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ParticipantMultiplicity(),
				 Bpmn2Factory.eINSTANCE.createParticipantMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_PartnerEntity(),
				 Bpmn2Factory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_PartnerRole(),
				 Bpmn2Factory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_PotentialOwner(),
				 Bpmn2Factory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Process(),
				 Bpmn2Factory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Property(),
				 Bpmn2Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ReceiveTask(),
				 Bpmn2Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Relationship(),
				 Bpmn2Factory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Rendering(),
				 Bpmn2Factory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Resource(),
				 Bpmn2Factory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceAssignmentExpression(),
				 Bpmn2Factory.eINSTANCE.createResourceAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceParameter(),
				 Bpmn2Factory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceParameterBinding(),
				 Bpmn2Factory.eINSTANCE.createResourceParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createBaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createConversationNode()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createRootElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createItemAwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createEscalation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createExtensionAttributeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createExtensionAttributeValue()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createExtensionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createInputOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createInteractionNode()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createParticipantMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createResourceAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createResourceParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 Bpmn2Factory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 SagaFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 SagaFactory.eINSTANCE.createComponentAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 SagaFactory.eINSTANCE.createComponentInterfaceAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 SagaFactory.eINSTANCE.createSaga()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 SagaFactory.eINSTANCE.createSagaStep()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 SagaFactory.eINSTANCE.createViolation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 SagaFactory.eINSTANCE.createImpact()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 SagaFactory.eINSTANCE.createNotification()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 DiFactory.eINSTANCE.createBPMNDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 DiFactory.eINSTANCE.createBPMNEdge()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 DiFactory.eINSTANCE.createBPMNLabel()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 DiFactory.eINSTANCE.createBPMNLabelStyle()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 DiFactory.eINSTANCE.createBPMNPlane()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 DiFactory.eINSTANCE.createBPMNShape()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 BpmnDiFactory.eINSTANCE.createDiagramElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 DcFactory.eINSTANCE.createBounds()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 DcFactory.eINSTANCE.createFont()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 DcFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 GropiusFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 GropiusFactory.eINSTANCE.createIMS()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 GropiusFactory.eINSTANCE.createComponentInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 GropiusFactory.eINSTANCE.createIssue()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 GropiusFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 GropiusFactory.eINSTANCE.createReactionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 GropiusFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 GropiusFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 GropiusFactory.eINSTANCE.createIssueComment()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 SloFactory.eINSTANCE.createSloRule()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 SloFactory.eINSTANCE.createAlert()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 SloFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Script(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ScriptTask(),
				 Bpmn2Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_SendTask(),
				 Bpmn2Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_SequenceFlow(),
				 Bpmn2Factory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ServiceTask(),
				 Bpmn2Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Signal(),
				 Bpmn2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_SignalEventDefinition(),
				 Bpmn2Factory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_StandardLoopCharacteristics(),
				 Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_StartEvent(),
				 Bpmn2Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_SubChoreography(),
				 Bpmn2Factory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_SubConversation(),
				 Bpmn2Factory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_SubProcess(),
				 Bpmn2Factory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_SubProcess(),
				 Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_SubProcess(),
				 Bpmn2Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
				 Bpmn2Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
				 Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
				 Bpmn2Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
				 Bpmn2Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
				 Bpmn2Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
				 Bpmn2Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
				 Bpmn2Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Task(),
				 Bpmn2Factory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_TerminateEventDefinition(),
				 Bpmn2Factory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createBaseElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createAdHocSubProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createArtifact()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createAuditing()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCallChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createConversationNode()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCallConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createRootElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCallableElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCancelEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCategoryValue()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCollaboration()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCompensateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createComplexBehaviorDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createConditionalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createConversationAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createConversationLink()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCorrelationKey()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCorrelationProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCorrelationPropertyBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCorrelationPropertyRetrievalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createCorrelationSubscription()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createItemAwareElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDataInput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDataInputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDataObject()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDataObjectReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDataOutputAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDataState()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDataStore()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDataStoreReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createEndPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createError()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createErrorEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createEscalation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createEscalationEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createExtension()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createExtensionAttributeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createExtensionAttributeValue()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createExtensionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createFormalExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createGlobalTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createGlobalBusinessRuleTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createGlobalChoreographyTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createGlobalConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createGlobalManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createGlobalScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createGlobalUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createResourceRole()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createHumanPerformer()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createInputOutputBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createInputOutputSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createInputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createInteractionNode()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createIntermediateCatchEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createLane()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createLaneSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createLinkEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createManualTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createMessage()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createMessageEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createMessageFlowAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createMonitoring()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createMultiInstanceLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createOutputSet()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createParticipant()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createParticipantAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createParticipantMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createPartnerEntity()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createPartnerRole()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createPotentialOwner()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createReceiveTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createRendering()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createResource()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createResourceAssignmentExpression()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createResourceParameter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createResourceParameterBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createScriptTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createSendTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createServiceTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createSignalEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createStandardLoopCharacteristics()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createSubChoreography()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createSubConversation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createTerminateEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 Bpmn2Factory.eINSTANCE.createUserTask()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 SagaFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 SagaFactory.eINSTANCE.createComponentAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 SagaFactory.eINSTANCE.createComponentInterfaceAdapter()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 SagaFactory.eINSTANCE.createSaga()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 SagaFactory.eINSTANCE.createSagaStep()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 SagaFactory.eINSTANCE.createViolation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 SagaFactory.eINSTANCE.createImpact()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 SagaFactory.eINSTANCE.createNotification()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 DiFactory.eINSTANCE.createBPMNDiagram()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 DiFactory.eINSTANCE.createBPMNEdge()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 DiFactory.eINSTANCE.createBPMNLabel()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 DiFactory.eINSTANCE.createBPMNLabelStyle()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 DiFactory.eINSTANCE.createBPMNPlane()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 DiFactory.eINSTANCE.createBPMNShape()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 BpmnDiFactory.eINSTANCE.createDiagramElement()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 DcFactory.eINSTANCE.createBounds()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 DcFactory.eINSTANCE.createFont()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 DcFactory.eINSTANCE.createPoint()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 GropiusFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 GropiusFactory.eINSTANCE.createIMS()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 GropiusFactory.eINSTANCE.createComponentInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 GropiusFactory.eINSTANCE.createIssue()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 GropiusFactory.eINSTANCE.createLabel()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 GropiusFactory.eINSTANCE.createReactionGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 GropiusFactory.eINSTANCE.createProject()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 GropiusFactory.eINSTANCE.createUser()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 GropiusFactory.eINSTANCE.createIssueComment()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 SloFactory.eINSTANCE.createSloRule()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 SloFactory.eINSTANCE.createAlert()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 SloFactory.eINSTANCE.createModel()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Text(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_TextAnnotation(),
				 Bpmn2Factory.eINSTANCE.createTextAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ThrowEvent(),
				 Bpmn2Factory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ThrowEvent(),
				 Bpmn2Factory.eINSTANCE.createImplicitThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_ThrowEvent(),
				 Bpmn2Factory.eINSTANCE.createIntermediateThrowEvent()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_TimerEventDefinition(),
				 Bpmn2Factory.eINSTANCE.createTimerEventDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_Transaction(),
				 Bpmn2Factory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(Bpmn2Package.eINSTANCE.getDocumentRoot_UserTask(),
				 Bpmn2Factory.eINSTANCE.createUserTask()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Activity() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_FlowElement() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElement() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_BaseElementWithMixedContent() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_FlowNode() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Script() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Text() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_SubProcess() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_AdHocSubProcess() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Task() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_BusinessRuleTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CallActivity() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ManualTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ReceiveTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ScriptTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_SendTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ServiceTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Transaction() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_UserTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_BoundaryEvent() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CatchEvent() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Event() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CallChoreography() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyActivity() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ChoreographyTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ComplexGateway() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_DataObject() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_DataObjectReference() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_DataStoreReference() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_EndEvent() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ThrowEvent() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_EventBasedGateway() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ExclusiveGateway() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ImplicitThrowEvent() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_InclusiveGateway() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_IntermediateCatchEvent() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_IntermediateThrowEvent() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ParallelGateway() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_SequenceFlow() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_StartEvent() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_SubChoreography() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Artifact() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Association() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Group() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_TextAnnotation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Assignment() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Auditing() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationNode() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CallConversation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_RootElement() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CallableElement() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_EventDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CancelEventDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Category() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CategoryValue() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Collaboration() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Choreography() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CompensateEventDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ComplexBehaviorDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ConditionalEventDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Conversation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationAssociation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ConversationLink() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationKey() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationProperty() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationPropertyBinding() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationPropertyRetrievalExpression() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_CorrelationSubscription() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_DataAssociation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_DataInput() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_DataInputAssociation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_DataOutput() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_DataOutputAssociation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_DataState() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_DataStore() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Definitions() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Documentation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_EndPoint() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Error() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ErrorEventDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Escalation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_EscalationEventDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Expression() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_FormalExpression() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalBusinessRuleTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalChoreographyTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalConversation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalManualTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalScriptTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_GlobalUserTask() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceRole() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Performer() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_HumanPerformer() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_IoBinding() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_IoSpecification() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_InputSet() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Interface() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ItemDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Lane() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_LaneSet() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_LinkEventDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Message() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_MessageEventDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_MessageFlow() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_MessageFlowAssociation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Monitoring() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_LoopCharacteristics() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_MultiInstanceLoopCharacteristics() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Operation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_OutputSet() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Participant() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ParticipantAssociation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ParticipantMultiplicity() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_PartnerEntity() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_PartnerRole() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_PotentialOwner() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Process() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Property() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Relationship() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Rendering() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Resource() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceAssignmentExpression() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceParameter() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ResourceParameterBinding() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Signal() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_SignalEventDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_StandardLoopCharacteristics() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_SubConversation() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_TerminateEventDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_TimerEventDefinition() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Extension() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_ExtensionElements() ||
			childFeature == Bpmn2Package.eINSTANCE.getDocumentRoot_Import();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SagaEditPlugin.INSTANCE;
	}

}