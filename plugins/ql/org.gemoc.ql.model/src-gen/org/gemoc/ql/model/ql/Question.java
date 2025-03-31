/**
 */
package org.gemoc.ql.model.ql;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.Question#getLabel <em>Label</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.Question#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.Question#getComputedExpression <em>Computed Expression</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends NamedElement, ConditionnalElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQuestion_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.Question#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DataType)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQuestion_Datatype()
	 * @model required="true"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.Question#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Computed Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computed Expression</em>' containment reference.
	 * @see #setComputedExpression(Expression)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQuestion_ComputedExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getComputedExpression();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.Question#getComputedExpression <em>Computed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computed Expression</em>' containment reference.
	 * @see #getComputedExpression()
	 * @generated
	 */
	void setComputedExpression(Expression value);

} // Question
