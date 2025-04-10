/**
 */
package org.gemoc.ql.model.ql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.Expression#getResultType <em>Result Type</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Type</em>' reference.
	 * @see #setResultType(ValueType)
	 * @see org.gemoc.ql.model.ql.QlPackage#getExpression_ResultType()
	 * @model
	 * @generated
	 */
	ValueType getResultType();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.Expression#getResultType <em>Result Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Type</em>' reference.
	 * @see #getResultType()
	 * @generated
	 */
	void setResultType(ValueType value);

} // Expression
