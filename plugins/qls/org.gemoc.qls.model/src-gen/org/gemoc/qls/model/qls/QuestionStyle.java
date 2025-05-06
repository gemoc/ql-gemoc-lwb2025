/**
 */
package org.gemoc.qls.model.qls;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.ql.model.ql.QuestionDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.QuestionStyle#getStyledQuestion <em>Styled Question</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.QuestionStyle#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.QuestionStyle#getTypeStyle <em>Type Style</em>}</li>
 * </ul>
 *
 * @see org.gemoc.qls.model.qls.QlsPackage#getQuestionStyle()
 * @model
 * @generated
 */
public interface QuestionStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Styled Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styled Question</em>' reference.
	 * @see #setStyledQuestion(QuestionDefinition)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getQuestionStyle_StyledQuestion()
	 * @model required="true"
	 * @generated
	 */
	QuestionDefinition getStyledQuestion();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.QuestionStyle#getStyledQuestion <em>Styled Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Styled Question</em>' reference.
	 * @see #getStyledQuestion()
	 * @generated
	 */
	void setStyledQuestion(QuestionDefinition value);

	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style</em>' reference.
	 * @see #setLabelStyle(LabelStyle)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getQuestionStyle_LabelStyle()
	 * @model
	 * @generated
	 */
	LabelStyle getLabelStyle();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.QuestionStyle#getLabelStyle <em>Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Style</em>' reference.
	 * @see #getLabelStyle()
	 * @generated
	 */
	void setLabelStyle(LabelStyle value);

	/**
	 * Returns the value of the '<em><b>Type Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Style</em>' containment reference.
	 * @see #setTypeStyle(TypeStyle)
	 * @see org.gemoc.qls.model.qls.QlsPackage#getQuestionStyle_TypeStyle()
	 * @model containment="true"
	 * @generated
	 */
	TypeStyle getTypeStyle();

	/**
	 * Sets the value of the '{@link org.gemoc.qls.model.qls.QuestionStyle#getTypeStyle <em>Type Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Style</em>' containment reference.
	 * @see #getTypeStyle()
	 * @generated
	 */
	void setTypeStyle(TypeStyle value);

} // QuestionStyle
