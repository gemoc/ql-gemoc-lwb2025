/**
 */
package org.gemoc.qls.model.qls.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.qls.model.qls.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QlsFactoryImpl extends EFactoryImpl implements QlsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QlsFactory init() {
		try {
			QlsFactory theQlsFactory = (QlsFactory) EPackage.Registry.INSTANCE.getEFactory(QlsPackage.eNS_URI);
			if (theQlsFactory != null) {
				return theQlsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QlsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QlsFactoryImpl() {
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
		case QlsPackage.QLS_MODEL:
			return createQLSModel();
		case QlsPackage.QUESTION_STYLE:
			return createQuestionStyle();
		case QlsPackage.LABEL_STYLE:
			return createLabelStyle();
		case QlsPackage.BOOLEAN_TYPE_STYLE:
			return createBooleanTypeStyle();
		case QlsPackage.NUMERIC_TYPE_STYLE:
			return createNumericTypeStyle();
		case QlsPackage.NUMERIC_TEXT_FIELD_STYLE:
			return createNumericTextFieldStyle();
		case QlsPackage.NUMERIC_SPINNER_STYLE:
			return createNumericSpinnerStyle();
		case QlsPackage.TEXT_TYPE_STYLE:
			return createTextTypeStyle();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case QlsPackage.BOOLEAN_STYLE_KIND:
			return createBooleanStyleKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case QlsPackage.BOOLEAN_STYLE_KIND:
			return convertBooleanStyleKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QLSModel createQLSModel() {
		QLSModelImpl qlsModel = new QLSModelImpl();
		return qlsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionStyle createQuestionStyle() {
		QuestionStyleImpl questionStyle = new QuestionStyleImpl();
		return questionStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelStyle createLabelStyle() {
		LabelStyleImpl labelStyle = new LabelStyleImpl();
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanTypeStyle createBooleanTypeStyle() {
		BooleanTypeStyleImpl booleanTypeStyle = new BooleanTypeStyleImpl();
		return booleanTypeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericTypeStyle createNumericTypeStyle() {
		NumericTypeStyleImpl numericTypeStyle = new NumericTypeStyleImpl();
		return numericTypeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericTextFieldStyle createNumericTextFieldStyle() {
		NumericTextFieldStyleImpl numericTextFieldStyle = new NumericTextFieldStyleImpl();
		return numericTextFieldStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericSpinnerStyle createNumericSpinnerStyle() {
		NumericSpinnerStyleImpl numericSpinnerStyle = new NumericSpinnerStyleImpl();
		return numericSpinnerStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextTypeStyle createTextTypeStyle() {
		TextTypeStyleImpl textTypeStyle = new TextTypeStyleImpl();
		return textTypeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanStyleKind createBooleanStyleKindFromString(EDataType eDataType, String initialValue) {
		BooleanStyleKind result = BooleanStyleKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanStyleKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QlsPackage getQlsPackage() {
		return (QlsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QlsPackage getPackage() {
		return QlsPackage.eINSTANCE;
	}

} //QlsFactoryImpl
