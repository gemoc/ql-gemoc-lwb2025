/**
 */
package org.gemoc.ql.model.ql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.IfExpression#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.IfExpression#getThenExpression <em>Then Expression</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.IfExpression#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getIfExpression()
 * @model
 * @generated
 */
public interface IfExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see org.gemoc.ql.model.ql.QlPackage#getIfExpression_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.IfExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' containment reference.
	 * @see #setThenExpression(Expression)
	 * @see org.gemoc.ql.model.ql.QlPackage#getIfExpression_ThenExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getThenExpression();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.IfExpression#getThenExpression <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expression</em>' containment reference.
	 * @see #getThenExpression()
	 * @generated
	 */
	void setThenExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' containment reference.
	 * @see #setElseExpression(Expression)
	 * @see org.gemoc.ql.model.ql.QlPackage#getIfExpression_ElseExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getElseExpression();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.IfExpression#getElseExpression <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' containment reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(Expression value);

} // IfExpression
