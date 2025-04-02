/**
 */
package org.gemoc.ql.model.ql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Question represents the application of a QuestionDefinition in a given form
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.Question#getQuestionDefinition <em>Question Definition</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Question Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Definition</em>' reference.
	 * @see #setQuestionDefinition(QuestionDefinition)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQuestion_QuestionDefinition()
	 * @model required="true"
	 * @generated
	 */
	QuestionDefinition getQuestionDefinition();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.Question#getQuestionDefinition <em>Question Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Definition</em>' reference.
	 * @see #getQuestionDefinition()
	 * @generated
	 */
	void setQuestionDefinition(QuestionDefinition value);

} // Question
