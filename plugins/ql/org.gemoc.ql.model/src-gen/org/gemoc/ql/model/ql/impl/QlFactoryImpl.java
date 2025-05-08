/**
 */
package org.gemoc.ql.model.ql.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.ql.model.ql.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QlFactoryImpl extends EFactoryImpl implements QlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QlFactory init() {
		try {
			QlFactory theQlFactory = (QlFactory) EPackage.Registry.INSTANCE.getEFactory(QlPackage.eNS_URI);
			if (theQlFactory != null) {
				return theQlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QlFactoryImpl() {
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
		case QlPackage.QL_MODEL:
			return createQLModel();
		case QlPackage.QUESTION_DEFINITION:
			return createQuestionDefinition();
		case QlPackage.BASIC_BINARY_EXPRESSION:
			return createBasicBinaryExpression();
		case QlPackage.CONSTANT_CALL:
			return createConstantCall();
		case QlPackage.INTEGER_VALUE:
			return createIntegerValue();
		case QlPackage.STRING_VALUE:
			return createStringValue();
		case QlPackage.BOOLEAN_VALUE:
			return createBooleanValue();
		case QlPackage.BASIC_UNARY_EXPRESSION:
			return createBasicUnaryExpression();
		case QlPackage.DATE_VALUE:
			return createDateValue();
		case QlPackage.DECIMAL_VALUE:
			return createDecimalValue();
		case QlPackage.VALUE_TYPE:
			return createValueType();
		case QlPackage.BOOLEAN_VALUE_TYPE:
			return createBooleanValueType();
		case QlPackage.INTEGER_VALUE_TYPE:
			return createIntegerValueType();
		case QlPackage.DECIMAL_VALUE_TYPE:
			return createDecimalValueType();
		case QlPackage.DATE_VALUE_TYPE:
			return createDateValueType();
		case QlPackage.ENUMERATION_VALUE_TYPE:
			return createEnumerationValueType();
		case QlPackage.ENUMERATION_LITERAL:
			return createEnumerationLiteral();
		case QlPackage.QUESTION_GROUP:
			return createQuestionGroup();
		case QlPackage.DEFINITION_GROUP:
			return createDefinitionGroup();
		case QlPackage.QUESTION_CALL:
			return createQuestionCall();
		case QlPackage.ENUMERATION_CALL:
			return createEnumerationCall();
		case QlPackage.STRING_VALUE_TYPE:
			return createStringValueType();
		case QlPackage.QUESTION:
			return createQuestion();
		case QlPackage.IF_EXPRESSION:
			return createIfExpression();
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
		case QlPackage.BINARY_OPERATOR_KIND:
			return createBinaryOperatorKindFromString(eDataType, initialValue);
		case QlPackage.UNARY_OPERATOR_KIND:
			return createUnaryOperatorKindFromString(eDataType, initialValue);
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
		case QlPackage.BINARY_OPERATOR_KIND:
			return convertBinaryOperatorKindToString(eDataType, instanceValue);
		case QlPackage.UNARY_OPERATOR_KIND:
			return convertUnaryOperatorKindToString(eDataType, instanceValue);
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
	public QLModel createQLModel() {
		QLModelImpl qlModel = new QLModelImpl();
		return qlModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionDefinition createQuestionDefinition() {
		QuestionDefinitionImpl questionDefinition = new QuestionDefinitionImpl();
		return questionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicBinaryExpression createBasicBinaryExpression() {
		BasicBinaryExpressionImpl basicBinaryExpression = new BasicBinaryExpressionImpl();
		return basicBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstantCall createConstantCall() {
		ConstantCallImpl constantCall = new ConstantCallImpl();
		return constantCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringValue createStringValue() {
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicUnaryExpression createBasicUnaryExpression() {
		BasicUnaryExpressionImpl basicUnaryExpression = new BasicUnaryExpressionImpl();
		return basicUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateValue createDateValue() {
		DateValueImpl dateValue = new DateValueImpl();
		return dateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalValue createDecimalValue() {
		DecimalValueImpl decimalValue = new DecimalValueImpl();
		return decimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanValueType createBooleanValueType() {
		BooleanValueTypeImpl booleanValueType = new BooleanValueTypeImpl();
		return booleanValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerValueType createIntegerValueType() {
		IntegerValueTypeImpl integerValueType = new IntegerValueTypeImpl();
		return integerValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecimalValueType createDecimalValueType() {
		DecimalValueTypeImpl decimalValueType = new DecimalValueTypeImpl();
		return decimalValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateValueType createDateValueType() {
		DateValueTypeImpl dateValueType = new DateValueTypeImpl();
		return dateValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationValueType createEnumerationValueType() {
		EnumerationValueTypeImpl enumerationValueType = new EnumerationValueTypeImpl();
		return enumerationValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionGroup createQuestionGroup() {
		QuestionGroupImpl questionGroup = new QuestionGroupImpl();
		return questionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionGroup createDefinitionGroup() {
		DefinitionGroupImpl definitionGroup = new DefinitionGroupImpl();
		return definitionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionCall createQuestionCall() {
		QuestionCallImpl questionCall = new QuestionCallImpl();
		return questionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationCall createEnumerationCall() {
		EnumerationCallImpl enumerationCall = new EnumerationCallImpl();
		return enumerationCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringValueType createStringValueType() {
		StringValueTypeImpl stringValueType = new StringValueTypeImpl();
		return stringValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfExpression createIfExpression() {
		IfExpressionImpl ifExpression = new IfExpressionImpl();
		return ifExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperatorKind createBinaryOperatorKindFromString(EDataType eDataType, String initialValue) {
		BinaryOperatorKind result = BinaryOperatorKind.get(initialValue);
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
	public String convertBinaryOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperatorKind createUnaryOperatorKindFromString(EDataType eDataType, String initialValue) {
		UnaryOperatorKind result = UnaryOperatorKind.get(initialValue);
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
	public String convertUnaryOperatorKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QlPackage getQlPackage() {
		return (QlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QlPackage getPackage() {
		return QlPackage.eINSTANCE;
	}

} //QlFactoryImpl
