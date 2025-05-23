/*
 * generated by Xtext 2.31.0
 */
package org.gemoc.ql.validation

import org.eclipse.xtext.validation.Check
import org.gemoc.ql.model.ql.QuestionDefinition
import org.gemoc.ql.model.ql.ConditionnalElement
import org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect
import org.gemoc.ql.model.ql.QlPackage
import org.gemoc.ql.model.ql.BooleanValueType
import org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect
import org.gemoc.ql.model.ql.ValueType
import org.gemoc.ql.model.ql.IfExpression
import org.gemoc.ql.model.ql.BasicBinaryExpression

import static extension org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect.*

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class QLValidator extends AbstractQLValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					QLPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	public static val INVALID_TYPE = 'invalidType'
	
	@Check(NORMAL)
	def checkComputedQuestionExpressionType(QuestionDefinition qd) {
		if(qd.computedExpression !== null ) {
			// deep first evaluate and check expression content types
			val inferredValueType = ExpressionAspect.inferredValueType(qd.computedExpression)
			// then expression type must conform to question type
			if(!ValueTypeAspect.isCompatible( qd.dataType, inferredValueType)) {
				error('''Expecting «prettyPrintType(qd.dataType)» but expression type is «prettyPrintType(inferredValueType)»''',
					QlPackage.Literals.QUESTION_DEFINITION__COMPUTED_EXPRESSION, 
					INVALID_TYPE
				)
			}
		}
	}
	
	@Check(NORMAL)
	def checkGuardExpressionType(ConditionnalElement ce) {
		if(ce.guard !== null ) {
			// deep first evaluate and check expression content types
			val inferredValueType = ExpressionAspect.inferredValueType(ce.guard)
			// then guard expression type must be boolean
			if(inferredValueType === null) {
				error('''Guard expression type cannot be inferred''',
					QlPackage.Literals.CONDITIONNAL_ELEMENT__GUARD, 
					INVALID_TYPE
				)
			} else if(!(inferredValueType instanceof BooleanValueType)) {
				error('''Guard expression type is a «prettyPrintType(inferredValueType)»  instead of a boolean''',
					QlPackage.Literals.CONDITIONNAL_ELEMENT__GUARD, 
					INVALID_TYPE
				)
				
			}
		}
	}
	
	@Check(NORMAL)
	def checkIfExpressionGuardType(IfExpression ifExpression) {
		if(ifExpression.condition !== null ) {
			// deep first evaluate and check expression content types
			val inferredValueType = ExpressionAspect.inferredValueType(ifExpression.condition)
			// then guard expression type must be boolean
			if(inferredValueType === null) {
				error('''Condition expression type cannot be inferred''',
					QlPackage.Literals.IF_EXPRESSION__CONDITION, 
					INVALID_TYPE
				)
			} else if(!(inferredValueType instanceof BooleanValueType)) {
				error('''Condition expression type is a «prettyPrintType(inferredValueType)»  instead of a boolean''',
					QlPackage.Literals.IF_EXPRESSION__CONDITION, 
					INVALID_TYPE
				)
			}
		}
		val thenInferredValueType = ifExpression.thenExpression.inferredValueType
		if(thenInferredValueType !== null && ifExpression.elseExpression !== null) {
			val elseInferredValueType = ifExpression.elseExpression.inferredValueType
			if(!thenInferredValueType.isCompatible(elseInferredValueType)) {
				error('''else type «prettyPrintType(elseInferredValueType)» is not compatible with then type «prettyPrintType(thenInferredValueType)»''',
					QlPackage.Literals.IF_EXPRESSION__ELSE_EXPRESSION, 
					INVALID_TYPE
				)
			}
		}
	}

	@Check(NORMAL)
	def checkBasicBinaryExpressionTypes(BasicBinaryExpression binaryExpression) {
		val lhsType = binaryExpression.lhsOperand.inferredValueType
		val rhsType = binaryExpression.rhsOperand.inferredValueType
		lhsType.isCompatible(rhsType)
		if(lhsType === null || !lhsType.isCompatible(rhsType)) {
			error('''Incompatible types «prettyPrintType(lhsType)» and «prettyPrintType(rhsType)» for operator «binaryExpression.operator.getName»''',
				QlPackage.Literals.BASIC_BINARY_EXPRESSION__OPERATOR, 
				INVALID_TYPE
			)
		}
	}
	
	def String prettyPrintType(ValueType valueType) {
		if(valueType !== null) {
			return '''«valueType.name»(«valueType.eClass.name»)'''
		} else {
			return 'null'
		}
	}
	 
	
}
