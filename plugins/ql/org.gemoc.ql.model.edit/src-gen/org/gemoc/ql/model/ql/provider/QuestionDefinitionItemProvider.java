/**
 */
package org.gemoc.ql.model.ql.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.QlPackage;
import org.gemoc.ql.model.ql.QuestionDefinition;

/**
 * This is the item provider adapter for a {@link org.gemoc.ql.model.ql.QuestionDefinition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionDefinitionItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionDefinitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLabelPropertyDescriptor(object);
			addDataTypePropertyDescriptor(object);
			addIsDisplayedPropertyDescriptor(object);
			addIsMandatoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_QuestionDefinition_label_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_QuestionDefinition_label_feature",
								"_UI_QuestionDefinition_type"),
						QlPackage.Literals.QUESTION_DEFINITION__LABEL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_QuestionDefinition_dataType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_QuestionDefinition_dataType_feature",
								"_UI_QuestionDefinition_type"),
						QlPackage.Literals.QUESTION_DEFINITION__DATA_TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Displayed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDisplayedPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_QuestionDefinition_isDisplayed_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_QuestionDefinition_isDisplayed_feature",
								"_UI_QuestionDefinition_type"),
						QlPackage.Literals.QUESTION_DEFINITION__IS_DISPLAYED, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Mandatory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsMandatoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_QuestionDefinition_isMandatory_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_QuestionDefinition_isMandatory_feature",
								"_UI_QuestionDefinition_type"),
						QlPackage.Literals.QUESTION_DEFINITION__IS_MANDATORY, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(QlPackage.Literals.QUESTION_DEFINITION__COMPUTED_EXPRESSION);
			childrenFeatures.add(QlPackage.Literals.QUESTION_DEFINITION__CURRENT_VALUE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns QuestionDefinition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QuestionDefinition"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((QuestionDefinition) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_QuestionDefinition_type")
				: getString("_UI_QuestionDefinition_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(QuestionDefinition.class)) {
		case QlPackage.QUESTION_DEFINITION__LABEL:
		case QlPackage.QUESTION_DEFINITION__IS_DISPLAYED:
		case QlPackage.QUESTION_DEFINITION__IS_MANDATORY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case QlPackage.QUESTION_DEFINITION__COMPUTED_EXPRESSION:
		case QlPackage.QUESTION_DEFINITION__CURRENT_VALUE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__COMPUTED_EXPRESSION,
				QlFactory.eINSTANCE.createBasicBinaryExpression()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__COMPUTED_EXPRESSION,
				QlFactory.eINSTANCE.createConstantCall()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__COMPUTED_EXPRESSION,
				QlFactory.eINSTANCE.createBasicUnaryExpression()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__COMPUTED_EXPRESSION,
				QlFactory.eINSTANCE.createQuestionCall()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__COMPUTED_EXPRESSION,
				QlFactory.eINSTANCE.createEnumerationCall()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__COMPUTED_EXPRESSION,
				QlFactory.eINSTANCE.createIfExpression()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__CURRENT_VALUE,
				QlFactory.eINSTANCE.createIntegerValue()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__CURRENT_VALUE,
				QlFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__CURRENT_VALUE,
				QlFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__CURRENT_VALUE,
				QlFactory.eINSTANCE.createDateValue()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__CURRENT_VALUE,
				QlFactory.eINSTANCE.createDecimalValue()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.QUESTION_DEFINITION__CURRENT_VALUE,
				QlFactory.eINSTANCE.createEnumerationCall()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == QlPackage.Literals.QUESTION_DEFINITION__COMPUTED_EXPRESSION
				|| childFeature == QlPackage.Literals.QUESTION_DEFINITION__CURRENT_VALUE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
