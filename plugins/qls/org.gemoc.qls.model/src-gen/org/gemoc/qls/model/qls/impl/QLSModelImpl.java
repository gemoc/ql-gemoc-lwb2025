/**
 */
package org.gemoc.qls.model.qls.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.qls.model.qls.Import;
import org.gemoc.qls.model.qls.QLSModel;
import org.gemoc.qls.model.qls.QlsPackage;
import org.gemoc.qls.model.qls.QuestionStyle;
import org.gemoc.qls.model.qls.Section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QLS Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.impl.QLSModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.impl.QLSModelImpl#getQuestionStyles <em>Question Styles</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.impl.QLSModelImpl#getStyledQLModel <em>Styled QL Model</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.impl.QLSModelImpl#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QLSModelImpl extends MinimalEObjectImpl.Container implements QLSModel {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

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
	 * The cached value of the '{@link #getStyledQLModel() <em>Styled QL Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyledQLModel()
	 * @generated
	 * @ordered
	 */
	protected QLModel styledQLModel;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> sections;

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
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, QlsPackage.QLS_MODEL__IMPORTS);
		}
		return imports;
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
	public QLModel getStyledQLModel() {
		if (styledQLModel != null && styledQLModel.eIsProxy()) {
			InternalEObject oldStyledQLModel = (InternalEObject) styledQLModel;
			styledQLModel = (QLModel) eResolveProxy(oldStyledQLModel);
			if (styledQLModel != oldStyledQLModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QlsPackage.QLS_MODEL__STYLED_QL_MODEL,
							oldStyledQLModel, styledQLModel));
			}
		}
		return styledQLModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QLModel basicGetStyledQLModel() {
		return styledQLModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyledQLModel(QLModel newStyledQLModel) {
		QLModel oldStyledQLModel = styledQLModel;
		styledQLModel = newStyledQLModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlsPackage.QLS_MODEL__STYLED_QL_MODEL,
					oldStyledQLModel, styledQLModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<Section>(Section.class, this, QlsPackage.QLS_MODEL__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QlsPackage.QLS_MODEL__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
		case QlsPackage.QLS_MODEL__QUESTION_STYLES:
			return ((InternalEList<?>) getQuestionStyles()).basicRemove(otherEnd, msgs);
		case QlsPackage.QLS_MODEL__SECTIONS:
			return ((InternalEList<?>) getSections()).basicRemove(otherEnd, msgs);
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
		case QlsPackage.QLS_MODEL__IMPORTS:
			return getImports();
		case QlsPackage.QLS_MODEL__QUESTION_STYLES:
			return getQuestionStyles();
		case QlsPackage.QLS_MODEL__STYLED_QL_MODEL:
			if (resolve)
				return getStyledQLModel();
			return basicGetStyledQLModel();
		case QlsPackage.QLS_MODEL__SECTIONS:
			return getSections();
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
		case QlsPackage.QLS_MODEL__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
			return;
		case QlsPackage.QLS_MODEL__QUESTION_STYLES:
			getQuestionStyles().clear();
			getQuestionStyles().addAll((Collection<? extends QuestionStyle>) newValue);
			return;
		case QlsPackage.QLS_MODEL__STYLED_QL_MODEL:
			setStyledQLModel((QLModel) newValue);
			return;
		case QlsPackage.QLS_MODEL__SECTIONS:
			getSections().clear();
			getSections().addAll((Collection<? extends Section>) newValue);
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
		case QlsPackage.QLS_MODEL__IMPORTS:
			getImports().clear();
			return;
		case QlsPackage.QLS_MODEL__QUESTION_STYLES:
			getQuestionStyles().clear();
			return;
		case QlsPackage.QLS_MODEL__STYLED_QL_MODEL:
			setStyledQLModel((QLModel) null);
			return;
		case QlsPackage.QLS_MODEL__SECTIONS:
			getSections().clear();
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
		case QlsPackage.QLS_MODEL__IMPORTS:
			return imports != null && !imports.isEmpty();
		case QlsPackage.QLS_MODEL__QUESTION_STYLES:
			return questionStyles != null && !questionStyles.isEmpty();
		case QlsPackage.QLS_MODEL__STYLED_QL_MODEL:
			return styledQLModel != null;
		case QlsPackage.QLS_MODEL__SECTIONS:
			return sections != null && !sections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QLSModelImpl
