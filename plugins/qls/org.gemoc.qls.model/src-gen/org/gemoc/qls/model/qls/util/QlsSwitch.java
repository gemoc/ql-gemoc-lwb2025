/**
 */
package org.gemoc.qls.model.qls.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.gemoc.qls.model.qls.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.gemoc.qls.model.qls.QlsPackage
 * @generated
 */
public class QlsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QlsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QlsSwitch() {
		if (modelPackage == null) {
			modelPackage = QlsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case QlsPackage.QLS_MODEL: {
			QLSModel qlsModel = (QLSModel) theEObject;
			T result = caseQLSModel(qlsModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlsPackage.IMPORT: {
			Import import_ = (Import) theEObject;
			T result = caseImport(import_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlsPackage.TYPE_STYLE: {
			TypeStyle typeStyle = (TypeStyle) theEObject;
			T result = caseTypeStyle(typeStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlsPackage.NUMERIC_TYPE_STYLE: {
			NumericTypeStyle numericTypeStyle = (NumericTypeStyle) theEObject;
			T result = caseNumericTypeStyle(numericTypeStyle);
			if (result == null)
				result = caseTypeStyle(numericTypeStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlsPackage.QUESTION_STYLE: {
			QuestionStyle questionStyle = (QuestionStyle) theEObject;
			T result = caseQuestionStyle(questionStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlsPackage.LABEL_STYLE: {
			LabelStyle labelStyle = (LabelStyle) theEObject;
			T result = caseLabelStyle(labelStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlsPackage.BOOLEAN_TYPE_STYLE: {
			BooleanTypeStyle booleanTypeStyle = (BooleanTypeStyle) theEObject;
			T result = caseBooleanTypeStyle(booleanTypeStyle);
			if (result == null)
				result = caseTypeStyle(booleanTypeStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlsPackage.NUMERIC_TYPE_TEXT_FIELD_STYLE: {
			NumericTypeTextFieldStyle numericTypeTextFieldStyle = (NumericTypeTextFieldStyle) theEObject;
			T result = caseNumericTypeTextFieldStyle(numericTypeTextFieldStyle);
			if (result == null)
				result = caseNumericTypeStyle(numericTypeTextFieldStyle);
			if (result == null)
				result = caseTypeStyle(numericTypeTextFieldStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlsPackage.NUMERIC_TYPE_SPINNER_STYLE: {
			NumericTypeSpinnerStyle numericTypeSpinnerStyle = (NumericTypeSpinnerStyle) theEObject;
			T result = caseNumericTypeSpinnerStyle(numericTypeSpinnerStyle);
			if (result == null)
				result = caseNumericTypeStyle(numericTypeSpinnerStyle);
			if (result == null)
				result = caseTypeStyle(numericTypeSpinnerStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlsPackage.TEXT_TYPE_STYLE: {
			TextTypeStyle textTypeStyle = (TextTypeStyle) theEObject;
			T result = caseTextTypeStyle(textTypeStyle);
			if (result == null)
				result = caseTypeStyle(textTypeStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QlsPackage.NUMERIC_SPINNER_STYLE: {
			NumericSpinnerStyle numericSpinnerStyle = (NumericSpinnerStyle) theEObject;
			T result = caseNumericSpinnerStyle(numericSpinnerStyle);
			if (result == null)
				result = caseNumericTypeSpinnerStyle(numericSpinnerStyle);
			if (result == null)
				result = caseNumericTypeStyle(numericSpinnerStyle);
			if (result == null)
				result = caseTypeStyle(numericSpinnerStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QLS Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QLS Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQLSModel(QLSModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeStyle(TypeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Type Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericTypeStyle(NumericTypeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionStyle(QuestionStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelStyle(LabelStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanTypeStyle(BooleanTypeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Type Text Field Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Type Text Field Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericTypeTextFieldStyle(NumericTypeTextFieldStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Type Spinner Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Type Spinner Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericTypeSpinnerStyle(NumericTypeSpinnerStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Type Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Type Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextTypeStyle(TextTypeStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Spinner Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Spinner Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericSpinnerStyle(NumericSpinnerStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QlsSwitch
