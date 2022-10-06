/**
 */
package rPGPyGame;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rPGPyGame.RPGPyGamePackage
 * @generated
 */
public interface RPGPyGameFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RPGPyGameFactory eINSTANCE = rPGPyGame.impl.RPGPyGameFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	Game createGame();

	/**
	 * Returns a new object of class '<em>Menu View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Menu View</em>'.
	 * @generated
	 */
	MenuView createMenuView();

	/**
	 * Returns a new object of class '<em>Game View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game View</em>'.
	 * @generated
	 */
	GameView createGameView();

	/**
	 * Returns a new object of class '<em>Classic Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classic Button</em>'.
	 * @generated
	 */
	ClassicButton createClassicButton();

	/**
	 * Returns a new object of class '<em>Edit Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edit Button</em>'.
	 * @generated
	 */
	EditButton createEditButton();

	/**
	 * Returns a new object of class '<em>No Select Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Select Button</em>'.
	 * @generated
	 */
	NoSelectButton createNoSelectButton();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Action Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Button</em>'.
	 * @generated
	 */
	ActionButton createActionButton();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RPGPyGamePackage getRPGPyGamePackage();

} //RPGPyGameFactory
