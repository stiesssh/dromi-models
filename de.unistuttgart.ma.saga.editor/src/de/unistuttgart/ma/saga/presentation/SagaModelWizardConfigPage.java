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
import de.unistuttgart.ma.saga.provider.SagaEditPlugin;


/**
 * This is the page where the type of object to create is selected.
 * 
 * Optional, in case you already have some BPMN lying around. 
 *  
 */
public class SagaModelWizardConfigPage extends WizardPage {

	protected Text backendUrl;
	protected Text bpmnFilePath;
	protected Text solomonUrlField;
	protected Text deploymentEnvironmentField;
	protected Text gropiusUrlField;
	protected Text gropiusProjectNameField;
	
	/**
	 * Pass in the selection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public SagaModelWizardConfigPage(String pageId) {
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

		{
			Label containerLabel = new Label(composite, SWT.LEFT);
			containerLabel.setText("Backend URL: ");
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			containerLabel.setLayoutData(data);
		}
		{
			backendUrl = new Text(composite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			backendUrl.setLayoutData(data);
			backendUrl.setText(Literals.backendUrl);
			backendUrl.addModifyListener(validator);
		}
		{
			Label containerLabel = new Label(composite, SWT.LEFT);
			containerLabel.setText("Process location: ");
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			containerLabel.setLayoutData(data);
		}
		{
			bpmnFilePath = new Text(composite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			bpmnFilePath.setLayoutData(data);
			bpmnFilePath.setText(Literals.bpmnFilePath);
			bpmnFilePath.addModifyListener(validator);
		}
		{
			Label containerLabel = new Label(composite, SWT.LEFT);
			containerLabel.setText("Gropius URL : ");
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			containerLabel.setLayoutData(data);
		}
		{
			gropiusUrlField = new Text(composite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			gropiusUrlField.setLayoutData(data);
			gropiusUrlField.setText(Literals.gropiusUrl);
			gropiusUrlField.addModifyListener(validator);
		}
		{
			Label encodingLabel = new Label(composite, SWT.LEFT);
			encodingLabel.setText("Project Name : ");
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			encodingLabel.setLayoutData(data);
		}
		{
			gropiusProjectNameField = new Text(composite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			gropiusProjectNameField.setLayoutData(data);
			gropiusProjectNameField.setText(Literals.gropiusProjectName);
			gropiusProjectNameField.addModifyListener(validator);
		}
		{
			Label containerLabel = new Label(composite, SWT.LEFT);
			containerLabel.setText("Solomon URL : ");
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			containerLabel.setLayoutData(data);
		}
		{
			solomonUrlField = new Text(composite, SWT.BORDER);
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			solomonUrlField.setLayoutData(data);
			solomonUrlField.setText(Literals.solomonUrl);
			solomonUrlField.addModifyListener(validator);
		}
		{
			Label encodingLabel = new Label(composite, SWT.LEFT);
			encodingLabel.setText("Environment: ");
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			encodingLabel.setLayoutData(data);
			deploymentEnvironmentField = new Text(composite, SWT.BORDER);
		}
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			deploymentEnvironmentField.setLayoutData(data);
			deploymentEnvironmentField.setText(Literals.solomonDeploymentEnvironment);
			deploymentEnvironmentField.addModifyListener(validator);
		}
		
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
		return getBackendUrlField() != null && !getBackendUrlField().isBlank() &&
		getBpmnFilePathField() != null && !getBpmnFilePathField().isBlank() &&
		getSolomonUrlField() != null && !getSolomonUrlField().isBlank() &&
		getDeploymentEnvironmentField() != null && !getDeploymentEnvironmentField().isBlank() &&
		getGropiusUrlField() != null && !getGropiusUrlField().isBlank() &&
		getGropiusProjectNameField() != null && !getGropiusProjectNameField().isBlank();
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			backendUrl.setFocus();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getBackendUrlField() {
		return backendUrl.getText();
	}
	
	public String getBpmnFilePathField() {
		return bpmnFilePath.getText();
	}

	public String getSolomonUrlField() {
		return solomonUrlField.getText();
	}

	public String getDeploymentEnvironmentField() {
		return deploymentEnvironmentField.getText();
	}
	
	public String getGropiusUrlField() {
		return gropiusUrlField.getText();
	}

	public String getGropiusProjectNameField() {
		return gropiusProjectNameField.getText();
	}

	/**
	 * Returns the label for the specified type name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected String getLabel(String typeName) {
		try {
			return SagaEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
		} catch (MissingResourceException mre) {
			SagaEditorPlugin.INSTANCE.log(mre);
		}
		return typeName;
	}
}