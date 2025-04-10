/**
 */
package org.gemoc.ql.model.ql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.QuestionDefinition#getLabel <em>Label</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.QuestionDefinition#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.QuestionDefinition#getComputedExpression <em>Computed Expression</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.QuestionDefinition#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.QuestionDefinition#isIsDisplayed <em>Is Displayed</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getQuestionDefinition()
 * @model
 * @generated
 */
public interface QuestionDefinition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQuestionDefinition_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.QuestionDefinition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(ValueType)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQuestionDefinition_DataType()
	 * @model required="true"
	 * @generated
	 */
	ValueType getDataType();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.QuestionDefinition#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(ValueType value);

	/**
	 * Returns the value of the '<em><b>Computed Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Expression</em>' containment reference.
	 * @see #setComputedExpression(Expression)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQuestionDefinition_ComputedExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getComputedExpression();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.QuestionDefinition#getComputedExpression <em>Computed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Expression</em>' containment reference.
	 * @see #getComputedExpression()
	 * @generated
	 */
	void setComputedExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' containment reference.
	 * @see #setCurrentValue(Value)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQuestionDefinition_CurrentValue()
	 * @model containment="true"
	 *        annotation="aspect"
	 * @generated
	 */
	Value getCurrentValue();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.QuestionDefinition#getCurrentValue <em>Current Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' containment reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(Value value);

	/**
	 * Returns the value of the '<em><b>Is Displayed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Displayed</em>' attribute.
	 * @see #setIsDisplayed(boolean)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQuestionDefinition_IsDisplayed()
	 * @model annotation="aspect"
	 * @generated
	 */
	boolean isIsDisplayed();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.QuestionDefinition#isIsDisplayed <em>Is Displayed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Displayed</em>' attribute.
	 * @see #isIsDisplayed()
	 * @generated
	 */
	void setIsDisplayed(boolean value);

} // QuestionDefinition
