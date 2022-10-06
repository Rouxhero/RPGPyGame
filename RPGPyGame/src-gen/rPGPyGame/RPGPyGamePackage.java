/**
 */
package rPGPyGame;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rPGPyGame.RPGPyGameFactory
 * @model kind="package"
 * @generated
 */
public interface RPGPyGamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rPGPyGame";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/rPGPyGame";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rPGPyGame";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RPGPyGamePackage eINSTANCE = rPGPyGame.impl.RPGPyGamePackageImpl.init();

	/**
	 * The meta object id for the '{@link rPGPyGame.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rPGPyGame.impl.GameImpl
	 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__VIEWS = 0;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rPGPyGame.impl.viewImpl <em>view</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rPGPyGame.impl.viewImpl
	 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getview()
	 * @generated
	 */
	int VIEW = 1;

	/**
	 * The number of structural features of the '<em>view</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>view</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rPGPyGame.impl.MenuViewImpl <em>Menu View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rPGPyGame.impl.MenuViewImpl
	 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getMenuView()
	 * @generated
	 */
	int MENU_VIEW = 2;

	/**
	 * The number of structural features of the '<em>Menu View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Menu View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rPGPyGame.impl.GameViewImpl <em>Game View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rPGPyGame.impl.GameViewImpl
	 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getGameView()
	 * @generated
	 */
	int GAME_VIEW = 3;

	/**
	 * The number of structural features of the '<em>Game View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Game View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_VIEW_OPERATION_COUNT = VIEW_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link rPGPyGame.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see rPGPyGame.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference list '{@link rPGPyGame.Game#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see rPGPyGame.Game#getViews()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Views();

	/**
	 * Returns the meta object for class '{@link rPGPyGame.view <em>view</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>view</em>'.
	 * @see rPGPyGame.view
	 * @generated
	 */
	EClass getview();

	/**
	 * Returns the meta object for class '{@link rPGPyGame.MenuView <em>Menu View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Menu View</em>'.
	 * @see rPGPyGame.MenuView
	 * @generated
	 */
	EClass getMenuView();

	/**
	 * Returns the meta object for class '{@link rPGPyGame.GameView <em>Game View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game View</em>'.
	 * @see rPGPyGame.GameView
	 * @generated
	 */
	EClass getGameView();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RPGPyGameFactory getRPGPyGameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.GameImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__VIEWS = eINSTANCE.getGame_Views();

		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.viewImpl <em>view</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.viewImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getview()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getview();

		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.MenuViewImpl <em>Menu View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.MenuViewImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getMenuView()
		 * @generated
		 */
		EClass MENU_VIEW = eINSTANCE.getMenuView();

		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.GameViewImpl <em>Game View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.GameViewImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getGameView()
		 * @generated
		 */
		EClass GAME_VIEW = eINSTANCE.getGameView();

	}

} //RPGPyGamePackage
