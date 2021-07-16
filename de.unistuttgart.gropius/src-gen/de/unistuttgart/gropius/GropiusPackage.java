/**
 */
package de.unistuttgart.gropius;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.unistuttgart.gropius.GropiusFactory
 * @model kind="package"
 * @generated
 */
public interface GropiusPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gropius";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/gropius";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gropius";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GropiusPackage eINSTANCE = de.unistuttgart.gropius.impl.GropiusPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.Node <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.Node
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.Comment <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.Comment
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = 0;

	/**
	 * The feature id for the '<em><b>Body Rendered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY_RENDERED = 1;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATED_BY = 2;

	/**
	 * The feature id for the '<em><b>Edited By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__EDITED_BY = 3;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CREATED_AT = 4;

	/**
	 * The feature id for the '<em><b>Last Edited At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__LAST_EDITED_AT = 5;

	/**
	 * The feature id for the '<em><b>Current User Can Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__CURRENT_USER_CAN_EDIT = 6;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REACTIONS = 7;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.IssueLocation <em>Issue Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.IssueLocation
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIssueLocation()
	 * @generated
	 */
	int ISSUE_LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LOCATION__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LOCATION__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LOCATION__DESCRIPTION = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issue On Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LOCATION__ISSUE_ON_LOCATION = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Issue Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LOCATION_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Issue Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_LOCATION_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.impl.ComponentImpl
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = ISSUE_LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = ISSUE_LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = ISSUE_LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Issue On Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ISSUE_ON_LOCATION = ISSUE_LOCATION__ISSUE_ON_LOCATION;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNER = ISSUE_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ims</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IMS = ISSUE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ISSUES = ISSUE_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROJECTS = ISSUE_LOCATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERFACES = ISSUE_LOCATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Consumed Interfaces</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONSUMED_INTERFACES = ISSUE_LOCATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LABELS = ISSUE_LOCATION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ISSUE_LOCATION_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ISSUE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.impl.IMSImpl <em>IMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.impl.IMSImpl
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIMS()
	 * @generated
	 */
	int IMS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Ims Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__IMS_TYPE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS__COMPONENT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>IMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMS_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.impl.ComponentInterfaceImpl
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getComponentInterface()
	 * @generated
	 */
	int COMPONENT_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ID = ISSUE_LOCATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__NAME = ISSUE_LOCATION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__DESCRIPTION = ISSUE_LOCATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Issue On Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__ISSUE_ON_LOCATION = ISSUE_LOCATION__ISSUE_ON_LOCATION;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__COMPONENT = ISSUE_LOCATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Consumed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE__CONSUMED_BY = ISSUE_LOCATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_FEATURE_COUNT = ISSUE_LOCATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INTERFACE_OPERATION_COUNT = ISSUE_LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.impl.IssueImpl
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 5;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__BODY = COMMENT__BODY;

	/**
	 * The feature id for the '<em><b>Body Rendered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__BODY_RENDERED = COMMENT__BODY_RENDERED;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CREATED_BY = COMMENT__CREATED_BY;

	/**
	 * The feature id for the '<em><b>Edited By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__EDITED_BY = COMMENT__EDITED_BY;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CREATED_AT = COMMENT__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Last Edited At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LAST_EDITED_AT = COMMENT__LAST_EDITED_AT;

	/**
	 * The feature id for the '<em><b>Current User Can Edit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CURRENT_USER_CAN_EDIT = COMMENT__CURRENT_USER_CAN_EDIT;

	/**
	 * The feature id for the '<em><b>Reactions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__REACTIONS = COMMENT__REACTIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ID = COMMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__UPDATED_AT = COMMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__IS_OPEN = COMMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Duplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__IS_DUPLICATE = COMMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CATEGORY = COMMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current User Can Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CURRENT_USER_CAN_COMMENT = COMMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__START_DATE = COMMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DUE_DATE = COMMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Estimated Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ESTIMATED_TIME = COMMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Spent Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SPENT_TIME = COMMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Issue Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ISSUE_COMMENTS = COMMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Links To Issues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LINKS_TO_ISSUES = COMMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Linked By Issues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LINKED_BY_ISSUES = COMMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Assignees</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNEES = COMMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LABELS = COMMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PARTICIPANTS = COMMENT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Pinned On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PINNED_ON = COMMENT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Timeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TIMELINE = COMMENT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LOCATION = COMMENT_FEATURE_COUNT + 18;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = COMMENT_FEATURE_COUNT + 19;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = COMMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.IssueTimelineItem <em>Issue Timeline Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.IssueTimelineItem
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIssueTimelineItem()
	 * @generated
	 */
	int ISSUE_TIMELINE_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TIMELINE_ITEM__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Issue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TIMELINE_ITEM__ISSUE = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TIMELINE_ITEM__CREATED_BY = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TIMELINE_ITEM__CREATED_AT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Issue Timeline Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TIMELINE_ITEM_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Issue Timeline Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_TIMELINE_ITEM_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.impl.LabelImpl
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DESCRIPTION = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COMPONENTS = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PROJECTS = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Reaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__REACTION = NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = NODE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.impl.ReactionGroupImpl <em>Reaction Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.impl.ReactionGroupImpl
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getReactionGroup()
	 * @generated
	 */
	int REACTION_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_GROUP__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_GROUP__USERS = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Total User Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_GROUP__TOTAL_USER_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reaction Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_GROUP_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reaction Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTION_GROUP_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.impl.ProjectImpl
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__COMPONENTS = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__USERS = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OWNER = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ISSUES = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LABELS = NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = NODE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.impl.UserImpl
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getUser()
	 * @generated
	 */
	int USER = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = NODE__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Displayname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__DISPLAYNAME = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROJECTS = NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assigned To Issues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ASSIGNED_TO_ISSUES = NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Participant Of Issue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PARTICIPANT_OF_ISSUE = NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Issue Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ISSUE_COMMENTS = NODE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = NODE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.IMSType <em>IMS Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.IMSType
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIMSType()
	 * @generated
	 */
	int IMS_TYPE = 12;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.IssueCategory <em>Issue Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.IssueCategory
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIssueCategory()
	 * @generated
	 */
	int ISSUE_CATEGORY = 13;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.IssueTimelineItemType <em>Issue Timeline Item Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.IssueTimelineItemType
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIssueTimelineItemType()
	 * @generated
	 */
	int ISSUE_TIMELINE_ITEM_TYPE = 14;

	/**
	 * The meta object id for the '{@link de.unistuttgart.gropius.Priority <em>Priority</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.unistuttgart.gropius.Priority
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getPriority()
	 * @generated
	 */
	int PRIORITY = 15;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 16;

	/**
	 * The meta object id for the '<em>ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getID()
	 * @generated
	 */
	int ID = 17;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 18;

	/**
	 * The meta object id for the '<em>Time Span</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getTimeSpan()
	 * @generated
	 */
	int TIME_SPAN = 19;

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.unistuttgart.gropius.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.unistuttgart.gropius.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see de.unistuttgart.gropius.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see de.unistuttgart.gropius.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Comment#getBodyRendered <em>Body Rendered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body Rendered</em>'.
	 * @see de.unistuttgart.gropius.Comment#getBodyRendered()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_BodyRendered();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Comment#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see de.unistuttgart.gropius.Comment#getCreatedBy()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_CreatedBy();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Comment#getEditedBy <em>Edited By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Edited By</em>'.
	 * @see de.unistuttgart.gropius.Comment#getEditedBy()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_EditedBy();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Comment#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see de.unistuttgart.gropius.Comment#getCreatedAt()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Comment#getLastEditedAt <em>Last Edited At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Edited At</em>'.
	 * @see de.unistuttgart.gropius.Comment#getLastEditedAt()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_LastEditedAt();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Comment#isCurrentUserCanEdit <em>Current User Can Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current User Can Edit</em>'.
	 * @see de.unistuttgart.gropius.Comment#isCurrentUserCanEdit()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_CurrentUserCanEdit();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Comment#getReactions <em>Reactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reactions</em>'.
	 * @see de.unistuttgart.gropius.Comment#getReactions()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Reactions();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see de.unistuttgart.gropius.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Component#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see de.unistuttgart.gropius.Component#getOwner()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Owner();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Component#getIms <em>Ims</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ims</em>'.
	 * @see de.unistuttgart.gropius.Component#getIms()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Ims();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Component#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issues</em>'.
	 * @see de.unistuttgart.gropius.Component#getIssues()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Issues();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Component#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projects</em>'.
	 * @see de.unistuttgart.gropius.Component#getProjects()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Projects();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Component#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interfaces</em>'.
	 * @see de.unistuttgart.gropius.Component#getInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Interfaces();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Component#getConsumedInterfaces <em>Consumed Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumed Interfaces</em>'.
	 * @see de.unistuttgart.gropius.Component#getConsumedInterfaces()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_ConsumedInterfaces();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Component#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Labels</em>'.
	 * @see de.unistuttgart.gropius.Component#getLabels()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Labels();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.IMS <em>IMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMS</em>'.
	 * @see de.unistuttgart.gropius.IMS
	 * @generated
	 */
	EClass getIMS();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.IMS#getImsType <em>Ims Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ims Type</em>'.
	 * @see de.unistuttgart.gropius.IMS#getImsType()
	 * @see #getIMS()
	 * @generated
	 */
	EAttribute getIMS_ImsType();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.IMS#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see de.unistuttgart.gropius.IMS#getComponent()
	 * @see #getIMS()
	 * @generated
	 */
	EReference getIMS_Component();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.ComponentInterface <em>Component Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Interface</em>'.
	 * @see de.unistuttgart.gropius.ComponentInterface
	 * @generated
	 */
	EClass getComponentInterface();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.ComponentInterface#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see de.unistuttgart.gropius.ComponentInterface#getComponent()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_Component();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.ComponentInterface#getConsumedBy <em>Consumed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Consumed By</em>'.
	 * @see de.unistuttgart.gropius.ComponentInterface#getConsumedBy()
	 * @see #getComponentInterface()
	 * @generated
	 */
	EReference getComponentInterface_ConsumedBy();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see de.unistuttgart.gropius.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Issue#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see de.unistuttgart.gropius.Issue#getUpdatedAt()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_UpdatedAt();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Issue#isIsOpen <em>Is Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Open</em>'.
	 * @see de.unistuttgart.gropius.Issue#isIsOpen()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_IsOpen();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Issue#isIsDuplicate <em>Is Duplicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Duplicate</em>'.
	 * @see de.unistuttgart.gropius.Issue#isIsDuplicate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_IsDuplicate();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Issue#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see de.unistuttgart.gropius.Issue#getCategory()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Category();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Issue#isCurrentUserCanComment <em>Current User Can Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current User Can Comment</em>'.
	 * @see de.unistuttgart.gropius.Issue#isCurrentUserCanComment()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_CurrentUserCanComment();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Issue#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see de.unistuttgart.gropius.Issue#getStartDate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Issue#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see de.unistuttgart.gropius.Issue#getDueDate()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Issue#getEstimatedTime <em>Estimated Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Estimated Time</em>'.
	 * @see de.unistuttgart.gropius.Issue#getEstimatedTime()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_EstimatedTime();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Issue#getSpentTime <em>Spent Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spent Time</em>'.
	 * @see de.unistuttgart.gropius.Issue#getSpentTime()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_SpentTime();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Issue#getIssueComments <em>Issue Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issue Comments</em>'.
	 * @see de.unistuttgart.gropius.Issue#getIssueComments()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_IssueComments();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Issue#getLinksToIssues <em>Links To Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Links To Issues</em>'.
	 * @see de.unistuttgart.gropius.Issue#getLinksToIssues()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_LinksToIssues();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Issue#getLinkedByIssues <em>Linked By Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked By Issues</em>'.
	 * @see de.unistuttgart.gropius.Issue#getLinkedByIssues()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_LinkedByIssues();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Issue#getAssignees <em>Assignees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignees</em>'.
	 * @see de.unistuttgart.gropius.Issue#getAssignees()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Assignees();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Issue#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Labels</em>'.
	 * @see de.unistuttgart.gropius.Issue#getLabels()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Labels();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Issue#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participants</em>'.
	 * @see de.unistuttgart.gropius.Issue#getParticipants()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Participants();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Issue#getPinnedOn <em>Pinned On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pinned On</em>'.
	 * @see de.unistuttgart.gropius.Issue#getPinnedOn()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_PinnedOn();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Issue#getTimeline <em>Timeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Timeline</em>'.
	 * @see de.unistuttgart.gropius.Issue#getTimeline()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Timeline();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Issue#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see de.unistuttgart.gropius.Issue#getLocation()
	 * @see #getIssue()
	 * @generated
	 */
	EReference getIssue_Location();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.IssueTimelineItem <em>Issue Timeline Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Timeline Item</em>'.
	 * @see de.unistuttgart.gropius.IssueTimelineItem
	 * @generated
	 */
	EClass getIssueTimelineItem();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.IssueTimelineItem#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issue</em>'.
	 * @see de.unistuttgart.gropius.IssueTimelineItem#getIssue()
	 * @see #getIssueTimelineItem()
	 * @generated
	 */
	EReference getIssueTimelineItem_Issue();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.IssueTimelineItem#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Created By</em>'.
	 * @see de.unistuttgart.gropius.IssueTimelineItem#getCreatedBy()
	 * @see #getIssueTimelineItem()
	 * @generated
	 */
	EReference getIssueTimelineItem_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.IssueTimelineItem#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see de.unistuttgart.gropius.IssueTimelineItem#getCreatedAt()
	 * @see #getIssueTimelineItem()
	 * @generated
	 */
	EAttribute getIssueTimelineItem_CreatedAt();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.IssueLocation <em>Issue Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue Location</em>'.
	 * @see de.unistuttgart.gropius.IssueLocation
	 * @generated
	 */
	EClass getIssueLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.IssueLocation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.gropius.IssueLocation#getName()
	 * @see #getIssueLocation()
	 * @generated
	 */
	EAttribute getIssueLocation_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.IssueLocation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.unistuttgart.gropius.IssueLocation#getDescription()
	 * @see #getIssueLocation()
	 * @generated
	 */
	EAttribute getIssueLocation_Description();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.IssueLocation#getIssueOnLocation <em>Issue On Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issue On Location</em>'.
	 * @see de.unistuttgart.gropius.IssueLocation#getIssueOnLocation()
	 * @see #getIssueLocation()
	 * @generated
	 */
	EReference getIssueLocation_IssueOnLocation();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see de.unistuttgart.gropius.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Label#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.gropius.Label#getName()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Label#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.unistuttgart.gropius.Label#getDescription()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Label#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see de.unistuttgart.gropius.Label#getColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Color();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Label#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Components</em>'.
	 * @see de.unistuttgart.gropius.Label#getComponents()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Components();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Label#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projects</em>'.
	 * @see de.unistuttgart.gropius.Label#getProjects()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Projects();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Label#getReaction <em>Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reaction</em>'.
	 * @see de.unistuttgart.gropius.Label#getReaction()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Reaction();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.ReactionGroup <em>Reaction Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reaction Group</em>'.
	 * @see de.unistuttgart.gropius.ReactionGroup
	 * @generated
	 */
	EClass getReactionGroup();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.ReactionGroup#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Users</em>'.
	 * @see de.unistuttgart.gropius.ReactionGroup#getUsers()
	 * @see #getReactionGroup()
	 * @generated
	 */
	EReference getReactionGroup_Users();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.ReactionGroup#getTotalUserCount <em>Total User Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total User Count</em>'.
	 * @see de.unistuttgart.gropius.ReactionGroup#getTotalUserCount()
	 * @see #getReactionGroup()
	 * @generated
	 */
	EAttribute getReactionGroup_TotalUserCount();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see de.unistuttgart.gropius.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.unistuttgart.gropius.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.unistuttgart.gropius.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Project#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Components</em>'.
	 * @see de.unistuttgart.gropius.Project#getComponents()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Components();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Project#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Users</em>'.
	 * @see de.unistuttgart.gropius.Project#getUsers()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Users();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Project#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see de.unistuttgart.gropius.Project#getOwner()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Owner();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Project#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issues</em>'.
	 * @see de.unistuttgart.gropius.Project#getIssues()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Issues();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.Project#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Labels</em>'.
	 * @see de.unistuttgart.gropius.Project#getLabels()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Labels();

	/**
	 * Returns the meta object for class '{@link de.unistuttgart.gropius.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see de.unistuttgart.gropius.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see de.unistuttgart.gropius.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.User#getDisplayname <em>Displayname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Displayname</em>'.
	 * @see de.unistuttgart.gropius.User#getDisplayname()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Displayname();

	/**
	 * Returns the meta object for the attribute '{@link de.unistuttgart.gropius.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.unistuttgart.gropius.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.User#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projects</em>'.
	 * @see de.unistuttgart.gropius.User#getProjects()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Projects();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.User#getAssignedToIssues <em>Assigned To Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned To Issues</em>'.
	 * @see de.unistuttgart.gropius.User#getAssignedToIssues()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_AssignedToIssues();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.User#getParticipantOfIssue <em>Participant Of Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Participant Of Issue</em>'.
	 * @see de.unistuttgart.gropius.User#getParticipantOfIssue()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_ParticipantOfIssue();

	/**
	 * Returns the meta object for the reference '{@link de.unistuttgart.gropius.User#getIssueComments <em>Issue Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Issue Comments</em>'.
	 * @see de.unistuttgart.gropius.User#getIssueComments()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_IssueComments();

	/**
	 * Returns the meta object for enum '{@link de.unistuttgart.gropius.IMSType <em>IMS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IMS Type</em>'.
	 * @see de.unistuttgart.gropius.IMSType
	 * @generated
	 */
	EEnum getIMSType();

	/**
	 * Returns the meta object for enum '{@link de.unistuttgart.gropius.IssueCategory <em>Issue Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Category</em>'.
	 * @see de.unistuttgart.gropius.IssueCategory
	 * @generated
	 */
	EEnum getIssueCategory();

	/**
	 * Returns the meta object for enum '{@link de.unistuttgart.gropius.IssueTimelineItemType <em>Issue Timeline Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue Timeline Item Type</em>'.
	 * @see de.unistuttgart.gropius.IssueTimelineItemType
	 * @generated
	 */
	EEnum getIssueTimelineItemType();

	/**
	 * Returns the meta object for enum '{@link de.unistuttgart.gropius.Priority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority</em>'.
	 * @see de.unistuttgart.gropius.Priority
	 * @generated
	 */
	EEnum getPriority();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ID</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getID();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Time Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Span</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getTimeSpan();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GropiusFactory getGropiusFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.Node <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.Node
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.Comment <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.Comment
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '<em><b>Body Rendered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY_RENDERED = eINSTANCE.getComment_BodyRendered();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__CREATED_BY = eINSTANCE.getComment_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Edited By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__EDITED_BY = eINSTANCE.getComment_EditedBy();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CREATED_AT = eINSTANCE.getComment_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Last Edited At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__LAST_EDITED_AT = eINSTANCE.getComment_LastEditedAt();

		/**
		 * The meta object literal for the '<em><b>Current User Can Edit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__CURRENT_USER_CAN_EDIT = eINSTANCE.getComment_CurrentUserCanEdit();

		/**
		 * The meta object literal for the '<em><b>Reactions</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__REACTIONS = eINSTANCE.getComment_Reactions();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.impl.ComponentImpl
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OWNER = eINSTANCE.getComponent_Owner();

		/**
		 * The meta object literal for the '<em><b>Ims</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IMS = eINSTANCE.getComponent_Ims();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ISSUES = eINSTANCE.getComponent_Issues();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PROJECTS = eINSTANCE.getComponent_Projects();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INTERFACES = eINSTANCE.getComponent_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Consumed Interfaces</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONSUMED_INTERFACES = eINSTANCE.getComponent_ConsumedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__LABELS = eINSTANCE.getComponent_Labels();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.impl.IMSImpl <em>IMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.impl.IMSImpl
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIMS()
		 * @generated
		 */
		EClass IMS = eINSTANCE.getIMS();

		/**
		 * The meta object literal for the '<em><b>Ims Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMS__IMS_TYPE = eINSTANCE.getIMS_ImsType();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMS__COMPONENT = eINSTANCE.getIMS_Component();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.impl.ComponentInterfaceImpl <em>Component Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.impl.ComponentInterfaceImpl
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getComponentInterface()
		 * @generated
		 */
		EClass COMPONENT_INTERFACE = eINSTANCE.getComponentInterface();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__COMPONENT = eINSTANCE.getComponentInterface_Component();

		/**
		 * The meta object literal for the '<em><b>Consumed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INTERFACE__CONSUMED_BY = eINSTANCE.getComponentInterface_ConsumedBy();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.impl.IssueImpl
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__UPDATED_AT = eINSTANCE.getIssue_UpdatedAt();

		/**
		 * The meta object literal for the '<em><b>Is Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__IS_OPEN = eINSTANCE.getIssue_IsOpen();

		/**
		 * The meta object literal for the '<em><b>Is Duplicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__IS_DUPLICATE = eINSTANCE.getIssue_IsDuplicate();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__CATEGORY = eINSTANCE.getIssue_Category();

		/**
		 * The meta object literal for the '<em><b>Current User Can Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__CURRENT_USER_CAN_COMMENT = eINSTANCE.getIssue_CurrentUserCanComment();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__START_DATE = eINSTANCE.getIssue_StartDate();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DUE_DATE = eINSTANCE.getIssue_DueDate();

		/**
		 * The meta object literal for the '<em><b>Estimated Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__ESTIMATED_TIME = eINSTANCE.getIssue_EstimatedTime();

		/**
		 * The meta object literal for the '<em><b>Spent Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__SPENT_TIME = eINSTANCE.getIssue_SpentTime();

		/**
		 * The meta object literal for the '<em><b>Issue Comments</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ISSUE_COMMENTS = eINSTANCE.getIssue_IssueComments();

		/**
		 * The meta object literal for the '<em><b>Links To Issues</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__LINKS_TO_ISSUES = eINSTANCE.getIssue_LinksToIssues();

		/**
		 * The meta object literal for the '<em><b>Linked By Issues</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__LINKED_BY_ISSUES = eINSTANCE.getIssue_LinkedByIssues();

		/**
		 * The meta object literal for the '<em><b>Assignees</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__ASSIGNEES = eINSTANCE.getIssue_Assignees();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__LABELS = eINSTANCE.getIssue_Labels();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__PARTICIPANTS = eINSTANCE.getIssue_Participants();

		/**
		 * The meta object literal for the '<em><b>Pinned On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__PINNED_ON = eINSTANCE.getIssue_PinnedOn();

		/**
		 * The meta object literal for the '<em><b>Timeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__TIMELINE = eINSTANCE.getIssue_Timeline();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE__LOCATION = eINSTANCE.getIssue_Location();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.IssueTimelineItem <em>Issue Timeline Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.IssueTimelineItem
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIssueTimelineItem()
		 * @generated
		 */
		EClass ISSUE_TIMELINE_ITEM = eINSTANCE.getIssueTimelineItem();

		/**
		 * The meta object literal for the '<em><b>Issue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TIMELINE_ITEM__ISSUE = eINSTANCE.getIssueTimelineItem_Issue();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_TIMELINE_ITEM__CREATED_BY = eINSTANCE.getIssueTimelineItem_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_TIMELINE_ITEM__CREATED_AT = eINSTANCE.getIssueTimelineItem_CreatedAt();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.IssueLocation <em>Issue Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.IssueLocation
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIssueLocation()
		 * @generated
		 */
		EClass ISSUE_LOCATION = eINSTANCE.getIssueLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_LOCATION__NAME = eINSTANCE.getIssueLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE_LOCATION__DESCRIPTION = eINSTANCE.getIssueLocation_Description();

		/**
		 * The meta object literal for the '<em><b>Issue On Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ISSUE_LOCATION__ISSUE_ON_LOCATION = eINSTANCE.getIssueLocation_IssueOnLocation();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.impl.LabelImpl
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__DESCRIPTION = eINSTANCE.getLabel_Description();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__COLOR = eINSTANCE.getLabel_Color();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__COMPONENTS = eINSTANCE.getLabel_Components();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__PROJECTS = eINSTANCE.getLabel_Projects();

		/**
		 * The meta object literal for the '<em><b>Reaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__REACTION = eINSTANCE.getLabel_Reaction();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.impl.ReactionGroupImpl <em>Reaction Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.impl.ReactionGroupImpl
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getReactionGroup()
		 * @generated
		 */
		EClass REACTION_GROUP = eINSTANCE.getReactionGroup();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTION_GROUP__USERS = eINSTANCE.getReactionGroup_Users();

		/**
		 * The meta object literal for the '<em><b>Total User Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REACTION_GROUP__TOTAL_USER_COUNT = eINSTANCE.getReactionGroup_TotalUserCount();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.impl.ProjectImpl
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__COMPONENTS = eINSTANCE.getProject_Components();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__USERS = eINSTANCE.getProject_Users();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__OWNER = eINSTANCE.getProject_Owner();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__ISSUES = eINSTANCE.getProject_Issues();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__LABELS = eINSTANCE.getProject_Labels();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.impl.UserImpl
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Displayname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__DISPLAYNAME = eINSTANCE.getUser_Displayname();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__PROJECTS = eINSTANCE.getUser_Projects();

		/**
		 * The meta object literal for the '<em><b>Assigned To Issues</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ASSIGNED_TO_ISSUES = eINSTANCE.getUser_AssignedToIssues();

		/**
		 * The meta object literal for the '<em><b>Participant Of Issue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__PARTICIPANT_OF_ISSUE = eINSTANCE.getUser_ParticipantOfIssue();

		/**
		 * The meta object literal for the '<em><b>Issue Comments</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ISSUE_COMMENTS = eINSTANCE.getUser_IssueComments();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.IMSType <em>IMS Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.IMSType
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIMSType()
		 * @generated
		 */
		EEnum IMS_TYPE = eINSTANCE.getIMSType();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.IssueCategory <em>Issue Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.IssueCategory
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIssueCategory()
		 * @generated
		 */
		EEnum ISSUE_CATEGORY = eINSTANCE.getIssueCategory();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.IssueTimelineItemType <em>Issue Timeline Item Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.IssueTimelineItemType
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getIssueTimelineItemType()
		 * @generated
		 */
		EEnum ISSUE_TIMELINE_ITEM_TYPE = eINSTANCE.getIssueTimelineItemType();

		/**
		 * The meta object literal for the '{@link de.unistuttgart.gropius.Priority <em>Priority</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.unistuttgart.gropius.Priority
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getPriority()
		 * @generated
		 */
		EEnum PRIORITY = eINSTANCE.getPriority();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getID()
		 * @generated
		 */
		EDataType ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Time Span</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see de.unistuttgart.gropius.impl.GropiusPackageImpl#getTimeSpan()
		 * @generated
		 */
		EDataType TIME_SPAN = eINSTANCE.getTimeSpan();

	}

} //GropiusPackage
