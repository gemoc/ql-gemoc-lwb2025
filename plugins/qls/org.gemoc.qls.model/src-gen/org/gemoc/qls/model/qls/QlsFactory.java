/**
 */
package org.gemoc.qls.model.qls;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.qls.model.qls.QlsPackage
 * @generated
 */
public interface QlsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QlsFactory eINSTANCE = org.gemoc.qls.model.qls.impl.QlsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>QLS Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QLS Model</em>'.
	 * @generated
	 */
	QLSModel createQLSModel();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Style</em>'.
	 * @generated
	 */
	TypeStyle createTypeStyle();

	/**
	 * Returns a new object of class '<em>Numeric Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Type Style</em>'.
	 * @generated
	 */
	NumericTypeStyle createNumericTypeStyle();

	/**
	 * Returns a new object of class '<em>Question Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Style</em>'.
	 * @generated
	 */
	QuestionStyle createQuestionStyle();

	/**
	 * Returns a new object of class '<em>Label Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label Style</em>'.
	 * @generated
	 */
	LabelStyle createLabelStyle();

	/**
	 * Returns a new object of class '<em>Boolean Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Type Style</em>'.
	 * @generated
	 */
	BooleanTypeStyle createBooleanTypeStyle();

	/**
	 * Returns a new object of class '<em>Numeric Type Text Field Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Type Text Field Style</em>'.
	 * @generated
	 */
	NumericTypeTextFieldStyle createNumericTypeTextFieldStyle();

	/**
	 * Returns a new object of class '<em>Numeric Type Spinner Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Type Spinner Style</em>'.
	 * @generated
	 */
	NumericTypeSpinnerStyle createNumericTypeSpinnerStyle();

	/**
	 * Returns a new object of class '<em>Text Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Type Style</em>'.
	 * @generated
	 */
	TextTypeStyle createTextTypeStyle();

	/**
	 * Returns a new object of class '<em>Enumeration Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Type Style</em>'.
	 * @generated
	 */
	EnumerationTypeStyle createEnumerationTypeStyle();

	/**
	 * Returns a new object of class '<em>Date Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Type Style</em>'.
	 * @generated
	 */
	DateTypeStyle createDateTypeStyle();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Question Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Reference</em>'.
	 * @generated
	 */
	QuestionReference createQuestionReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QlsPackage getQlsPackage();

} //QlsFactory
