/**
 */
package org.gemoc.qls.model.qls;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Text Field Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.NumericTextFieldStyle#getStep <em>Step</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.NumericTextFieldStyle#isUseStep <em>Use Step</em>}</li>
 * </ul>
 *
 * @see org.gemoc.qls.model.qls.QlsPackage#getNumericTextFieldStyle()
 * @model
 * @generated
 */
public interface NumericTextFieldStyle extends NumericTypeStyle {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(double)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getNumericTextFieldStyle_Step()
	 * @model
	 * @generated
	 */
	double getStep();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.NumericTextFieldStyle#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(double value);

	/**
	 * Returns the value of the '<em><b>Use Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Step</em>' attribute.
	 * @see #setUseStep(boolean)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getNumericTextFieldStyle_UseStep()
	 * @model required="true"
	 * @generated
	 */
	boolean isUseStep();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.NumericTextFieldStyle#isUseStep <em>Use Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Step</em>' attribute.
	 * @see #isUseStep()
	 * @generated
	 */
	void setUseStep(boolean value);

} // NumericTextFieldStyle
