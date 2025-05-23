/**
 */
package org.gemoc.ql.model.ql.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.ql.model.ql.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gemoc.ql.model.ql.QlPackage
 * @generated
 */
public class QlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QlSwitch() {
		if (modelPackage == null) {
			modelPackage = QlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case QlPackage.QL_MODEL: {
			QLModel qlModel = (QLModel) theEObject;
			T result = caseQLModel(qlModel);
			if (result == null)
				result = caseNamedElement(qlModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.QUESTION_DEFINITION: {
			QuestionDefinition questionDefinition = (QuestionDefinition) theEObject;
			T result = caseQuestionDefinition(questionDefinition);
			if (result == null)
				result = caseNamedElement(questionDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.BINARY_EXPRESSION: {
			BinaryExpression binaryExpression = (BinaryExpression) theEObject;
			T result = caseBinaryExpression(binaryExpression);
			if (result == null)
				result = caseExpression(binaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.UNARY_EXPRESSION: {
			UnaryExpression unaryExpression = (UnaryExpression) theEObject;
			T result = caseUnaryExpression(unaryExpression);
			if (result == null)
				result = caseExpression(unaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.BASIC_BINARY_EXPRESSION: {
			BasicBinaryExpression basicBinaryExpression = (BasicBinaryExpression) theEObject;
			T result = caseBasicBinaryExpression(basicBinaryExpression);
			if (result == null)
				result = caseBinaryExpression(basicBinaryExpression);
			if (result == null)
				result = caseExpression(basicBinaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.CALL: {
			Call call = (Call) theEObject;
			T result = caseCall(call);
			if (result == null)
				result = caseExpression(call);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.CONSTANT_CALL: {
			ConstantCall constantCall = (ConstantCall) theEObject;
			T result = caseConstantCall(constantCall);
			if (result == null)
				result = caseCall(constantCall);
			if (result == null)
				result = caseExpression(constantCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.INTEGER_VALUE: {
			IntegerValue integerValue = (IntegerValue) theEObject;
			T result = caseIntegerValue(integerValue);
			if (result == null)
				result = caseValue(integerValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.STRING_VALUE: {
			StringValue stringValue = (StringValue) theEObject;
			T result = caseStringValue(stringValue);
			if (result == null)
				result = caseValue(stringValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.BOOLEAN_VALUE: {
			BooleanValue booleanValue = (BooleanValue) theEObject;
			T result = caseBooleanValue(booleanValue);
			if (result == null)
				result = caseValue(booleanValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.BASIC_UNARY_EXPRESSION: {
			BasicUnaryExpression basicUnaryExpression = (BasicUnaryExpression) theEObject;
			T result = caseBasicUnaryExpression(basicUnaryExpression);
			if (result == null)
				result = caseUnaryExpression(basicUnaryExpression);
			if (result == null)
				result = caseExpression(basicUnaryExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.DATE_VALUE: {
			DateValue dateValue = (DateValue) theEObject;
			T result = caseDateValue(dateValue);
			if (result == null)
				result = caseValue(dateValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.DECIMAL_VALUE: {
			DecimalValue decimalValue = (DecimalValue) theEObject;
			T result = caseDecimalValue(decimalValue);
			if (result == null)
				result = caseValue(decimalValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.VALUE_TYPE: {
			ValueType valueType = (ValueType) theEObject;
			T result = caseValueType(valueType);
			if (result == null)
				result = caseNamedElement(valueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.BOOLEAN_VALUE_TYPE: {
			BooleanValueType booleanValueType = (BooleanValueType) theEObject;
			T result = caseBooleanValueType(booleanValueType);
			if (result == null)
				result = caseValueType(booleanValueType);
			if (result == null)
				result = caseNamedElement(booleanValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.INTEGER_VALUE_TYPE: {
			IntegerValueType integerValueType = (IntegerValueType) theEObject;
			T result = caseIntegerValueType(integerValueType);
			if (result == null)
				result = caseValueType(integerValueType);
			if (result == null)
				result = caseNamedElement(integerValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.DECIMAL_VALUE_TYPE: {
			DecimalValueType decimalValueType = (DecimalValueType) theEObject;
			T result = caseDecimalValueType(decimalValueType);
			if (result == null)
				result = caseValueType(decimalValueType);
			if (result == null)
				result = caseNamedElement(decimalValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.DATE_VALUE_TYPE: {
			DateValueType dateValueType = (DateValueType) theEObject;
			T result = caseDateValueType(dateValueType);
			if (result == null)
				result = caseValueType(dateValueType);
			if (result == null)
				result = caseNamedElement(dateValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.ENUMERATION_VALUE_TYPE: {
			EnumerationValueType enumerationValueType = (EnumerationValueType) theEObject;
			T result = caseEnumerationValueType(enumerationValueType);
			if (result == null)
				result = caseValueType(enumerationValueType);
			if (result == null)
				result = caseNamedElement(enumerationValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.ENUMERATION_LITERAL: {
			EnumerationLiteral enumerationLiteral = (EnumerationLiteral) theEObject;
			T result = caseEnumerationLiteral(enumerationLiteral);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.CONDITIONNAL_ELEMENT: {
			ConditionnalElement conditionnalElement = (ConditionnalElement) theEObject;
			T result = caseConditionnalElement(conditionnalElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.QUESTION_GROUP: {
			QuestionGroup questionGroup = (QuestionGroup) theEObject;
			T result = caseQuestionGroup(questionGroup);
			if (result == null)
				result = caseConditionnalElement(questionGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.DEFINITION_GROUP: {
			DefinitionGroup definitionGroup = (DefinitionGroup) theEObject;
			T result = caseDefinitionGroup(definitionGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.QUESTION_CALL: {
			QuestionCall questionCall = (QuestionCall) theEObject;
			T result = caseQuestionCall(questionCall);
			if (result == null)
				result = caseCall(questionCall);
			if (result == null)
				result = caseExpression(questionCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.ENUMERATION_CALL: {
			EnumerationCall enumerationCall = (EnumerationCall) theEObject;
			T result = caseEnumerationCall(enumerationCall);
			if (result == null)
				result = caseCall(enumerationCall);
			if (result == null)
				result = caseValue(enumerationCall);
			if (result == null)
				result = caseExpression(enumerationCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.STRING_VALUE_TYPE: {
			StringValueType stringValueType = (StringValueType) theEObject;
			T result = caseStringValueType(stringValueType);
			if (result == null)
				result = caseValueType(stringValueType);
			if (result == null)
				result = caseNamedElement(stringValueType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.QUESTION: {
			Question question = (Question) theEObject;
			T result = caseQuestion(question);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlPackage.IF_EXPRESSION: {
			IfExpression ifExpression = (IfExpression) theEObject;
			T result = caseIfExpression(ifExpression);
			if (result == null)
				result = caseExpression(ifExpression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QL Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QL Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQLModel(QLModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionDefinition(QuestionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicBinaryExpression(BasicBinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantCall(ConstantCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValue(IntegerValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValue(BooleanValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicUnaryExpression(BasicUnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateValue(DateValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalValue(DecimalValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanValueType(BooleanValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerValueType(IntegerValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalValueType(DecimalValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateValueType(DateValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationValueType(EnumerationValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditionnal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditionnal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionnalElement(ConditionnalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionGroup(QuestionGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionGroup(DefinitionGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionCall(QuestionCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationCall(EnumerationCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValueType(StringValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfExpression(IfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QlSwitch
