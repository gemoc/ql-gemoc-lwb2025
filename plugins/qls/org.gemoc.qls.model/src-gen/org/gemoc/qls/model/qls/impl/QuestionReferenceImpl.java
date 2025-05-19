/**
 */
package org.gemoc.qls.model.qls.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.gemoc.ql.model.ql.QuestionDefinition;

import org.gemoc.qls.model.qls.QlsPackage;
import org.gemoc.qls.model.qls.QuestionReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.impl.QuestionReferenceImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionReferenceImpl extends SectionContentImpl implements QuestionReference {
	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected QuestionDefinition question;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlsPackage.Literals.QUESTION_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionDefinition getQuestion() {
		if (question != null && question.eIsProxy()) {
			InternalEObject oldQuestion = (InternalEObject) question;
			question = (QuestionDefinition) eResolveProxy(oldQuestion);
			if (question != oldQuestion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QlsPackage.QUESTION_REFERENCE__QUESTION,
							oldQuestion, question));
			}
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionDefinition basicGetQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestion(QuestionDefinition newQuestion) {
		QuestionDefinition oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlsPackage.QUESTION_REFERENCE__QUESTION, oldQuestion,
					question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QlsPackage.QUESTION_REFERENCE__QUESTION:
			if (resolve)
				return getQuestion();
			return basicGetQuestion();
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
		case QlsPackage.QUESTION_REFERENCE__QUESTION:
			setQuestion((QuestionDefinition) newValue);
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
		case QlsPackage.QUESTION_REFERENCE__QUESTION:
			setQuestion((QuestionDefinition) null);
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
		case QlsPackage.QUESTION_REFERENCE__QUESTION:
			return question != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionReferenceImpl
