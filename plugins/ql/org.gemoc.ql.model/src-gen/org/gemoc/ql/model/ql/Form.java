/**
 */
package org.gemoc.ql.model.ql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.Form#getQuestionGroup <em>Question Group</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Question Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Group</em>' containment reference.
	 * @see #setQuestionGroup(QuestionGroup)
	 * @see org.gemoc.ql.model.ql.QlPackage#getForm_QuestionGroup()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QuestionGroup getQuestionGroup();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.Form#getQuestionGroup <em>Question Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Group</em>' containment reference.
	 * @see #getQuestionGroup()
	 * @generated
	 */
	void setQuestionGroup(QuestionGroup value);

} // Form
