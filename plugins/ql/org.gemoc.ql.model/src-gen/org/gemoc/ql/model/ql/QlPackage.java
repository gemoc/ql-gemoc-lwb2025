/**
 */
package org.gemoc.ql.model.ql;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.gemoc.ql.model.ql.QlFactory
 * @model kind="package"
 * @generated
 */
public interface QlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ql";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gemoc.org/ql";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ql";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QlPackage eINSTANCE = org.gemoc.ql.model.ql.impl.QlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.QLModelImpl <em>QL Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.QLModelImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getQLModel()
	 * @generated
	 */
	int QL_MODEL = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.NamedElementImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QL_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Definition Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QL_MODEL__DEFINITION_GROUP = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Can Submit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QL_MODEL__CAN_SUBMIT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Submit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QL_MODEL__SUBMIT_DATE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Question Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QL_MODEL__QUESTION_GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>QL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QL_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>QL Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QL_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.QuestionDefinitionImpl <em>Question Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.QuestionDefinitionImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getQuestionDefinition()
	 * @generated
	 */
	int QUESTION_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION__LABEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION__DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Computed Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION__COMPUTED_EXPRESSION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION__CURRENT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Displayed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION__IS_DISPLAYED = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION__IS_MANDATORY = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Question Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Question Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_DEFINITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.ExpressionImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__RESULT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.BinaryExpressionImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RESULT_TYPE = EXPRESSION__RESULT_TYPE;

	/**
	 * The feature id for the '<em><b>Lhs Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LHS_OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RHS_OPERAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.UnaryExpressionImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__RESULT_TYPE = EXPRESSION__RESULT_TYPE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.BasicBinaryExpressionImpl <em>Basic Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.BasicBinaryExpressionImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBasicBinaryExpression()
	 * @generated
	 */
	int BASIC_BINARY_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BINARY_EXPRESSION__RESULT_TYPE = BINARY_EXPRESSION__RESULT_TYPE;

	/**
	 * The feature id for the '<em><b>Lhs Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BINARY_EXPRESSION__LHS_OPERAND = BINARY_EXPRESSION__LHS_OPERAND;

	/**
	 * The feature id for the '<em><b>Rhs Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BINARY_EXPRESSION__RHS_OPERAND = BINARY_EXPRESSION__RHS_OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BINARY_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BINARY_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BINARY_EXPRESSION_OPERATION_COUNT = BINARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.CallImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 6;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__RESULT_TYPE = EXPRESSION__RESULT_TYPE;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.ConstantCallImpl <em>Constant Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.ConstantCallImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getConstantCall()
	 * @generated
	 */
	int CONSTANT_CALL = 7;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_CALL__RESULT_TYPE = CALL__RESULT_TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_CALL__VALUE = CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_CALL_FEATURE_COUNT = CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Constant Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_CALL_OPERATION_COUNT = CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.ValueImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 8;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.IntegerValueImpl <em>Integer Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.IntegerValueImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getIntegerValue()
	 * @generated
	 */
	int INTEGER_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE__INT_VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.StringValueImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 10;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__STRING_VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.BooleanValueImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBooleanValue()
	 * @generated
	 */
	int BOOLEAN_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE__BOOLEAN_VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.BasicUnaryExpressionImpl <em>Basic Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.BasicUnaryExpressionImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBasicUnaryExpression()
	 * @generated
	 */
	int BASIC_UNARY_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_UNARY_EXPRESSION__RESULT_TYPE = UNARY_EXPRESSION__RESULT_TYPE;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_UNARY_EXPRESSION__OPERAND = UNARY_EXPRESSION__OPERAND;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_UNARY_EXPRESSION__OPERATOR = UNARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Basic Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_UNARY_EXPRESSION_FEATURE_COUNT = UNARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Basic Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_UNARY_EXPRESSION_OPERATION_COUNT = UNARY_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.DateValueImpl <em>Date Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.DateValueImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getDateValue()
	 * @generated
	 */
	int DATE_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Date Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE__DATE_VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.DecimalValueImpl <em>Decimal Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.DecimalValueImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getDecimalValue()
	 * @generated
	 */
	int DECIMAL_VALUE = 14;

	/**
	 * The feature id for the '<em><b>Decimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE__DECIMAL_VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.ValueTypeImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__UNIT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.BooleanValueTypeImpl <em>Boolean Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.BooleanValueTypeImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBooleanValueType()
	 * @generated
	 */
	int BOOLEAN_VALUE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE__UNIT = VALUE_TYPE__UNIT;

	/**
	 * The number of structural features of the '<em>Boolean Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.IntegerValueTypeImpl <em>Integer Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.IntegerValueTypeImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getIntegerValueType()
	 * @generated
	 */
	int INTEGER_VALUE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__UNIT = VALUE_TYPE__UNIT;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__MIN = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE__MAX = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.DecimalValueTypeImpl <em>Decimal Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.DecimalValueTypeImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getDecimalValueType()
	 * @generated
	 */
	int DECIMAL_VALUE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE_TYPE__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE_TYPE__UNIT = VALUE_TYPE__UNIT;

	/**
	 * The number of structural features of the '<em>Decimal Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decimal Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.DateValueTypeImpl <em>Date Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.DateValueTypeImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getDateValueType()
	 * @generated
	 */
	int DATE_VALUE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_TYPE__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_TYPE__UNIT = VALUE_TYPE__UNIT;

	/**
	 * The number of structural features of the '<em>Date Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.EnumerationValueTypeImpl <em>Enumeration Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.EnumerationValueTypeImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getEnumerationValueType()
	 * @generated
	 */
	int ENUMERATION_VALUE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__UNIT = VALUE_TYPE__UNIT;

	/**
	 * The feature id for the '<em><b>Enumeration Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE__ENUMERATION_LITERALS = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.EnumerationLiteralImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.ConditionnalElementImpl <em>Conditionnal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.ConditionnalElementImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getConditionnalElement()
	 * @generated
	 */
	int CONDITIONNAL_ELEMENT = 23;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONNAL_ELEMENT__GUARD = 0;

	/**
	 * The number of structural features of the '<em>Conditionnal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONNAL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Conditionnal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONNAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.QuestionGroupImpl <em>Question Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.QuestionGroupImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getQuestionGroup()
	 * @generated
	 */
	int QUESTION_GROUP = 24;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GROUP__GUARD = CONDITIONNAL_ELEMENT__GUARD;

	/**
	 * The feature id for the '<em><b>Question Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GROUP__QUESTION_GROUPS = CONDITIONNAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GROUP__QUESTIONS = CONDITIONNAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Question Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GROUP_FEATURE_COUNT = CONDITIONNAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Question Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_GROUP_OPERATION_COUNT = CONDITIONNAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.DefinitionGroupImpl <em>Definition Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.DefinitionGroupImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getDefinitionGroup()
	 * @generated
	 */
	int DEFINITION_GROUP = 25;

	/**
	 * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_GROUP__DATA_TYPES = 0;

	/**
	 * The feature id for the '<em><b>Question Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_GROUP__QUESTION_DEFINITIONS = 1;

	/**
	 * The number of structural features of the '<em>Definition Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Definition Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.QuestionCallImpl <em>Question Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.QuestionCallImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getQuestionCall()
	 * @generated
	 */
	int QUESTION_CALL = 26;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CALL__RESULT_TYPE = CALL__RESULT_TYPE;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CALL__QUESTION = CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Question Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CALL_FEATURE_COUNT = CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Question Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_CALL_OPERATION_COUNT = CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.EnumerationCallImpl <em>Enumeration Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.EnumerationCallImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getEnumerationCall()
	 * @generated
	 */
	int ENUMERATION_CALL = 27;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CALL__RESULT_TYPE = CALL__RESULT_TYPE;

	/**
	 * The feature id for the '<em><b>Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CALL__ENUMERATION_LITERAL = CALL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CALL_FEATURE_COUNT = CALL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_CALL_OPERATION_COUNT = CALL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.StringValueTypeImpl <em>String Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.StringValueTypeImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getStringValueType()
	 * @generated
	 */
	int STRING_VALUE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_TYPE__NAME = VALUE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_TYPE__UNIT = VALUE_TYPE__UNIT;

	/**
	 * The number of structural features of the '<em>String Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_TYPE_FEATURE_COUNT = VALUE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_TYPE_OPERATION_COUNT = VALUE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.QuestionImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 29;

	/**
	 * The feature id for the '<em><b>Question Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION_DEFINITION = 0;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.impl.IfExpressionImpl <em>If Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.impl.IfExpressionImpl
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getIfExpression()
	 * @generated
	 */
	int IF_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__RESULT_TYPE = EXPRESSION__RESULT_TYPE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__CONDITION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__THEN_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION__ELSE_EXPRESSION = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.BinaryOperatorKind <em>Binary Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.BinaryOperatorKind
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBinaryOperatorKind()
	 * @generated
	 */
	int BINARY_OPERATOR_KIND = 31;

	/**
	 * The meta object id for the '{@link org.gemoc.ql.model.ql.UnaryOperatorKind <em>Unary Operator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.ql.model.ql.UnaryOperatorKind
	 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getUnaryOperatorKind()
	 * @generated
	 */
	int UNARY_OPERATOR_KIND = 32;

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.QLModel <em>QL Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QL Model</em>'.
	 * @see org.gemoc.ql.model.ql.QLModel
	 * @generated
	 */
	EClass getQLModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ql.model.ql.QLModel#getDefinitionGroup <em>Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definition Group</em>'.
	 * @see org.gemoc.ql.model.ql.QLModel#getDefinitionGroup()
	 * @see #getQLModel()
	 * @generated
	 */
	EReference getQLModel_DefinitionGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.QLModel#isCanSubmit <em>Can Submit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Submit</em>'.
	 * @see org.gemoc.ql.model.ql.QLModel#isCanSubmit()
	 * @see #getQLModel()
	 * @generated
	 */
	EAttribute getQLModel_CanSubmit();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.QLModel#getSubmitDate <em>Submit Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Submit Date</em>'.
	 * @see org.gemoc.ql.model.ql.QLModel#getSubmitDate()
	 * @see #getQLModel()
	 * @generated
	 */
	EAttribute getQLModel_SubmitDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ql.model.ql.QLModel#getQuestionGroups <em>Question Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Groups</em>'.
	 * @see org.gemoc.ql.model.ql.QLModel#getQuestionGroups()
	 * @see #getQLModel()
	 * @generated
	 */
	EReference getQLModel_QuestionGroups();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.QuestionDefinition <em>Question Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Definition</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionDefinition
	 * @generated
	 */
	EClass getQuestionDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.QuestionDefinition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionDefinition#getLabel()
	 * @see #getQuestionDefinition()
	 * @generated
	 */
	EAttribute getQuestionDefinition_Label();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ql.model.ql.QuestionDefinition#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionDefinition#getDataType()
	 * @see #getQuestionDefinition()
	 * @generated
	 */
	EReference getQuestionDefinition_DataType();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ql.model.ql.QuestionDefinition#getComputedExpression <em>Computed Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Computed Expression</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionDefinition#getComputedExpression()
	 * @see #getQuestionDefinition()
	 * @generated
	 */
	EReference getQuestionDefinition_ComputedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ql.model.ql.QuestionDefinition#getCurrentValue <em>Current Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Current Value</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionDefinition#getCurrentValue()
	 * @see #getQuestionDefinition()
	 * @generated
	 */
	EReference getQuestionDefinition_CurrentValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.QuestionDefinition#isIsDisplayed <em>Is Displayed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Displayed</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionDefinition#isIsDisplayed()
	 * @see #getQuestionDefinition()
	 * @generated
	 */
	EAttribute getQuestionDefinition_IsDisplayed();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.QuestionDefinition#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionDefinition#isIsMandatory()
	 * @see #getQuestionDefinition()
	 * @generated
	 */
	EAttribute getQuestionDefinition_IsMandatory();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.gemoc.ql.model.ql.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ql.model.ql.Expression#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Result Type</em>'.
	 * @see org.gemoc.ql.model.ql.Expression#getResultType()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_ResultType();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.gemoc.ql.model.ql.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ql.model.ql.BinaryExpression#getLhsOperand <em>Lhs Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs Operand</em>'.
	 * @see org.gemoc.ql.model.ql.BinaryExpression#getLhsOperand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LhsOperand();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ql.model.ql.BinaryExpression#getRhsOperand <em>Rhs Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs Operand</em>'.
	 * @see org.gemoc.ql.model.ql.BinaryExpression#getRhsOperand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RhsOperand();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see org.gemoc.ql.model.ql.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ql.model.ql.UnaryExpression#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see org.gemoc.ql.model.ql.UnaryExpression#getOperand()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Operand();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.BasicBinaryExpression <em>Basic Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Binary Expression</em>'.
	 * @see org.gemoc.ql.model.ql.BasicBinaryExpression
	 * @generated
	 */
	EClass getBasicBinaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.BasicBinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.ql.model.ql.BasicBinaryExpression#getOperator()
	 * @see #getBasicBinaryExpression()
	 * @generated
	 */
	EAttribute getBasicBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.gemoc.ql.model.ql.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.ConstantCall <em>Constant Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Call</em>'.
	 * @see org.gemoc.ql.model.ql.ConstantCall
	 * @generated
	 */
	EClass getConstantCall();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ql.model.ql.ConstantCall#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.gemoc.ql.model.ql.ConstantCall#getValue()
	 * @see #getConstantCall()
	 * @generated
	 */
	EReference getConstantCall_Value();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.gemoc.ql.model.ql.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.IntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value</em>'.
	 * @see org.gemoc.ql.model.ql.IntegerValue
	 * @generated
	 */
	EClass getIntegerValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.IntegerValue#getIntValue <em>Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int Value</em>'.
	 * @see org.gemoc.ql.model.ql.IntegerValue#getIntValue()
	 * @see #getIntegerValue()
	 * @generated
	 */
	EAttribute getIntegerValue_IntValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see org.gemoc.ql.model.ql.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.StringValue#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see org.gemoc.ql.model.ql.StringValue#getStringValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_StringValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.BooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value</em>'.
	 * @see org.gemoc.ql.model.ql.BooleanValue
	 * @generated
	 */
	EClass getBooleanValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.BooleanValue#isBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see org.gemoc.ql.model.ql.BooleanValue#isBooleanValue()
	 * @see #getBooleanValue()
	 * @generated
	 */
	EAttribute getBooleanValue_BooleanValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.BasicUnaryExpression <em>Basic Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Unary Expression</em>'.
	 * @see org.gemoc.ql.model.ql.BasicUnaryExpression
	 * @generated
	 */
	EClass getBasicUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.BasicUnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.gemoc.ql.model.ql.BasicUnaryExpression#getOperator()
	 * @see #getBasicUnaryExpression()
	 * @generated
	 */
	EAttribute getBasicUnaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.DateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Value</em>'.
	 * @see org.gemoc.ql.model.ql.DateValue
	 * @generated
	 */
	EClass getDateValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.DateValue#getDateValue <em>Date Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Value</em>'.
	 * @see org.gemoc.ql.model.ql.DateValue#getDateValue()
	 * @see #getDateValue()
	 * @generated
	 */
	EAttribute getDateValue_DateValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.DecimalValue <em>Decimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Value</em>'.
	 * @see org.gemoc.ql.model.ql.DecimalValue
	 * @generated
	 */
	EClass getDecimalValue();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.DecimalValue#getDecimalValue <em>Decimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal Value</em>'.
	 * @see org.gemoc.ql.model.ql.DecimalValue#getDecimalValue()
	 * @see #getDecimalValue()
	 * @generated
	 */
	EAttribute getDecimalValue_DecimalValue();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see org.gemoc.ql.model.ql.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.ValueType#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.gemoc.ql.model.ql.ValueType#getUnit()
	 * @see #getValueType()
	 * @generated
	 */
	EAttribute getValueType_Unit();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.BooleanValueType <em>Boolean Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Value Type</em>'.
	 * @see org.gemoc.ql.model.ql.BooleanValueType
	 * @generated
	 */
	EClass getBooleanValueType();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.IntegerValueType <em>Integer Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Type</em>'.
	 * @see org.gemoc.ql.model.ql.IntegerValueType
	 * @generated
	 */
	EClass getIntegerValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.IntegerValueType#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.gemoc.ql.model.ql.IntegerValueType#getMin()
	 * @see #getIntegerValueType()
	 * @generated
	 */
	EAttribute getIntegerValueType_Min();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.IntegerValueType#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.gemoc.ql.model.ql.IntegerValueType#getMax()
	 * @see #getIntegerValueType()
	 * @generated
	 */
	EAttribute getIntegerValueType_Max();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.DecimalValueType <em>Decimal Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Value Type</em>'.
	 * @see org.gemoc.ql.model.ql.DecimalValueType
	 * @generated
	 */
	EClass getDecimalValueType();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.DateValueType <em>Date Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Value Type</em>'.
	 * @see org.gemoc.ql.model.ql.DateValueType
	 * @generated
	 */
	EClass getDateValueType();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.EnumerationValueType <em>Enumeration Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Value Type</em>'.
	 * @see org.gemoc.ql.model.ql.EnumerationValueType
	 * @generated
	 */
	EClass getEnumerationValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ql.model.ql.EnumerationValueType#getEnumerationLiterals <em>Enumeration Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumeration Literals</em>'.
	 * @see org.gemoc.ql.model.ql.EnumerationValueType#getEnumerationLiterals()
	 * @see #getEnumerationValueType()
	 * @generated
	 */
	EReference getEnumerationValueType_EnumerationLiterals();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see org.gemoc.ql.model.ql.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.EnumerationLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.ql.model.ql.EnumerationLiteral#getName()
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	EAttribute getEnumerationLiteral_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.gemoc.ql.model.ql.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.ql.model.ql.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.ql.model.ql.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.ConditionnalElement <em>Conditionnal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditionnal Element</em>'.
	 * @see org.gemoc.ql.model.ql.ConditionnalElement
	 * @generated
	 */
	EClass getConditionnalElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ql.model.ql.ConditionnalElement#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see org.gemoc.ql.model.ql.ConditionnalElement#getGuard()
	 * @see #getConditionnalElement()
	 * @generated
	 */
	EReference getConditionnalElement_Guard();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.QuestionGroup <em>Question Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Group</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionGroup
	 * @generated
	 */
	EClass getQuestionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ql.model.ql.QuestionGroup#getQuestionGroups <em>Question Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Groups</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionGroup#getQuestionGroups()
	 * @see #getQuestionGroup()
	 * @generated
	 */
	EReference getQuestionGroup_QuestionGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ql.model.ql.QuestionGroup#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionGroup#getQuestions()
	 * @see #getQuestionGroup()
	 * @generated
	 */
	EReference getQuestionGroup_Questions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.DefinitionGroup <em>Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition Group</em>'.
	 * @see org.gemoc.ql.model.ql.DefinitionGroup
	 * @generated
	 */
	EClass getDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ql.model.ql.DefinitionGroup#getDataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Types</em>'.
	 * @see org.gemoc.ql.model.ql.DefinitionGroup#getDataTypes()
	 * @see #getDefinitionGroup()
	 * @generated
	 */
	EReference getDefinitionGroup_DataTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.ql.model.ql.DefinitionGroup#getQuestionDefinitions <em>Question Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Definitions</em>'.
	 * @see org.gemoc.ql.model.ql.DefinitionGroup#getQuestionDefinitions()
	 * @see #getDefinitionGroup()
	 * @generated
	 */
	EReference getDefinitionGroup_QuestionDefinitions();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.QuestionCall <em>Question Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Call</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionCall
	 * @generated
	 */
	EClass getQuestionCall();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ql.model.ql.QuestionCall#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Question</em>'.
	 * @see org.gemoc.ql.model.ql.QuestionCall#getQuestion()
	 * @see #getQuestionCall()
	 * @generated
	 */
	EReference getQuestionCall_Question();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.EnumerationCall <em>Enumeration Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Call</em>'.
	 * @see org.gemoc.ql.model.ql.EnumerationCall
	 * @generated
	 */
	EClass getEnumerationCall();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ql.model.ql.EnumerationCall#getEnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration Literal</em>'.
	 * @see org.gemoc.ql.model.ql.EnumerationCall#getEnumerationLiteral()
	 * @see #getEnumerationCall()
	 * @generated
	 */
	EReference getEnumerationCall_EnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.StringValueType <em>String Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value Type</em>'.
	 * @see org.gemoc.ql.model.ql.StringValueType
	 * @generated
	 */
	EClass getStringValueType();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see org.gemoc.ql.model.ql.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.ql.model.ql.Question#getQuestionDefinition <em>Question Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Question Definition</em>'.
	 * @see org.gemoc.ql.model.ql.Question#getQuestionDefinition()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_QuestionDefinition();

	/**
	 * Returns the meta object for class '{@link org.gemoc.ql.model.ql.IfExpression <em>If Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Expression</em>'.
	 * @see org.gemoc.ql.model.ql.IfExpression
	 * @generated
	 */
	EClass getIfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ql.model.ql.IfExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.gemoc.ql.model.ql.IfExpression#getCondition()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ql.model.ql.IfExpression#getThenExpression <em>Then Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then Expression</em>'.
	 * @see org.gemoc.ql.model.ql.IfExpression#getThenExpression()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_ThenExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.ql.model.ql.IfExpression#getElseExpression <em>Else Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Expression</em>'.
	 * @see org.gemoc.ql.model.ql.IfExpression#getElseExpression()
	 * @see #getIfExpression()
	 * @generated
	 */
	EReference getIfExpression_ElseExpression();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.ql.model.ql.BinaryOperatorKind <em>Binary Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator Kind</em>'.
	 * @see org.gemoc.ql.model.ql.BinaryOperatorKind
	 * @generated
	 */
	EEnum getBinaryOperatorKind();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.ql.model.ql.UnaryOperatorKind <em>Unary Operator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator Kind</em>'.
	 * @see org.gemoc.ql.model.ql.UnaryOperatorKind
	 * @generated
	 */
	EEnum getUnaryOperatorKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QlFactory getQlFactory();

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
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.QLModelImpl <em>QL Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.QLModelImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getQLModel()
		 * @generated
		 */
		EClass QL_MODEL = eINSTANCE.getQLModel();

		/**
		 * The meta object literal for the '<em><b>Definition Group</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QL_MODEL__DEFINITION_GROUP = eINSTANCE.getQLModel_DefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Can Submit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QL_MODEL__CAN_SUBMIT = eINSTANCE.getQLModel_CanSubmit();

		/**
		 * The meta object literal for the '<em><b>Submit Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QL_MODEL__SUBMIT_DATE = eINSTANCE.getQLModel_SubmitDate();

		/**
		 * The meta object literal for the '<em><b>Question Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QL_MODEL__QUESTION_GROUPS = eINSTANCE.getQLModel_QuestionGroups();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.QuestionDefinitionImpl <em>Question Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.QuestionDefinitionImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getQuestionDefinition()
		 * @generated
		 */
		EClass QUESTION_DEFINITION = eINSTANCE.getQuestionDefinition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_DEFINITION__LABEL = eINSTANCE.getQuestionDefinition_Label();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_DEFINITION__DATA_TYPE = eINSTANCE.getQuestionDefinition_DataType();

		/**
		 * The meta object literal for the '<em><b>Computed Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_DEFINITION__COMPUTED_EXPRESSION = eINSTANCE.getQuestionDefinition_ComputedExpression();

		/**
		 * The meta object literal for the '<em><b>Current Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_DEFINITION__CURRENT_VALUE = eINSTANCE.getQuestionDefinition_CurrentValue();

		/**
		 * The meta object literal for the '<em><b>Is Displayed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_DEFINITION__IS_DISPLAYED = eINSTANCE.getQuestionDefinition_IsDisplayed();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION_DEFINITION__IS_MANDATORY = eINSTANCE.getQuestionDefinition_IsMandatory();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.ExpressionImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__RESULT_TYPE = eINSTANCE.getExpression_ResultType();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.BinaryExpressionImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LHS_OPERAND = eINSTANCE.getBinaryExpression_LhsOperand();

		/**
		 * The meta object literal for the '<em><b>Rhs Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RHS_OPERAND = eINSTANCE.getBinaryExpression_RhsOperand();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.UnaryExpressionImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__OPERAND = eINSTANCE.getUnaryExpression_Operand();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.BasicBinaryExpressionImpl <em>Basic Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.BasicBinaryExpressionImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBasicBinaryExpression()
		 * @generated
		 */
		EClass BASIC_BINARY_EXPRESSION = eINSTANCE.getBasicBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBasicBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.CallImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.ConstantCallImpl <em>Constant Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.ConstantCallImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getConstantCall()
		 * @generated
		 */
		EClass CONSTANT_CALL = eINSTANCE.getConstantCall();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_CALL__VALUE = eINSTANCE.getConstantCall_Value();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.ValueImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.IntegerValueImpl <em>Integer Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.IntegerValueImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getIntegerValue()
		 * @generated
		 */
		EClass INTEGER_VALUE = eINSTANCE.getIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE__INT_VALUE = eINSTANCE.getIntegerValue_IntValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.StringValueImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__STRING_VALUE = eINSTANCE.getStringValue_StringValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.BooleanValueImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBooleanValue()
		 * @generated
		 */
		EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_VALUE__BOOLEAN_VALUE = eINSTANCE.getBooleanValue_BooleanValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.BasicUnaryExpressionImpl <em>Basic Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.BasicUnaryExpressionImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBasicUnaryExpression()
		 * @generated
		 */
		EClass BASIC_UNARY_EXPRESSION = eINSTANCE.getBasicUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_UNARY_EXPRESSION__OPERATOR = eINSTANCE.getBasicUnaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.DateValueImpl <em>Date Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.DateValueImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getDateValue()
		 * @generated
		 */
		EClass DATE_VALUE = eINSTANCE.getDateValue();

		/**
		 * The meta object literal for the '<em><b>Date Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_VALUE__DATE_VALUE = eINSTANCE.getDateValue_DateValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.DecimalValueImpl <em>Decimal Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.DecimalValueImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getDecimalValue()
		 * @generated
		 */
		EClass DECIMAL_VALUE = eINSTANCE.getDecimalValue();

		/**
		 * The meta object literal for the '<em><b>Decimal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_VALUE__DECIMAL_VALUE = eINSTANCE.getDecimalValue_DecimalValue();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.ValueTypeImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_TYPE__UNIT = eINSTANCE.getValueType_Unit();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.BooleanValueTypeImpl <em>Boolean Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.BooleanValueTypeImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBooleanValueType()
		 * @generated
		 */
		EClass BOOLEAN_VALUE_TYPE = eINSTANCE.getBooleanValueType();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.IntegerValueTypeImpl <em>Integer Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.IntegerValueTypeImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getIntegerValueType()
		 * @generated
		 */
		EClass INTEGER_VALUE_TYPE = eINSTANCE.getIntegerValueType();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_TYPE__MIN = eINSTANCE.getIntegerValueType_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_TYPE__MAX = eINSTANCE.getIntegerValueType_Max();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.DecimalValueTypeImpl <em>Decimal Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.DecimalValueTypeImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getDecimalValueType()
		 * @generated
		 */
		EClass DECIMAL_VALUE_TYPE = eINSTANCE.getDecimalValueType();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.DateValueTypeImpl <em>Date Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.DateValueTypeImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getDateValueType()
		 * @generated
		 */
		EClass DATE_VALUE_TYPE = eINSTANCE.getDateValueType();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.EnumerationValueTypeImpl <em>Enumeration Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.EnumerationValueTypeImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getEnumerationValueType()
		 * @generated
		 */
		EClass ENUMERATION_VALUE_TYPE = eINSTANCE.getEnumerationValueType();

		/**
		 * The meta object literal for the '<em><b>Enumeration Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_VALUE_TYPE__ENUMERATION_LITERALS = eINSTANCE
				.getEnumerationValueType_EnumerationLiterals();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.EnumerationLiteralImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_LITERAL__NAME = eINSTANCE.getEnumerationLiteral_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.NamedElementImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.ConditionnalElementImpl <em>Conditionnal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.ConditionnalElementImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getConditionnalElement()
		 * @generated
		 */
		EClass CONDITIONNAL_ELEMENT = eINSTANCE.getConditionnalElement();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONNAL_ELEMENT__GUARD = eINSTANCE.getConditionnalElement_Guard();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.QuestionGroupImpl <em>Question Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.QuestionGroupImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getQuestionGroup()
		 * @generated
		 */
		EClass QUESTION_GROUP = eINSTANCE.getQuestionGroup();

		/**
		 * The meta object literal for the '<em><b>Question Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_GROUP__QUESTION_GROUPS = eINSTANCE.getQuestionGroup_QuestionGroups();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_GROUP__QUESTIONS = eINSTANCE.getQuestionGroup_Questions();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.DefinitionGroupImpl <em>Definition Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.DefinitionGroupImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getDefinitionGroup()
		 * @generated
		 */
		EClass DEFINITION_GROUP = eINSTANCE.getDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_GROUP__DATA_TYPES = eINSTANCE.getDefinitionGroup_DataTypes();

		/**
		 * The meta object literal for the '<em><b>Question Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_GROUP__QUESTION_DEFINITIONS = eINSTANCE.getDefinitionGroup_QuestionDefinitions();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.QuestionCallImpl <em>Question Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.QuestionCallImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getQuestionCall()
		 * @generated
		 */
		EClass QUESTION_CALL = eINSTANCE.getQuestionCall();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_CALL__QUESTION = eINSTANCE.getQuestionCall_Question();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.EnumerationCallImpl <em>Enumeration Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.EnumerationCallImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getEnumerationCall()
		 * @generated
		 */
		EClass ENUMERATION_CALL = eINSTANCE.getEnumerationCall();

		/**
		 * The meta object literal for the '<em><b>Enumeration Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_CALL__ENUMERATION_LITERAL = eINSTANCE.getEnumerationCall_EnumerationLiteral();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.StringValueTypeImpl <em>String Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.StringValueTypeImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getStringValueType()
		 * @generated
		 */
		EClass STRING_VALUE_TYPE = eINSTANCE.getStringValueType();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.QuestionImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Question Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__QUESTION_DEFINITION = eINSTANCE.getQuestion_QuestionDefinition();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.impl.IfExpressionImpl <em>If Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.impl.IfExpressionImpl
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getIfExpression()
		 * @generated
		 */
		EClass IF_EXPRESSION = eINSTANCE.getIfExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__CONDITION = eINSTANCE.getIfExpression_Condition();

		/**
		 * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__THEN_EXPRESSION = eINSTANCE.getIfExpression_ThenExpression();

		/**
		 * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_EXPRESSION__ELSE_EXPRESSION = eINSTANCE.getIfExpression_ElseExpression();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.BinaryOperatorKind <em>Binary Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.BinaryOperatorKind
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getBinaryOperatorKind()
		 * @generated
		 */
		EEnum BINARY_OPERATOR_KIND = eINSTANCE.getBinaryOperatorKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.ql.model.ql.UnaryOperatorKind <em>Unary Operator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.ql.model.ql.UnaryOperatorKind
		 * @see org.gemoc.ql.model.ql.impl.QlPackageImpl#getUnaryOperatorKind()
		 * @generated
		 */
		EEnum UNARY_OPERATOR_KIND = eINSTANCE.getUnaryOperatorKind();

	}

} //QlPackage
