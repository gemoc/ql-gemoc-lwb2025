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

import org.gemoc.ql.model.ql.Form;
import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.ql.model.ql.QlPackage;
import org.gemoc.ql.model.ql.TypeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QL Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QLModelImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link org.gemoc.ql.model.ql.impl.QLModelImpl#getTypegroup <em>Typegroup</em>}</li>
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
	 * The cached value of the '{@link #getTypegroup() <em>Typegroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypegroup()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeGroup> typegroup;

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
	public EList<TypeGroup> getTypegroup() {
		if (typegroup == null) {
			typegroup = new EObjectContainmentEList<TypeGroup>(TypeGroup.class, this, QlPackage.QL_MODEL__TYPEGROUP);
		}
		return typegroup;
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
		case QlPackage.QL_MODEL__TYPEGROUP:
			return ((InternalEList<?>) getTypegroup()).basicRemove(otherEnd, msgs);
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
		case QlPackage.QL_MODEL__TYPEGROUP:
			return getTypegroup();
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
		case QlPackage.QL_MODEL__TYPEGROUP:
			getTypegroup().clear();
			getTypegroup().addAll((Collection<? extends TypeGroup>) newValue);
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
		case QlPackage.QL_MODEL__TYPEGROUP:
			getTypegroup().clear();
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
		case QlPackage.QL_MODEL__TYPEGROUP:
			return typegroup != null && !typegroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QLModelImpl
