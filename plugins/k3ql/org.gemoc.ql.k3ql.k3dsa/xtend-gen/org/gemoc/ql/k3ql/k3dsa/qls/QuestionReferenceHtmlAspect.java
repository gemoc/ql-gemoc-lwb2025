package org.gemoc.ql.k3ql.k3dsa.qls;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.k3ql.k3dsa.ql.QuestionDefinitionHtmlAspect;
import org.gemoc.qls.model.qls.QLSModel;
import org.gemoc.qls.model.qls.QuestionReference;

@Aspect(className = QuestionReference.class)
@SuppressWarnings("all")
public class QuestionReferenceHtmlAspect extends SectionContentHtmlAspect {
  public static String htmlStyledDiv(final QuestionReference _self) {
    final org.gemoc.ql.k3ql.k3dsa.qls.QuestionReferenceHtmlAspectQuestionReferenceAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.qls.QuestionReferenceHtmlAspectQuestionReferenceAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlStyledDiv()
    if (_self instanceof org.gemoc.qls.model.qls.QuestionReference){
    	result = org.gemoc.ql.k3ql.k3dsa.qls.QuestionReferenceHtmlAspect._privk3_htmlStyledDiv(_self_, (org.gemoc.qls.model.qls.QuestionReference)_self);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlStyledDiv(final QuestionReferenceHtmlAspectQuestionReferenceAspectProperties _self_, final QuestionReference _self) {
    boolean _isIsDisplayed = _self.getQuestion().isIsDisplayed();
    if (_isIsDisplayed) {
      return QuestionDefinitionHtmlAspect.htmlStyledField(_self.getQuestion(), EObjectAspect.<QLSModel>getContainerOfType(_self, QLSModel.class));
    } else {
      return "";
    }
  }
}
