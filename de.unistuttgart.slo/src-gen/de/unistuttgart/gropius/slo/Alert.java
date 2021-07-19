/**
 */
package de.unistuttgart.gropius.slo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.slo.Alert#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.Alert#getSloId <em>Slo Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.Alert#getSloName <em>Slo Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.Alert#getGropiusComponentId <em>Gropius Component Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.Alert#getGropiusProjectId <em>Gropius Project Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.Alert#getValue <em>Value</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.Alert#getGropiusComponentInterfaceId <em>Gropius Component Interface Id</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert()
 * @model
 * @generated
 */
public interface Alert extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.Alert#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Slo Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo Id</em>' attribute.
	 * @see #setSloId(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert_SloId()
	 * @model
	 * @generated
	 */
	String getSloId();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.Alert#getSloId <em>Slo Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slo Id</em>' attribute.
	 * @see #getSloId()
	 * @generated
	 */
	void setSloId(String value);

	/**
	 * Returns the value of the '<em><b>Slo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slo Name</em>' attribute.
	 * @see #setSloName(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert_SloName()
	 * @model
	 * @generated
	 */
	String getSloName();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.Alert#getSloName <em>Slo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slo Name</em>' attribute.
	 * @see #getSloName()
	 * @generated
	 */
	void setSloName(String value);

	/**
	 * Returns the value of the '<em><b>Gropius Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gropius Component Id</em>' attribute.
	 * @see #setGropiusComponentId(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert_GropiusComponentId()
	 * @model
	 * @generated
	 */
	String getGropiusComponentId();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.Alert#getGropiusComponentId <em>Gropius Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gropius Component Id</em>' attribute.
	 * @see #getGropiusComponentId()
	 * @generated
	 */
	void setGropiusComponentId(String value);

	/**
	 * Returns the value of the '<em><b>Gropius Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gropius Project Id</em>' attribute.
	 * @see #setGropiusProjectId(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert_GropiusProjectId()
	 * @model
	 * @generated
	 */
	String getGropiusProjectId();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.Alert#getGropiusProjectId <em>Gropius Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gropius Project Id</em>' attribute.
	 * @see #getGropiusProjectId()
	 * @generated
	 */
	void setGropiusProjectId(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not in solomon
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert_Value()
	 * @model
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.Alert#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Gropius Component Interface Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gropius Component Interface Id</em>' attribute.
	 * @see #setGropiusComponentInterfaceId(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getAlert_GropiusComponentInterfaceId()
	 * @model
	 * @generated
	 */
	String getGropiusComponentInterfaceId();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.Alert#getGropiusComponentInterfaceId <em>Gropius Component Interface Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gropius Component Interface Id</em>' attribute.
	 * @see #getGropiusComponentInterfaceId()
	 * @generated
	 */
	void setGropiusComponentInterfaceId(String value);

} // Alert