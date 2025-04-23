/**
 */
package org.gemoc.ql.model.ql.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.ql.model.ql.EnumerationLiteral;
import org.gemoc.ql.model.ql.EnumerationValue;
import org.gemoc.ql.model.ql.QlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.impl.EnumerationValueImpl#getEnumerationLiteral <em>Enumeration Literal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationValueImpl extends CallImpl implements EnumerationValue {
	/**
	 * The cached value of the '{@link #getEnumerationLiteral() <em>Enumeration Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumerationLiteral enumerationLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlPackage.Literals.ENUMERATION_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationLiteral getEnumerationLiteral() {
		if (enumerationLiteral != null && enumerationLiteral.eIsProxy()) {
			InternalEObject oldEnumerationLiteral = (InternalEObject) enumerationLiteral;
			enumerationLiteral = (EnumerationLiteral) eResolveProxy(oldEnumerationLiteral);
			if (enumerationLiteral != oldEnumerationLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QlPackage.ENUMERATION_VALUE__ENUMERATION_LITERAL, oldEnumerationLiteral,
							enumerationLiteral));
			}
		}
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral basicGetEnumerationLiteral() {
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumerationLiteral(EnumerationLiteral newEnumerationLiteral) {
		EnumerationLiteral oldEnumerationLiteral = enumerationLiteral;
		enumerationLiteral = newEnumerationLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.ENUMERATION_VALUE__ENUMERATION_LITERAL,
					oldEnumerationLiteral, enumerationLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QlPackage.ENUMERATION_VALUE__ENUMERATION_LITERAL:
			if (resolve)
				return getEnumerationLiteral();
			return basicGetEnumerationLiteral();
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
		case QlPackage.ENUMERATION_VALUE__ENUMERATION_LITERAL:
			setEnumerationLiteral((EnumerationLiteral) newValue);
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
		case QlPackage.ENUMERATION_VALUE__ENUMERATION_LITERAL:
			setEnumerationLiteral((EnumerationLiteral) null);
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
		case QlPackage.ENUMERATION_VALUE__ENUMERATION_LITERAL:
			return enumerationLiteral != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationValueImpl
