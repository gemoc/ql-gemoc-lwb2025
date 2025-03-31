/**
 */
package org.gemoc.ql.model.ql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.ql.model.ql.BinaryExpression;
import org.gemoc.ql.model.ql.Expression;
import org.gemoc.ql.model.ql.QlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.impl.BinaryExpressionImpl#getLhsOperand <em>Lhs Operand</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.BinaryExpressionImpl#getRhsOperand <em>Rhs Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The cached value of the '{@link #getLhsOperand() <em>Lhs Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhsOperand()
	 * @generated
	 * @ordered
	 */
	protected Expression lhsOperand;

	/**
	 * The cached value of the '{@link #getRhsOperand() <em>Rhs Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhsOperand()
	 * @generated
	 * @ordered
	 */
	protected Expression rhsOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLhsOperand() {
		return lhsOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhsOperand(Expression newLhsOperand, NotificationChain msgs) {
		Expression oldLhsOperand = lhsOperand;
		lhsOperand = newLhsOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QlPackage.BINARY_EXPRESSION__LHS_OPERAND, oldLhsOperand, newLhsOperand);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLhsOperand(Expression newLhsOperand) {
		if (newLhsOperand != lhsOperand) {
			NotificationChain msgs = null;
			if (lhsOperand != null)
				msgs = ((InternalEObject) lhsOperand).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.BINARY_EXPRESSION__LHS_OPERAND, null, msgs);
			if (newLhsOperand != null)
				msgs = ((InternalEObject) newLhsOperand).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.BINARY_EXPRESSION__LHS_OPERAND, null, msgs);
			msgs = basicSetLhsOperand(newLhsOperand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.BINARY_EXPRESSION__LHS_OPERAND,
					newLhsOperand, newLhsOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getRhsOperand() {
		return rhsOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhsOperand(Expression newRhsOperand, NotificationChain msgs) {
		Expression oldRhsOperand = rhsOperand;
		rhsOperand = newRhsOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QlPackage.BINARY_EXPRESSION__RHS_OPERAND, oldRhsOperand, newRhsOperand);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRhsOperand(Expression newRhsOperand) {
		if (newRhsOperand != rhsOperand) {
			NotificationChain msgs = null;
			if (rhsOperand != null)
				msgs = ((InternalEObject) rhsOperand).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.BINARY_EXPRESSION__RHS_OPERAND, null, msgs);
			if (newRhsOperand != null)
				msgs = ((InternalEObject) newRhsOperand).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.BINARY_EXPRESSION__RHS_OPERAND, null, msgs);
			msgs = basicSetRhsOperand(newRhsOperand, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.BINARY_EXPRESSION__RHS_OPERAND,
					newRhsOperand, newRhsOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QlPackage.BINARY_EXPRESSION__LHS_OPERAND:
			return basicSetLhsOperand(null, msgs);
		case QlPackage.BINARY_EXPRESSION__RHS_OPERAND:
			return basicSetRhsOperand(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QlPackage.BINARY_EXPRESSION__LHS_OPERAND:
			return getLhsOperand();
		case QlPackage.BINARY_EXPRESSION__RHS_OPERAND:
			return getRhsOperand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QlPackage.BINARY_EXPRESSION__LHS_OPERAND:
			setLhsOperand((Expression) newValue);
			return;
		case QlPackage.BINARY_EXPRESSION__RHS_OPERAND:
			setRhsOperand((Expression) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QlPackage.BINARY_EXPRESSION__LHS_OPERAND:
			setLhsOperand((Expression) null);
			return;
		case QlPackage.BINARY_EXPRESSION__RHS_OPERAND:
			setRhsOperand((Expression) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QlPackage.BINARY_EXPRESSION__LHS_OPERAND:
			return lhsOperand != null;
		case QlPackage.BINARY_EXPRESSION__RHS_OPERAND:
			return rhsOperand != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryExpressionImpl
