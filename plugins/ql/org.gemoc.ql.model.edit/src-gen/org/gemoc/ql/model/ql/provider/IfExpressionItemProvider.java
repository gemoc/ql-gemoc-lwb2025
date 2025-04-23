/**
 */
package org.gemoc.ql.model.ql.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.gemoc.ql.model.ql.IfExpression;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.QlPackage;

/**
 * This is the item provider adapter for a {@link org.gemoc.ql.model.ql.IfExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IfExpressionItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfExpressionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(QlPackage.Literals.IF_EXPRESSION__CONDITION);
			childrenFeatures.add(QlPackage.Literals.IF_EXPRESSION__THEN_EXPRESSION);
			childrenFeatures.add(QlPackage.Literals.IF_EXPRESSION__ELSE_EXPRESSION);
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
	 * This returns IfExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IfExpression"));
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
		return getString("_UI_IfExpression_type");
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

		switch (notification.getFeatureID(IfExpression.class)) {
		case QlPackage.IF_EXPRESSION__CONDITION:
		case QlPackage.IF_EXPRESSION__THEN_EXPRESSION:
		case QlPackage.IF_EXPRESSION__ELSE_EXPRESSION:
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

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__CONDITION,
				QlFactory.eINSTANCE.createBasicBinaryExpression()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__CONDITION,
				QlFactory.eINSTANCE.createConstantCall()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__CONDITION,
				QlFactory.eINSTANCE.createBasicUnaryExpression()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__CONDITION,
				QlFactory.eINSTANCE.createQuestionCall()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__CONDITION,
				QlFactory.eINSTANCE.createEnumerationValue()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__CONDITION,
				QlFactory.eINSTANCE.createIfExpression()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__THEN_EXPRESSION,
				QlFactory.eINSTANCE.createBasicBinaryExpression()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__THEN_EXPRESSION,
				QlFactory.eINSTANCE.createConstantCall()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__THEN_EXPRESSION,
				QlFactory.eINSTANCE.createBasicUnaryExpression()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__THEN_EXPRESSION,
				QlFactory.eINSTANCE.createQuestionCall()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__THEN_EXPRESSION,
				QlFactory.eINSTANCE.createEnumerationValue()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__THEN_EXPRESSION,
				QlFactory.eINSTANCE.createIfExpression()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__ELSE_EXPRESSION,
				QlFactory.eINSTANCE.createBasicBinaryExpression()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__ELSE_EXPRESSION,
				QlFactory.eINSTANCE.createConstantCall()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__ELSE_EXPRESSION,
				QlFactory.eINSTANCE.createBasicUnaryExpression()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__ELSE_EXPRESSION,
				QlFactory.eINSTANCE.createQuestionCall()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__ELSE_EXPRESSION,
				QlFactory.eINSTANCE.createEnumerationValue()));

		newChildDescriptors.add(createChildParameter(QlPackage.Literals.IF_EXPRESSION__ELSE_EXPRESSION,
				QlFactory.eINSTANCE.createIfExpression()));
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

		boolean qualify = childFeature == QlPackage.Literals.IF_EXPRESSION__CONDITION
				|| childFeature == QlPackage.Literals.IF_EXPRESSION__THEN_EXPRESSION
				|| childFeature == QlPackage.Literals.IF_EXPRESSION__ELSE_EXPRESSION;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
