/**
 */
package rPGPyGame;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rPGPyGame.Game#getViews <em>Views</em>}</li>
 * </ul>
 *
 * @see rPGPyGame.RPGPyGamePackage#getGame()
 * @model
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link rPGPyGame.view}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see rPGPyGame.RPGPyGamePackage#getGame_Views()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<view> getViews();

} // Game
