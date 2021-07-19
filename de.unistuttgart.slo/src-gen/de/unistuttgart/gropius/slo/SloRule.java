/**
 */
package de.unistuttgart.gropius.slo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getGropiusProjectId <em>Gropius Project Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponentId <em>Gropius Component Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponentInterfaceId <em>Gropius Component Interface Id</em>}</li>
 * </ul>
 *
 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule()
 * @model
 * @generated
 */
public interface SloRule extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gropius Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gropius Project Id</em>' attribute.
	 * @see #setGropiusProjectId(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_GropiusProjectId()
	 * @model
	 * @generated
	 */
	String getGropiusProjectId();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusProjectId <em>Gropius Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gropius Project Id</em>' attribute.
	 * @see #getGropiusProjectId()
	 * @generated
	 */
	void setGropiusProjectId(String value);

	/**
	 * Returns the value of the '<em><b>Gropius Component Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gropius Component Id</em>' attribute.
	 * @see #setGropiusComponentId(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_GropiusComponentId()
	 * @model
	 * @generated
	 */
	String getGropiusComponentId();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponentId <em>Gropius Component Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gropius Component Id</em>' attribute.
	 * @see #getGropiusComponentId()
	 * @generated
	 */
	void setGropiusComponentId(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(double)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_Period()
	 * @model
	 * @generated
	 */
	double getPeriod();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(double value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_Threshold()
	 * @model
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Gropius Component Interface Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gropius Component Interface Id</em>' attribute.
	 * @see #setGropiusComponentInterfaceId(String)
	 * @see de.unistuttgart.gropius.slo.SloPackage#getSloRule_GropiusComponentInterfaceId()
	 * @model
	 * @generated
	 */
	String getGropiusComponentInterfaceId();

	/**
	 * Sets the value of the '{@link de.unistuttgart.gropius.slo.SloRule#getGropiusComponentInterfaceId <em>Gropius Component Interface Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gropius Component Interface Id</em>' attribute.
	 * @see #getGropiusComponentInterfaceId()
	 * @generated
	 */
	void setGropiusComponentInterfaceId(String value);

} // SloRule