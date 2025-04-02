/**
 */
package org.gemoc.ql.model.ql.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gemoc.ql.model.ql.Form;
import org.gemoc.ql.model.ql.QlPackage;
import org.gemoc.ql.model.ql.QuestionGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.impl.FormImpl#getQuestionGroup <em>Question Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends NamedElementImpl implements Form {
	/**
	 * The cached value of the '{@link #getQuestionGroup() <em>Question Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionGroup()
	 * @generated
	 * @ordered
	 */
	protected QuestionGroup questionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionGroup getQuestionGroup() {
		return questionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionGroup(QuestionGroup newQuestionGroup, NotificationChain msgs) {
		QuestionGroup oldQuestionGroup = questionGroup;
		questionGroup = newQuestionGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QlPackage.FORM__QUESTION_GROUP, oldQuestionGroup, newQuestionGroup);
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
	public void setQuestionGroup(QuestionGroup newQuestionGroup) {
		if (newQuestionGroup != questionGroup) {
			NotificationChain msgs = null;
			if (questionGroup != null)
				msgs = ((InternalEObject) questionGroup).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.FORM__QUESTION_GROUP, null, msgs);
			if (newQuestionGroup != null)
				msgs = ((InternalEObject) newQuestionGroup).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QlPackage.FORM__QUESTION_GROUP, null, msgs);
			msgs = basicSetQuestionGroup(newQuestionGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlPackage.FORM__QUESTION_GROUP, newQuestionGroup,
					newQuestionGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QlPackage.FORM__QUESTION_GROUP:
			return basicSetQuestionGroup(null, msgs);
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
		case QlPackage.FORM__QUESTION_GROUP:
			return getQuestionGroup();
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
		case QlPackage.FORM__QUESTION_GROUP:
			setQuestionGroup((QuestionGroup) newValue);
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
		case QlPackage.FORM__QUESTION_GROUP:
			setQuestionGroup((QuestionGroup) null);
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
		case QlPackage.FORM__QUESTION_GROUP:
			return questionGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //FormImpl
