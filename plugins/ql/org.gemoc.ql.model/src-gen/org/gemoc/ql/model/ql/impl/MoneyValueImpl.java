/**
 */
package org.gemoc.ql.model.ql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.ql.model.ql.MoneyValue;
import org.gemoc.ql.model.ql.QlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Money Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.impl.MoneyValueImpl#getMoneyValue <em>Money Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoneyValueImpl extends ValueImpl implements MoneyValue {
	/**
	 * The default value of the '{@link #getMoneyValue() <em>Money Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoneyValue()
	 * @generated
	 * @ordered
	 */
	protected static final float MONEY_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMoneyValue() <em>Money Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoneyValue()
	 * @generated
	 * @ordered
	 */
	protected float moneyValue = MONEY_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoneyValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlPackage.Literals.MONEY_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMoneyValue() {
		return moneyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoneyValue(float newMoneyValue) {
		float oldMoneyValue = moneyValue;
		moneyValue = newMoneyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.MONEY_VALUE__MONEY_VALUE, oldMoneyValue,
					moneyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QlPackage.MONEY_VALUE__MONEY_VALUE:
			return getMoneyValue();
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
		case QlPackage.MONEY_VALUE__MONEY_VALUE:
			setMoneyValue((Float) newValue);
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
		case QlPackage.MONEY_VALUE__MONEY_VALUE:
			setMoneyValue(MONEY_VALUE_EDEFAULT);
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
		case QlPackage.MONEY_VALUE__MONEY_VALUE:
			return moneyValue != MONEY_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (moneyValue: ");
		result.append(moneyValue);
		result.append(')');
		return result.toString();
	}

} //MoneyValueImpl
