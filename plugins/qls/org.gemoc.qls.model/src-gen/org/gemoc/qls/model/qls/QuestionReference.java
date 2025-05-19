/**
 */
package org.gemoc.qls.model.qls;

import org.gemoc.ql.model.ql.QuestionDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.QuestionReference#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see org.gemoc.qls.model.qls.QlsPackage#getQuestionReference()
 * @model
 * @generated
 */
public interface QuestionReference extends SectionContent {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' reference.
	 * @see #setQuestion(QuestionDefinition)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getQuestionReference_Question()
	 * @model required="true"
	 * @generated
	 */
	QuestionDefinition getQuestion();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.QuestionReference#getQuestion <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(QuestionDefinition value);

} // QuestionReference
