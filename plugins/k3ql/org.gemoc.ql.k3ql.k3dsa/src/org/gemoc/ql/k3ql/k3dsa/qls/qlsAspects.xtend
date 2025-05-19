package org.gemoc.ql.k3ql.k3dsa.qls

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import org.gemoc.qls.model.qls.QLSModel
import org.gemoc.qls.model.qls.Import
import org.gemoc.qls.model.qls.TypeStyle
import org.gemoc.qls.model.qls.NumericTypeStyle
import org.gemoc.qls.model.qls.QuestionStyle
import org.gemoc.qls.model.qls.LabelStyle
import org.gemoc.qls.model.qls.BooleanTypeStyle
import org.gemoc.qls.model.qls.NumericTypeTextFieldStyle
import org.gemoc.qls.model.qls.NumericTypeSpinnerStyle
import org.gemoc.qls.model.qls.TextTypeStyle

import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import org.eclipse.emf.common.util.EList


import static extension org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.QLSModelAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.ImportAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.TypeStyleAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.NumericTypeStyleAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.QuestionStyleAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.LabelStyleAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.BooleanTypeStyleAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.NumericTypeTextFieldStyleAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.NumericTypeSpinnerStyleAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.TextTypeStyleAspect.*

import static extension org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect.*

@Aspect(className=QLSModel)
class QLSModelAspect {
	@Step 												
	@InitializeModel									
	def void initializeModel(EList<String> input){
		// forward entry point to styled QLModel 
		_self.styledQLModel.initializeModel(input)
	}
	
	@Step
	@Main
	def void main() {
		// forward entry point to styled QLModel 
		_self.styledQLModel.main()
	}
}

@Aspect(className=Import)
class ImportAspect {

}

@Aspect(className=TypeStyle)
class TypeStyleAspect {

}

@Aspect(className=NumericTypeStyle)
class NumericTypeStyleAspect extends TypeStyleAspect {

}

@Aspect(className=QuestionStyle)
class QuestionStyleAspect {

}

@Aspect(className=LabelStyle)
class LabelStyleAspect {

}

@Aspect(className=BooleanTypeStyle)
class BooleanTypeStyleAspect extends TypeStyleAspect {

}

@Aspect(className=NumericTypeTextFieldStyle)
class NumericTypeTextFieldStyleAspect extends NumericTypeStyleAspect {

}

@Aspect(className=NumericTypeSpinnerStyle)
class NumericTypeSpinnerStyleAspect extends NumericTypeStyleAspect {

}

@Aspect(className=TextTypeStyle)
class TextTypeStyleAspect extends TypeStyleAspect {

}




