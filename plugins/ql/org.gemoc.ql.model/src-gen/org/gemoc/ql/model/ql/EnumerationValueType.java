/**
 */
package org.gemoc.ql.model.ql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.EnumerationValueType#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getEnumerationValueType()
 * @model
 * @generated
 */
public interface EnumerationValueType extends ValueType {
	/**
	 * Returns the value of the '<em><b>Enumeration Literals</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ql.model.ql.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Literals</em>' containment reference list.
	 * @see org.gemoc.ql.model.ql.QlPackage#getEnumerationValueType_EnumerationLiterals()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getEnumerationLiterals();

} // EnumerationValueType
