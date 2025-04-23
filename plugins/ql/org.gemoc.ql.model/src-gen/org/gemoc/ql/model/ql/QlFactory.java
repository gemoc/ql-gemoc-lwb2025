/**
 */
package org.gemoc.ql.model.ql;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.ql.model.ql.QlPackage
 * @generated
 */
public interface QlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QlFactory eINSTANCE = org.gemoc.ql.model.ql.impl.QlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>QL Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QL Model</em>'.
	 * @generated
	 */
	QLModel createQLModel();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Question Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Definition</em>'.
	 * @generated
	 */
	QuestionDefinition createQuestionDefinition();

	/**
	 * Returns a new object of class '<em>Basic Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Binary Expression</em>'.
	 * @generated
	 */
	BasicBinaryExpression createBasicBinaryExpression();

	/**
	 * Returns a new object of class '<em>Constant Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Call</em>'.
	 * @generated
	 */
	ConstantCall createConstantCall();

	/**
	 * Returns a new object of class '<em>Integer Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value</em>'.
	 * @generated
	 */
	IntegerValue createIntegerValue();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	StringValue createStringValue();

	/**
	 * Returns a new object of class '<em>Boolean Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value</em>'.
	 * @generated
	 */
	BooleanValue createBooleanValue();

	/**
	 * Returns a new object of class '<em>Basic Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Unary Expression</em>'.
	 * @generated
	 */
	BasicUnaryExpression createBasicUnaryExpression();

	/**
	 * Returns a new object of class '<em>Date Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Value</em>'.
	 * @generated
	 */
	DateValue createDateValue();

	/**
	 * Returns a new object of class '<em>Decimal Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Value</em>'.
	 * @generated
	 */
	DecimalValue createDecimalValue();

	/**
	 * Returns a new object of class '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Type</em>'.
	 * @generated
	 */
	ValueType createValueType();

	/**
	 * Returns a new object of class '<em>Boolean Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Value Type</em>'.
	 * @generated
	 */
	BooleanValueType createBooleanValueType();

	/**
	 * Returns a new object of class '<em>Integer Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value Type</em>'.
	 * @generated
	 */
	IntegerValueType createIntegerValueType();

	/**
	 * Returns a new object of class '<em>Decimal Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Value Type</em>'.
	 * @generated
	 */
	DecimalValueType createDecimalValueType();

	/**
	 * Returns a new object of class '<em>Date Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Value Type</em>'.
	 * @generated
	 */
	DateValueType createDateValueType();

	/**
	 * Returns a new object of class '<em>Enumeration Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Value Type</em>'.
	 * @generated
	 */
	EnumerationValueType createEnumerationValueType();

	/**
	 * Returns a new object of class '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Literal</em>'.
	 * @generated
	 */
	EnumerationLiteral createEnumerationLiteral();

	/**
	 * Returns a new object of class '<em>Question Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Group</em>'.
	 * @generated
	 */
	QuestionGroup createQuestionGroup();

	/**
	 * Returns a new object of class '<em>Definition Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition Group</em>'.
	 * @generated
	 */
	DefinitionGroup createDefinitionGroup();

	/**
	 * Returns a new object of class '<em>Question Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Call</em>'.
	 * @generated
	 */
	QuestionCall createQuestionCall();

	/**
	 * Returns a new object of class '<em>Enumeration Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Call</em>'.
	 * @generated
	 */
	EnumerationCall createEnumerationCall();

	/**
	 * Returns a new object of class '<em>String Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value Type</em>'.
	 * @generated
	 */
	StringValueType createStringValueType();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>If Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If Expression</em>'.
	 * @generated
	 */
	IfExpression createIfExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QlPackage getQlPackage();

} //QlFactory
