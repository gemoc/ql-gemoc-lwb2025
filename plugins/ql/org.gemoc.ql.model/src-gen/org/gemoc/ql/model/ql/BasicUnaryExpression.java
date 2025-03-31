/**
 */
package org.gemoc.ql.model.ql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.BasicUnaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getBasicUnaryExpression()
 * @model
 * @generated
 */
public interface BasicUnaryExpression extends UnaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.ql.model.ql.UnaryOperatorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.ql.model.ql.UnaryOperatorKind
	 * @see #setOperator(UnaryOperatorKind)
	 * @see org.gemoc.ql.model.ql.QlPackage#getBasicUnaryExpression_Operator()
	 * @model
	 * @generated
	 */
	UnaryOperatorKind getOperator();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.BasicUnaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.gemoc.ql.model.ql.UnaryOperatorKind
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(UnaryOperatorKind value);

} // BasicUnaryExpression
