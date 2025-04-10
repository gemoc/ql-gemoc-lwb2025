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
 *   <li>{@link org.gemoc.ql.model.ql.QLModel#isCanSubmit <em>Can Submit</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Can Submit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Submit</em>' attribute.
	 * @see #setCanSubmit(boolean)
	 * @see org.gemoc.ql.model.ql.QlPackage#getQLModel_CanSubmit()
	 * @model
	 * @generated
	 */
	boolean isCanSubmit();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.QLModel#isCanSubmit <em>Can Submit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Submit</em>' attribute.
	 * @see #isCanSubmit()
	 * @generated
	 */
	void setCanSubmit(boolean value);

} // QLModel
