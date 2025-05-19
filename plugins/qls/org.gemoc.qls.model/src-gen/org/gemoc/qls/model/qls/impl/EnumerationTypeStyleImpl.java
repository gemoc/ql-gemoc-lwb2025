/**
 */
package org.gemoc.qls.model.qls.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.qls.model.qls.EnumerationStyleKind;
import org.gemoc.qls.model.qls.EnumerationTypeStyle;
import org.gemoc.qls.model.qls.QlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Type Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.impl.EnumerationTypeStyleImpl#getEnumerationStyleKing <em>Enumeration Style King</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationTypeStyleImpl extends TypeStyleImpl implements EnumerationTypeStyle {
	/**
	 * The default value of the '{@link #getEnumerationStyleKing() <em>Enumeration Style King</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationStyleKing()
	 * @generated
	 * @ordered
	 */
	protected static final EnumerationStyleKind ENUMERATION_STYLE_KING_EDEFAULT = EnumerationStyleKind.DROPDOWN;

	/**
	 * The cached value of the '{@link #getEnumerationStyleKing() <em>Enumeration Style King</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationStyleKing()
	 * @generated
	 * @ordered
	 */
	protected EnumerationStyleKind enumerationStyleKing = ENUMERATION_STYLE_KING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationTypeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlsPackage.Literals.ENUMERATION_TYPE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumerationStyleKind getEnumerationStyleKing() {
		return enumerationStyleKing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumerationStyleKing(EnumerationStyleKind newEnumerationStyleKing) {
		EnumerationStyleKind oldEnumerationStyleKing = enumerationStyleKing;
		enumerationStyleKing = newEnumerationStyleKing == null ? ENUMERATION_STYLE_KING_EDEFAULT
				: newEnumerationStyleKing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QlsPackage.ENUMERATION_TYPE_STYLE__ENUMERATION_STYLE_KING, oldEnumerationStyleKing,
					enumerationStyleKing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QlsPackage.ENUMERATION_TYPE_STYLE__ENUMERATION_STYLE_KING:
			return getEnumerationStyleKing();
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
		case QlsPackage.ENUMERATION_TYPE_STYLE__ENUMERATION_STYLE_KING:
			setEnumerationStyleKing((EnumerationStyleKind) newValue);
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
		case QlsPackage.ENUMERATION_TYPE_STYLE__ENUMERATION_STYLE_KING:
			setEnumerationStyleKing(ENUMERATION_STYLE_KING_EDEFAULT);
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
		case QlsPackage.ENUMERATION_TYPE_STYLE__ENUMERATION_STYLE_KING:
			return enumerationStyleKing != ENUMERATION_STYLE_KING_EDEFAULT;
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
		result.append(" (enumerationStyleKing: ");
		result.append(enumerationStyleKing);
		result.append(')');
		return result.toString();
	}

} //EnumerationTypeStyleImpl
