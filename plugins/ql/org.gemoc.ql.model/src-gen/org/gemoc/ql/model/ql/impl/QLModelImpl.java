/**
 */
package org.gemoc.ql.model.ql.impl;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.ql.model.ql.DefinitionGroup;
import org.gemoc.ql.model.ql.Form;
import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.ql.model.ql.QlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QL Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QLModelImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QLModelImpl#getDefinitionGroup <em>Definition Group</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QLModelImpl#isCanSubmit <em>Can Submit</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QLModelImpl#getSubmitDate <em>Submit Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QLModelImpl extends MinimalEObjectImpl.Container implements QLModel {
	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * The cached value of the '{@link #getDefinitionGroup() <em>Definition Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<DefinitionGroup> definitionGroup;

	/**
	 * The default value of the '{@link #isCanSubmit() <em>Can Submit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanSubmit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_SUBMIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanSubmit() <em>Can Submit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanSubmit()
	 * @generated
	 * @ordered
	 */
	protected boolean canSubmit = CAN_SUBMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmitDate() <em>Submit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SUBMIT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmitDate() <em>Submit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmitDate()
	 * @generated
	 * @ordered
	 */
	protected Date submitDate = SUBMIT_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QLModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlPackage.Literals.QL_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, QlPackage.QL_MODEL__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefinitionGroup> getDefinitionGroup() {
		if (definitionGroup == null) {
			definitionGroup = new EObjectContainmentEList<DefinitionGroup>(DefinitionGroup.class, this,
					QlPackage.QL_MODEL__DEFINITION_GROUP);
		}
		return definitionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCanSubmit() {
		return canSubmit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanSubmit(boolean newCanSubmit) {
		boolean oldCanSubmit = canSubmit;
		canSubmit = newCanSubmit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.QL_MODEL__CAN_SUBMIT, oldCanSubmit,
					canSubmit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getSubmitDate() {
		return submitDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubmitDate(Date newSubmitDate) {
		Date oldSubmitDate = submitDate;
		submitDate = newSubmitDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.QL_MODEL__SUBMIT_DATE, oldSubmitDate,
					submitDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QlPackage.QL_MODEL__FORMS:
			return ((InternalEList<?>) getForms()).basicRemove(otherEnd, msgs);
		case QlPackage.QL_MODEL__DEFINITION_GROUP:
			return ((InternalEList<?>) getDefinitionGroup()).basicRemove(otherEnd, msgs);
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
		case QlPackage.QL_MODEL__FORMS:
			return getForms();
		case QlPackage.QL_MODEL__DEFINITION_GROUP:
			return getDefinitionGroup();
		case QlPackage.QL_MODEL__CAN_SUBMIT:
			return isCanSubmit();
		case QlPackage.QL_MODEL__SUBMIT_DATE:
			return getSubmitDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QlPackage.QL_MODEL__FORMS:
			getForms().clear();
			getForms().addAll((Collection<? extends Form>) newValue);
			return;
		case QlPackage.QL_MODEL__DEFINITION_GROUP:
			getDefinitionGroup().clear();
			getDefinitionGroup().addAll((Collection<? extends DefinitionGroup>) newValue);
			return;
		case QlPackage.QL_MODEL__CAN_SUBMIT:
			setCanSubmit((Boolean) newValue);
			return;
		case QlPackage.QL_MODEL__SUBMIT_DATE:
			setSubmitDate((Date) newValue);
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
		case QlPackage.QL_MODEL__FORMS:
			getForms().clear();
			return;
		case QlPackage.QL_MODEL__DEFINITION_GROUP:
			getDefinitionGroup().clear();
			return;
		case QlPackage.QL_MODEL__CAN_SUBMIT:
			setCanSubmit(CAN_SUBMIT_EDEFAULT);
			return;
		case QlPackage.QL_MODEL__SUBMIT_DATE:
			setSubmitDate(SUBMIT_DATE_EDEFAULT);
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
		case QlPackage.QL_MODEL__FORMS:
			return forms != null && !forms.isEmpty();
		case QlPackage.QL_MODEL__DEFINITION_GROUP:
			return definitionGroup != null && !definitionGroup.isEmpty();
		case QlPackage.QL_MODEL__CAN_SUBMIT:
			return canSubmit != CAN_SUBMIT_EDEFAULT;
		case QlPackage.QL_MODEL__SUBMIT_DATE:
			return SUBMIT_DATE_EDEFAULT == null ? submitDate != null : !SUBMIT_DATE_EDEFAULT.equals(submitDate);
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
		result.append(" (canSubmit: ");
		result.append(canSubmit);
		result.append(", submitDate: ");
		result.append(submitDate);
		result.append(')');
		return result.toString();
	}

} //QLModelImpl
