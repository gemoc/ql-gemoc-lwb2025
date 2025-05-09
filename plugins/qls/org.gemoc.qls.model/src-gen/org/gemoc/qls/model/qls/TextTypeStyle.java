/**
 */
package org.gemoc.qls.model.qls;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Type Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.TextTypeStyle#isMultiline <em>Multiline</em>}</li>
 * </ul>
 *
 * @see org.gemoc.qls.model.qls.QlsPackage#getTextTypeStyle()
 * @model
 * @generated
 */
public interface TextTypeStyle extends TypeStyle {
	/**
	 * Returns the value of the '<em><b>Multiline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiline</em>' attribute.
	 * @see #setMultiline(boolean)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getTextTypeStyle_Multiline()
	 * @model
	 * @generated
	 */
	boolean isMultiline();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.TextTypeStyle#isMultiline <em>Multiline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiline</em>' attribute.
	 * @see #isMultiline()
	 * @generated
	 */
	void setMultiline(boolean value);

} // TextTypeStyle
