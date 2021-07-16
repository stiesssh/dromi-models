/**
 */
package de.unistuttgart.gropius.impl;

import de.unistuttgart.gropius.Component;
import de.unistuttgart.gropius.GropiusPackage;
import de.unistuttgart.gropius.Label;
import de.unistuttgart.gropius.Project;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.unistuttgart.gropius.impl.LabelImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.LabelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.LabelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.LabelImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.LabelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.LabelImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link de.unistuttgart.gropius.impl.LabelImpl#getReaction <em>Reaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends MinimalEObjectImpl.Container implements Label {
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Object id;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Object color;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected Component components;

	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected Project projects;

	/**
	 * The default value of the '{@link #getReaction() <em>Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated
	 * @ordered
	 */
	protected static final String REACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReaction() <em>Reaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaction()
	 * @generated
	 * @ordered
	 */
	protected String reaction = REACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GropiusPackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Object newId) {
		Object oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.LABEL__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.LABEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.LABEL__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Object newColor) {
		Object oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.LABEL__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponents() {
		if (components != null && components.eIsProxy()) {
			InternalEObject oldComponents = (InternalEObject) components;
			components = (Component) eResolveProxy(oldComponents);
			if (components != oldComponents) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.LABEL__COMPONENTS,
							oldComponents, components));
			}
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponents() {
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponents(Component newComponents, NotificationChain msgs) {
		Component oldComponents = components;
		components = newComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GropiusPackage.LABEL__COMPONENTS, oldComponents, newComponents);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponents(Component newComponents) {
		if (newComponents != components) {
			NotificationChain msgs = null;
			if (components != null)
				msgs = ((InternalEObject) components).eInverseRemove(this, GropiusPackage.COMPONENT__LABELS,
						Component.class, msgs);
			if (newComponents != null)
				msgs = ((InternalEObject) newComponents).eInverseAdd(this, GropiusPackage.COMPONENT__LABELS,
						Component.class, msgs);
			msgs = basicSetComponents(newComponents, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.LABEL__COMPONENTS, newComponents,
					newComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProjects() {
		if (projects != null && projects.eIsProxy()) {
			InternalEObject oldProjects = (InternalEObject) projects;
			projects = (Project) eResolveProxy(oldProjects);
			if (projects != oldProjects) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GropiusPackage.LABEL__PROJECTS,
							oldProjects, projects));
			}
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetProjects() {
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjects(Project newProjects) {
		Project oldProjects = projects;
		projects = newProjects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.LABEL__PROJECTS, oldProjects,
					projects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReaction() {
		return reaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReaction(String newReaction) {
		String oldReaction = reaction;
		reaction = newReaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GropiusPackage.LABEL__REACTION, oldReaction,
					reaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GropiusPackage.LABEL__COMPONENTS:
			if (components != null)
				msgs = ((InternalEObject) components).eInverseRemove(this, GropiusPackage.COMPONENT__LABELS,
						Component.class, msgs);
			return basicSetComponents((Component) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GropiusPackage.LABEL__COMPONENTS:
			return basicSetComponents(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GropiusPackage.LABEL__ID:
			return getId();
		case GropiusPackage.LABEL__NAME:
			return getName();
		case GropiusPackage.LABEL__DESCRIPTION:
			return getDescription();
		case GropiusPackage.LABEL__COLOR:
			return getColor();
		case GropiusPackage.LABEL__COMPONENTS:
			if (resolve)
				return getComponents();
			return basicGetComponents();
		case GropiusPackage.LABEL__PROJECTS:
			if (resolve)
				return getProjects();
			return basicGetProjects();
		case GropiusPackage.LABEL__REACTION:
			return getReaction();
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
		case GropiusPackage.LABEL__ID:
			setId(newValue);
			return;
		case GropiusPackage.LABEL__NAME:
			setName((String) newValue);
			return;
		case GropiusPackage.LABEL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case GropiusPackage.LABEL__COLOR:
			setColor(newValue);
			return;
		case GropiusPackage.LABEL__COMPONENTS:
			setComponents((Component) newValue);
			return;
		case GropiusPackage.LABEL__PROJECTS:
			setProjects((Project) newValue);
			return;
		case GropiusPackage.LABEL__REACTION:
			setReaction((String) newValue);
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
		case GropiusPackage.LABEL__ID:
			setId((Object) null);
			return;
		case GropiusPackage.LABEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GropiusPackage.LABEL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case GropiusPackage.LABEL__COLOR:
			setColor((Object) null);
			return;
		case GropiusPackage.LABEL__COMPONENTS:
			setComponents((Component) null);
			return;
		case GropiusPackage.LABEL__PROJECTS:
			setProjects((Project) null);
			return;
		case GropiusPackage.LABEL__REACTION:
			setReaction(REACTION_EDEFAULT);
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
		case GropiusPackage.LABEL__ID:
			return id != null;
		case GropiusPackage.LABEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GropiusPackage.LABEL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case GropiusPackage.LABEL__COLOR:
			return color != null;
		case GropiusPackage.LABEL__COMPONENTS:
			return components != null;
		case GropiusPackage.LABEL__PROJECTS:
			return projects != null;
		case GropiusPackage.LABEL__REACTION:
			return REACTION_EDEFAULT == null ? reaction != null : !REACTION_EDEFAULT.equals(reaction);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", color: ");
		result.append(color);
		result.append(", reaction: ");
		result.append(reaction);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
