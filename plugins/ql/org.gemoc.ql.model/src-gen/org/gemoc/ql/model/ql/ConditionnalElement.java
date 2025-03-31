/**
 */
package org.gemoc.ql.model.ql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditionnal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.ConditionnalElement#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @see org.gemoc.ql.model.ql.QlPackage#getConditionnalElement()
 * @model abstract="true"
 * @generated
 */
public interface ConditionnalElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Expression)
	 * @see org.gemoc.ql.model.ql.QlPackage#getConditionnalElement_Guard()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getGuard();

	/**
	 * Sets the value of the '{@link org.gemoc.ql.model.ql.ConditionnalElement#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Expression value);

} // ConditionnalElement
