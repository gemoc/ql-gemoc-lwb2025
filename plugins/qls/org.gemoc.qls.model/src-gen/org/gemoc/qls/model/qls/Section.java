/**
 */
package org.gemoc.qls.model.qls;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.Section#getTitle <em>Title</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.Section#getSectionContents <em>Section Contents</em>}</li>
 * </ul>
 *
 * @see org.gemoc.qls.model.qls.QlsPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends SectionContent {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getSection_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.Section#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Section Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.qls.model.qls.SectionContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section Contents</em>' containment reference list.
	 * @see org.gemoc.qls.model.qls.QlsPackage#getSection_SectionContents()
	 * @model containment="true"
	 * @generated
	 */
	EList<SectionContent> getSectionContents();

} // Section
