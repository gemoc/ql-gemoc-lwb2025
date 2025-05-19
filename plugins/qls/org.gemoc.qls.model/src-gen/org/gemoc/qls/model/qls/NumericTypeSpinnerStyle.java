/**
 */
package org.gemoc.qls.model.qls;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Type Spinner Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.NumericTypeSpinnerStyle#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see org.gemoc.qls.model.qls.QlsPackage#getNumericTypeSpinnerStyle()
 * @model
 * @generated
 */
public interface NumericTypeSpinnerStyle extends NumericTypeStyle {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(double)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getNumericTypeSpinnerStyle_Step()
	 * @model
	 * @generated
	 */
	double getStep();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.NumericTypeSpinnerStyle#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(double value);

} // NumericTypeSpinnerStyle
