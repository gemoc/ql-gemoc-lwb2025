/**
 */
package org.gemoc.ql.model.ql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.ql.model.ql.Expression;
import org.gemoc.ql.model.ql.QlPackage;
import org.gemoc.ql.model.ql.QuestionDefinition;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QuestionDefinitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QuestionDefinitionImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QuestionDefinitionImpl#getComputedExpression <em>Computed Expression</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QuestionDefinitionImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QuestionDefinitionImpl#isIsDisplayed <em>Is Displayed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionDefinitionImpl extends NamedElementImpl implements QuestionDefinition {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected ValueType dataType;

	/**
	 * The cached value of the '{@link #getComputedExpression() <em>Computed Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputedExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression computedExpression;

	/**
	 * The cached value of the '{@link #getCurrentValue() <em>Current Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentValue()
	 * @generated
	 * @ordered
	 */
	protected Value currentValue;

	/**
	 * The default value of the '{@link #isIsDisplayed() <em>Is Displayed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DISPLAYED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDisplayed() <em>Is Displayed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDisplayed()
	 * @generated
	 * @ordered
	 */
	protected boolean isDisplayed = IS_DISPLAYED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlPackage.Literals.QUESTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.QUESTION_DEFINITION__LABEL, oldLabel,
					label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueType getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject) dataType;
			dataType = (ValueType) eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QlPackage.QUESTION_DEFINITION__DATA_TYPE,
							oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(ValueType newDataType) {
		ValueType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.QUESTION_DEFINITION__DATA_TYPE, oldDataType,
					dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getComputedExpression() {
		return computedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComputedExpression(Expression newComputedExpression, NotificationChain msgs) {
		Expression oldComputedExpression = computedExpression;
		computedExpression = newComputedExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QlPackage.QUESTION_DEFINITION__COMPUTED_EXPRESSION, oldComputedExpression, newComputedExpression);
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
	public void setComputedExpression(Expression newComputedExpression) {
		if (newComputedExpression != computedExpression) {
			NotificationChain msgs = null;
			if (computedExpression != null)
				msgs = ((InternalEObject) computedExpression).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.QUESTION_DEFINITION__COMPUTED_EXPRESSION, null, msgs);
			if (newComputedExpression != null)
				msgs = ((InternalEObject) newComputedExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.QUESTION_DEFINITION__COMPUTED_EXPRESSION, null, msgs);
			msgs = basicSetComputedExpression(newComputedExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.QUESTION_DEFINITION__COMPUTED_EXPRESSION,
					newComputedExpression, newComputedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value getCurrentValue() {
		return currentValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentValue(Value newCurrentValue, NotificationChain msgs) {
		Value oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QlPackage.QUESTION_DEFINITION__CURRENT_VALUE, oldCurrentValue, newCurrentValue);
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
	public void setCurrentValue(Value newCurrentValue) {
		if (newCurrentValue != currentValue) {
			NotificationChain msgs = null;
			if (currentValue != null)
				msgs = ((InternalEObject) currentValue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.QUESTION_DEFINITION__CURRENT_VALUE, null, msgs);
			if (newCurrentValue != null)
				msgs = ((InternalEObject) newCurrentValue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.QUESTION_DEFINITION__CURRENT_VALUE, null, msgs);
			msgs = basicSetCurrentValue(newCurrentValue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.QUESTION_DEFINITION__CURRENT_VALUE,
					newCurrentValue, newCurrentValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDisplayed() {
		return isDisplayed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDisplayed(boolean newIsDisplayed) {
		boolean oldIsDisplayed = isDisplayed;
		isDisplayed = newIsDisplayed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.QUESTION_DEFINITION__IS_DISPLAYED,
					oldIsDisplayed, isDisplayed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QlPackage.QUESTION_DEFINITION__COMPUTED_EXPRESSION:
			return basicSetComputedExpression(null, msgs);
		case QlPackage.QUESTION_DEFINITION__CURRENT_VALUE:
			return basicSetCurrentValue(null, msgs);
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
		case QlPackage.QUESTION_DEFINITION__LABEL:
			return getLabel();
		case QlPackage.QUESTION_DEFINITION__DATA_TYPE:
			if (resolve)
				return getDataType();
			return basicGetDataType();
		case QlPackage.QUESTION_DEFINITION__COMPUTED_EXPRESSION:
			return getComputedExpression();
		case QlPackage.QUESTION_DEFINITION__CURRENT_VALUE:
			return getCurrentValue();
		case QlPackage.QUESTION_DEFINITION__IS_DISPLAYED:
			return isIsDisplayed();
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
		case QlPackage.QUESTION_DEFINITION__LABEL:
			setLabel((String) newValue);
			return;
		case QlPackage.QUESTION_DEFINITION__DATA_TYPE:
			setDataType((ValueType) newValue);
			return;
		case QlPackage.QUESTION_DEFINITION__COMPUTED_EXPRESSION:
			setComputedExpression((Expression) newValue);
			return;
		case QlPackage.QUESTION_DEFINITION__CURRENT_VALUE:
			setCurrentValue((Value) newValue);
			return;
		case QlPackage.QUESTION_DEFINITION__IS_DISPLAYED:
			setIsDisplayed((Boolean) newValue);
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
		case QlPackage.QUESTION_DEFINITION__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case QlPackage.QUESTION_DEFINITION__DATA_TYPE:
			setDataType((ValueType) null);
			return;
		case QlPackage.QUESTION_DEFINITION__COMPUTED_EXPRESSION:
			setComputedExpression((Expression) null);
			return;
		case QlPackage.QUESTION_DEFINITION__CURRENT_VALUE:
			setCurrentValue((Value) null);
			return;
		case QlPackage.QUESTION_DEFINITION__IS_DISPLAYED:
			setIsDisplayed(IS_DISPLAYED_EDEFAULT);
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
		case QlPackage.QUESTION_DEFINITION__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case QlPackage.QUESTION_DEFINITION__DATA_TYPE:
			return dataType != null;
		case QlPackage.QUESTION_DEFINITION__COMPUTED_EXPRESSION:
			return computedExpression != null;
		case QlPackage.QUESTION_DEFINITION__CURRENT_VALUE:
			return currentValue != null;
		case QlPackage.QUESTION_DEFINITION__IS_DISPLAYED:
			return isDisplayed != IS_DISPLAYED_EDEFAULT;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", isDisplayed: ");
		result.append(isDisplayed);
		result.append(')');
		return result.toString();
	}

} //QuestionDefinitionImpl
