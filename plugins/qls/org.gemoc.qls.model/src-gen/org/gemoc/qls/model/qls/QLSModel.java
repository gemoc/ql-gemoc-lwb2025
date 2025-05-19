/**
 */
package org.gemoc.qls.model.qls;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.ql.model.ql.QLModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QLS Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.QLSModel#getImports <em>Imports</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.QLSModel#getQuestionStyles <em>Question Styles</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.QLSModel#getStyledQLModel <em>Styled QL Model</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.QLSModel#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @see org.gemoc.qls.model.qls.QlsPackage#getQLSModel()
 * @model
 * @generated
 */
public interface QLSModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.qls.model.qls.Import}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.gemoc.qls.model.qls.QlsPackage#getQLSModel_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Question Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.qls.model.qls.QuestionStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Styles</em>' containment reference list.
	 * @see org.gemoc.qls.model.qls.QlsPackage#getQLSModel_QuestionStyles()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionStyle> getQuestionStyles();

	/**
	 * Returns the value of the '<em><b>Styled QL Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styled QL Model</em>' reference.
	 * @see #setStyledQLModel(QLModel)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getQLSModel_StyledQLModel()
	 * @model required="true"
	 * @generated
	 */
	QLModel getStyledQLModel();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.QLSModel#getStyledQLModel <em>Styled QL Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Styled QL Model</em>' reference.
	 * @see #getStyledQLModel()
	 * @generated
	 */
	void setStyledQLModel(QLModel value);

	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.qls.model.qls.Section}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see org.gemoc.qls.model.qls.QlsPackage#getQLSModel_Sections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Section> getSections();

} // QLSModel
