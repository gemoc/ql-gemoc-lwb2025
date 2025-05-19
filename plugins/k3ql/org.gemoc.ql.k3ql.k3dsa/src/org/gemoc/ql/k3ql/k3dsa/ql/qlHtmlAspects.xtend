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

import static extension org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ql.ValueAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect.*
import org.gemoc.ql.model.ql.QLModel
import org.gemoc.qls.model.qls.QLSModel
import org.gemoc.qls.model.qls.QuestionStyle
import org.gemoc.qls.model.qls.QlsPackage
import org.gemoc.qls.model.qls.QlsFactory
import org.gemoc.qls.model.qls.TypeStyle
import org.gemoc.qls.model.qls.LabelStyle
import org.gemoc.qls.model.qls.BooleanStyleKind
import org.gemoc.qls.model.qls.EnumerationStyleKind
import org.gemoc.qls.model.qls.NumericTypeTextFieldStyle
import org.gemoc.qls.model.qls.NumericTypeSpinnerStyle
import org.gemoc.qls.model.qls.BooleanTypeStyle

/* Aspects used by HTML Form presentation */


@Aspect(className=QLModel)
class QLModelHtmlAspect {
	/**
	 * Minimalistic rendering of all displayed questions without styling
	 */
	def String htmlDiv() {
		
		val sb = new StringBuffer
		_self.eAllContents.filter(QuestionDefinition).filter[qd | qd.isDisplayed].forEach[ qd |
			sb.append(qd.htmlField())
			sb.append("\n")
		]
		
		return sb.toString()
	}
	
	/**
	 * Rendering of all displayed questions using provided styling
	 */
	def String htmlStyledDiv( QLSModel qlsModel) {
		val sb = new StringBuffer
		_self.eAllContents.filter(QuestionDefinition).filter[qd | qd.isDisplayed].forEach[ qd |
			sb.append(qd.htmlStyledField(qlsModel))
			sb.append("\n")
		]
		
		return sb.toString()
	}
}

@Aspect(className=QuestionDefinition)
class QuestionDefinitionHtmlAspect extends NamedElementAspect {

	

	def  String htmlField() {
		if(_self.appliedStyle === null) {
			// create a default style
			_self.appliedStyle = QlsFactory.eINSTANCE.createQuestionStyle
			_self.appliedStyle.labelStyle = QlsFactory.eINSTANCE.createLabelStyle
			_self.appliedStyle.typeStyle = _self.dataType.createDefaultTypeStyle
		}
		return _self.dataType.htmlField(_self.name, _self.label, _self.currentValue, _self.appliedStyle, _self.computedExpression !== null);
	}
	
	/**
	 * cache for the style applied to this question
	 */
	QuestionStyle appliedStyle
	
	def  String htmlStyledField(QLSModel qlsModel) {
		if(_self.appliedStyle === null) {
			val userDefinedStyle = qlsModel.eAllContents.filter(QuestionStyle).findFirst[qs | qs.styledQuestion == _self]
			if(userDefinedStyle !== null) {
				_self.appliedStyle = userDefinedStyle;
			} else {
				// create a default style
				_self.appliedStyle = QlsFactory.eINSTANCE.createQuestionStyle
				_self.appliedStyle.labelStyle = QlsFactory.eINSTANCE.createLabelStyle
				_self.appliedStyle.typeStyle = _self.dataType.createDefaultTypeStyle
			}
		}
		return _self.dataType.htmlField(_self.name, _self.label, _self.currentValue, _self.appliedStyle, _self.computedExpression !== null);
	}
}


@Aspect(className=ValueType)
class ValueTypeHtmlAspect  {
	def String htmlLabel(String id, String label, LabelStyle style) {
		// labelStyl may be null
		val bold = style !== null ? style.bold : false;
		val italic = style !== null ? style.italic : false;
		return '''«IF bold»<b>«ENDIF»«IF italic»<i>«ENDIF»<label for="«id»">«label»</label>«IF italic»</i>«ENDIF»«IF bold»</b>«ENDIF»'''
	}
	
	def String htmlField(String id, String label, Value currentValue, QuestionStyle qStyle, boolean readonly){
		
		_self.devError('not implemented, please ask language designer to implement evaluate() for '+_self);
		throw new NotImplementedException('not implemented, please implement evaluate() for '+_self);
	}
	
	def String htmlReadonlyField(String id, String label, String value, QuestionStyle qStyle) {
		
			return '''<div>
		      «_self.htmlLabel(id, label, qStyle.labelStyle)» «value» 
		    </div>'''
	}
	def TypeStyle createDefaultTypeStyle() {
		
		_self.devError('not implemented, please ask language designer to implement createDefaultTypeStyle() for '+_self);
		throw new NotImplementedException('not implemented, please implement createDefaultTypeStyle() for '+_self);
	}
}

@Aspect(className=BooleanValueType)
class BooleanValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue, QuestionStyle qStyle, boolean readonly){
		val booleanStyleKind = (qStyle.typeStyle as BooleanTypeStyle).booleanStyleKind
		switch booleanStyleKind {
				case TWO_RADIO: {
					var isChecked = false;
					if(currentValue !== null) {
						isChecked = (currentValue as BooleanValue).isBooleanValue
					}
					return '''<div>
				    	«_self.htmlLabel(id, label,qStyle.labelStyle)»
				      	<input type="radio" id="«id»" name="«id»" value="true" «IF isChecked»checked«ENDIF» oninput="onInput()" onchange="onChange()"«IF readonly» readonly«ENDIF»> <label for="«id»_true">Yes</label>
				      	<input type="radio" id="«id»_false" name="«id»" value="false" «IF !isChecked»checked«ENDIF» oninput="onInput()" onchange="onChange()"«IF readonly» readonly«ENDIF»> <label for="«id»_false">No</label>
				    </div>'''
				    
				   }
		    	default : {
		    		var String checked = ""
					if(currentValue !== null) {
						if((currentValue as BooleanValue).isBooleanValue) 
						checked = "checked";
					}
					return '''<div>
					      «_self.htmlLabel(id, label,qStyle.labelStyle)»
					      <input type="checkbox" id="«id»" name="«id»" «checked» oninput="onInput()" onchange="onChange()"«IF readonly» readonly«ENDIF»>
					    </div>'''
					    
				}			
		}
	}
	
	def TypeStyle createDefaultTypeStyle() {
		val typeStype = QlsFactory.eINSTANCE.createBooleanTypeStyle;
		typeStype.booleanStyleKind = BooleanStyleKind.CHECKBOX
		return typeStype;
	}
}

@Aspect(className=IntegerValueType)
class IntegerValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue, QuestionStyle qStyle, boolean readonly){
		var String value = ""
		if(currentValue !== null) {
			value = currentValue.valueToString
		}
		if (readonly) {
			return _self.htmlReadonlyField(id, label, value, qStyle)
		} else {
			val typeStyle = qStyle.typeStyle
			switch typeStyle {
				NumericTypeSpinnerStyle: {
					val step = typeStyle.step;
					return '''<div>
				    	«_self.htmlLabel(id, label,qStyle.labelStyle)»
				      	<input type="number" id="«id»" name="«id»" step="«step»" value="«value»" oninput="onInput()" onchange="onChange()">
				    </div>'''
				    
				   }
		    	default :
					return '''<div>
				    	«_self.htmlLabel(id, label,qStyle.labelStyle)»
				      	<input type="text" id="«id»" name="«id»" value="«value»" oninput="onInput()" onchange="onChange()">
				    </div>'''
		    }
		}
	}
	
	def TypeStyle createDefaultTypeStyle() {
		val typeStype = QlsFactory.eINSTANCE.createNumericTypeTextFieldStyle;
		return typeStype;
	}
}

@Aspect(className=DecimalValueType)
class DecimalValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue, QuestionStyle qStyle, boolean readonly){
		var String value = ""
		if(currentValue !== null) {
			value = currentValue.valueToString
		}
		if (readonly) {
			return _self.htmlReadonlyField(id, label, value, qStyle)
		} else {
			val typeStyle = qStyle.typeStyle
			switch typeStyle {
				NumericTypeSpinnerStyle: {
					val step = typeStyle.step;
					return '''<div>
				    	«_self.htmlLabel(id, label,qStyle.labelStyle)»
				      	<input type="number" id="«id»" name="«id»" step="«step»" value="«value»" oninput="onInput()" onchange="onChange()">
				    </div>'''
				    
				   }
		    	default :
					return '''<div>
				    	«_self.htmlLabel(id, label,qStyle.labelStyle)»
				      	<input type="text" id="«id»" name="«id»" value="«value»" oninput="onInput()" onchange="onChange()">
				    </div>'''
		    }    
		}
	}
	def TypeStyle createDefaultTypeStyle() {
		val typeStype = QlsFactory.eINSTANCE.createNumericTypeTextFieldStyle;
		return typeStype;
	}
}
@Aspect(className=StringValueType)
class StringValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue, QuestionStyle qStyle, boolean readonly){
		var String value = ""
		if(currentValue !== null) {
			value = currentValue.valueToString
		}
		if (readonly) {
			return _self.htmlReadonlyField(id, label, value, qStyle)
		} else {
			return '''<div>
		      «_self.htmlLabel(id, label,qStyle.labelStyle)»
		      <input type="text" id="«id»" name="«id»"  value="«value»" oninput="onInput()" onchange="onChange()">
		    </div>''';   
		 }
	}
	def TypeStyle createDefaultTypeStyle() {
		val typeStype = QlsFactory.eINSTANCE.createTextTypeStyle;
		typeStype.multiline = false
		return typeStype;
	}
}

@Aspect(className=DateValueType)
class DateValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue, QuestionStyle qStyle, boolean readonly){
		
		var String value = ""
		if(currentValue !== null) {
			value = currentValue.valueToString
		}
		if (readonly) {
			return _self.htmlReadonlyField(id, label, value, qStyle)
		} else {
			// TODO set currentValue
			return '''<div>
		      «_self.htmlLabel(id, label,qStyle.labelStyle)»
		      <input type="date" id="«id»" name="«id»" oninput="onInput()" onchange="onChange()">
		    </div>''';
		 }
	}
	def TypeStyle createDefaultTypeStyle() {
		val typeStype = QlsFactory.eINSTANCE.createDateTypeStyle;
		return typeStype;
	}

}

@Aspect(className=EnumerationValueType)
class EnumerationValueTypeHtmlAspect extends ValueTypeHtmlAspect {
	def String htmlField(String id, String label, Value currentValue, QuestionStyle qStyle, boolean readonly){
		var String value = ""
		if(currentValue !== null) {
			value = currentValue.valueToString
		}
		if (readonly) {
			return _self.htmlReadonlyField(id, label, value, qStyle)
		} else {
			return '''<div>
			      «_self.htmlLabel(id, label,qStyle.labelStyle)»
			      <select id="«id»" name="«id»" onchange="onChange()">
			      «FOR lit : _self.enumerationLiterals»
			      	<option value="«lit.name»" «IF lit.name.equals(value)» selected«ENDIF»>«lit.name»</option>
			       «ENDFOR»
			      </select>
			    </div>'''    
		}
	}
	
	def TypeStyle createDefaultTypeStyle() {
		val typeStype = QlsFactory.eINSTANCE.createEnumerationTypeStyle;
		typeStype.enumerationStyleKing = EnumerationStyleKind.DROPDOWN
		return typeStype;
	}
}
