/**
 */
package org.gemoc.ql.model.ql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.ql.model.ql.QlPackage;
import org.gemoc.ql.model.ql.Question;
import org.gemoc.ql.model.ql.QuestionGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QuestionGroupImpl#getQuestionGroups <em>Question Groups</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QuestionGroupImpl#getQuestions <em>Questions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionGroupImpl extends ConditionnalElementImpl implements QuestionGroup {
	/**
	 * The cached value of the '{@link #getQuestionGroups() <em>Question Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionGroup> questionGroups;

	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> questions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlPackage.Literals.QUESTION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuestionGroup> getQuestionGroups() {
		if (questionGroups == null) {
			questionGroups = new EObjectContainmentEList<QuestionGroup>(QuestionGroup.class, this,
					QlPackage.QUESTION_GROUP__QUESTION_GROUPS);
		}
		return questionGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Question> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<Question>(Question.class, this,
					QlPackage.QUESTION_GROUP__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QlPackage.QUESTION_GROUP__QUESTION_GROUPS:
			return ((InternalEList<?>) getQuestionGroups()).basicRemove(otherEnd, msgs);
		case QlPackage.QUESTION_GROUP__QUESTIONS:
			return ((InternalEList<?>) getQuestions()).basicRemove(otherEnd, msgs);
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
		case QlPackage.QUESTION_GROUP__QUESTION_GROUPS:
			return getQuestionGroups();
		case QlPackage.QUESTION_GROUP__QUESTIONS:
			return getQuestions();
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
		case QlPackage.QUESTION_GROUP__QUESTION_GROUPS:
			getQuestionGroups().clear();
			getQuestionGroups().addAll((Collection<? extends QuestionGroup>) newValue);
			return;
		case QlPackage.QUESTION_GROUP__QUESTIONS:
			getQuestions().clear();
			getQuestions().addAll((Collection<? extends Question>) newValue);
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
		case QlPackage.QUESTION_GROUP__QUESTION_GROUPS:
			getQuestionGroups().clear();
			return;
		case QlPackage.QUESTION_GROUP__QUESTIONS:
			getQuestions().clear();
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
		case QlPackage.QUESTION_GROUP__QUESTION_GROUPS:
			return questionGroups != null && !questionGroups.isEmpty();
		case QlPackage.QUESTION_GROUP__QUESTIONS:
			return questions != null && !questions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionGroupImpl
