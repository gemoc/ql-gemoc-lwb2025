/**
 */
package org.gemoc.ql.model.ql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Money Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.MoneyValue#getMoneyValue <em>Money Value</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getMoneyValue()
 * @model
 * @generated
 */
public interface MoneyValue extends Value {
	/**
	 * Returns the value of the '<em><b>Money Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Money Value</em>' attribute.
	 * @see #setMoneyValue(float)
	 * @see org.gemoc.ql.model.ql.QlPackage#getMoneyValue_MoneyValue()
	 * @model
	 * @generated
	 */
	float getMoneyValue();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.MoneyValue#getMoneyValue <em>Money Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Money Value</em>' attribute.
	 * @see #getMoneyValue()
	 * @generated
	 */
	void setMoneyValue(float value);

} // MoneyValue
