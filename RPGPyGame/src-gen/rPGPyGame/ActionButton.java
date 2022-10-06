/**
 */
package rPGPyGame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rPGPyGame.ActionButton#getDest <em>Dest</em>}</li>
 * </ul>
 *
 * @see rPGPyGame.RPGPyGamePackage#getActionButton()
 * @model
 * @generated
 */
public interface ActionButton extends Button {
	/**
	 * Returns the value of the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dest</em>' reference.
	 * @see #setDest(view)
	 * @see rPGPyGame.RPGPyGamePackage#getActionButton_Dest()
	 * @model required="true"
	 * @generated
	 */
	view getDest();

	/**
	 * Sets the value of the '{@link rPGPyGame.ActionButton#getDest <em>Dest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dest</em>' reference.
	 * @see #getDest()
	 * @generated
	 */
	void setDest(view value);

} // ActionButton
