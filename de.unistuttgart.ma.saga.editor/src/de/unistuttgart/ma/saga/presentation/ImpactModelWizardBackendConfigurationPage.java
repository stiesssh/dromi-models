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
public class ImpactModelWizardBackendConfigurationPage extends WizardPage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected Text backendUrl;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	protected Text systemUri;

	/**
	 * Pass in the selection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public ImpactModelWizardBackendConfigurationPage(String pageId) {
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
			containerLabel.setText("backend Url : ");

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			containerLabel.setLayoutData(data);
		}

		backendUrl = new Text(composite, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			backendUrl.setLayoutData(data);
			backendUrl.setText(Literals.backendUrl);
		}

		backendUrl.addModifyListener(validator);
		
		{
			Label containerLabel = new Label(composite, SWT.LEFT);
			containerLabel.setText("System URI: ");

			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			containerLabel.setLayoutData(data);
		}

		systemUri = new Text(composite, SWT.BORDER);
		{
			GridData data = new GridData();
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			systemUri.setLayoutData(data);
			systemUri.setText(Literals.systemUri);
		}

		systemUri.addModifyListener(validator);

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
		return getBackendUrlField() != null && !getBackendUrlField().isBlank() && getSystemUriField() != null && !getSystemUriField().isBlank();
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public String getSystemUriField() {
		return systemUri.getText();
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