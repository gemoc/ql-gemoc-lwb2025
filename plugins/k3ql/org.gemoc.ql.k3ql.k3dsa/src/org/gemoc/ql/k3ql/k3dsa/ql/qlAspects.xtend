package org.gemoc.ql.k3ql.k3dsa.ql

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.gemoc.ql.model.ql.QLModel
import org.gemoc.ql.model.ql.Form
import org.gemoc.ql.model.ql.Question
import org.gemoc.ql.model.ql.QuestionDefinition
import org.gemoc.ql.model.ql.Expression
import org.gemoc.ql.model.ql.BinaryExpression
import org.gemoc.ql.model.ql.UnaryExpression
import org.gemoc.ql.model.ql.BasicBinaryExpression
import org.gemoc.ql.model.ql.Call
import org.gemoc.ql.model.ql.ConstantCall
import org.gemoc.ql.model.ql.Value
import org.gemoc.ql.model.ql.IntegerValue
import org.gemoc.ql.model.ql.StringValue
import org.gemoc.ql.model.ql.BooleanValue
import org.gemoc.ql.model.ql.BasicUnaryExpression
import org.gemoc.ql.model.ql.DateValue
import org.gemoc.ql.model.ql.DecimalValue
import org.gemoc.ql.model.ql.ValueType
import org.gemoc.ql.model.ql.BooleanValueType
import org.gemoc.ql.model.ql.IntegerValueType
import org.gemoc.ql.model.ql.DecimalValueType
import org.gemoc.ql.model.ql.DateValueType
import org.gemoc.ql.model.ql.EnumerationValueType
import org.gemoc.ql.model.ql.EnumerationLiteral
import org.gemoc.ql.model.ql.NamedElement
import org.gemoc.ql.model.ql.ConditionnalElement
import org.gemoc.ql.model.ql.QuestionGroup
import org.gemoc.ql.model.ql.DefinitionGroup
import org.gemoc.ql.model.ql.QuestionCall

import static extension org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.FormAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.QuestionAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.BinaryExpressionAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.UnaryExpressionAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.CallAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.DateValueAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.EnumerationLiteralAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.NamedElementAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.ConditionnalElementAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.QuestionGroupAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.DefinitionGroupAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspect.*

import static extension org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect.*

import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.EList
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException
import org.gemoc.ql.k3ql.k3dsa.QLException
import org.gemoc.ql.model.ql.QlFactory
import org.gemoc.ql.model.ql.StringValueType
import org.gemoc.ql.model.ql.UnaryOperatorKind
import org.gemoc.ql.model.ql.BinaryOperatorKind
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import java.io.File
import java.text.SimpleDateFormat
import java.util.List
import java.util.HashMap
import java.util.ArrayList
import java.util.Set
import org.gemoc.ql.model.ql.IfExpression
import org.gemoc.ql.model.ql.EnumerationCall
import org.gemoc.ql.k3ql.k3dsa.NullValueException

@Aspect(className=QLModel)
class QLModelAspect {
	
	@Step 												
	@InitializeModel									
	def void initializeModel(EList<String> input){
		_self.devInfo('-> initializeModel() input='+input.get(0));
		_self.setInitialValues()
		
		_self.definitionGroup.flatMap[ f | f.questionDefinitions].forEach[qd | qd.evaluateComputedQuestionDependencies()]
		
		
	}
	
	@Step
	@Main
	def void main() {
		_self.devInfo('-> main() ');
		
		while(_self.submitDate === null) {
			// recompute which questions must be displayed
			_self.resetIsDisplayed();
			for( f : _self.forms) {
				f.render();
			}
			// refresh canSubmit
			val allDisplayedMandatory = _self.definitionGroup.flatMap[ f | f.questionDefinitions].filter[qd | qd.isIsDisplayed].filter[qd | qd.isIsMandatory]
			_self.canSubmit = allDisplayedMandatory.empty || allDisplayedMandatory.forall[qd | qd.currentValue !== null];
			_self.updateSubmitButtonStatus();
			
			// wait for an input
			_self.waitUserInput();
			
			// for all rendered questions, update the model with the value in the UI
			var allDisplayedQuestion = _self.definitionGroup.flatMap[ f | f.questionDefinitions].filter[qd | qd.isIsDisplayed]
			allDisplayedQuestion.forEach[qd | qd.updateCurrentValueFromUI();]
			_self.readSubmitButtonStatus();
			
			// recompute all computedQuestions
			_self.updateAllComputedQuestions();
		}
		// received submitAction
		// serialize answers
		_self.saveToXmi()
	}
	
	/** step captured by the Engine Addon to feed the model forms with input from the user UI
	 * it waits for change
	 */
	@Step 
	def void waitUserInput() {
		
	}
	
	/** step captured by the Engine Addon to flush the display, so we can add the field again according to their newly isDisplayed status
	 * it waits for change
	 */
	@Step
	def void resetIsDisplayed() {
//		for( g : _self.definitionGroup) {
//			for (qd : g.questionDefinitions) {
//				qd.isDisplayed = false
//			}
//		}	
	}
	
	/** step captured by the Engine Addon to update the submit button according to the model status
	 */
	@Step
	def void updateSubmitButtonStatus() {
		
	}
	
	/**
	 * step captured by the Engine Addon to Read the submitButtonStatus, it sets the submitDate attribute 
	 */
	@Step
	def void readSubmitButtonStatus() {
		
	}
	
	def void setInitialValues() {
		for( g : _self.definitionGroup) {
			for (qd : g.questionDefinitions) {
				val dataType = qd.dataType;
				switch dataType {
					BooleanValueType,
					StringValueType :
						// boolean and String cannot be null in the UI, so we must set their value
						qd.currentValue = qd.dataType.createDefaultValue()
					default:
						// other valueType are nullable in the UI
						qd.currentValue = null
				};
			}
		}
	}
	
	/**
	 * 
	 * TODO only displayedComputedQuestion ? 
	 * TODO what happen if a computedQuestion depends on a non displayed question ?
	 */
	@Step
	def void updateAllComputedQuestions() {
		
		// need to define the best evaluation order, and error in case of cycle
		var allComputedQuestions = _self.sortAllDisplayedComputedQuestions
		
		_self.devDebug('allComputedQuestions='+allComputedQuestions.map[qd | qd.name].join(', '));
		allComputedQuestions.forEach[qd | 
			// if the computedQuestion depends on a question that is not displayed then it is in error
			val notDisplayedDependencies = qd.computedExpression.eAllContents.filter(QuestionCall).filter[ qc | !qc.question.isDisplayed]
			if(!notDisplayedDependencies.empty) {
				_self.error('TODO implement better user feedback');
				throw new QLException('Question '+qd.name + ' depends on question(s) ' + notDisplayedDependencies.map[qdc | qdc.question.name].join(', ')+  ' that are currently not displayed ');
			} else {
				qd.currentValue = qd.computedExpression.evaluate()	
			}
		]
	}
	
	/**
	 * returns the all computedQuestion of self in a topologically sorted order
	 * consider only displayed questions
	 * Kahn's algorithm from https://en.wikipedia.org/wiki/Topological_sorting
	 */
	def List<QuestionDefinition> sortAllDisplayedComputedQuestions() {
		
		var allComputedQuestions = _self.definitionGroup.flatMap[ f | f.questionDefinitions].filter[qd | qd.computedExpression !== null && qd.isIsDisplayed]
		_self.devDebug('sortAllDisplayedComputedQuestions allComputedQuestions='+allComputedQuestions.map[qd | qd.name].join(', '));
		allComputedQuestions.forEach[qd | qd.evaluateComputedQuestionDependencies()]
		// L <- Empty list that will contain the sorted elements
		val List<QuestionDefinition> resList = newArrayList; //Empty list that will contain the sorted elements		
		// S <- Set of all nodes with no incoming edge
		val List<QuestionDefinition> nodeWithNoIncomingEdgeSet = allComputedQuestions.filter[qd | qd.referencingQuestions.isNullOrEmpty].toList

		// while S is non-empty do
		while(! nodeWithNoIncomingEdgeSet.isEmpty()){
			// remove a node n from S
			val QuestionDefinition n = nodeWithNoIncomingEdgeSet.get(0);
			nodeWithNoIncomingEdgeSet.remove(0);
			// add n to tail of L
			//self.devDebug('\tsortedSubfunctions add '+n.name+' to tail of L ');
			resList.add(n);
			// for each node m with an edge e from n to m do
			n.dependencies.clone.forEach[m | 
				// remove edge e from the graph
				n.dependencies.remove(m);
				m.referencingQuestions.remove(n);
				// if m has no other incoming edges then
				
				if(m.referencingQuestions.empty){
	            	// insert m into S
	            	//self.devDebug('\tsortedSubfunctions insert '+m.name+' into S');
	            	nodeWithNoIncomingEdgeSet.add(m);
            	}
			]
		}
		
		// if graph has edges then
		if(allComputedQuestions.exists[qd | !qd.dependencies.empty]){
	    	// 	return error   (graph has at least one cycle)
			_self.error('Found at least one cycle in computed questions ');
			_self.error('Questions involved in cycle(s) are:\n'+allComputedQuestions.filter[qd | !qd.dependencies.empty].map[qd | qd.name+' -> ('+qd.dependencies.map[qddep | qddep.name].join(', ')+')'].join(',   \n'));
			
			throw new QLException('No Topological order can be found');
	    }
		else { 
			//  	 return L   (a topologically sorted order)
			return resList;
		}
		
	}
	
	
	@Step
	def void saveToXmi() {
		val origResource = _self.eResource
		val resourceUri = _self.eResource.URI;
		val String fileName = resourceUri.lastSegment(); // Get the file name
        //val String platformPlugin = resourceUri.segment(1); // Get the plugin name
        val String platformFolderPath = resourceUri.trimSegments(1).toString(); // get the path within the plugin.

		val SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss"); // Customize the format
        
		val String postfix = "_"+dateFormat.format(_self.submitDate);
		val URI outputUri = URI.createURI(platformFolderPath +"/reports/" + fileName.replaceFirst("\\.([^.]+)$", postfix + ".$1")+".xmi", true);
		
		
		_self.devInfo("Saving to "+outputUri.toString);
		val resourceSet = new ResourceSetImpl();
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                "*", new XMIResourceFactoryImpl()
            );
	    val outputResource = resourceSet.createResource(outputUri)
	    outputResource.getContents().addAll(_self.eResource.getContents())
	
	    outputResource.save({});
	    
	    // move back to the original resource
	    origResource.getContents().addAll(outputResource.getContents());
	    
	} 

}

@Aspect(className=Form)
class FormAspect extends NamedElementAspect {
	@Step
	def void render() {
		_self.questionGroup.render();
	}
}

@Aspect(className=Question)
class QuestionAspect {
	/** this step is captured by the EngineAddons to concretely add the question in the form */
	@Step
	def void show(){
		
		_self.devInfo('QuestionAspect.show '+_self.questionDefinition.name);
	}
}

@Aspect(className=QuestionDefinition)
class QuestionDefinitionAspect extends NamedElementAspect {
	
	/** this step is captured by the EngineAddons to concretely update the currentValue from the value in the UI form */
	@Step
	def void updateCurrentValueFromUI(){
		
	}
	
	/** List all questions that this question directly use to compute this question
	 * is empty is this is not a 
	 */
	public Set<QuestionDefinition> dependencies = newHashSet
	/** List all questions that directly reference this question */
	public Set<QuestionDefinition> referencingQuestions = newHashSet
	
	/**
	 * evaluation in order to fill the dependencies and referencingQuestions lists
	 * consider only computedQuestions in the dependency graph
	 */
	def void evaluateComputedQuestionDependencies() {
		if(_self.computedExpression !== null) {
			_self.dependencies.addAll(
				_self.computedExpression.eAllContents.filter(QuestionCall).filter[qc | qc.question.computedExpression !== null].map[ qc |qc.question].toList)
			_self.dependencies.forEach[qd | qd.referencingQuestions.add(_self)]
		}
	}
}



@Aspect(className=Expression)
abstract class ExpressionAspect {
	/**
	 * evaluate the expression and get the boolean
	 * if not a boolean raise an exception 
	 */ 
	def boolean evaluateAsBoolean(){
		val Value internalResult = _self.evaluate();
		var boolean result = false;
		if(internalResult instanceof BooleanValue) {
			result = internalResult.booleanValue;
		} else {
			if (internalResult === null) {
				throw new NullValueException('expected a boolean but got '+internalResult);
			} else {
				throw new QLException('expected a boolean but got '+internalResult);	
			}
		}
		return result;
	}
	
	def Value evaluate() {
		_self.devError('not implemented, please ask language designer to implement evaluate() for '+_self);
		throw new NotImplementedException('not implemented, please implement evaluate() for '+_self);
	}
}

@Aspect(className=BinaryExpression)
abstract class BinaryExpressionAspect extends ExpressionAspect {

}

@Aspect(className=UnaryExpression)
abstract class UnaryExpressionAspect extends ExpressionAspect {

}

@Aspect(className=BasicBinaryExpression)
class BasicBinaryExpressionAspect extends BinaryExpressionAspect {
	def Value evaluate() {
		var Value result; 
		if(_self.operator == BinaryOperatorKind.OR) {
			val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
			bValue.booleanValue = _self.lhsOperand.evaluateAsBoolean() || _self.rhsOperand.evaluateAsBoolean(); 
			result = bValue;
		} else if(_self.operator == BinaryOperatorKind.AND){
				
			val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
			bValue.booleanValue = _self.lhsOperand.evaluateAsBoolean() && _self.rhsOperand.evaluateAsBoolean(); 
			result = bValue;
		} else {
			// all other operators need both lhs and rhs evaluation
			val Value lhs = _self.lhsOperand.evaluate();
			val Value rhs = _self.rhsOperand.evaluate();
			if(_self.operator == BinaryOperatorKind::EQUAL){
				result = lhs.bEquals(rhs);
			} else if(_self.operator == BinaryOperatorKind::PLUS){ 
				result = lhs.plus(rhs);
			} else if(_self.operator == BinaryOperatorKind::MINUS){ 
				result = lhs.minus(rhs);
			} else if(_self.operator == BinaryOperatorKind::MULT){
				result = lhs.mult(rhs);
			} else if(_self.operator == BinaryOperatorKind::DIV){
				result = lhs.div(rhs);
			} else if(_self.operator == BinaryOperatorKind::GREATER){
				result = lhs.greater(rhs);
			} else if(_self.operator == BinaryOperatorKind::LOWER){
				result = lhs.lower(rhs);
			} else if(_self.operator == BinaryOperatorKind::GREATEROREQUAL){
				result = lhs.greaterOrEquals(rhs);
			} else if(_self.operator == BinaryOperatorKind::LOWEROREQUAL){
				result = lhs.lowerOrEquals(rhs);
			} else {
				throw new NotImplementedException('not implemented, please implement evaluate() for '+_self);
			}
		}
		return result;
	}
}

@Aspect(className=Call)
abstract class CallAspect extends ExpressionAspect {
	def Value evaluate() {
		_self.devError('not implemented, please ask language designer to implement evaluate() for '+_self);
		throw new NotImplementedException('not implemented, please implement evaluate() for '+_self);
	}
}

@Aspect(className=ConstantCall)
class ConstantCallAspect extends CallAspect {
	def Value evaluate() {
		return _self.value.evaluate();
	}
}

@Aspect(className=IfExpression)
class IfExpressionAspect extends ExpressionAspect {
	def Value evaluate() {
		try {
			if(_self.condition.evaluateAsBoolean().booleanValue) {
				return _self.thenExpression.evaluate();
			} else if(_self.elseExpression !== null) {
				return _self.elseExpression.evaluate();
			} else {
				return null;			
			}
		} catch (NullValueException nve) {
			return null;
		}
	}
}

@Aspect(className=Value)
abstract class ValueAspect {
	def Value evaluate() {
		_self.devError('not implemented, please ask language designer to implement evaluate() for '+_self);
		throw new NotImplementedException('not implemented, please implement evaluate() for '+_self);
	}
	
	def Value copy() {
		_self.devError('not implemented, please ask language designer to implement copy() for '+_self);
		throw new NotImplementedException('not implemented, please implement copy() for '+_self);
	}
	
	def BooleanValue bEquals(Value rhs) {
		_self.devError('not implemented, please ask language designer to implement equals() for '+_self);
		throw new NotImplementedException('not implemented, please implement equals() for '+_self);
	}
	
	def Value plus(Value rhs) {
		_self.devError('not implemented, please ask language designer to implement plus() for '+_self);
		throw new NotImplementedException('not implemented, please implement plus() for '+_self);
	}
	def Value minus(Value rhs) {
		_self.devError('not implemented, please ask language designer to implement minus() for '+_self);
		throw new NotImplementedException('not implemented, please implement minus() for '+_self);
	}
	def Value mult(Value rhs) {
		_self.devError('not implemented, please ask language designer to implement mult() for '+_self);
		throw new NotImplementedException('not implemented, please implement mult() for '+_self);
	}
	def Value div(Value rhs) {
		_self.devError('not implemented, please ask language designer to implement div() for '+_self);
		throw new NotImplementedException('not implemented, please implement div() for '+_self);
	}
	def BooleanValue greater(Value rhs) {
		_self.devError('not implemented, please ask language designer to implement greater() for '+_self);
		throw new NotImplementedException('not implemented, please implement greater() for '+_self);
	}
	def BooleanValue lower(Value rhs) {
		_self.devError('not implemented, please ask language designer to implement lower() for '+_self);
		throw new NotImplementedException('not implemented, please implement lower() for '+_self);
	}
	def BooleanValue greaterOrEquals(Value rhs) {
		_self.devError('not implemented, please ask language designer to implement greaterOrEquals() for '+_self);
		throw new NotImplementedException('not implemented, please implement greaterOrEquals() for '+_self);
	}
	def BooleanValue lowerOrEquals(Value rhs) {
		_self.devError('not implemented, please ask language designer to implement lowerOrEquals(() for '+_self);
		throw new NotImplementedException('not implemented, please implement lowerOrEquals(() for '+_self);
	}
	def Value uminus() {
		_self.devError('not implemented, please ask language designer to implement uminus() for '+_self);
		throw new NotImplementedException('not implemented, please implement uminus() for '+_self);
	}
	
	// conversions
	def DecimalValue toDecimalValue() {
		_self.devError('not implemented, please ask language designer to implement toDecimalValue() for '+_self);
		throw new NotImplementedException('not implemented, please implement toDecimalValue() for '+_self);
	}
	
	def IntegerValue toIntegerValue() {
		_self.devError('not implemented, please ask language designer to implement toIntegerValue() for '+_self);
		throw new NotImplementedException('not implemented, please implement toIntegerValue() for '+_self);
	}
	
	def Boolean isKindOf(ValueType type){
		_self.devError('not implemented, please ask language designer to implement isKindOf() for '+_self);
		throw new NotImplementedException('not implemented, please implement isKindOf() for '+_self);
	}
	
	/*
	 * a human readable version of the value
	 */
	def String valueToString(){
		_self.devError('not implemented, please ask language designer to implement valueToString() for '+_self);
		throw new NotImplementedException('not implemented, please implement valueToString() for '+_self);
	}
	
	def Object rawValue(){
		_self.devError('not implemented, please ask language designer to implement rawValue() for '+_self);
		throw new NotImplementedException('not implemented, please implement rawValue() for '+_self);
	}
}

@Aspect(className=IntegerValue)
class IntegerValueAspect extends ValueAspect {

	def Value evaluate() {
//		_self.devInfo(_self.eContainerOfType(FCLModel).indentation+
//			' -> IntegerValue.evaluate '+_self);
		return _self;
	}
	def Value copy() {
		val IntegerValue aValue = QlFactory.eINSTANCE.createIntegerValue();
		aValue.intValue = _self.intValue;
		return aValue;
	}
	def BooleanValue bEquals(Value rhs) {
		if(rhs === null) return null;
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.intValue == rhs.toIntegerValue().intValue;
		return bValue;
	}
	def BooleanValue lower(Value rhs) {
		if(rhs === null) return null;
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.intValue < rhs.toIntegerValue().intValue;
		return bValue;
	}
	def BooleanValue lowerOrEquals(Value rhs) {
		if(rhs === null) return null;
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.intValue <= rhs.toIntegerValue().intValue;
		return bValue;
	}
	def BooleanValue greater(Value rhs) {
		if(rhs === null) return null;
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.intValue > rhs.toIntegerValue().intValue;
		return bValue;
	}
	def BooleanValue greaterOrEquals(Value rhs) {
		if(rhs === null) return null;
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.intValue >= rhs.toIntegerValue().intValue;
		return bValue;
	}
	def Value plus(Value rhs) {
		if(rhs === null) return null;
		val IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
		iValue.intValue = _self.intValue + rhs.toIntegerValue().intValue;
		return iValue;
	}
	def Value minus(Value rhs) {
		if(rhs === null) return null;
		val IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
		iValue.intValue = _self.intValue - rhs.toIntegerValue().intValue;
		return iValue;
	}
	def Value uminus() {
		val IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
		iValue.intValue = - _self.intValue;
		return iValue;
	}
	def Value mult(Value rhs) {
		if(rhs === null) return null;
		val IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
		iValue.intValue = _self.intValue * rhs.toIntegerValue().intValue;
		return iValue;
	}
	
	def Value div(Value rhs) {
		if(rhs === null) return null;
		val IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
		iValue.intValue = _self.intValue / rhs.toIntegerValue().intValue;
		return iValue;
	}	
	
	def DecimalValue toDecimalValue() {
		val DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
		fValue.decimalValue = _self.intValue;
		return fValue;
	}
	
	def IntegerValue toIntegerValue() {
		return _self;
	}
	def String valueToString(){
		return _self.intValue.toString();
	}
	
	def Object rawValue(){
		return _self.intValue;
	}
	
	def Boolean isKindOf(ValueType type){
		return type instanceof IntegerValueType;
	}
}

@Aspect(className=StringValue)
class StringValueAspect extends ValueAspect {
	def Value evaluate() {
		return _self;
	}
	
	def Value copy() {
		val StringValue aValue = QlFactory.eINSTANCE.createStringValue();
		aValue.stringValue = _self.stringValue;
		return aValue;
	}
	def BooleanValue bEquals(Value rhs) {
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		if(rhs instanceof StringValue) {
			bValue.booleanValue = _self.stringValue == (rhs as StringValue).stringValue;
		} else {
			bValue.booleanValue = false;
		}
		return bValue;
	}
	def String valueToString(){
		return _self.stringValue.toString();
	}
	def Object rawValue(){
		return _self.stringValue;
	}
	
	def Boolean isKindOf(ValueType type){
		return type instanceof StringValueType;
	}
}

@Aspect(className=BooleanValue)
class BooleanValueAspect extends ValueAspect {
	def Value evaluate() {
//		_self.devInfo(' -> BooleanValue.evaluate '+_self);
		return _self;
	}
	def Value copy() {
		val BooleanValue aValue = QlFactory.eINSTANCE.createBooleanValue();
		aValue.booleanValue = _self.booleanValue;
		return aValue;
	}
	def BooleanValue bEquals(Value rhs) {
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		if(rhs instanceof BooleanValue) {
			bValue.booleanValue = _self.booleanValue == (rhs as BooleanValue).booleanValue;
		} else {
			bValue.booleanValue = false;
		}
		return bValue;
	}

	def String valueToString(){
		return _self.booleanValue.toString();
	}
	def Object rawValue(){
		return _self.booleanValue;
	}
	
	
	def Boolean isKindOf(ValueType type){
		return type instanceof BooleanValueType;
	}
}

@Aspect(className=EnumerationCall , with=#[ValueAspect])
class EnumerationCallAspect extends CallAspect {

	def Value evaluate() {
		return _self;
	}
	
	def Value copy() {
		val EnumerationCall aValue = QlFactory.eINSTANCE.createEnumerationCall();
		aValue.enumerationLiteral = _self.enumerationLiteral;
		return aValue;
	}
	def BooleanValue bEquals(Value rhs) {
		if(rhs === null) return null;
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		if(rhs instanceof EnumerationCall){
			bValue.booleanValue = _self.enumerationLiteral == rhs.enumerationLiteral;
			return bValue;
		} else {
			return null;
		}
	}
	
	def String valueToString(){
		return _self.enumerationLiteral.name;
	}
	
	def Object rawValue(){
		return _self.enumerationLiteral;
	}
	
	def Boolean isKindOf(ValueType type){
		return type instanceof IntegerValueType;
	}
}
@Aspect(className=BasicUnaryExpression)
class BasicUnaryExpressionAspect extends UnaryExpressionAspect {
	def Value evaluate() {
		val Value lhs = _self.operand.evaluate();
		if(_self.operator == UnaryOperatorKind::UNARYMINUS) {
			return lhs.uminus();
		} else if(_self.operator == UnaryOperatorKind::NOT) {
			val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
			bValue.booleanValue = ! _self.operand.evaluateAsBoolean(); 
			return bValue;
		} else {
			throw new NotImplementedException('not implemented, please implement evaluate() for '+_self);			
		}
	}
}

@Aspect(className=DateValue)
class DateValueAspect extends ValueAspect {

}

@Aspect(className=DecimalValue)
class DecimalValueAspect extends ValueAspect {
	def Value evaluate() {
//		_self.devInfo(' -> BooleanValue.evaluate '+_self);
		return _self;
	}
	def Value copy() {
		val DecimalValue aValue = QlFactory.eINSTANCE.createDecimalValue();
		aValue.decimalValue = _self.decimalValue;
		return aValue;
	}
	def BooleanValue bEquals(Value rhs) {
		if(rhs === null) return null;
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		if(rhs instanceof DecimalValue) {
			bValue.booleanValue = _self.decimalValue == (rhs as DecimalValue).decimalValue;
		} else {
			bValue.booleanValue = false;
		}
		return bValue;
	}
	def BooleanValue lower(Value rhs) {
		if(rhs === null) return null;
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.decimalValue < rhs.toDecimalValue().decimalValue;
		return bValue;
	}
	def BooleanValue lowerOrEquals(Value rhs) {
		if(rhs === null) return null;
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.decimalValue <= rhs.toDecimalValue().decimalValue;
		return bValue;
	}
	def BooleanValue greater(Value rhs) {
		if(rhs === null) return null;
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.decimalValue > rhs.toDecimalValue().decimalValue;
		return bValue;
	}
	def BooleanValue greaterOrEquals(Value rhs) {
		if(rhs === null) return null;
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.decimalValue >= rhs.toDecimalValue().decimalValue;
		return bValue;
	}
	def Value plus(Value rhs) {
		if(rhs === null) return null;
		val DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
		fValue.decimalValue = _self.decimalValue + rhs.toDecimalValue().decimalValue;
		return fValue;
	}
	def Value minus(Value rhs) {
		if(rhs === null) return null;
		val DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
		fValue.decimalValue = _self.decimalValue - rhs.toDecimalValue().decimalValue;
		return fValue;
	}
	def Value uminus() {
		val DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
		fValue.decimalValue = - _self.decimalValue;
		return fValue;
	}
	def Value mult(Value rhs) {
		if(rhs === null) return null;
		val DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
		fValue.decimalValue = _self.decimalValue * rhs.toDecimalValue().decimalValue;
		return fValue;
	}
	
	def Value div(Value rhs) {
		if(rhs === null) return null;
		val DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
		fValue.decimalValue = _self.decimalValue / rhs.toDecimalValue().decimalValue;
		return fValue;
	}	
	
	def DecimalValue toDecimalValue() {
		val DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
		fValue.decimalValue = _self.decimalValue;
		return _self;
	}
	

	def String valueToString(){
		return _self.decimalValue.toString();
	}
	def Object rawValue(){
		return _self.decimalValue;
	}
	
	
	def Boolean isKindOf(ValueType type){
		return type instanceof BooleanValueType;
	}

}

@Aspect(className=ValueType)
class ValueTypeAspect extends NamedElementAspect {
	def Value createValue(String internalValue) {
		_self.devError('not implemented, please ask language designer to implement createValue() for '+_self);
		throw new NotImplementedException('not implemented, please implement createValue() for '+_self);
	}
	def Value createDefaultValue() {
		_self.devError('not implemented, please ask language designer to implement createDefaultValue() for '+_self);
		throw new NotImplementedException('not implemented, please implement createValue() for '+_self);
	}
}

@Aspect(className=BooleanValueType)
class BooleanValueTypeAspect extends ValueTypeAspect {
	def Value createValue(String internalValue) {
		val BooleanValue aValue = QlFactory.eINSTANCE.createBooleanValue();
		aValue.booleanValue = Boolean.parseBoolean(internalValue);
		return aValue;
	}
	def Value createDefaultValue() {
		val BooleanValue aValue = QlFactory.eINSTANCE.createBooleanValue();
		aValue.booleanValue = false;
		return aValue;
	}
}

@Aspect(className=IntegerValueType)
class IntegerValueTypeAspect extends ValueTypeAspect {
	def Value createValue(String internalValue) {
		val IntegerValue aValue = QlFactory.eINSTANCE.createIntegerValue();
		try {
			aValue.intValue = Integer.parseInt(internalValue);
		}
		catch (NumberFormatException e) { 
			// do not create value if it is invalid
			return null;
		}
		return aValue;
	}
	def Value createDefaultValue() {
		val IntegerValue aValue = QlFactory.eINSTANCE.createIntegerValue();
		aValue.intValue = 0;
		return aValue;
	}
}

@Aspect(className=DecimalValueType)
class DecimalValueTypeAspect extends ValueTypeAspect {
	def Value createValue(String internalValue) {
		val DecimalValue aValue = QlFactory.eINSTANCE.createDecimalValue();
		try {
			aValue.decimalValue = Float.parseFloat(internalValue);
		}
		catch (NumberFormatException e) { 
			// do not create value if it is invalid
			return null;
		}
		return aValue;
	}	
	def Value createDefaultValue() {
		val DecimalValue aValue = QlFactory.eINSTANCE.createDecimalValue();
		aValue.decimalValue = 0;
		return aValue;
	}
}
@Aspect(className=StringValueType)
class StringValueTypeAspect extends ValueTypeAspect {
	def Value createValue(String internalValue) {
		val StringValue aValue = QlFactory.eINSTANCE.createStringValue();
		aValue.stringValue = internalValue;
		return aValue;
	}
	def Value createDefaultValue() {
		val StringValue aValue = QlFactory.eINSTANCE.createStringValue();
		aValue.stringValue = "";
		return aValue;
	}
}

@Aspect(className=DateValueType)
class DateValueTypeAspect extends ValueTypeAspect {

}

@Aspect(className=EnumerationValueType)
class EnumerationValueTypeAspect extends ValueTypeAspect {
	def Value createValue(String internalValue) {
		
		val literal = _self.enumerationLiterals.findFirst[e | e.name == internalValue]
		if(literal !== null) {
			val EnumerationCall aValue = QlFactory.eINSTANCE.createEnumerationCall();
			aValue.enumerationLiteral = literal;
			return aValue;	
		} else {
			return null;
		}
	}
	
	def Value createDefaultValue() {
		if(!_self.enumerationLiterals.empty) {
			val EnumerationCall aValue = QlFactory.eINSTANCE.createEnumerationCall();
			aValue.enumerationLiteral = _self.enumerationLiterals.get(0);
			return aValue;	
		} else {
			return null;
		}
	}
}

@Aspect(className=EnumerationLiteral)
class EnumerationLiteralAspect extends NamedElementAspect {

}

@Aspect(className=NamedElement)
abstract class NamedElementAspect {

}

@Aspect(className=ConditionnalElement)
abstract class ConditionnalElementAspect {

}

@Aspect(className=QuestionGroup)
class QuestionGroupAspect extends ConditionnalElementAspect {
	@Step
	def void render() {
		_self.devInfo('QuestionGroupAspect guard='+_self.guard);
		
		if(_self.guard === null  || _self.guard.evaluateAsBoolean().booleanValue) {
			for( question : _self.questions) {
				question.questionDefinition.isDisplayed = true;
				question.show();
			}
		} else {
			for( question : _self.questions) {
				question.questionDefinition.isDisplayed = false;
			}
		}
		
		for(subGroup : _self.questionGroups) {
			subGroup.render();	
		}
	}
}

@Aspect(className=DefinitionGroup)
class DefinitionGroupAspect {

}

@Aspect(className=QuestionCall)
class QuestionCallAspect extends CallAspect {
	def Value evaluate() {
		return _self.question.currentValue;
	}
}



