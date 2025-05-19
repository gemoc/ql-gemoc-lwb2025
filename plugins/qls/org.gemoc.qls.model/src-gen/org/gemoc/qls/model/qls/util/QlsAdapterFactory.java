/**
 */
package org.gemoc.qls.model.qls.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.qls.model.qls.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.gemoc.qls.model.qls.QlsPackage
 * @generated
 */
public class QlsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QlsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QlsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QlsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QlsSwitch<Adapter> modelSwitch = new QlsSwitch<Adapter>() {
		@Override
		public Adapter caseQLSModel(QLSModel object) {
			return createQLSModelAdapter();
		}

		@Override
		public Adapter caseImport(Import object) {
			return createImportAdapter();
		}

		@Override
		public Adapter caseTypeStyle(TypeStyle object) {
			return createTypeStyleAdapter();
		}

		@Override
		public Adapter caseNumericTypeStyle(NumericTypeStyle object) {
			return createNumericTypeStyleAdapter();
		}

		@Override
		public Adapter caseQuestionStyle(QuestionStyle object) {
			return createQuestionStyleAdapter();
		}

		@Override
		public Adapter caseLabelStyle(LabelStyle object) {
			return createLabelStyleAdapter();
		}

		@Override
		public Adapter caseBooleanTypeStyle(BooleanTypeStyle object) {
			return createBooleanTypeStyleAdapter();
		}

		@Override
		public Adapter caseNumericTypeTextFieldStyle(NumericTypeTextFieldStyle object) {
			return createNumericTypeTextFieldStyleAdapter();
		}

		@Override
		public Adapter caseNumericTypeSpinnerStyle(NumericTypeSpinnerStyle object) {
			return createNumericTypeSpinnerStyleAdapter();
		}

		@Override
		public Adapter caseTextTypeStyle(TextTypeStyle object) {
			return createTextTypeStyleAdapter();
		}

		@Override
		public Adapter caseNumericSpinnerStyle(NumericSpinnerStyle object) {
			return createNumericSpinnerStyleAdapter();
		}

		@Override
		public Adapter caseEnumerationTypeStyle(EnumerationTypeStyle object) {
			return createEnumerationTypeStyleAdapter();
		}

		@Override
		public Adapter caseDateTypeStyle(DateTypeStyle object) {
			return createDateTypeStyleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.QLSModel <em>QLS Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.QLSModel
	 * @generated
	 */
	public Adapter createQLSModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.TypeStyle <em>Type Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.TypeStyle
	 * @generated
	 */
	public Adapter createTypeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.NumericTypeStyle <em>Numeric Type Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.NumericTypeStyle
	 * @generated
	 */
	public Adapter createNumericTypeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.QuestionStyle <em>Question Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.QuestionStyle
	 * @generated
	 */
	public Adapter createQuestionStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.LabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.LabelStyle
	 * @generated
	 */
	public Adapter createLabelStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.BooleanTypeStyle <em>Boolean Type Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.BooleanTypeStyle
	 * @generated
	 */
	public Adapter createBooleanTypeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.NumericTypeTextFieldStyle <em>Numeric Type Text Field Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.NumericTypeTextFieldStyle
	 * @generated
	 */
	public Adapter createNumericTypeTextFieldStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.NumericTypeSpinnerStyle <em>Numeric Type Spinner Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.NumericTypeSpinnerStyle
	 * @generated
	 */
	public Adapter createNumericTypeSpinnerStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.TextTypeStyle <em>Text Type Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.TextTypeStyle
	 * @generated
	 */
	public Adapter createTextTypeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.NumericSpinnerStyle <em>Numeric Spinner Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.NumericSpinnerStyle
	 * @generated
	 */
	public Adapter createNumericSpinnerStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.EnumerationTypeStyle <em>Enumeration Type Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.EnumerationTypeStyle
	 * @generated
	 */
	public Adapter createEnumerationTypeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.gemoc.qls.model.qls.DateTypeStyle <em>Date Type Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.gemoc.qls.model.qls.DateTypeStyle
	 * @generated
	 */
	public Adapter createDateTypeStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QlsAdapterFactory
