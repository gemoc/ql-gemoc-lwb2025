/**
 */
package org.gemoc.ql.model.ql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.BasicBinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getBasicBinaryExpression()
 * @model
 * @generated
 */
public interface BasicBinaryExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.ql.model.ql.BinaryOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.ql.model.ql.BinaryOperatorKind
	 * @see #setOperator(BinaryOperatorKind)
	 * @see org.gemoc.ql.model.ql.QlPackage#getBasicBinaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	BinaryOperatorKind getOperator();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.BasicBinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.ql.model.ql.BinaryOperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperatorKind value);

} // BasicBinaryExpression
