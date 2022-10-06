/**
 */
package rPGPyGame;

import org.eclipse.emf.ecore.EAttribute;
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
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__ELEMENTS = VIEW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__NAME_ID = VIEW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW__IS_FIRST = VIEW_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Menu View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MENU_VIEW_FEATURE_COUNT = VIEW_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link rPGPyGame.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rPGPyGame.impl.ElementImpl
	 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME_ID = 0;

	/**
	 * The feature id for the '<em><b>Order Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ORDER_LAYER = 1;

	/**
	 * The feature id for the '<em><b>Color BG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COLOR_BG = 2;

	/**
	 * The feature id for the '<em><b>Color FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__COLOR_FG = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rPGPyGame.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rPGPyGame.impl.ButtonImpl
	 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 4;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME_ID = ELEMENT__NAME_ID;

	/**
	 * The feature id for the '<em><b>Order Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__ORDER_LAYER = ELEMENT__ORDER_LAYER;

	/**
	 * The feature id for the '<em><b>Color BG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__COLOR_BG = ELEMENT__COLOR_BG;

	/**
	 * The feature id for the '<em><b>Color FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__COLOR_FG = ELEMENT__COLOR_FG;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rPGPyGame.impl.ClassicButtonImpl <em>Classic Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rPGPyGame.impl.ClassicButtonImpl
	 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getClassicButton()
	 * @generated
	 */
	int CLASSIC_BUTTON = 5;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_BUTTON__NAME_ID = BUTTON__NAME_ID;

	/**
	 * The feature id for the '<em><b>Order Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_BUTTON__ORDER_LAYER = BUTTON__ORDER_LAYER;

	/**
	 * The feature id for the '<em><b>Color BG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_BUTTON__COLOR_BG = BUTTON__COLOR_BG;

	/**
	 * The feature id for the '<em><b>Color FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_BUTTON__COLOR_FG = BUTTON__COLOR_FG;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_BUTTON__TEXT = BUTTON__TEXT;

	/**
	 * The number of structural features of the '<em>Classic Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Classic Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rPGPyGame.impl.EditButtonImpl <em>Edit Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rPGPyGame.impl.EditButtonImpl
	 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getEditButton()
	 * @generated
	 */
	int EDIT_BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_BUTTON__NAME_ID = BUTTON__NAME_ID;

	/**
	 * The feature id for the '<em><b>Order Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_BUTTON__ORDER_LAYER = BUTTON__ORDER_LAYER;

	/**
	 * The feature id for the '<em><b>Color BG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_BUTTON__COLOR_BG = BUTTON__COLOR_BG;

	/**
	 * The feature id for the '<em><b>Color FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_BUTTON__COLOR_FG = BUTTON__COLOR_FG;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_BUTTON__TEXT = BUTTON__TEXT;

	/**
	 * The number of structural features of the '<em>Edit Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Edit Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rPGPyGame.impl.NoSelectButtonImpl <em>No Select Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rPGPyGame.impl.NoSelectButtonImpl
	 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getNoSelectButton()
	 * @generated
	 */
	int NO_SELECT_BUTTON = 7;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SELECT_BUTTON__NAME_ID = BUTTON__NAME_ID;

	/**
	 * The feature id for the '<em><b>Order Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SELECT_BUTTON__ORDER_LAYER = BUTTON__ORDER_LAYER;

	/**
	 * The feature id for the '<em><b>Color BG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SELECT_BUTTON__COLOR_BG = BUTTON__COLOR_BG;

	/**
	 * The feature id for the '<em><b>Color FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SELECT_BUTTON__COLOR_FG = BUTTON__COLOR_FG;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SELECT_BUTTON__TEXT = BUTTON__TEXT;

	/**
	 * The number of structural features of the '<em>No Select Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SELECT_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Select Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SELECT_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rPGPyGame.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rPGPyGame.impl.TextImpl
	 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getText()
	 * @generated
	 */
	int TEXT = 8;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__NAME_ID = ELEMENT__NAME_ID;

	/**
	 * The feature id for the '<em><b>Order Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ORDER_LAYER = ELEMENT__ORDER_LAYER;

	/**
	 * The feature id for the '<em><b>Color BG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__COLOR_BG = ELEMENT__COLOR_BG;

	/**
	 * The feature id for the '<em><b>Color FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__COLOR_FG = ELEMENT__COLOR_FG;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rPGPyGame.impl.ActionButtonImpl <em>Action Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rPGPyGame.impl.ActionButtonImpl
	 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getActionButton()
	 * @generated
	 */
	int ACTION_BUTTON = 10;

	/**
	 * The feature id for the '<em><b>Name ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BUTTON__NAME_ID = BUTTON__NAME_ID;

	/**
	 * The feature id for the '<em><b>Order Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BUTTON__ORDER_LAYER = BUTTON__ORDER_LAYER;

	/**
	 * The feature id for the '<em><b>Color BG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BUTTON__COLOR_BG = BUTTON__COLOR_BG;

	/**
	 * The feature id for the '<em><b>Color FG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BUTTON__COLOR_FG = BUTTON__COLOR_FG;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BUTTON__TEXT = BUTTON__TEXT;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BUTTON__DEST = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BUTTON_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BUTTON_OPERATION_COUNT = BUTTON_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link rPGPyGame.MenuView#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see rPGPyGame.MenuView#getElements()
	 * @see #getMenuView()
	 * @generated
	 */
	EReference getMenuView_Elements();

	/**
	 * Returns the meta object for the attribute '{@link rPGPyGame.MenuView#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see rPGPyGame.MenuView#getNameID()
	 * @see #getMenuView()
	 * @generated
	 */
	EAttribute getMenuView_NameID();

	/**
	 * Returns the meta object for the attribute '{@link rPGPyGame.MenuView#isIsFirst <em>Is First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is First</em>'.
	 * @see rPGPyGame.MenuView#isIsFirst()
	 * @see #getMenuView()
	 * @generated
	 */
	EAttribute getMenuView_IsFirst();

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
	 * Returns the meta object for class '{@link rPGPyGame.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see rPGPyGame.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link rPGPyGame.Button#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see rPGPyGame.Button#getText()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Text();

	/**
	 * Returns the meta object for class '{@link rPGPyGame.ClassicButton <em>Classic Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classic Button</em>'.
	 * @see rPGPyGame.ClassicButton
	 * @generated
	 */
	EClass getClassicButton();

	/**
	 * Returns the meta object for class '{@link rPGPyGame.EditButton <em>Edit Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Button</em>'.
	 * @see rPGPyGame.EditButton
	 * @generated
	 */
	EClass getEditButton();

	/**
	 * Returns the meta object for class '{@link rPGPyGame.NoSelectButton <em>No Select Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Select Button</em>'.
	 * @see rPGPyGame.NoSelectButton
	 * @generated
	 */
	EClass getNoSelectButton();

	/**
	 * Returns the meta object for class '{@link rPGPyGame.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see rPGPyGame.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link rPGPyGame.Text#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see rPGPyGame.Text#getContent()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Content();

	/**
	 * Returns the meta object for class '{@link rPGPyGame.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see rPGPyGame.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link rPGPyGame.Element#getNameID <em>Name ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name ID</em>'.
	 * @see rPGPyGame.Element#getNameID()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_NameID();

	/**
	 * Returns the meta object for the attribute '{@link rPGPyGame.Element#getOrderLayer <em>Order Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Layer</em>'.
	 * @see rPGPyGame.Element#getOrderLayer()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_OrderLayer();

	/**
	 * Returns the meta object for the attribute '{@link rPGPyGame.Element#getColorBG <em>Color BG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color BG</em>'.
	 * @see rPGPyGame.Element#getColorBG()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ColorBG();

	/**
	 * Returns the meta object for the attribute '{@link rPGPyGame.Element#getColorFG <em>Color FG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color FG</em>'.
	 * @see rPGPyGame.Element#getColorFG()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_ColorFG();

	/**
	 * Returns the meta object for class '{@link rPGPyGame.ActionButton <em>Action Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Button</em>'.
	 * @see rPGPyGame.ActionButton
	 * @generated
	 */
	EClass getActionButton();

	/**
	 * Returns the meta object for the reference '{@link rPGPyGame.ActionButton#getDest <em>Dest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dest</em>'.
	 * @see rPGPyGame.ActionButton#getDest()
	 * @see #getActionButton()
	 * @generated
	 */
	EReference getActionButton_Dest();

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
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MENU_VIEW__ELEMENTS = eINSTANCE.getMenuView_Elements();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_VIEW__NAME_ID = eINSTANCE.getMenuView_NameID();

		/**
		 * The meta object literal for the '<em><b>Is First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MENU_VIEW__IS_FIRST = eINSTANCE.getMenuView_IsFirst();

		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.GameViewImpl <em>Game View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.GameViewImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getGameView()
		 * @generated
		 */
		EClass GAME_VIEW = eINSTANCE.getGameView();

		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.ButtonImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__TEXT = eINSTANCE.getButton_Text();

		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.ClassicButtonImpl <em>Classic Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.ClassicButtonImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getClassicButton()
		 * @generated
		 */
		EClass CLASSIC_BUTTON = eINSTANCE.getClassicButton();

		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.EditButtonImpl <em>Edit Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.EditButtonImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getEditButton()
		 * @generated
		 */
		EClass EDIT_BUTTON = eINSTANCE.getEditButton();

		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.NoSelectButtonImpl <em>No Select Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.NoSelectButtonImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getNoSelectButton()
		 * @generated
		 */
		EClass NO_SELECT_BUTTON = eINSTANCE.getNoSelectButton();

		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.TextImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__CONTENT = eINSTANCE.getText_Content();

		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.ElementImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Name ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME_ID = eINSTANCE.getElement_NameID();

		/**
		 * The meta object literal for the '<em><b>Order Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ORDER_LAYER = eINSTANCE.getElement_OrderLayer();

		/**
		 * The meta object literal for the '<em><b>Color BG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COLOR_BG = eINSTANCE.getElement_ColorBG();

		/**
		 * The meta object literal for the '<em><b>Color FG</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__COLOR_FG = eINSTANCE.getElement_ColorFG();

		/**
		 * The meta object literal for the '{@link rPGPyGame.impl.ActionButtonImpl <em>Action Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rPGPyGame.impl.ActionButtonImpl
		 * @see rPGPyGame.impl.RPGPyGamePackageImpl#getActionButton()
		 * @generated
		 */
		EClass ACTION_BUTTON = eINSTANCE.getActionButton();

		/**
		 * The meta object literal for the '<em><b>Dest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BUTTON__DEST = eINSTANCE.getActionButton_Dest();

	}

} //RPGPyGamePackage
