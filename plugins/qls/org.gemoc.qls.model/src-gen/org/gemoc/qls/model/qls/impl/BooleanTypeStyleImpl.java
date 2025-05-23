/**
 */
package org.gemoc.qls.model.qls.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.qls.model.qls.BooleanStyleKind;
import org.gemoc.qls.model.qls.BooleanTypeStyle;
import org.gemoc.qls.model.qls.QlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Type Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.impl.BooleanTypeStyleImpl#getBooleanStyleKind <em>Boolean Style Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanTypeStyleImpl extends TypeStyleImpl implements BooleanTypeStyle {
	/**
	 * The default value of the '{@link #getBooleanStyleKind() <em>Boolean Style Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanStyleKind()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanStyleKind BOOLEAN_STYLE_KIND_EDEFAULT = BooleanStyleKind.CHECKBOX;

	/**
	 * The cached value of the '{@link #getBooleanStyleKind() <em>Boolean Style Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanStyleKind()
	 * @generated
	 * @ordered
	 */
	protected BooleanStyleKind booleanStyleKind = BOOLEAN_STYLE_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanTypeStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlsPackage.Literals.BOOLEAN_TYPE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanStyleKind getBooleanStyleKind() {
		return booleanStyleKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBooleanStyleKind(BooleanStyleKind newBooleanStyleKind) {
		BooleanStyleKind oldBooleanStyleKind = booleanStyleKind;
		booleanStyleKind = newBooleanStyleKind == null ? BOOLEAN_STYLE_KIND_EDEFAULT : newBooleanStyleKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlsPackage.BOOLEAN_TYPE_STYLE__BOOLEAN_STYLE_KIND,
					oldBooleanStyleKind, booleanStyleKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QlsPackage.BOOLEAN_TYPE_STYLE__BOOLEAN_STYLE_KIND:
			return getBooleanStyleKind();
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
		case QlsPackage.BOOLEAN_TYPE_STYLE__BOOLEAN_STYLE_KIND:
			setBooleanStyleKind((BooleanStyleKind) newValue);
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
		case QlsPackage.BOOLEAN_TYPE_STYLE__BOOLEAN_STYLE_KIND:
			setBooleanStyleKind(BOOLEAN_STYLE_KIND_EDEFAULT);
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
		case QlsPackage.BOOLEAN_TYPE_STYLE__BOOLEAN_STYLE_KIND:
			return booleanStyleKind != BOOLEAN_STYLE_KIND_EDEFAULT;
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
		result.append(" (booleanStyleKind: ");
		result.append(booleanStyleKind);
		result.append(')');
		return result.toString();
	}

} //BooleanTypeStyleImpl
