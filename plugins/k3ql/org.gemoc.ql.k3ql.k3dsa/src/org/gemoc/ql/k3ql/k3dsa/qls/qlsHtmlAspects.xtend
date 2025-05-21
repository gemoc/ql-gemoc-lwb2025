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
import static extension org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.QLSModelAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.SectionHtmlAspect.*
import static extension org.gemoc.ql.k3ql.k3dsa.qls.SectionContentHtmlAspect.*

import static extension org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect.*
import org.gemoc.qls.model.qls.Section
import org.gemoc.qls.model.qls.QuestionReference
import org.gemoc.qls.model.qls.SectionContent
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect
import org.gemoc.ql.model.ql.QLModel


@Aspect (className=Section)
class SectionHtmlAspect extends SectionContentHtmlAspect {
	def String htmlStyledDiv() {
		if (_self.eAllContents.filter(QuestionReference).exists[qr | qr.question.isIsDisplayed ]) {
			_self.sectionContents
			return '''<div style="border: 1px solid #ccc; padding: 15px; margin-bottom: 10px;">
			  <h3>«_self.title»</h3>
			  	«FOR sectionContent : _self.sectionContents»«sectionContent.htmlStyledDiv»«ENDFOR»
			  </div>'''
		} else {
			return  ''
		}
	}
}

@Aspect (className=SectionContent)
class SectionContentHtmlAspect {
	def String htmlStyledDiv() {
		
		_self.devError('not implemented, please ask language designer to implement htmlStyledDiv() for '+_self);
		throw new NotImplementedException('not implemented, please implement htmlStyledDiv() for '+_self);
	}
}

@Aspect (className=QuestionReference)
class QuestionReferenceHtmlAspect  extends SectionContentHtmlAspect {
	def String htmlStyledDiv() {
		if(_self.question.isIsDisplayed)
			return _self.question.htmlStyledField(_self.getContainerOfType(QLSModel))
		else 
			return ''
	}
}


