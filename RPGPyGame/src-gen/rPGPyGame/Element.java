/**
 */
package rPGPyGame;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rPGPyGame.Element#getNameID <em>Name ID</em>}</li>
 *   <li>{@link rPGPyGame.Element#getOrderLayer <em>Order Layer</em>}</li>
 *   <li>{@link rPGPyGame.Element#getColorBG <em>Color BG</em>}</li>
 *   <li>{@link rPGPyGame.Element#getColorFG <em>Color FG</em>}</li>
 * </ul>
 *
 * @see rPGPyGame.RPGPyGamePackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name ID</em>' attribute.
	 * @see #setNameID(String)
	 * @see rPGPyGame.RPGPyGamePackage#getElement_NameID()
	 * @model
	 * @generated
	 */
	String getNameID();

	/**
	 * Sets the value of the '{@link rPGPyGame.Element#getNameID <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ID</em>' attribute.
	 * @see #getNameID()
	 * @generated
	 */
	void setNameID(String value);

	/**
	 * Returns the value of the '<em><b>Order Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Layer</em>' attribute.
	 * @see #setOrderLayer(int)
	 * @see rPGPyGame.RPGPyGamePackage#getElement_OrderLayer()
	 * @model
	 * @generated
	 */
	int getOrderLayer();

	/**
	 * Sets the value of the '{@link rPGPyGame.Element#getOrderLayer <em>Order Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Layer</em>' attribute.
	 * @see #getOrderLayer()
	 * @generated
	 */
	void setOrderLayer(int value);

	/**
	 * Returns the value of the '<em><b>Color BG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color BG</em>' attribute.
	 * @see #setColorBG(String)
	 * @see rPGPyGame.RPGPyGamePackage#getElement_ColorBG()
	 * @model
	 * @generated
	 */
	String getColorBG();

	/**
	 * Sets the value of the '{@link rPGPyGame.Element#getColorBG <em>Color BG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color BG</em>' attribute.
	 * @see #getColorBG()
	 * @generated
	 */
	void setColorBG(String value);

	/**
	 * Returns the value of the '<em><b>Color FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color FG</em>' attribute.
	 * @see #setColorFG(String)
	 * @see rPGPyGame.RPGPyGamePackage#getElement_ColorFG()
	 * @model
	 * @generated
	 */
	String getColorFG();

	/**
	 * Sets the value of the '{@link rPGPyGame.Element#getColorFG <em>Color FG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color FG</em>' attribute.
	 * @see #getColorFG()
	 * @generated
	 */
	void setColorFG(String value);

} // Element
