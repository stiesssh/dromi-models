package de.unistuttgart.ma.saga.presentation;

import java.util.MissingResourceException;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.unistuttgart.ma.saga.presentation.SagaEditorPlugin;

/**
 * This is the page where the type of object to create is selected.
 * 
 * This is mandatory. 
 *  
 */
public class SagaModelWizardSolomonRulesImportPage extends WizardPage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected Text gropiusUrlField;
	protected Text gropiusProjectIdField;

	/**
	 * Pass in the selection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SagaModelWizardSolomonRulesImportPage(String pageId) {
		super(pageId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			layout.numColumns = 1;
			layout.verticalSpacing = 12;
			composite.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.horizontalAlignment = GridData.FILL;
			composite.setLayoutData(data);
		}

		Label containerLabel = new Label(composite, SWT.LEFT);
		{
			containerLabel.setText("Solomon url : ");

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			containerLabel.setLayoutData(data);
		}

		gropiusUrlField = new Text(composite, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			gropiusUrlField.setLayoutData(data);
		}

		gropiusUrlField.addModifyListener(validator);

		Label encodingLabel = new Label(composite, SWT.LEFT);
		{
			encodingLabel.setText("Project id : ");

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			encodingLabel.setLayoutData(data);
		}
		gropiusProjectIdField = new Text(composite, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			gropiusProjectIdField.setLayoutData(data);
		}

		gropiusProjectIdField.addModifyListener(validator);

		setPageComplete(validatePage());
		setControl(composite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected ModifyListener validator = new ModifyListener() {
		public void modifyText(ModifyEvent e) {
			setPageComplete(validatePage());
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected boolean validatePage() {
		return getGropiusUrlField() != null && getGropiusProjectIdField() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			gropiusProjectIdField.clearSelection();
			gropiusUrlField.setFocus();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getGropiusUrlField() {
		return gropiusUrlField.getText();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getGropiusProjectIdField() {
		return gropiusProjectIdField.getText();
	}

	/**
	 * Returns the label for the specified type name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected String getLabel(String typeName) {
		try {
			return de.unistuttgart.ma.saga.provider.SagaEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
		} catch (MissingResourceException mre) {
			SagaEditorPlugin.INSTANCE.log(mre);
		}
		return typeName;
	}
}