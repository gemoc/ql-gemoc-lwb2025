/**
 */
package org.gemoc.ql.model.ql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.EnumerationValue#getEnumerationLiteral <em>Enumeration Literal</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getEnumerationValue()
 * @model
 * @generated
 */
public interface EnumerationValue extends Call {
	/**
	 * Returns the value of the '<em><b>Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Literal</em>' reference.
	 * @see #setEnumerationLiteral(EnumerationLiteral)
	 * @see org.gemoc.ql.model.ql.QlPackage#getEnumerationValue_EnumerationLiteral()
	 * @model required="true"
	 * @generated
	 */
	EnumerationLiteral getEnumerationLiteral();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.EnumerationValue#getEnumerationLiteral <em>Enumeration Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Literal</em>' reference.
	 * @see #getEnumerationLiteral()
	 * @generated
	 */
	void setEnumerationLiteral(EnumerationLiteral value);

} // EnumerationValue
