/**
 */
package org.gemoc.ql.model.ql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.DefinitionGroup#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.DefinitionGroup#getQuestionDefinitions <em>Question Definitions</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getDefinitionGroup()
 * @model
 * @generated
 */
public interface DefinitionGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ql.model.ql.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see org.gemoc.ql.model.ql.QlPackage#getDefinitionGroup_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

	/**
	 * Returns the value of the '<em><b>Question Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ql.model.ql.QuestionDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Definitions</em>' containment reference list.
	 * @see org.gemoc.ql.model.ql.QlPackage#getDefinitionGroup_QuestionDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuestionDefinition> getQuestionDefinitions();

} // DefinitionGroup
