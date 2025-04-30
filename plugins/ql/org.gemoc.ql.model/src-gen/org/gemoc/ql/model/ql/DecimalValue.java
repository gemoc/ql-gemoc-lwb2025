/**
 */
package org.gemoc.ql.model.ql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.DecimalValue#getDecimalValue <em>Decimal Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getDecimalValue()
 * @model annotation="aspect"
 * @generated
 */
public interface DecimalValue extends Value {
	/**
	 * Returns the value of the '<em><b>Decimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Value</em>' attribute.
	 * @see #setDecimalValue(float)
	 * @see org.gemoc.ql.model.ql.QlPackage#getDecimalValue_DecimalValue()
	 * @model
	 * @generated
	 */
	float getDecimalValue();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.DecimalValue#getDecimalValue <em>Decimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Value</em>' attribute.
	 * @see #getDecimalValue()
	 * @generated
	 */
	void setDecimalValue(float value);

} // DecimalValue
