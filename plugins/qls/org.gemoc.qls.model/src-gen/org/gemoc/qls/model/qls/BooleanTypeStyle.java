/**
 */
package org.gemoc.qls.model.qls;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Type Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.BooleanTypeStyle#getBooleanStyleKind <em>Boolean Style Kind</em>}</li>
 * </ul>
 *
 * @see org.gemoc.qls.model.qls.QlsPackage#getBooleanTypeStyle()
 * @model
 * @generated
 */
public interface BooleanTypeStyle extends TypeStyle {
	/**
	 * Returns the value of the '<em><b>Boolean Style Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.qls.model.qls.BooleanStyleKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Style Kind</em>' attribute.
	 * @see org.gemoc.qls.model.qls.BooleanStyleKind
	 * @see #setBooleanStyleKind(BooleanStyleKind)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getBooleanTypeStyle_BooleanStyleKind()
	 * @model
	 * @generated
	 */
	BooleanStyleKind getBooleanStyleKind();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.BooleanTypeStyle#getBooleanStyleKind <em>Boolean Style Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Style Kind</em>' attribute.
	 * @see org.gemoc.qls.model.qls.BooleanStyleKind
	 * @see #getBooleanStyleKind()
	 * @generated
	 */
	void setBooleanStyleKind(BooleanStyleKind value);

} // BooleanTypeStyle
