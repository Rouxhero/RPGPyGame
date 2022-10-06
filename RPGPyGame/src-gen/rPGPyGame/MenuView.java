/**
 */
package rPGPyGame;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Menu View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rPGPyGame.MenuView#getElements <em>Elements</em>}</li>
 *   <li>{@link rPGPyGame.MenuView#getNameID <em>Name ID</em>}</li>
 *   <li>{@link rPGPyGame.MenuView#isIsFirst <em>Is First</em>}</li>
 * </ul>
 *
 * @see rPGPyGame.RPGPyGamePackage#getMenuView()
 * @model
 * @generated
 */
public interface MenuView extends view {

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link rPGPyGame.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see rPGPyGame.RPGPyGamePackage#getMenuView_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name ID</em>' attribute.
	 * @see #setNameID(String)
	 * @see rPGPyGame.RPGPyGamePackage#getMenuView_NameID()
	 * @model
	 * @generated
	 */
	String getNameID();

	/**
	 * Sets the value of the '{@link rPGPyGame.MenuView#getNameID <em>Name ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name ID</em>' attribute.
	 * @see #getNameID()
	 * @generated
	 */
	void setNameID(String value);

	/**
	 * Returns the value of the '<em><b>Is First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is First</em>' attribute.
	 * @see #setIsFirst(boolean)
	 * @see rPGPyGame.RPGPyGamePackage#getMenuView_IsFirst()
	 * @model
	 * @generated
	 */
	boolean isIsFirst();

	/**
	 * Sets the value of the '{@link rPGPyGame.MenuView#isIsFirst <em>Is First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is First</em>' attribute.
	 * @see #isIsFirst()
	 * @generated
	 */
	void setIsFirst(boolean value);
} // MenuView
