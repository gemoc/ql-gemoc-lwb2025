/**
 */
package org.gemoc.ql.model.ql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QL Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.QLModel#getForms <em>Forms</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.QLModel#getDefinitionGroup <em>Definition Group</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getQLModel()
 * @model
 * @generated
 */
public interface QLModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ql.model.ql.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see org.gemoc.ql.model.ql.QlPackage#getQLModel_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getForms();

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

} // QLModel
