/**
 */
package org.gemoc.ql.model.ql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.TypeGroup#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getTypeGroup()
 * @model
 * @generated
 */
public interface TypeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.ql.model.ql.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see org.gemoc.ql.model.ql.QlPackage#getTypeGroup_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

} // TypeGroup
