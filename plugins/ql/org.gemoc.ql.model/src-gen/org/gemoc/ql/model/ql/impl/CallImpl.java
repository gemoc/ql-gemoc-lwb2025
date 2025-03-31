/**
 */
package org.gemoc.ql.model.ql.impl;

import org.eclipse.emf.ecore.EClass;

import org.gemoc.ql.model.ql.Call;
import org.gemoc.ql.model.ql.QlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class CallImpl extends ExpressionImpl implements Call {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlPackage.Literals.CALL;
	}

} //CallImpl
