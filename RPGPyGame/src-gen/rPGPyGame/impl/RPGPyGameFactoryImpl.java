/**
 */
package rPGPyGame.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rPGPyGame.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RPGPyGameFactoryImpl extends EFactoryImpl implements RPGPyGameFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RPGPyGameFactory init() {
		try {
			RPGPyGameFactory theRPGPyGameFactory = (RPGPyGameFactory) EPackage.Registry.INSTANCE
					.getEFactory(RPGPyGamePackage.eNS_URI);
			if (theRPGPyGameFactory != null) {
				return theRPGPyGameFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RPGPyGameFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPGPyGameFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RPGPyGamePackage.GAME:
			return createGame();
		case RPGPyGamePackage.MENU_VIEW:
			return createMenuView();
		case RPGPyGamePackage.GAME_VIEW:
			return createGameView();
		case RPGPyGamePackage.CLASSIC_BUTTON:
			return createClassicButton();
		case RPGPyGamePackage.EDIT_BUTTON:
			return createEditButton();
		case RPGPyGamePackage.NO_SELECT_BUTTON:
			return createNoSelectButton();
		case RPGPyGamePackage.TEXT:
			return createText();
		case RPGPyGamePackage.ACTION_BUTTON:
			return createActionButton();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuView createMenuView() {
		MenuViewImpl menuView = new MenuViewImpl();
		return menuView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameView createGameView() {
		GameViewImpl gameView = new GameViewImpl();
		return gameView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicButton createClassicButton() {
		ClassicButtonImpl classicButton = new ClassicButtonImpl();
		return classicButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditButton createEditButton() {
		EditButtonImpl editButton = new EditButtonImpl();
		return editButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoSelectButton createNoSelectButton() {
		NoSelectButtonImpl noSelectButton = new NoSelectButtonImpl();
		return noSelectButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionButton createActionButton() {
		ActionButtonImpl actionButton = new ActionButtonImpl();
		return actionButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPGPyGamePackage getRPGPyGamePackage() {
		return (RPGPyGamePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RPGPyGamePackage getPackage() {
		return RPGPyGamePackage.eINSTANCE;
	}

} //RPGPyGameFactoryImpl
