/**
 */
package rPGPyGame.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rPGPyGame.Element;
import rPGPyGame.RPGPyGamePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rPGPyGame.impl.ElementImpl#getNameID <em>Name ID</em>}</li>
 *   <li>{@link rPGPyGame.impl.ElementImpl#getOrderLayer <em>Order Layer</em>}</li>
 *   <li>{@link rPGPyGame.impl.ElementImpl#getColorBG <em>Color BG</em>}</li>
 *   <li>{@link rPGPyGame.impl.ElementImpl#getColorFG <em>Color FG</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
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
	 * The default value of the '{@link #getOrderLayer() <em>Order Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderLayer()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_LAYER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOrderLayer() <em>Order Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderLayer()
	 * @generated
	 * @ordered
	 */
	protected int orderLayer = ORDER_LAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorBG() <em>Color BG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorBG()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_BG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorBG() <em>Color BG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorBG()
	 * @generated
	 * @ordered
	 */
	protected String colorBG = COLOR_BG_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorFG() <em>Color FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFG()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_FG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorFG() <em>Color FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorFG()
	 * @generated
	 * @ordered
	 */
	protected String colorFG = COLOR_FG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RPGPyGamePackage.Literals.ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RPGPyGamePackage.ELEMENT__NAME_ID, oldNameID,
					nameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOrderLayer() {
		return orderLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderLayer(int newOrderLayer) {
		int oldOrderLayer = orderLayer;
		orderLayer = newOrderLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RPGPyGamePackage.ELEMENT__ORDER_LAYER, oldOrderLayer,
					orderLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorBG() {
		return colorBG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorBG(String newColorBG) {
		String oldColorBG = colorBG;
		colorBG = newColorBG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RPGPyGamePackage.ELEMENT__COLOR_BG, oldColorBG,
					colorBG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorFG() {
		return colorFG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorFG(String newColorFG) {
		String oldColorFG = colorFG;
		colorFG = newColorFG;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RPGPyGamePackage.ELEMENT__COLOR_FG, oldColorFG,
					colorFG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RPGPyGamePackage.ELEMENT__NAME_ID:
			return getNameID();
		case RPGPyGamePackage.ELEMENT__ORDER_LAYER:
			return getOrderLayer();
		case RPGPyGamePackage.ELEMENT__COLOR_BG:
			return getColorBG();
		case RPGPyGamePackage.ELEMENT__COLOR_FG:
			return getColorFG();
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
		case RPGPyGamePackage.ELEMENT__NAME_ID:
			setNameID((String) newValue);
			return;
		case RPGPyGamePackage.ELEMENT__ORDER_LAYER:
			setOrderLayer((Integer) newValue);
			return;
		case RPGPyGamePackage.ELEMENT__COLOR_BG:
			setColorBG((String) newValue);
			return;
		case RPGPyGamePackage.ELEMENT__COLOR_FG:
			setColorFG((String) newValue);
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
		case RPGPyGamePackage.ELEMENT__NAME_ID:
			setNameID(NAME_ID_EDEFAULT);
			return;
		case RPGPyGamePackage.ELEMENT__ORDER_LAYER:
			setOrderLayer(ORDER_LAYER_EDEFAULT);
			return;
		case RPGPyGamePackage.ELEMENT__COLOR_BG:
			setColorBG(COLOR_BG_EDEFAULT);
			return;
		case RPGPyGamePackage.ELEMENT__COLOR_FG:
			setColorFG(COLOR_FG_EDEFAULT);
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
		case RPGPyGamePackage.ELEMENT__NAME_ID:
			return NAME_ID_EDEFAULT == null ? nameID != null : !NAME_ID_EDEFAULT.equals(nameID);
		case RPGPyGamePackage.ELEMENT__ORDER_LAYER:
			return orderLayer != ORDER_LAYER_EDEFAULT;
		case RPGPyGamePackage.ELEMENT__COLOR_BG:
			return COLOR_BG_EDEFAULT == null ? colorBG != null : !COLOR_BG_EDEFAULT.equals(colorBG);
		case RPGPyGamePackage.ELEMENT__COLOR_FG:
			return COLOR_FG_EDEFAULT == null ? colorFG != null : !COLOR_FG_EDEFAULT.equals(colorFG);
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
		result.append(", orderLayer: ");
		result.append(orderLayer);
		result.append(", colorBG: ");
		result.append(colorBG);
		result.append(", colorFG: ");
		result.append(colorFG);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
