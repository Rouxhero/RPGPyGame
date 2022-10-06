/**
 */
package rPGPyGame.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import rPGPyGame.Element;
import rPGPyGame.MenuView;
import rPGPyGame.RPGPyGamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rPGPyGame.impl.MenuViewImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link rPGPyGame.impl.MenuViewImpl#getNameID <em>Name ID</em>}</li>
 *   <li>{@link rPGPyGame.impl.MenuViewImpl#isIsFirst <em>Is First</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MenuViewImpl extends viewImpl implements MenuView {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;
	/**
	 * The default value of the '{@link #getNameID() <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameID()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getNameID() <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameID()
	 * @generated
	 * @ordered
	 */
	protected String nameID = NAME_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #isIsFirst() <em>Is First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FIRST_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsFirst() <em>Is First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean isFirst = IS_FIRST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RPGPyGamePackage.Literals.MENU_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, RPGPyGamePackage.MENU_VIEW__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameID() {
		return nameID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameID(String newNameID) {
		String oldNameID = nameID;
		nameID = newNameID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RPGPyGamePackage.MENU_VIEW__NAME_ID, oldNameID,
					nameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFirst() {
		return isFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFirst(boolean newIsFirst) {
		boolean oldIsFirst = isFirst;
		isFirst = newIsFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RPGPyGamePackage.MENU_VIEW__IS_FIRST, oldIsFirst,
					isFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RPGPyGamePackage.MENU_VIEW__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
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
		case RPGPyGamePackage.MENU_VIEW__ELEMENTS:
			return getElements();
		case RPGPyGamePackage.MENU_VIEW__NAME_ID:
			return getNameID();
		case RPGPyGamePackage.MENU_VIEW__IS_FIRST:
			return isIsFirst();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RPGPyGamePackage.MENU_VIEW__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends Element>) newValue);
			return;
		case RPGPyGamePackage.MENU_VIEW__NAME_ID:
			setNameID((String) newValue);
			return;
		case RPGPyGamePackage.MENU_VIEW__IS_FIRST:
			setIsFirst((Boolean) newValue);
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
		case RPGPyGamePackage.MENU_VIEW__ELEMENTS:
			getElements().clear();
			return;
		case RPGPyGamePackage.MENU_VIEW__NAME_ID:
			setNameID(NAME_ID_EDEFAULT);
			return;
		case RPGPyGamePackage.MENU_VIEW__IS_FIRST:
			setIsFirst(IS_FIRST_EDEFAULT);
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
		case RPGPyGamePackage.MENU_VIEW__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case RPGPyGamePackage.MENU_VIEW__NAME_ID:
			return NAME_ID_EDEFAULT == null ? nameID != null : !NAME_ID_EDEFAULT.equals(nameID);
		case RPGPyGamePackage.MENU_VIEW__IS_FIRST:
			return isFirst != IS_FIRST_EDEFAULT;
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
		result.append(" (nameID: ");
		result.append(nameID);
		result.append(", isFirst: ");
		result.append(isFirst);
		result.append(')');
		return result.toString();
	}

} //MenuViewImpl
