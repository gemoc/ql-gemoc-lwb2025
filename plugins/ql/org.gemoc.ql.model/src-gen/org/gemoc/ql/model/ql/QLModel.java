/**
 */
package org.gemoc.ql.model.ql;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QL Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.QLModel#getDefinitionGroup <em>Definition Group</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.QLModel#isCanSubmit <em>Can Submit</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.QLModel#getSubmitDate <em>Submit Date</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.QLModel#getQuestionGroups <em>Question Groups</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getQLModel()
 * @model
 * @generated
 */
public interface QLModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Definition Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ql.model.ql.DefinitionGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Group</em>' containment reference list.
	 * @see org.gemoc.ql.model.ql.QlPackage#getQLModel_DefinitionGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<DefinitionGroup> getDefinitionGroup();

	/**
	 * Returns the value of the '<em><b>Can Submit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Submit</em>' attribute.
	 * @see #setCanSubmit(boolean)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQLModel_CanSubmit()
	 * @model annotation="aspect"
	 * @generated
	 */
	boolean isCanSubmit();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.QLModel#isCanSubmit <em>Can Submit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Submit</em>' attribute.
	 * @see #isCanSubmit()
	 * @generated
	 */
	void setCanSubmit(boolean value);

	/**
	 * Returns the value of the '<em><b>Submit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submit Date</em>' attribute.
	 * @see #setSubmitDate(Date)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQLModel_SubmitDate()
	 * @model annotation="aspect"
	 * @generated
	 */
	Date getSubmitDate();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.QLModel#getSubmitDate <em>Submit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submit Date</em>' attribute.
	 * @see #getSubmitDate()
	 * @generated
	 */
	void setSubmitDate(Date value);

	/**
	 * Returns the value of the '<em><b>Question Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ql.model.ql.QuestionGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Groups</em>' containment reference list.
	 * @see org.gemoc.ql.model.ql.QlPackage#getQLModel_QuestionGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionGroup> getQuestionGroups();

} // QLModel
