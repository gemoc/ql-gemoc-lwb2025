/**
 */
package org.gemoc.ql.model.ql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.BinaryExpression#getLhsOperand <em>Lhs Operand</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.BinaryExpression#getRhsOperand <em>Rhs Operand</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getBinaryExpression()
 * @model abstract="true"
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Lhs Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs Operand</em>' containment reference.
	 * @see #setLhsOperand(Expression)
	 * @see org.gemoc.ql.model.ql.QlPackage#getBinaryExpression_LhsOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLhsOperand();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.BinaryExpression#getLhsOperand <em>Lhs Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs Operand</em>' containment reference.
	 * @see #getLhsOperand()
	 * @generated
	 */
	void setLhsOperand(Expression value);

	/**
	 * Returns the value of the '<em><b>Rhs Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs Operand</em>' containment reference.
	 * @see #setRhsOperand(Expression)
	 * @see org.gemoc.ql.model.ql.QlPackage#getBinaryExpression_RhsOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRhsOperand();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.BinaryExpression#getRhsOperand <em>Rhs Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs Operand</em>' containment reference.
	 * @see #getRhsOperand()
	 * @generated
	 */
	void setRhsOperand(Expression value);

} // BinaryExpression
