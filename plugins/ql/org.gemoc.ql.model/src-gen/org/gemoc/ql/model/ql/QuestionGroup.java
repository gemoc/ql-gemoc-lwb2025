/**
 */
package org.gemoc.ql.model.ql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.QuestionGroup#getQuestionGroups <em>Question Groups</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.QuestionGroup#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getQuestionGroup()
 * @model
 * @generated
 */
public interface QuestionGroup extends ConditionnalElement {
	/**
	 * Returns the value of the '<em><b>Question Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ql.model.ql.QuestionGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Groups</em>' containment reference list.
	 * @see org.gemoc.ql.model.ql.QlPackage#getQuestionGroup_QuestionGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionGroup> getQuestionGroups();

	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ql.model.ql.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see org.gemoc.ql.model.ql.QlPackage#getQuestionGroup_Questions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestions();

} // QuestionGroup
