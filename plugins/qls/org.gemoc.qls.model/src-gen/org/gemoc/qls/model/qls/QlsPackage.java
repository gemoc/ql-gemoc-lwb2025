/**
 */
package org.gemoc.qls.model.qls;

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
 * @see org.gemoc.qls.model.qls.QlsFactory
 * @model kind="package"
 * @generated
 */
public interface QlsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qls";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gemoc.org/qls";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qls";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QlsPackage eINSTANCE = org.gemoc.qls.model.qls.impl.QlsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.impl.QLSModelImpl <em>QLS Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.impl.QLSModelImpl
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getQLSModel()
	 * @generated
	 */
	int QLS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QLS_MODEL__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Question Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QLS_MODEL__QUESTION_STYLES = 1;

	/**
	 * The number of structural features of the '<em>QLS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QLS_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>QLS Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QLS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.impl.ImportImpl
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.impl.TypeStyleImpl <em>Type Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.impl.TypeStyleImpl
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getTypeStyle()
	 * @generated
	 */
	int TYPE_STYLE = 2;

	/**
	 * The number of structural features of the '<em>Type Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_STYLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.impl.NumericTypeStyleImpl <em>Numeric Type Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.impl.NumericTypeStyleImpl
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getNumericTypeStyle()
	 * @generated
	 */
	int NUMERIC_TYPE_STYLE = 3;

	/**
	 * The number of structural features of the '<em>Numeric Type Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_STYLE_FEATURE_COUNT = TYPE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Type Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_STYLE_OPERATION_COUNT = TYPE_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.impl.QuestionStyleImpl <em>Question Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.impl.QuestionStyleImpl
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getQuestionStyle()
	 * @generated
	 */
	int QUESTION_STYLE = 4;

	/**
	 * The feature id for the '<em><b>Styled Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_STYLE__STYLED_QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_STYLE__LABEL_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Type Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_STYLE__TYPE_STYLE = 2;

	/**
	 * The number of structural features of the '<em>Question Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_STYLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Question Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.impl.LabelStyleImpl <em>Label Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.impl.LabelStyleImpl
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getLabelStyle()
	 * @generated
	 */
	int LABEL_STYLE = 5;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE__ITALIC = 0;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE__BOLD = 1;

	/**
	 * The number of structural features of the '<em>Label Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Label Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.impl.BooleanTypeStyleImpl <em>Boolean Type Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.impl.BooleanTypeStyleImpl
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getBooleanTypeStyle()
	 * @generated
	 */
	int BOOLEAN_TYPE_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Boolean Style Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_STYLE__BOOLEAN_STYLE_KIND = TYPE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Type Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_STYLE_FEATURE_COUNT = TYPE_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Type Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_STYLE_OPERATION_COUNT = TYPE_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.impl.NumericTypeTextFieldStyleImpl <em>Numeric Type Text Field Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.impl.NumericTypeTextFieldStyleImpl
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getNumericTypeTextFieldStyle()
	 * @generated
	 */
	int NUMERIC_TYPE_TEXT_FIELD_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_TEXT_FIELD_STYLE__STEP = NUMERIC_TYPE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeric Type Text Field Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_TEXT_FIELD_STYLE_FEATURE_COUNT = NUMERIC_TYPE_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Numeric Type Text Field Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_TEXT_FIELD_STYLE_OPERATION_COUNT = NUMERIC_TYPE_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.impl.NumericTypeSpinnerStyleImpl <em>Numeric Type Spinner Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.impl.NumericTypeSpinnerStyleImpl
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getNumericTypeSpinnerStyle()
	 * @generated
	 */
	int NUMERIC_TYPE_SPINNER_STYLE = 8;

	/**
	 * The number of structural features of the '<em>Numeric Type Spinner Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_SPINNER_STYLE_FEATURE_COUNT = NUMERIC_TYPE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Type Spinner Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_SPINNER_STYLE_OPERATION_COUNT = NUMERIC_TYPE_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.impl.TextTypeStyleImpl <em>Text Type Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.impl.TextTypeStyleImpl
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getTextTypeStyle()
	 * @generated
	 */
	int TEXT_TYPE_STYLE = 9;

	/**
	 * The feature id for the '<em><b>Multiline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_STYLE__MULTILINE = TYPE_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Type Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_STYLE_FEATURE_COUNT = TYPE_STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Type Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_TYPE_STYLE_OPERATION_COUNT = TYPE_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.impl.NumericSpinnerStyleImpl <em>Numeric Spinner Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.impl.NumericSpinnerStyleImpl
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getNumericSpinnerStyle()
	 * @generated
	 */
	int NUMERIC_SPINNER_STYLE = 10;

	/**
	 * The number of structural features of the '<em>Numeric Spinner Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SPINNER_STYLE_FEATURE_COUNT = NUMERIC_TYPE_SPINNER_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Spinner Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_SPINNER_STYLE_OPERATION_COUNT = NUMERIC_TYPE_SPINNER_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gemoc.qls.model.qls.BooleanStyleKind <em>Boolean Style Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.qls.model.qls.BooleanStyleKind
	 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getBooleanStyleKind()
	 * @generated
	 */
	int BOOLEAN_STYLE_KIND = 11;

	/**
	 * Returns the meta object for class '{@link org.gemoc.qls.model.qls.QLSModel <em>QLS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QLS Model</em>'.
	 * @see org.gemoc.qls.model.qls.QLSModel
	 * @generated
	 */
	EClass getQLSModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.qls.model.qls.QLSModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.gemoc.qls.model.qls.QLSModel#getImports()
	 * @see #getQLSModel()
	 * @generated
	 */
	EReference getQLSModel_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.qls.model.qls.QLSModel#getQuestionStyles <em>Question Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Styles</em>'.
	 * @see org.gemoc.qls.model.qls.QLSModel#getQuestionStyles()
	 * @see #getQLSModel()
	 * @generated
	 */
	EReference getQLSModel_QuestionStyles();

	/**
	 * Returns the meta object for class '{@link org.gemoc.qls.model.qls.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.gemoc.qls.model.qls.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.qls.model.qls.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see org.gemoc.qls.model.qls.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link org.gemoc.qls.model.qls.TypeStyle <em>Type Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Style</em>'.
	 * @see org.gemoc.qls.model.qls.TypeStyle
	 * @generated
	 */
	EClass getTypeStyle();

	/**
	 * Returns the meta object for class '{@link org.gemoc.qls.model.qls.NumericTypeStyle <em>Numeric Type Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type Style</em>'.
	 * @see org.gemoc.qls.model.qls.NumericTypeStyle
	 * @generated
	 */
	EClass getNumericTypeStyle();

	/**
	 * Returns the meta object for class '{@link org.gemoc.qls.model.qls.QuestionStyle <em>Question Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Style</em>'.
	 * @see org.gemoc.qls.model.qls.QuestionStyle
	 * @generated
	 */
	EClass getQuestionStyle();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.qls.model.qls.QuestionStyle#getStyledQuestion <em>Styled Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Styled Question</em>'.
	 * @see org.gemoc.qls.model.qls.QuestionStyle#getStyledQuestion()
	 * @see #getQuestionStyle()
	 * @generated
	 */
	EReference getQuestionStyle_StyledQuestion();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.qls.model.qls.QuestionStyle#getLabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Style</em>'.
	 * @see org.gemoc.qls.model.qls.QuestionStyle#getLabelStyle()
	 * @see #getQuestionStyle()
	 * @generated
	 */
	EReference getQuestionStyle_LabelStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.gemoc.qls.model.qls.QuestionStyle#getTypeStyle <em>Type Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Style</em>'.
	 * @see org.gemoc.qls.model.qls.QuestionStyle#getTypeStyle()
	 * @see #getQuestionStyle()
	 * @generated
	 */
	EReference getQuestionStyle_TypeStyle();

	/**
	 * Returns the meta object for class '{@link org.gemoc.qls.model.qls.LabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Style</em>'.
	 * @see org.gemoc.qls.model.qls.LabelStyle
	 * @generated
	 */
	EClass getLabelStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.qls.model.qls.LabelStyle#isItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see org.gemoc.qls.model.qls.LabelStyle#isItalic()
	 * @see #getLabelStyle()
	 * @generated
	 */
	EAttribute getLabelStyle_Italic();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.qls.model.qls.LabelStyle#isBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see org.gemoc.qls.model.qls.LabelStyle#isBold()
	 * @see #getLabelStyle()
	 * @generated
	 */
	EAttribute getLabelStyle_Bold();

	/**
	 * Returns the meta object for class '{@link org.gemoc.qls.model.qls.BooleanTypeStyle <em>Boolean Type Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type Style</em>'.
	 * @see org.gemoc.qls.model.qls.BooleanTypeStyle
	 * @generated
	 */
	EClass getBooleanTypeStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.qls.model.qls.BooleanTypeStyle#getBooleanStyleKind <em>Boolean Style Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Style Kind</em>'.
	 * @see org.gemoc.qls.model.qls.BooleanTypeStyle#getBooleanStyleKind()
	 * @see #getBooleanTypeStyle()
	 * @generated
	 */
	EAttribute getBooleanTypeStyle_BooleanStyleKind();

	/**
	 * Returns the meta object for class '{@link org.gemoc.qls.model.qls.NumericTypeTextFieldStyle <em>Numeric Type Text Field Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type Text Field Style</em>'.
	 * @see org.gemoc.qls.model.qls.NumericTypeTextFieldStyle
	 * @generated
	 */
	EClass getNumericTypeTextFieldStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.qls.model.qls.NumericTypeTextFieldStyle#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see org.gemoc.qls.model.qls.NumericTypeTextFieldStyle#getStep()
	 * @see #getNumericTypeTextFieldStyle()
	 * @generated
	 */
	EAttribute getNumericTypeTextFieldStyle_Step();

	/**
	 * Returns the meta object for class '{@link org.gemoc.qls.model.qls.NumericTypeSpinnerStyle <em>Numeric Type Spinner Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type Spinner Style</em>'.
	 * @see org.gemoc.qls.model.qls.NumericTypeSpinnerStyle
	 * @generated
	 */
	EClass getNumericTypeSpinnerStyle();

	/**
	 * Returns the meta object for class '{@link org.gemoc.qls.model.qls.TextTypeStyle <em>Text Type Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Type Style</em>'.
	 * @see org.gemoc.qls.model.qls.TextTypeStyle
	 * @generated
	 */
	EClass getTextTypeStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.qls.model.qls.TextTypeStyle#isMultiline <em>Multiline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiline</em>'.
	 * @see org.gemoc.qls.model.qls.TextTypeStyle#isMultiline()
	 * @see #getTextTypeStyle()
	 * @generated
	 */
	EAttribute getTextTypeStyle_Multiline();

	/**
	 * Returns the meta object for class '{@link org.gemoc.qls.model.qls.NumericSpinnerStyle <em>Numeric Spinner Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Spinner Style</em>'.
	 * @see org.gemoc.qls.model.qls.NumericSpinnerStyle
	 * @generated
	 */
	EClass getNumericSpinnerStyle();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.qls.model.qls.BooleanStyleKind <em>Boolean Style Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Style Kind</em>'.
	 * @see org.gemoc.qls.model.qls.BooleanStyleKind
	 * @generated
	 */
	EEnum getBooleanStyleKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QlsFactory getQlsFactory();

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
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.impl.QLSModelImpl <em>QLS Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.impl.QLSModelImpl
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getQLSModel()
		 * @generated
		 */
		EClass QLS_MODEL = eINSTANCE.getQLSModel();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QLS_MODEL__IMPORTS = eINSTANCE.getQLSModel_Imports();

		/**
		 * The meta object literal for the '<em><b>Question Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QLS_MODEL__QUESTION_STYLES = eINSTANCE.getQLSModel_QuestionStyles();

		/**
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.impl.ImportImpl
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.impl.TypeStyleImpl <em>Type Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.impl.TypeStyleImpl
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getTypeStyle()
		 * @generated
		 */
		EClass TYPE_STYLE = eINSTANCE.getTypeStyle();

		/**
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.impl.NumericTypeStyleImpl <em>Numeric Type Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.impl.NumericTypeStyleImpl
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getNumericTypeStyle()
		 * @generated
		 */
		EClass NUMERIC_TYPE_STYLE = eINSTANCE.getNumericTypeStyle();

		/**
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.impl.QuestionStyleImpl <em>Question Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.impl.QuestionStyleImpl
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getQuestionStyle()
		 * @generated
		 */
		EClass QUESTION_STYLE = eINSTANCE.getQuestionStyle();

		/**
		 * The meta object literal for the '<em><b>Styled Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_STYLE__STYLED_QUESTION = eINSTANCE.getQuestionStyle_StyledQuestion();

		/**
		 * The meta object literal for the '<em><b>Label Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_STYLE__LABEL_STYLE = eINSTANCE.getQuestionStyle_LabelStyle();

		/**
		 * The meta object literal for the '<em><b>Type Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_STYLE__TYPE_STYLE = eINSTANCE.getQuestionStyle_TypeStyle();

		/**
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.impl.LabelStyleImpl <em>Label Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.impl.LabelStyleImpl
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getLabelStyle()
		 * @generated
		 */
		EClass LABEL_STYLE = eINSTANCE.getLabelStyle();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_STYLE__ITALIC = eINSTANCE.getLabelStyle_Italic();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_STYLE__BOLD = eINSTANCE.getLabelStyle_Bold();

		/**
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.impl.BooleanTypeStyleImpl <em>Boolean Type Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.impl.BooleanTypeStyleImpl
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getBooleanTypeStyle()
		 * @generated
		 */
		EClass BOOLEAN_TYPE_STYLE = eINSTANCE.getBooleanTypeStyle();

		/**
		 * The meta object literal for the '<em><b>Boolean Style Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_TYPE_STYLE__BOOLEAN_STYLE_KIND = eINSTANCE.getBooleanTypeStyle_BooleanStyleKind();

		/**
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.impl.NumericTypeTextFieldStyleImpl <em>Numeric Type Text Field Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.impl.NumericTypeTextFieldStyleImpl
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getNumericTypeTextFieldStyle()
		 * @generated
		 */
		EClass NUMERIC_TYPE_TEXT_FIELD_STYLE = eINSTANCE.getNumericTypeTextFieldStyle();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_TYPE_TEXT_FIELD_STYLE__STEP = eINSTANCE.getNumericTypeTextFieldStyle_Step();

		/**
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.impl.NumericTypeSpinnerStyleImpl <em>Numeric Type Spinner Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.impl.NumericTypeSpinnerStyleImpl
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getNumericTypeSpinnerStyle()
		 * @generated
		 */
		EClass NUMERIC_TYPE_SPINNER_STYLE = eINSTANCE.getNumericTypeSpinnerStyle();

		/**
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.impl.TextTypeStyleImpl <em>Text Type Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.impl.TextTypeStyleImpl
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getTextTypeStyle()
		 * @generated
		 */
		EClass TEXT_TYPE_STYLE = eINSTANCE.getTextTypeStyle();

		/**
		 * The meta object literal for the '<em><b>Multiline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_TYPE_STYLE__MULTILINE = eINSTANCE.getTextTypeStyle_Multiline();

		/**
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.impl.NumericSpinnerStyleImpl <em>Numeric Spinner Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.impl.NumericSpinnerStyleImpl
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getNumericSpinnerStyle()
		 * @generated
		 */
		EClass NUMERIC_SPINNER_STYLE = eINSTANCE.getNumericSpinnerStyle();

		/**
		 * The meta object literal for the '{@link org.gemoc.qls.model.qls.BooleanStyleKind <em>Boolean Style Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.qls.model.qls.BooleanStyleKind
		 * @see org.gemoc.qls.model.qls.impl.QlsPackageImpl#getBooleanStyleKind()
		 * @generated
		 */
		EEnum BOOLEAN_STYLE_KIND = eINSTANCE.getBooleanStyleKind();

	}

} //QlsPackage
