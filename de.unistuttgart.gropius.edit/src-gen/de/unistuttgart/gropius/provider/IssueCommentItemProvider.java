/**
 */
package de.unistuttgart.gropius.provider;

import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.IssueComment;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.unistuttgart.gropius.IssueComment} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IssueCommentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueCommentItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addBodyPropertyDescriptor(object);
			addBodyRenderedPropertyDescriptor(object);
			addCommentCreatedByPropertyDescriptor(object);
			addEditedByPropertyDescriptor(object);
			addCommentCreatedAtPropertyDescriptor(object);
			addLastEditedAtPropertyDescriptor(object);
			addCurrentUserCanEditPropertyDescriptor(object);
			addReactionsPropertyDescriptor(object);
			addIssuePropertyDescriptor(object);
			addCreatedByPropertyDescriptor(object);
			addCreatedAtPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Node_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Node_id_feature", "_UI_Node_type"),
						GropiusPackage.Literals.NODE__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Body feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_body_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_body_feature", "_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__BODY, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Body Rendered feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBodyRenderedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_bodyRendered_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_bodyRendered_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__BODY_RENDERED, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Comment Created By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentCreatedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_commentCreatedBy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_commentCreatedBy_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__COMMENT_CREATED_BY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Edited By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEditedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_editedBy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_editedBy_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__EDITED_BY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Comment Created At feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentCreatedAtPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_commentCreatedAt_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_commentCreatedAt_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__COMMENT_CREATED_AT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Last Edited At feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastEditedAtPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_lastEditedAt_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_lastEditedAt_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__LAST_EDITED_AT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Current User Can Edit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCurrentUserCanEditPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_currentUserCanEdit_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_currentUserCanEdit_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__CURRENT_USER_CAN_EDIT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reactions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReactionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Comment_reactions_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Comment_reactions_feature",
								"_UI_Comment_type"),
						GropiusPackage.Literals.COMMENT__REACTIONS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Issue feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IssueTimelineItem_issue_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IssueTimelineItem_issue_feature",
								"_UI_IssueTimelineItem_type"),
						GropiusPackage.Literals.ISSUE_TIMELINE_ITEM__ISSUE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Created By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IssueTimelineItem_createdBy_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IssueTimelineItem_createdBy_feature",
								"_UI_IssueTimelineItem_type"),
						GropiusPackage.Literals.ISSUE_TIMELINE_ITEM__CREATED_BY, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Created At feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatedAtPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IssueTimelineItem_createdAt_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IssueTimelineItem_createdAt_feature",
								"_UI_IssueTimelineItem_type"),
						GropiusPackage.Literals.ISSUE_TIMELINE_ITEM__CREATED_AT, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns IssueComment.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IssueComment"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Object labelValue = ((IssueComment) object).getId();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_IssueComment_type")
				: getString("_UI_IssueComment_type") + " " + label;
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

		switch (notification.getFeatureID(IssueComment.class)) {
		case GropiusPackage.ISSUE_COMMENT__ID:
		case GropiusPackage.ISSUE_COMMENT__BODY:
		case GropiusPackage.ISSUE_COMMENT__BODY_RENDERED:
		case GropiusPackage.ISSUE_COMMENT__COMMENT_CREATED_AT:
		case GropiusPackage.ISSUE_COMMENT__LAST_EDITED_AT:
		case GropiusPackage.ISSUE_COMMENT__CURRENT_USER_CAN_EDIT:
		case GropiusPackage.ISSUE_COMMENT__CREATED_AT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GropiusEditPlugin.INSTANCE;
	}

}
