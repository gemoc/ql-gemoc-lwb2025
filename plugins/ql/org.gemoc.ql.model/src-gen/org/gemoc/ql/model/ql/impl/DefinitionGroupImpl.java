/**
 */
package org.gemoc.ql.model.ql.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.ql.model.ql.DataType;
import org.gemoc.ql.model.ql.DefinitionGroup;
import org.gemoc.ql.model.ql.QlPackage;
import org.gemoc.ql.model.ql.QuestionDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.impl.DefinitionGroupImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.DefinitionGroupImpl#getQuestionDefinitions <em>Question Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionGroupImpl extends MinimalEObjectImpl.Container implements DefinitionGroup {
	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataTypes;

	/**
	 * The cached value of the '{@link #getQuestionDefinitions() <em>Question Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionDefinition> questionDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlPackage.Literals.DEFINITION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this,
					QlPackage.DEFINITION_GROUP__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuestionDefinition> getQuestionDefinitions() {
		if (questionDefinitions == null) {
			questionDefinitions = new EObjectContainmentEList<QuestionDefinition>(QuestionDefinition.class, this,
					QlPackage.DEFINITION_GROUP__QUESTION_DEFINITIONS);
		}
		return questionDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QlPackage.DEFINITION_GROUP__DATA_TYPES:
			return ((InternalEList<?>) getDataTypes()).basicRemove(otherEnd, msgs);
		case QlPackage.DEFINITION_GROUP__QUESTION_DEFINITIONS:
			return ((InternalEList<?>) getQuestionDefinitions()).basicRemove(otherEnd, msgs);
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
		case QlPackage.DEFINITION_GROUP__DATA_TYPES:
			return getDataTypes();
		case QlPackage.DEFINITION_GROUP__QUESTION_DEFINITIONS:
			return getQuestionDefinitions();
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
		case QlPackage.DEFINITION_GROUP__DATA_TYPES:
			getDataTypes().clear();
			getDataTypes().addAll((Collection<? extends DataType>) newValue);
			return;
		case QlPackage.DEFINITION_GROUP__QUESTION_DEFINITIONS:
			getQuestionDefinitions().clear();
			getQuestionDefinitions().addAll((Collection<? extends QuestionDefinition>) newValue);
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
		case QlPackage.DEFINITION_GROUP__DATA_TYPES:
			getDataTypes().clear();
			return;
		case QlPackage.DEFINITION_GROUP__QUESTION_DEFINITIONS:
			getQuestionDefinitions().clear();
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
		case QlPackage.DEFINITION_GROUP__DATA_TYPES:
			return dataTypes != null && !dataTypes.isEmpty();
		case QlPackage.DEFINITION_GROUP__QUESTION_DEFINITIONS:
			return questionDefinitions != null && !questionDefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefinitionGroupImpl
