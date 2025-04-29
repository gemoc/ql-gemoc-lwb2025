/**
 */
package org.gemoc.ql.model.ql.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.ql.model.ql.BasicBinaryExpression;
import org.gemoc.ql.model.ql.BasicUnaryExpression;
import org.gemoc.ql.model.ql.BinaryExpression;
import org.gemoc.ql.model.ql.BinaryOperatorKind;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.BooleanValueType;
import org.gemoc.ql.model.ql.Call;
import org.gemoc.ql.model.ql.ConditionnalElement;
import org.gemoc.ql.model.ql.ConstantCall;
import org.gemoc.ql.model.ql.DateValue;
import org.gemoc.ql.model.ql.DateValueType;
import org.gemoc.ql.model.ql.DecimalValue;
import org.gemoc.ql.model.ql.DecimalValueType;
import org.gemoc.ql.model.ql.DefinitionGroup;
import org.gemoc.ql.model.ql.EnumerationCall;
import org.gemoc.ql.model.ql.EnumerationLiteral;
import org.gemoc.ql.model.ql.EnumerationValueType;
import org.gemoc.ql.model.ql.Expression;
import org.gemoc.ql.model.ql.Form;
import org.gemoc.ql.model.ql.IfExpression;
import org.gemoc.ql.model.ql.IntegerValue;
import org.gemoc.ql.model.ql.IntegerValueType;
import org.gemoc.ql.model.ql.NamedElement;
import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.QlPackage;
import org.gemoc.ql.model.ql.Question;
import org.gemoc.ql.model.ql.QuestionCall;
import org.gemoc.ql.model.ql.QuestionDefinition;
import org.gemoc.ql.model.ql.QuestionGroup;
import org.gemoc.ql.model.ql.StringValue;
import org.gemoc.ql.model.ql.StringValueType;
import org.gemoc.ql.model.ql.UnaryExpression;
import org.gemoc.ql.model.ql.UnaryOperatorKind;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QlPackageImpl extends EPackageImpl implements QlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicBinaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicUnaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionnalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperatorKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.ql.model.ql.QlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QlPackageImpl() {
		super(eNS_URI, QlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QlPackage init() {
		if (isInited)
			return (QlPackage) EPackage.Registry.INSTANCE.getEPackage(QlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QlPackageImpl theQlPackage = registeredQlPackage instanceof QlPackageImpl ? (QlPackageImpl) registeredQlPackage
				: new QlPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theQlPackage.createPackageContents();

		// Initialize created meta-data
		theQlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QlPackage.eNS_URI, theQlPackage);
		return theQlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQLModel() {
		return qlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQLModel_Forms() {
		return (EReference) qlModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQLModel_DefinitionGroup() {
		return (EReference) qlModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQLModel_CanSubmit() {
		return (EAttribute) qlModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQLModel_SubmitDate() {
		return (EAttribute) qlModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForm() {
		return formEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForm_QuestionGroup() {
		return (EReference) formEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionDefinition() {
		return questionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionDefinition_Label() {
		return (EAttribute) questionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionDefinition_DataType() {
		return (EReference) questionDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionDefinition_ComputedExpression() {
		return (EReference) questionDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionDefinition_CurrentValue() {
		return (EReference) questionDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionDefinition_IsDisplayed() {
		return (EAttribute) questionDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuestionDefinition_IsMandatory() {
		return (EAttribute) questionDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_ResultType() {
		return (EReference) expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryExpression_LhsOperand() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinaryExpression_RhsOperand() {
		return (EReference) binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnaryExpression_Operand() {
		return (EReference) unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicBinaryExpression() {
		return basicBinaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicBinaryExpression_Operator() {
		return (EAttribute) basicBinaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstantCall() {
		return constantCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstantCall_Value() {
		return (EReference) constantCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerValue() {
		return integerValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerValue_IntValue() {
		return (EAttribute) integerValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringValue_StringValue() {
		return (EAttribute) stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanValue() {
		return booleanValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanValue_BooleanValue() {
		return (EAttribute) booleanValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicUnaryExpression() {
		return basicUnaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBasicUnaryExpression_Operator() {
		return (EAttribute) basicUnaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateValue() {
		return dateValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateValue_DateValue() {
		return (EAttribute) dateValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecimalValue() {
		return decimalValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimalValue_DecimalValue() {
		return (EAttribute) decimalValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValueType() {
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValueType_Unit() {
		return (EAttribute) valueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanValueType() {
		return booleanValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerValueType() {
		return integerValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerValueType_Min() {
		return (EAttribute) integerValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerValueType_Max() {
		return (EAttribute) integerValueTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecimalValueType() {
		return decimalValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateValueType() {
		return dateValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationValueType() {
		return enumerationValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumerationValueType_EnumerationLiterals() {
		return (EReference) enumerationValueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumerationLiteral_Name() {
		return (EAttribute) enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionnalElement() {
		return conditionnalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionnalElement_Guard() {
		return (EReference) conditionnalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionGroup() {
		return questionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionGroup_QuestionGroups() {
		return (EReference) questionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionGroup_Questions() {
		return (EReference) questionGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionGroup() {
		return definitionGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionGroup_DataTypes() {
		return (EReference) definitionGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionGroup_QuestionDefinitions() {
		return (EReference) definitionGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionCall() {
		return questionCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionCall_Question() {
		return (EReference) questionCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationCall() {
		return enumerationCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumerationCall_EnumerationLiteral() {
		return (EReference) enumerationCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringValueType() {
		return stringValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestion_QuestionDefinition() {
		return (EReference) questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfExpression() {
		return ifExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfExpression_Condition() {
		return (EReference) ifExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfExpression_ThenExpression() {
		return (EReference) ifExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfExpression_ElseExpression() {
		return (EReference) ifExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBinaryOperatorKind() {
		return binaryOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnaryOperatorKind() {
		return unaryOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QlFactory getQlFactory() {
		return (QlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		qlModelEClass = createEClass(QL_MODEL);
		createEReference(qlModelEClass, QL_MODEL__FORMS);
		createEReference(qlModelEClass, QL_MODEL__DEFINITION_GROUP);
		createEAttribute(qlModelEClass, QL_MODEL__CAN_SUBMIT);
		createEAttribute(qlModelEClass, QL_MODEL__SUBMIT_DATE);

		formEClass = createEClass(FORM);
		createEReference(formEClass, FORM__QUESTION_GROUP);

		questionDefinitionEClass = createEClass(QUESTION_DEFINITION);
		createEAttribute(questionDefinitionEClass, QUESTION_DEFINITION__LABEL);
		createEReference(questionDefinitionEClass, QUESTION_DEFINITION__DATA_TYPE);
		createEReference(questionDefinitionEClass, QUESTION_DEFINITION__COMPUTED_EXPRESSION);
		createEReference(questionDefinitionEClass, QUESTION_DEFINITION__CURRENT_VALUE);
		createEAttribute(questionDefinitionEClass, QUESTION_DEFINITION__IS_DISPLAYED);
		createEAttribute(questionDefinitionEClass, QUESTION_DEFINITION__IS_MANDATORY);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__RESULT_TYPE);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LHS_OPERAND);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RHS_OPERAND);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__OPERAND);

		basicBinaryExpressionEClass = createEClass(BASIC_BINARY_EXPRESSION);
		createEAttribute(basicBinaryExpressionEClass, BASIC_BINARY_EXPRESSION__OPERATOR);

		callEClass = createEClass(CALL);

		constantCallEClass = createEClass(CONSTANT_CALL);
		createEReference(constantCallEClass, CONSTANT_CALL__VALUE);

		valueEClass = createEClass(VALUE);

		integerValueEClass = createEClass(INTEGER_VALUE);
		createEAttribute(integerValueEClass, INTEGER_VALUE__INT_VALUE);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__STRING_VALUE);

		booleanValueEClass = createEClass(BOOLEAN_VALUE);
		createEAttribute(booleanValueEClass, BOOLEAN_VALUE__BOOLEAN_VALUE);

		basicUnaryExpressionEClass = createEClass(BASIC_UNARY_EXPRESSION);
		createEAttribute(basicUnaryExpressionEClass, BASIC_UNARY_EXPRESSION__OPERATOR);

		dateValueEClass = createEClass(DATE_VALUE);
		createEAttribute(dateValueEClass, DATE_VALUE__DATE_VALUE);

		decimalValueEClass = createEClass(DECIMAL_VALUE);
		createEAttribute(decimalValueEClass, DECIMAL_VALUE__DECIMAL_VALUE);

		valueTypeEClass = createEClass(VALUE_TYPE);
		createEAttribute(valueTypeEClass, VALUE_TYPE__UNIT);

		booleanValueTypeEClass = createEClass(BOOLEAN_VALUE_TYPE);

		integerValueTypeEClass = createEClass(INTEGER_VALUE_TYPE);
		createEAttribute(integerValueTypeEClass, INTEGER_VALUE_TYPE__MIN);
		createEAttribute(integerValueTypeEClass, INTEGER_VALUE_TYPE__MAX);

		decimalValueTypeEClass = createEClass(DECIMAL_VALUE_TYPE);

		dateValueTypeEClass = createEClass(DATE_VALUE_TYPE);

		enumerationValueTypeEClass = createEClass(ENUMERATION_VALUE_TYPE);
		createEReference(enumerationValueTypeEClass, ENUMERATION_VALUE_TYPE__ENUMERATION_LITERALS);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEAttribute(enumerationLiteralEClass, ENUMERATION_LITERAL__NAME);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		conditionnalElementEClass = createEClass(CONDITIONNAL_ELEMENT);
		createEReference(conditionnalElementEClass, CONDITIONNAL_ELEMENT__GUARD);

		questionGroupEClass = createEClass(QUESTION_GROUP);
		createEReference(questionGroupEClass, QUESTION_GROUP__QUESTION_GROUPS);
		createEReference(questionGroupEClass, QUESTION_GROUP__QUESTIONS);

		definitionGroupEClass = createEClass(DEFINITION_GROUP);
		createEReference(definitionGroupEClass, DEFINITION_GROUP__DATA_TYPES);
		createEReference(definitionGroupEClass, DEFINITION_GROUP__QUESTION_DEFINITIONS);

		questionCallEClass = createEClass(QUESTION_CALL);
		createEReference(questionCallEClass, QUESTION_CALL__QUESTION);

		enumerationCallEClass = createEClass(ENUMERATION_CALL);
		createEReference(enumerationCallEClass, ENUMERATION_CALL__ENUMERATION_LITERAL);

		stringValueTypeEClass = createEClass(STRING_VALUE_TYPE);

		questionEClass = createEClass(QUESTION);
		createEReference(questionEClass, QUESTION__QUESTION_DEFINITION);

		ifExpressionEClass = createEClass(IF_EXPRESSION);
		createEReference(ifExpressionEClass, IF_EXPRESSION__CONDITION);
		createEReference(ifExpressionEClass, IF_EXPRESSION__THEN_EXPRESSION);
		createEReference(ifExpressionEClass, IF_EXPRESSION__ELSE_EXPRESSION);

		// Create enums
		binaryOperatorKindEEnum = createEEnum(BINARY_OPERATOR_KIND);
		unaryOperatorKindEEnum = createEEnum(UNARY_OPERATOR_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		formEClass.getESuperTypes().add(this.getNamedElement());
		questionDefinitionEClass.getESuperTypes().add(this.getNamedElement());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		basicBinaryExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		callEClass.getESuperTypes().add(this.getExpression());
		constantCallEClass.getESuperTypes().add(this.getCall());
		integerValueEClass.getESuperTypes().add(this.getValue());
		stringValueEClass.getESuperTypes().add(this.getValue());
		booleanValueEClass.getESuperTypes().add(this.getValue());
		basicUnaryExpressionEClass.getESuperTypes().add(this.getUnaryExpression());
		dateValueEClass.getESuperTypes().add(this.getValue());
		decimalValueEClass.getESuperTypes().add(this.getValue());
		valueTypeEClass.getESuperTypes().add(this.getNamedElement());
		booleanValueTypeEClass.getESuperTypes().add(this.getValueType());
		integerValueTypeEClass.getESuperTypes().add(this.getValueType());
		decimalValueTypeEClass.getESuperTypes().add(this.getValueType());
		dateValueTypeEClass.getESuperTypes().add(this.getValueType());
		enumerationValueTypeEClass.getESuperTypes().add(this.getValueType());
		questionGroupEClass.getESuperTypes().add(this.getConditionnalElement());
		questionCallEClass.getESuperTypes().add(this.getCall());
		enumerationCallEClass.getESuperTypes().add(this.getCall());
		enumerationCallEClass.getESuperTypes().add(this.getValue());
		stringValueTypeEClass.getESuperTypes().add(this.getValueType());
		ifExpressionEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(qlModelEClass, QLModel.class, "QLModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQLModel_Forms(), this.getForm(), null, "forms", null, 0, -1, QLModel.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getQLModel_DefinitionGroup(), this.getDefinitionGroup(), null, "definitionGroup", null, 0, -1,
				QLModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQLModel_CanSubmit(), ecorePackage.getEBoolean(), "canSubmit", null, 0, 1, QLModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQLModel_SubmitDate(), ecorePackage.getEDate(), "submitDate", null, 0, 1, QLModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formEClass, Form.class, "Form", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForm_QuestionGroup(), this.getQuestionGroup(), null, "questionGroup", null, 1, 1, Form.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionDefinitionEClass, QuestionDefinition.class, "QuestionDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestionDefinition_Label(), ecorePackage.getEString(), "label", null, 0, 1,
				QuestionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionDefinition_DataType(), this.getValueType(), null, "dataType", null, 1, 1,
				QuestionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionDefinition_ComputedExpression(), this.getExpression(), null, "computedExpression",
				null, 0, 1, QuestionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionDefinition_CurrentValue(), this.getValue(), null, "currentValue", null, 0, 1,
				QuestionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionDefinition_IsDisplayed(), ecorePackage.getEBoolean(), "isDisplayed", null, 0, 1,
				QuestionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestionDefinition_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 0, 1,
				QuestionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_ResultType(), this.getValueType(), null, "resultType", null, 0, 1,
				Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_LhsOperand(), this.getExpression(), null, "lhsOperand", null, 1, 1,
				BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_RhsOperand(), this.getExpression(), null, "rhsOperand", null, 1, 1,
				BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryExpression_Operand(), this.getExpression(), null, "operand", null, 1, 1,
				UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicBinaryExpressionEClass, BasicBinaryExpression.class, "BasicBinaryExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicBinaryExpression_Operator(), this.getBinaryOperatorKind(), "operator", null, 1, 1,
				BasicBinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callEClass, Call.class, "Call", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantCallEClass, ConstantCall.class, "ConstantCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantCall_Value(), this.getValue(), null, "value", null, 0, 1, ConstantCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerValueEClass, IntegerValue.class, "IntegerValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValue_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, IntegerValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1,
				StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueEClass, BooleanValue.class, "BooleanValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanValue_BooleanValue(), ecorePackage.getEBoolean(), "booleanValue", null, 0, 1,
				BooleanValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(basicUnaryExpressionEClass, BasicUnaryExpression.class, "BasicUnaryExpression", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicUnaryExpression_Operator(), this.getUnaryOperatorKind(), "operator", null, 0, 1,
				BasicUnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateValueEClass, DateValue.class, "DateValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateValue_DateValue(), ecorePackage.getEDate(), "dateValue", null, 0, 1, DateValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalValueEClass, DecimalValue.class, "DecimalValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalValue_DecimalValue(), ecorePackage.getEFloat(), "decimalValue", null, 0, 1,
				DecimalValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueType_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, ValueType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanValueTypeEClass, BooleanValueType.class, "BooleanValueType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerValueTypeEClass, IntegerValueType.class, "IntegerValueType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerValueType_Min(), ecorePackage.getEInt(), "min", null, 0, 1, IntegerValueType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerValueType_Max(), ecorePackage.getEInt(), "max", null, 0, 1, IntegerValueType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalValueTypeEClass, DecimalValueType.class, "DecimalValueType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateValueTypeEClass, DateValueType.class, "DateValueType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationValueTypeEClass, EnumerationValueType.class, "EnumerationValueType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationValueType_EnumerationLiterals(), this.getEnumerationLiteral(), null,
				"enumerationLiterals", null, 0, -1, EnumerationValueType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionnalElementEClass, ConditionnalElement.class, "ConditionnalElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionnalElement_Guard(), this.getExpression(), null, "guard", null, 0, 1,
				ConditionnalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionGroupEClass, QuestionGroup.class, "QuestionGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionGroup_QuestionGroups(), this.getQuestionGroup(), null, "questionGroups", null, 0, -1,
				QuestionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionGroup_Questions(), this.getQuestion(), null, "questions", null, 0, -1,
				QuestionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionGroupEClass, DefinitionGroup.class, "DefinitionGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefinitionGroup_DataTypes(), this.getValueType(), null, "dataTypes", null, 0, -1,
				DefinitionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefinitionGroup_QuestionDefinitions(), this.getQuestionDefinition(), null,
				"questionDefinitions", null, 0, -1, DefinitionGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionCallEClass, QuestionCall.class, "QuestionCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionCall_Question(), this.getQuestionDefinition(), null, "question", null, 1, 1,
				QuestionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationCallEClass, EnumerationCall.class, "EnumerationCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationCall_EnumerationLiteral(), this.getEnumerationLiteral(), null,
				"enumerationLiteral", null, 1, 1, EnumerationCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueTypeEClass, StringValueType.class, "StringValueType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestion_QuestionDefinition(), this.getQuestionDefinition(), null, "questionDefinition", null,
				1, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifExpressionEClass, IfExpression.class, "IfExpression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIfExpression_Condition(), this.getExpression(), null, "condition", null, 1, 1,
				IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfExpression_ThenExpression(), this.getExpression(), null, "thenExpression", null, 1, 1,
				IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIfExpression_ElseExpression(), this.getExpression(), null, "elseExpression", null, 0, 1,
				IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(binaryOperatorKindEEnum, BinaryOperatorKind.class, "BinaryOperatorKind");
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.PLUS);
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.MINUS);
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.MULT);
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.DIV);
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.EQUAL);
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.NOTEQUAL);
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.GREATER);
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.LOWER);
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.GREATEROREQUAL);
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.LOWEROREQUAL);
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.AND);
		addEEnumLiteral(binaryOperatorKindEEnum, BinaryOperatorKind.OR);

		initEEnum(unaryOperatorKindEEnum, UnaryOperatorKind.class, "UnaryOperatorKind");
		addEEnumLiteral(unaryOperatorKindEEnum, UnaryOperatorKind.UNARYMINUS);
		addEEnumLiteral(unaryOperatorKindEEnum, UnaryOperatorKind.NOT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";
		addAnnotation(getQLModel_CanSubmit(), source, new String[] {});
		addAnnotation(getQLModel_SubmitDate(), source, new String[] {});
		addAnnotation(getQuestionDefinition_CurrentValue(), source, new String[] {});
		addAnnotation(getQuestionDefinition_IsDisplayed(), source, new String[] {});
	}

} //QlPackageImpl
