package org.gemoc.ql.k3ql.k3dsa.ql

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.gemoc.ql.model.ql.QuestionDefinition
import org.gemoc.ql.model.ql.DataType


import static extension org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect.*
import org.gemoc.ql.model.ql.ValueType
import org.gemoc.ql.model.ql.BooleanValueType
import org.gemoc.ql.model.ql.IntegerValueType
import org.gemoc.ql.model.ql.DecimalValueType
import org.gemoc.ql.model.ql.StringValueType
import org.gemoc.ql.model.ql.DateValueType
import org.gemoc.ql.model.ql.EnumerationValueType

/* Aspects used by HTML Form presentation */

@Aspect(className=QuestionDefinition)
class QuestionDefinitionHtmlAspect extends NamedElementAspect {

	def  String htmlField() {
		return _self.datatype.htmlField(_self.name, _self.label) + " debug "+_self.name;
	}
}

@Aspect(className=DataType)
abstract class DataTypeHtmlAspect extends NamedElementAspect {

	abstract def String htmlField(String id, String label);
}

@Aspect(className=ValueType)
class ValueTypeHtmlAspect extends DataTypeHtmlAspect {
}

@Aspect(className=BooleanValueType)
class BooleanValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label){
		return '''<div>
		      <label for="«id»">«label»</label>
		      <input type="checkbox" id="«id»" name="«id»" value="false" onchange="onInputChange()">
		    </div>''';
	}
}

@Aspect(className=IntegerValueType)
class IntegerValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label){
		return '''
		    <div>
		      <label for="«id»">«label»</label>
		      <input type="number" id="«id»" name="«id»" min="0" step="1" onchange="onInputChange()">
		    </div>''';
	}
}

@Aspect(className=DecimalValueType)
class DecimalValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label){
		return '''<div>
		        <label for="«id»">«label»</label>
		        <input type="number" id="«id»" name="«id»" min="0" step="0.1" onchange="onInputChange()">
		    </div>''';
	}
}
@Aspect(className=StringValueType)
class StringValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label){
		
		return '''<div>
		      <label for="«id»">«label»</label>
		      <input type="text" id="«id»" name="«id»" oninput="onInputChange()">
		    </div>''';
	}
}

@Aspect(className=DateValueType)
class DateValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label){
		return '''<div>
		      <label for="«id»">«label»</label>
		      <input type="date" id="«id»" name="«id»" onchange="onInputChange()">
		    </div>''';
	}

}

@Aspect(className=EnumerationValueType)
class EnumerationValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label){
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
