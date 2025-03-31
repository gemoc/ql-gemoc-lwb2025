/**
 */
package org.gemoc.ql.model.ql;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.Form#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends NamedElement, ConditionnalElement {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ql.model.ql.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see org.gemoc.ql.model.ql.QlPackage#getForm_Questions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestions();

} // Form
