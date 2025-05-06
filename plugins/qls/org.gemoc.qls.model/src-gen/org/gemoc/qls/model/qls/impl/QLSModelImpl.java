/**
 */
package org.gemoc.qls.model.qls.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.qls.model.qls.QLSModel;
import org.gemoc.qls.model.qls.QlsPackage;
import org.gemoc.qls.model.qls.QuestionStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QLS Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.impl.QLSModelImpl#getQuestionStyles <em>Question Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QLSModelImpl extends MinimalEObjectImpl.Container implements QLSModel {
	/**
	 * The cached value of the '{@link #getQuestionStyles() <em>Question Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionStyle> questionStyles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QLSModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlsPackage.Literals.QLS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuestionStyle> getQuestionStyles() {
		if (questionStyles == null) {
			questionStyles = new EObjectContainmentEList<QuestionStyle>(QuestionStyle.class, this,
					QlsPackage.QLS_MODEL__QUESTION_STYLES);
		}
		return questionStyles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QlsPackage.QLS_MODEL__QUESTION_STYLES:
			return ((InternalEList<?>) getQuestionStyles()).basicRemove(otherEnd, msgs);
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
		case QlsPackage.QLS_MODEL__QUESTION_STYLES:
			return getQuestionStyles();
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
		case QlsPackage.QLS_MODEL__QUESTION_STYLES:
			getQuestionStyles().clear();
			getQuestionStyles().addAll((Collection<? extends QuestionStyle>) newValue);
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
		case QlsPackage.QLS_MODEL__QUESTION_STYLES:
			getQuestionStyles().clear();
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
		case QlsPackage.QLS_MODEL__QUESTION_STYLES:
			return questionStyles != null && !questionStyles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QLSModelImpl
