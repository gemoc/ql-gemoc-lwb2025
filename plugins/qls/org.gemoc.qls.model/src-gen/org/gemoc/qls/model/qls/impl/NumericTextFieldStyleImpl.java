/**
 */
package org.gemoc.qls.model.qls.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.qls.model.qls.NumericTextFieldStyle;
import org.gemoc.qls.model.qls.QlsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Text Field Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.impl.NumericTextFieldStyleImpl#getStep <em>Step</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.impl.NumericTextFieldStyleImpl#isUseStep <em>Use Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericTextFieldStyleImpl extends NumericTypeStyleImpl implements NumericTextFieldStyle {
	/**
	 * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected static final double STEP_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected double step = STEP_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseStep() <em>Use Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseStep()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_STEP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseStep() <em>Use Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseStep()
	 * @generated
	 * @ordered
	 */
	protected boolean useStep = USE_STEP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NumericTextFieldStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlsPackage.Literals.NUMERIC_TEXT_FIELD_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStep(double newStep) {
		double oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlsPackage.NUMERIC_TEXT_FIELD_STYLE__STEP, oldStep,
					step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseStep() {
		return useStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseStep(boolean newUseStep) {
		boolean oldUseStep = useStep;
		useStep = newUseStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlsPackage.NUMERIC_TEXT_FIELD_STYLE__USE_STEP,
					oldUseStep, useStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QlsPackage.NUMERIC_TEXT_FIELD_STYLE__STEP:
			return getStep();
		case QlsPackage.NUMERIC_TEXT_FIELD_STYLE__USE_STEP:
			return isUseStep();
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
		case QlsPackage.NUMERIC_TEXT_FIELD_STYLE__STEP:
			setStep((Double) newValue);
			return;
		case QlsPackage.NUMERIC_TEXT_FIELD_STYLE__USE_STEP:
			setUseStep((Boolean) newValue);
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
		case QlsPackage.NUMERIC_TEXT_FIELD_STYLE__STEP:
			setStep(STEP_EDEFAULT);
			return;
		case QlsPackage.NUMERIC_TEXT_FIELD_STYLE__USE_STEP:
			setUseStep(USE_STEP_EDEFAULT);
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
		case QlsPackage.NUMERIC_TEXT_FIELD_STYLE__STEP:
			return step != STEP_EDEFAULT;
		case QlsPackage.NUMERIC_TEXT_FIELD_STYLE__USE_STEP:
			return useStep != USE_STEP_EDEFAULT;
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
		result.append(" (step: ");
		result.append(step);
		result.append(", useStep: ");
		result.append(useStep);
		result.append(')');
		return result.toString();
	}

} //NumericTextFieldStyleImpl
