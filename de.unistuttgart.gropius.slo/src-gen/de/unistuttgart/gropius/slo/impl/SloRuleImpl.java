/**
 */
package de.unistuttgart.gropius.slo.impl;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.ComponentInterface;
import de.unistuttgart.gropius.Project;
import de.unistuttgart.gropius.slo.SloPackage;
import de.unistuttgart.gropius.slo.SloRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl#getGropiusProject <em>Gropius Project</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl#getGropiusComponent <em>Gropius Component</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl#getGropiusComponentInterface <em>Gropius Component Interface</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl#getStatisticsOption <em>Statistics Option</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.slo.impl.SloRuleImpl#getPresetOption <em>Preset Option</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SloRuleImpl extends MinimalEObjectImpl.Container implements SloRule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final double PERIOD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected double period = PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected double threshold = THRESHOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGropiusProject() <em>Gropius Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGropiusProject()
	 * @generated
	 * @ordered
	 */
	protected Project gropiusProject;

	/**
	 * The cached value of the '{@link #getGropiusComponent() <em>Gropius Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGropiusComponent()
	 * @generated
	 * @ordered
	 */
	protected Component gropiusComponent;

	/**
	 * The cached value of the '{@link #getGropiusComponentInterface() <em>Gropius Component Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGropiusComponentInterface()
	 * @generated
	 * @ordered
	 */
	protected ComponentInterface gropiusComponentInterface;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatisticsOption() <em>Statistics Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticsOption()
	 * @generated
	 * @ordered
	 */
	protected static final String STATISTICS_OPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatisticsOption() <em>Statistics Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticsOption()
	 * @generated
	 * @ordered
	 */
	protected String statisticsOption = STATISTICS_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARISON_OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected String comparisonOperator = COMPARISON_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPresetOption() <em>Preset Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetOption()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESET_OPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresetOption() <em>Preset Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresetOption()
	 * @generated
	 * @ordered
	 */
	protected String presetOption = PRESET_OPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SloRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SloPackage.Literals.SLO_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SLO_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(double newPeriod) {
		double oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SLO_RULE__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(double newThreshold) {
		double oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SLO_RULE__THRESHOLD, oldThreshold,
					threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getGropiusProject() {
		if (gropiusProject != null && gropiusProject.eIsProxy()) {
			InternalEObject oldGropiusProject = (InternalEObject) gropiusProject;
			gropiusProject = (Project) eResolveProxy(oldGropiusProject);
			if (gropiusProject != oldGropiusProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SloPackage.SLO_RULE__GROPIUS_PROJECT,
							oldGropiusProject, gropiusProject));
			}
		}
		return gropiusProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetGropiusProject() {
		return gropiusProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGropiusProject(Project newGropiusProject) {
		Project oldGropiusProject = gropiusProject;
		gropiusProject = newGropiusProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SLO_RULE__GROPIUS_PROJECT,
					oldGropiusProject, gropiusProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getGropiusComponent() {
		if (gropiusComponent != null && gropiusComponent.eIsProxy()) {
			InternalEObject oldGropiusComponent = (InternalEObject) gropiusComponent;
			gropiusComponent = (Component) eResolveProxy(oldGropiusComponent);
			if (gropiusComponent != oldGropiusComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SloPackage.SLO_RULE__GROPIUS_COMPONENT,
							oldGropiusComponent, gropiusComponent));
			}
		}
		return gropiusComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetGropiusComponent() {
		return gropiusComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGropiusComponent(Component newGropiusComponent) {
		Component oldGropiusComponent = gropiusComponent;
		gropiusComponent = newGropiusComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SLO_RULE__GROPIUS_COMPONENT,
					oldGropiusComponent, gropiusComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface getGropiusComponentInterface() {
		if (gropiusComponentInterface != null && gropiusComponentInterface.eIsProxy()) {
			InternalEObject oldGropiusComponentInterface = (InternalEObject) gropiusComponentInterface;
			gropiusComponentInterface = (ComponentInterface) eResolveProxy(oldGropiusComponentInterface);
			if (gropiusComponentInterface != oldGropiusComponentInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SloPackage.SLO_RULE__GROPIUS_COMPONENT_INTERFACE, oldGropiusComponentInterface,
							gropiusComponentInterface));
			}
		}
		return gropiusComponentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface basicGetGropiusComponentInterface() {
		return gropiusComponentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGropiusComponentInterface(ComponentInterface newGropiusComponentInterface) {
		ComponentInterface oldGropiusComponentInterface = gropiusComponentInterface;
		gropiusComponentInterface = newGropiusComponentInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SLO_RULE__GROPIUS_COMPONENT_INTERFACE,
					oldGropiusComponentInterface, gropiusComponentInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SLO_RULE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatisticsOption() {
		return statisticsOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatisticsOption(String newStatisticsOption) {
		String oldStatisticsOption = statisticsOption;
		statisticsOption = newStatisticsOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SLO_RULE__STATISTICS_OPTION,
					oldStatisticsOption, statisticsOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparisonOperator() {
		return comparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonOperator(String newComparisonOperator) {
		String oldComparisonOperator = comparisonOperator;
		comparisonOperator = newComparisonOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SLO_RULE__COMPARISON_OPERATOR,
					oldComparisonOperator, comparisonOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPresetOption() {
		return presetOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresetOption(String newPresetOption) {
		String oldPresetOption = presetOption;
		presetOption = newPresetOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SloPackage.SLO_RULE__PRESET_OPTION, oldPresetOption,
					presetOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SloPackage.SLO_RULE__NAME:
			return getName();
		case SloPackage.SLO_RULE__PERIOD:
			return getPeriod();
		case SloPackage.SLO_RULE__THRESHOLD:
			return getThreshold();
		case SloPackage.SLO_RULE__GROPIUS_PROJECT:
			if (resolve)
				return getGropiusProject();
			return basicGetGropiusProject();
		case SloPackage.SLO_RULE__GROPIUS_COMPONENT:
			if (resolve)
				return getGropiusComponent();
			return basicGetGropiusComponent();
		case SloPackage.SLO_RULE__GROPIUS_COMPONENT_INTERFACE:
			if (resolve)
				return getGropiusComponentInterface();
			return basicGetGropiusComponentInterface();
		case SloPackage.SLO_RULE__ID:
			return getId();
		case SloPackage.SLO_RULE__STATISTICS_OPTION:
			return getStatisticsOption();
		case SloPackage.SLO_RULE__COMPARISON_OPERATOR:
			return getComparisonOperator();
		case SloPackage.SLO_RULE__PRESET_OPTION:
			return getPresetOption();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SloPackage.SLO_RULE__NAME:
			setName((String) newValue);
			return;
		case SloPackage.SLO_RULE__PERIOD:
			setPeriod((Double) newValue);
			return;
		case SloPackage.SLO_RULE__THRESHOLD:
			setThreshold((Double) newValue);
			return;
		case SloPackage.SLO_RULE__GROPIUS_PROJECT:
			setGropiusProject((Project) newValue);
			return;
		case SloPackage.SLO_RULE__GROPIUS_COMPONENT:
			setGropiusComponent((Component) newValue);
			return;
		case SloPackage.SLO_RULE__GROPIUS_COMPONENT_INTERFACE:
			setGropiusComponentInterface((ComponentInterface) newValue);
			return;
		case SloPackage.SLO_RULE__ID:
			setId((String) newValue);
			return;
		case SloPackage.SLO_RULE__STATISTICS_OPTION:
			setStatisticsOption((String) newValue);
			return;
		case SloPackage.SLO_RULE__COMPARISON_OPERATOR:
			setComparisonOperator((String) newValue);
			return;
		case SloPackage.SLO_RULE__PRESET_OPTION:
			setPresetOption((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SloPackage.SLO_RULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case SloPackage.SLO_RULE__PERIOD:
			setPeriod(PERIOD_EDEFAULT);
			return;
		case SloPackage.SLO_RULE__THRESHOLD:
			setThreshold(THRESHOLD_EDEFAULT);
			return;
		case SloPackage.SLO_RULE__GROPIUS_PROJECT:
			setGropiusProject((Project) null);
			return;
		case SloPackage.SLO_RULE__GROPIUS_COMPONENT:
			setGropiusComponent((Component) null);
			return;
		case SloPackage.SLO_RULE__GROPIUS_COMPONENT_INTERFACE:
			setGropiusComponentInterface((ComponentInterface) null);
			return;
		case SloPackage.SLO_RULE__ID:
			setId(ID_EDEFAULT);
			return;
		case SloPackage.SLO_RULE__STATISTICS_OPTION:
			setStatisticsOption(STATISTICS_OPTION_EDEFAULT);
			return;
		case SloPackage.SLO_RULE__COMPARISON_OPERATOR:
			setComparisonOperator(COMPARISON_OPERATOR_EDEFAULT);
			return;
		case SloPackage.SLO_RULE__PRESET_OPTION:
			setPresetOption(PRESET_OPTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SloPackage.SLO_RULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case SloPackage.SLO_RULE__PERIOD:
			return period != PERIOD_EDEFAULT;
		case SloPackage.SLO_RULE__THRESHOLD:
			return threshold != THRESHOLD_EDEFAULT;
		case SloPackage.SLO_RULE__GROPIUS_PROJECT:
			return gropiusProject != null;
		case SloPackage.SLO_RULE__GROPIUS_COMPONENT:
			return gropiusComponent != null;
		case SloPackage.SLO_RULE__GROPIUS_COMPONENT_INTERFACE:
			return gropiusComponentInterface != null;
		case SloPackage.SLO_RULE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case SloPackage.SLO_RULE__STATISTICS_OPTION:
			return STATISTICS_OPTION_EDEFAULT == null ? statisticsOption != null
					: !STATISTICS_OPTION_EDEFAULT.equals(statisticsOption);
		case SloPackage.SLO_RULE__COMPARISON_OPERATOR:
			return COMPARISON_OPERATOR_EDEFAULT == null ? comparisonOperator != null
					: !COMPARISON_OPERATOR_EDEFAULT.equals(comparisonOperator);
		case SloPackage.SLO_RULE__PRESET_OPTION:
			return PRESET_OPTION_EDEFAULT == null ? presetOption != null : !PRESET_OPTION_EDEFAULT.equals(presetOption);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", period: ");
		result.append(period);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(", id: ");
		result.append(id);
		result.append(", statisticsOption: ");
		result.append(statisticsOption);
		result.append(", comparisonOperator: ");
		result.append(comparisonOperator);
		result.append(", presetOption: ");
		result.append(presetOption);
		result.append(')');
		return result.toString();
	}

} //SloRuleImpl
