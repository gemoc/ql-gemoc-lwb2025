package org.gemoc.ql.k3ql.k3dsa.ql

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.gemoc.ql.model.ql.QuestionDefinition
import org.gemoc.ql.model.ql.ValueType
import org.gemoc.ql.model.ql.BooleanValueType
import org.gemoc.ql.model.ql.IntegerValueType
import org.gemoc.ql.model.ql.DecimalValueType
import org.gemoc.ql.model.ql.StringValueType
import org.gemoc.ql.model.ql.DateValueType
import org.gemoc.ql.model.ql.EnumerationValueType
import org.gemoc.ql.model.ql.Value
import org.gemoc.ql.model.ql.BooleanValue
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException

import static extension org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect.*

/* Aspects used by HTML Form presentation */

@Aspect(className=QuestionDefinition)
class QuestionDefinitionHtmlAspect extends NamedElementAspect {

	def  String htmlField() {
		
		return _self.dataType.htmlField(_self.name, _self.label, _self.currentValue);
	}
}


@Aspect(className=ValueType)
class ValueTypeHtmlAspect  {
	def String htmlField(String id, String label, Value currentValue){
		
		_self.devError('not implemented, please ask language designer to implement evaluate() for '+_self);
		throw new NotImplementedException('not implemented, please implement evaluate() for '+_self);
	}
}

@Aspect(className=BooleanValueType)
class BooleanValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue){
		var String checked = ""
		if(currentValue !== null) {
			if((currentValue as BooleanValue).isBooleanValue) checked = "checked";
		}
		return '''<div>
		      <label for="«id»">«label»</label>
		      <input type="checkbox" id="«id»" name="«id»" «checked» onchange="onInputChange()">
		    </div>''';
	}
}

@Aspect(className=IntegerValueType)
class IntegerValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue){
		var String value = ""
		if(currentValue !== null) {
			value = currentValue.valueToString
		}
		return '''
		    <div>
		      <label for="«id»">«label»</label>
		      <input type="number" id="«id»" name="«id»" min="0" step="1" value="«value»" onchange="onInputChange()">
		    </div>''';
	}
}

@Aspect(className=DecimalValueType)
class DecimalValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue){
		var String value = ""
		if(currentValue !== null) {
			value = currentValue.valueToString
		}
		return '''<div>
		        <label for="«id»">«label»</label>
		        <input type="number" id="«id»" name="«id»" min="0" step="0.1" value="«value»"  onchange="onInputChange()">
		    </div>''';
	}
}
@Aspect(className=StringValueType)
class StringValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue){
		var String value = ""
		if(currentValue !== null) {
			value = currentValue.valueToString
		}
		return '''<div>
		      <label for="«id»">«label»</label>
		      <input type="text" id="«id»" name="«id»"  value="«value»" oninput="onInputChange()">
		    </div>''';
	}
}

@Aspect(className=DateValueType)
class DateValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue){
		// TODO set currentValue
		return '''<div>
		      <label for="«id»">«label»</label>
		      <input type="date" id="«id»" name="«id»" onchange="onInputChange()">
		    </div>''';
	}

}

@Aspect(className=EnumerationValueType)
class EnumerationValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue){
		// TODO set currentValue
		return '''<div>
		      <label for="«id»">«label»</label>
		      <select id="«id»" name="«id»" onchange="onInputChange()">
		      «FOR lit : _self.enumerationLiterals»
		        <option value="«lit.name»">«lit.name»</option>
		       «ENDFOR»
		      </select>
		    </div>'''
	}
	
}
