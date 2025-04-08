package org.gemoc.ql.k3ql.k3dsa.ql

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.gemoc.ql.model.ql.QLModel
import org.gemoc.ql.model.ql.Form
import org.gemoc.ql.model.ql.Question
import org.gemoc.ql.model.ql.QuestionDefinition
import org.gemoc.ql.model.ql.DataType
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
import static extension org.gemoc.ql.k3ql.k3dsa.ql.DataTypeAspect.*
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

@Aspect(className=QLModel)
class QLModelAspect {
	
	@Step 												
	@InitializeModel									
	def void initializeModel(EList<String> input){
		_self.devInfo('-> initializeModel() input='+input.get(0));
	}
	
	@Main
	def void main() {
		_self.devInfo('-> main() ');
		
		var int i = 100;
		while(i > 0) {
			// TODO find/define what is a end condition for the evaluation of the questionnaire/form (maybe a "submit button" ?)
			
			// recompute which question must be displayed
			_self.resetIsDisplayed();
			for( f : _self.forms) {
				f.render();
			}
			// wait for an input
			_self.waitUserInput();
			// for all rendered questions, update the model with the value in the UI  
			for( g : _self.definitionGroup) {
				for (qd : g.questionDefinitions) {
					if(qd.isDisplayed) {
						qd.updateCurrentValueFromUI();
					}
				}
			}
			
			i--;
		}
//		// while not on a final mode
//		while(! _self.modeAutomata.currentMode.final){ 
//			_self.manageInputScenario();
//			_self.evaluateModeAutomata();
//			_self.evaluateDataflow();
//		}
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
		for( g : _self.definitionGroup) {
			for (qd : g.questionDefinitions) {
				qd.isDisplayed = false
			}
		}	
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
		
	}
}

@Aspect(className=QuestionDefinition)
class QuestionDefinitionAspect extends NamedElementAspect {
	
	/** this step is captured by the EngineAddons to concretely update the currentValue from the value in the UI form */
	@Step
	def void updateCurrentValueFromUI(){
		
	}
}

@Aspect(className=DataType)
abstract class DataTypeAspect extends NamedElementAspect {

}

@Aspect(className=Expression)
abstract class ExpressionAspect {
	/**
	 * evaluate the expression and get the boolean
	 * if not a boolean raise an exception and stop
	 */ 
	def boolean evaluateAsBoolean(){
		val Value internalResult = _self.evaluate();
		var boolean result = false;
		if(internalResult instanceof BooleanValue) {
			result = internalResult.booleanValue;
		} else {
			throw new QLException('expected a boolean but got '+internalResult);
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
	
	def Boolean isKindOf(DataType type){
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
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.intValue == rhs.toIntegerValue().intValue;
		return bValue;
	}
	def BooleanValue lower(Value rhs) {
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.intValue < rhs.toIntegerValue().intValue;
		return bValue;
	}
	def BooleanValue lowerOrEquals(Value rhs) {
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.intValue <= rhs.toIntegerValue().intValue;
		return bValue;
	}
	def BooleanValue greater(Value rhs) {
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.intValue > rhs.toIntegerValue().intValue;
		return bValue;
	}
	def BooleanValue greaterOrEquals(Value rhs) {
		val BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
		bValue.booleanValue = _self.intValue >= rhs.toIntegerValue().intValue;
		return bValue;
	}
	def Value plus(Value rhs) {
		val IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
		iValue.intValue = _self.intValue + rhs.toIntegerValue().intValue;
		return iValue;
	}
	def Value minus(Value rhs) {
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
		val IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
		iValue.intValue = _self.intValue * rhs.toIntegerValue().intValue;
		return iValue;
	}
	
	def Value div(Value rhs) {
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
	
	def Boolean isKindOf(DataType type){
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
	
	def Boolean isKindOf(DataType type){
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
	
	
	def Boolean isKindOf(DataType type){
		return type instanceof BooleanValueType;
	}
}

@Aspect(className=BasicUnaryExpression)
class BasicUnaryExpressionAspect extends UnaryExpressionAspect {

}

@Aspect(className=DateValue)
class DateValueAspect extends ValueAspect {

}

@Aspect(className=DecimalValue)
class DecimalValueAspect extends ValueAspect {

}

@Aspect(className=ValueType)
class ValueTypeAspect extends DataTypeAspect {
	def Value createValue(String internalValue) {
		_self.devError('not implemented, please ask language designer to implement createValue() for '+_self);
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
}
@Aspect(className=StringValueType)
class StringValueTypeAspect extends ValueTypeAspect {
	def Value createValue(String internalValue) {
		val StringValue aValue = QlFactory.eINSTANCE.createStringValue();
		aValue.stringValue = internalValue;
		return aValue;
	}
}

@Aspect(className=DateValueType)
class DateValueTypeAspect extends ValueTypeAspect {

}

@Aspect(className=EnumerationValueType)
class EnumerationValueTypeAspect extends ValueTypeAspect {
	
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
		if(_self.guard === null /* || guard evaluates to True */) {
			for( question : _self.questions) {
				question.questionDefinition.isDisplayed = true;
				question.show();
			}
		}
		// TODO evaluate guard
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

}



