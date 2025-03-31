/**
 */
package org.gemoc.ql.model.ql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.ql.model.ql.ConditionnalElement;
import org.gemoc.ql.model.ql.DataType;
import org.gemoc.ql.model.ql.Expression;
import org.gemoc.ql.model.ql.QlPackage;
import org.gemoc.ql.model.ql.Question;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QuestionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QuestionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QuestionImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QuestionImpl#getComputedExpression <em>Computed Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends NamedElementImpl implements Question {
	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected Expression guard;

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
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected DataType datatype;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(Expression newGuard, NotificationChain msgs) {
		Expression oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QlPackage.QUESTION__GUARD,
					oldGuard, newGuard);
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
	public void setGuard(Expression newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject) guard).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.QUESTION__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject) newGuard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.QUESTION__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.QUESTION__GUARD, newGuard, newGuard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.QUESTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDatatype() {
		if (datatype != null && datatype.eIsProxy()) {
			InternalEObject oldDatatype = (InternalEObject) datatype;
			datatype = (DataType) eResolveProxy(oldDatatype);
			if (datatype != oldDatatype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QlPackage.QUESTION__DATATYPE, oldDatatype,
							datatype));
			}
		}
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatatype(DataType newDatatype) {
		DataType oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.QUESTION__DATATYPE, oldDatatype, datatype));
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
					QlPackage.QUESTION__COMPUTED_EXPRESSION, oldComputedExpression, newComputedExpression);
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
						EOPPOSITE_FEATURE_BASE - QlPackage.QUESTION__COMPUTED_EXPRESSION, null, msgs);
			if (newComputedExpression != null)
				msgs = ((InternalEObject) newComputedExpression).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.QUESTION__COMPUTED_EXPRESSION, null, msgs);
			msgs = basicSetComputedExpression(newComputedExpression, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.QUESTION__COMPUTED_EXPRESSION,
					newComputedExpression, newComputedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QlPackage.QUESTION__GUARD:
			return basicSetGuard(null, msgs);
		case QlPackage.QUESTION__COMPUTED_EXPRESSION:
			return basicSetComputedExpression(null, msgs);
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
		case QlPackage.QUESTION__GUARD:
			return getGuard();
		case QlPackage.QUESTION__LABEL:
			return getLabel();
		case QlPackage.QUESTION__DATATYPE:
			if (resolve)
				return getDatatype();
			return basicGetDatatype();
		case QlPackage.QUESTION__COMPUTED_EXPRESSION:
			return getComputedExpression();
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
		case QlPackage.QUESTION__GUARD:
			setGuard((Expression) newValue);
			return;
		case QlPackage.QUESTION__LABEL:
			setLabel((String) newValue);
			return;
		case QlPackage.QUESTION__DATATYPE:
			setDatatype((DataType) newValue);
			return;
		case QlPackage.QUESTION__COMPUTED_EXPRESSION:
			setComputedExpression((Expression) newValue);
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
		case QlPackage.QUESTION__GUARD:
			setGuard((Expression) null);
			return;
		case QlPackage.QUESTION__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case QlPackage.QUESTION__DATATYPE:
			setDatatype((DataType) null);
			return;
		case QlPackage.QUESTION__COMPUTED_EXPRESSION:
			setComputedExpression((Expression) null);
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
		case QlPackage.QUESTION__GUARD:
			return guard != null;
		case QlPackage.QUESTION__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case QlPackage.QUESTION__DATATYPE:
			return datatype != null;
		case QlPackage.QUESTION__COMPUTED_EXPRESSION:
			return computedExpression != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ConditionnalElement.class) {
			switch (derivedFeatureID) {
			case QlPackage.QUESTION__GUARD:
				return QlPackage.CONDITIONNAL_ELEMENT__GUARD;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ConditionnalElement.class) {
			switch (baseFeatureID) {
			case QlPackage.CONDITIONNAL_ELEMENT__GUARD:
				return QlPackage.QUESTION__GUARD;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
