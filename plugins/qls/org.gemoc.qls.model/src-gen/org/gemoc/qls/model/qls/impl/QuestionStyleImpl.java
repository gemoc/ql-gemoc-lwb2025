/**
 */
package org.gemoc.qls.model.qls.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.ql.model.ql.QuestionDefinition;

import org.gemoc.qls.model.qls.LabelStyle;
import org.gemoc.qls.model.qls.QlsPackage;
import org.gemoc.qls.model.qls.QuestionStyle;
import org.gemoc.qls.model.qls.TypeStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.gemoc.qls.model.qls.impl.QuestionStyleImpl#getStyledQuestion <em>Styled Question</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.impl.QuestionStyleImpl#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link org.gemoc.qls.model.qls.impl.QuestionStyleImpl#getTypeStyle <em>Type Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionStyleImpl extends MinimalEObjectImpl.Container implements QuestionStyle {
	/**
	 * The cached value of the '{@link #getStyledQuestion() <em>Styled Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyledQuestion()
	 * @generated
	 * @ordered
	 */
	protected QuestionDefinition styledQuestion;

	/**
	 * The cached value of the '{@link #getLabelStyle() <em>Label Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStyle()
	 * @generated
	 * @ordered
	 */
	protected LabelStyle labelStyle;

	/**
	 * The cached value of the '{@link #getTypeStyle() <em>Type Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeStyle()
	 * @generated
	 * @ordered
	 */
	protected TypeStyle typeStyle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QlsPackage.Literals.QUESTION_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuestionDefinition getStyledQuestion() {
		if (styledQuestion != null && styledQuestion.eIsProxy()) {
			InternalEObject oldStyledQuestion = (InternalEObject) styledQuestion;
			styledQuestion = (QuestionDefinition) eResolveProxy(oldStyledQuestion);
			if (styledQuestion != oldStyledQuestion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QlsPackage.QUESTION_STYLE__STYLED_QUESTION, oldStyledQuestion, styledQuestion));
			}
		}
		return styledQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionDefinition basicGetStyledQuestion() {
		return styledQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyledQuestion(QuestionDefinition newStyledQuestion) {
		QuestionDefinition oldStyledQuestion = styledQuestion;
		styledQuestion = newStyledQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlsPackage.QUESTION_STYLE__STYLED_QUESTION,
					oldStyledQuestion, styledQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelStyle getLabelStyle() {
		if (labelStyle != null && labelStyle.eIsProxy()) {
			InternalEObject oldLabelStyle = (InternalEObject) labelStyle;
			labelStyle = (LabelStyle) eResolveProxy(oldLabelStyle);
			if (labelStyle != oldLabelStyle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QlsPackage.QUESTION_STYLE__LABEL_STYLE,
							oldLabelStyle, labelStyle));
			}
		}
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelStyle basicGetLabelStyle() {
		return labelStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelStyle(LabelStyle newLabelStyle) {
		LabelStyle oldLabelStyle = labelStyle;
		labelStyle = newLabelStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlsPackage.QUESTION_STYLE__LABEL_STYLE, oldLabelStyle,
					labelStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeStyle getTypeStyle() {
		return typeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeStyle(TypeStyle newTypeStyle, NotificationChain msgs) {
		TypeStyle oldTypeStyle = typeStyle;
		typeStyle = newTypeStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QlsPackage.QUESTION_STYLE__TYPE_STYLE, oldTypeStyle, newTypeStyle);
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
	public void setTypeStyle(TypeStyle newTypeStyle) {
		if (newTypeStyle != typeStyle) {
			NotificationChain msgs = null;
			if (typeStyle != null)
				msgs = ((InternalEObject) typeStyle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QlsPackage.QUESTION_STYLE__TYPE_STYLE, null, msgs);
			if (newTypeStyle != null)
				msgs = ((InternalEObject) newTypeStyle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QlsPackage.QUESTION_STYLE__TYPE_STYLE, null, msgs);
			msgs = basicSetTypeStyle(newTypeStyle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QlsPackage.QUESTION_STYLE__TYPE_STYLE, newTypeStyle,
					newTypeStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QlsPackage.QUESTION_STYLE__TYPE_STYLE:
			return basicSetTypeStyle(null, msgs);
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
		case QlsPackage.QUESTION_STYLE__STYLED_QUESTION:
			if (resolve)
				return getStyledQuestion();
			return basicGetStyledQuestion();
		case QlsPackage.QUESTION_STYLE__LABEL_STYLE:
			if (resolve)
				return getLabelStyle();
			return basicGetLabelStyle();
		case QlsPackage.QUESTION_STYLE__TYPE_STYLE:
			return getTypeStyle();
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
		case QlsPackage.QUESTION_STYLE__STYLED_QUESTION:
			setStyledQuestion((QuestionDefinition) newValue);
			return;
		case QlsPackage.QUESTION_STYLE__LABEL_STYLE:
			setLabelStyle((LabelStyle) newValue);
			return;
		case QlsPackage.QUESTION_STYLE__TYPE_STYLE:
			setTypeStyle((TypeStyle) newValue);
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
		case QlsPackage.QUESTION_STYLE__STYLED_QUESTION:
			setStyledQuestion((QuestionDefinition) null);
			return;
		case QlsPackage.QUESTION_STYLE__LABEL_STYLE:
			setLabelStyle((LabelStyle) null);
			return;
		case QlsPackage.QUESTION_STYLE__TYPE_STYLE:
			setTypeStyle((TypeStyle) null);
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
		case QlsPackage.QUESTION_STYLE__STYLED_QUESTION:
			return styledQuestion != null;
		case QlsPackage.QUESTION_STYLE__LABEL_STYLE:
			return labelStyle != null;
		case QlsPackage.QUESTION_STYLE__TYPE_STYLE:
			return typeStyle != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionStyleImpl
