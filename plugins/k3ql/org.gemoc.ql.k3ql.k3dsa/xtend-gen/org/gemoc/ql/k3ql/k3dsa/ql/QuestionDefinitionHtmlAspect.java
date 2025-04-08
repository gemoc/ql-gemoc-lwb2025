package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.QuestionDefinition;

/**
 * Aspects used by HTML Form presentation
 */
@Aspect(className = QuestionDefinition.class)
@SuppressWarnings("all")
public class QuestionDefinitionHtmlAspect extends NamedElementAspect {
  public static String htmlField(final QuestionDefinition _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspectQuestionDefinitionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField()
    if (_self instanceof org.gemoc.ql.model.ql.QuestionDefinition){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.QuestionDefinition)_self);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlField(final QuestionDefinitionHtmlAspectQuestionDefinitionAspectProperties _self_, final QuestionDefinition _self) {
    return DataTypeHtmlAspect.htmlField(_self.getDatatype(), _self.getName(), _self.getLabel(), _self.getCurrentValue());
  }
}
