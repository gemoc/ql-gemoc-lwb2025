/**
 */
package org.gemoc.qls.model.qls.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.ql.model.ql.QlPackage;

import org.gemoc.qls.model.qls.BooleanStyleKind;
import org.gemoc.qls.model.qls.BooleanTypeStyle;
import org.gemoc.qls.model.qls.DateTypeStyle;
import org.gemoc.qls.model.qls.EnumerationStyleKind;
import org.gemoc.qls.model.qls.EnumerationTypeStyle;
import org.gemoc.qls.model.qls.Import;
import org.gemoc.qls.model.qls.LabelStyle;
import org.gemoc.qls.model.qls.NumericTypeSpinnerStyle;
import org.gemoc.qls.model.qls.NumericTypeStyle;
import org.gemoc.qls.model.qls.NumericTypeTextFieldStyle;
import org.gemoc.qls.model.qls.QLSModel;
import org.gemoc.qls.model.qls.QlsFactory;
import org.gemoc.qls.model.qls.QlsPackage;
import org.gemoc.qls.model.qls.QuestionReference;
import org.gemoc.qls.model.qls.QuestionStyle;
import org.gemoc.qls.model.qls.Section;
import org.gemoc.qls.model.qls.SectionContent;
import org.gemoc.qls.model.qls.TextTypeStyle;
import org.gemoc.qls.model.qls.TypeStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QlsPackageImpl extends EPackageImpl implements QlsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qlsModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeTextFieldStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeSpinnerStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textTypeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTypeStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanStyleKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumerationStyleKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.qls.model.qls.QlsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QlsPackageImpl() {
		super(eNS_URI, QlsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QlsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QlsPackage init() {
		if (isInited)
			return (QlsPackage) EPackage.Registry.INSTANCE.getEPackage(QlsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQlsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QlsPackageImpl theQlsPackage = registeredQlsPackage instanceof QlsPackageImpl
				? (QlsPackageImpl) registeredQlsPackage
				: new QlsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		QlPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQlsPackage.createPackageContents();

		// Initialize created meta-data
		theQlsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQlsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QlsPackage.eNS_URI, theQlsPackage);
		return theQlsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQLSModel() {
		return qlsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQLSModel_Imports() {
		return (EReference) qlsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQLSModel_QuestionStyles() {
		return (EReference) qlsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQLSModel_StyledQLModel() {
		return (EReference) qlsModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQLSModel_Sections() {
		return (EReference) qlsModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImport_ImportURI() {
		return (EAttribute) importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeStyle() {
		return typeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericTypeStyle() {
		return numericTypeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionStyle() {
		return questionStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionStyle_StyledQuestion() {
		return (EReference) questionStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionStyle_LabelStyle() {
		return (EReference) questionStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionStyle_TypeStyle() {
		return (EReference) questionStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelStyle() {
		return labelStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelStyle_Italic() {
		return (EAttribute) labelStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelStyle_Bold() {
		return (EAttribute) labelStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanTypeStyle() {
		return booleanTypeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanTypeStyle_BooleanStyleKind() {
		return (EAttribute) booleanTypeStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericTypeTextFieldStyle() {
		return numericTypeTextFieldStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericTypeSpinnerStyle() {
		return numericTypeSpinnerStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumericTypeSpinnerStyle_Step() {
		return (EAttribute) numericTypeSpinnerStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextTypeStyle() {
		return textTypeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextTypeStyle_Multiline() {
		return (EAttribute) textTypeStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationTypeStyle() {
		return enumerationTypeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumerationTypeStyle_EnumerationStyleKing() {
		return (EAttribute) enumerationTypeStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTypeStyle() {
		return dateTypeStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSection_Title() {
		return (EAttribute) sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_SectionContents() {
		return (EReference) sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSectionContent() {
		return sectionContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuestionReference() {
		return questionReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuestionReference_Question() {
		return (EReference) questionReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBooleanStyleKind() {
		return booleanStyleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnumerationStyleKind() {
		return enumerationStyleKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QlsFactory getQlsFactory() {
		return (QlsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		qlsModelEClass = createEClass(QLS_MODEL);
		createEReference(qlsModelEClass, QLS_MODEL__IMPORTS);
		createEReference(qlsModelEClass, QLS_MODEL__QUESTION_STYLES);
		createEReference(qlsModelEClass, QLS_MODEL__STYLED_QL_MODEL);
		createEReference(qlsModelEClass, QLS_MODEL__SECTIONS);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORT_URI);

		typeStyleEClass = createEClass(TYPE_STYLE);

		numericTypeStyleEClass = createEClass(NUMERIC_TYPE_STYLE);

		questionStyleEClass = createEClass(QUESTION_STYLE);
		createEReference(questionStyleEClass, QUESTION_STYLE__STYLED_QUESTION);
		createEReference(questionStyleEClass, QUESTION_STYLE__LABEL_STYLE);
		createEReference(questionStyleEClass, QUESTION_STYLE__TYPE_STYLE);

		labelStyleEClass = createEClass(LABEL_STYLE);
		createEAttribute(labelStyleEClass, LABEL_STYLE__ITALIC);
		createEAttribute(labelStyleEClass, LABEL_STYLE__BOLD);

		booleanTypeStyleEClass = createEClass(BOOLEAN_TYPE_STYLE);
		createEAttribute(booleanTypeStyleEClass, BOOLEAN_TYPE_STYLE__BOOLEAN_STYLE_KIND);

		numericTypeTextFieldStyleEClass = createEClass(NUMERIC_TYPE_TEXT_FIELD_STYLE);

		numericTypeSpinnerStyleEClass = createEClass(NUMERIC_TYPE_SPINNER_STYLE);
		createEAttribute(numericTypeSpinnerStyleEClass, NUMERIC_TYPE_SPINNER_STYLE__STEP);

		textTypeStyleEClass = createEClass(TEXT_TYPE_STYLE);
		createEAttribute(textTypeStyleEClass, TEXT_TYPE_STYLE__MULTILINE);

		enumerationTypeStyleEClass = createEClass(ENUMERATION_TYPE_STYLE);
		createEAttribute(enumerationTypeStyleEClass, ENUMERATION_TYPE_STYLE__ENUMERATION_STYLE_KING);

		dateTypeStyleEClass = createEClass(DATE_TYPE_STYLE);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__TITLE);
		createEReference(sectionEClass, SECTION__SECTION_CONTENTS);

		sectionContentEClass = createEClass(SECTION_CONTENT);

		questionReferenceEClass = createEClass(QUESTION_REFERENCE);
		createEReference(questionReferenceEClass, QUESTION_REFERENCE__QUESTION);

		// Create enums
		booleanStyleKindEEnum = createEEnum(BOOLEAN_STYLE_KIND);
		enumerationStyleKindEEnum = createEEnum(ENUMERATION_STYLE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QlPackage theQlPackage = (QlPackage) EPackage.Registry.INSTANCE.getEPackage(QlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		numericTypeStyleEClass.getESuperTypes().add(this.getTypeStyle());
		booleanTypeStyleEClass.getESuperTypes().add(this.getTypeStyle());
		numericTypeTextFieldStyleEClass.getESuperTypes().add(this.getNumericTypeStyle());
		numericTypeSpinnerStyleEClass.getESuperTypes().add(this.getNumericTypeStyle());
		textTypeStyleEClass.getESuperTypes().add(this.getTypeStyle());
		enumerationTypeStyleEClass.getESuperTypes().add(this.getTypeStyle());
		dateTypeStyleEClass.getESuperTypes().add(this.getTypeStyle());
		sectionEClass.getESuperTypes().add(this.getSectionContent());
		questionReferenceEClass.getESuperTypes().add(this.getSectionContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(qlsModelEClass, QLSModel.class, "QLSModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQLSModel_Imports(), this.getImport(), null, "imports", null, 0, -1, QLSModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQLSModel_QuestionStyles(), this.getQuestionStyle(), null, "questionStyles", null, 0, -1,
				QLSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQLSModel_StyledQLModel(), theQlPackage.getQLModel(), null, "styledQLModel", null, 1, 1,
				QLSModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQLSModel_Sections(), this.getSection(), null, "sections", null, 0, -1, QLSModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeStyleEClass, TypeStyle.class, "TypeStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericTypeStyleEClass, NumericTypeStyle.class, "NumericTypeStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionStyleEClass, QuestionStyle.class, "QuestionStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionStyle_StyledQuestion(), theQlPackage.getQuestionDefinition(), null, "styledQuestion",
				null, 0, 1, QuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionStyle_LabelStyle(), this.getLabelStyle(), null, "labelStyle", null, 0, 1,
				QuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestionStyle_TypeStyle(), this.getTypeStyle(), null, "typeStyle", null, 0, 1,
				QuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelStyleEClass, LabelStyle.class, "LabelStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelStyle_Italic(), ecorePackage.getEBoolean(), "italic", null, 0, 1, LabelStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelStyle_Bold(), ecorePackage.getEBoolean(), "bold", null, 0, 1, LabelStyle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanTypeStyleEClass, BooleanTypeStyle.class, "BooleanTypeStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanTypeStyle_BooleanStyleKind(), this.getBooleanStyleKind(), "booleanStyleKind", null, 0,
				1, BooleanTypeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericTypeTextFieldStyleEClass, NumericTypeTextFieldStyle.class, "NumericTypeTextFieldStyle",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numericTypeSpinnerStyleEClass, NumericTypeSpinnerStyle.class, "NumericTypeSpinnerStyle",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericTypeSpinnerStyle_Step(), ecorePackage.getEDouble(), "step", null, 0, 1,
				NumericTypeSpinnerStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textTypeStyleEClass, TextTypeStyle.class, "TextTypeStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextTypeStyle_Multiline(), ecorePackage.getEBoolean(), "multiline", null, 0, 1,
				TextTypeStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(enumerationTypeStyleEClass, EnumerationTypeStyle.class, "EnumerationTypeStyle", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationTypeStyle_EnumerationStyleKing(), this.getEnumerationStyleKind(),
				"enumerationStyleKing", null, 1, 1, EnumerationTypeStyle.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTypeStyleEClass, DateTypeStyle.class, "DateTypeStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_Title(), ecorePackage.getEString(), "title", null, 0, 1, Section.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSection_SectionContents(), this.getSectionContent(), null, "sectionContents", null, 0, -1,
				Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionContentEClass, SectionContent.class, "SectionContent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(questionReferenceEClass, QuestionReference.class, "QuestionReference", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuestionReference_Question(), theQlPackage.getQuestionDefinition(), null, "question", null, 1,
				1, QuestionReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(booleanStyleKindEEnum, BooleanStyleKind.class, "BooleanStyleKind");
		addEEnumLiteral(booleanStyleKindEEnum, BooleanStyleKind.CHECKBOX);
		addEEnumLiteral(booleanStyleKindEEnum, BooleanStyleKind.TWO_RADIO);
		addEEnumLiteral(booleanStyleKindEEnum, BooleanStyleKind.DROPDOWN);

		initEEnum(enumerationStyleKindEEnum, EnumerationStyleKind.class, "EnumerationStyleKind");
		addEEnumLiteral(enumerationStyleKindEEnum, EnumerationStyleKind.DROPDOWN);
		addEEnumLiteral(enumerationStyleKindEEnum, EnumerationStyleKind.RADIO);

		// Create resource
		createResource(eNS_URI);
	}

} //QlsPackageImpl
