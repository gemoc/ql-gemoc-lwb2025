/**
 */
package org.gemoc.qls.model.qls;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.EnumerationTypeStyle#getEnumerationStyleKing <em>Enumeration Style King</em>}</li>
 * </ul>
 *
 * @see org.gemoc.qls.model.qls.QlsPackage#getEnumerationTypeStyle()
 * @model
 * @generated
 */
public interface EnumerationTypeStyle extends TypeStyle {
	/**
	 * Returns the value of the '<em><b>Enumeration Style King</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.qls.model.qls.EnumerationStyleKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Style King</em>' attribute.
	 * @see org.gemoc.qls.model.qls.EnumerationStyleKind
	 * @see #setEnumerationStyleKing(EnumerationStyleKind)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getEnumerationTypeStyle_EnumerationStyleKing()
	 * @model required="true"
	 * @generated
	 */
	EnumerationStyleKind getEnumerationStyleKing();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.EnumerationTypeStyle#getEnumerationStyleKing <em>Enumeration Style King</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Style King</em>' attribute.
	 * @see org.gemoc.qls.model.qls.EnumerationStyleKind
	 * @see #getEnumerationStyleKing()
	 * @generated
	 */
	void setEnumerationStyleKing(EnumerationStyleKind value);

} // EnumerationTypeStyle
