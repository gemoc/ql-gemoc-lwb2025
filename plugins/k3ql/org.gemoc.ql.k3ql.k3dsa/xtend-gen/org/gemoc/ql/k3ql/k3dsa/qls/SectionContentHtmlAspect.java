package org.gemoc.ql.k3ql.k3dsa.qls;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.qls.model.qls.SectionContent;

@Aspect(className = SectionContent.class)
@SuppressWarnings("all")
public class SectionContentHtmlAspect {
  public static String htmlStyledDiv(final SectionContent _self) {
    final org.gemoc.ql.k3ql.k3dsa.qls.SectionContentHtmlAspectSectionContentAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.qls.SectionContentHtmlAspectSectionContentAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.qls.SectionContentHtmlAspect#String htmlStyledDiv() from org.gemoc.ql.k3ql.k3dsa.qls.SectionHtmlAspect
    		if (_self instanceof org.gemoc.qls.model.qls.Section){
    			result = org.gemoc.ql.k3ql.k3dsa.qls.SectionHtmlAspect.htmlStyledDiv((org.gemoc.qls.model.qls.Section)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.qls.SectionContentHtmlAspect#String htmlStyledDiv() from org.gemoc.ql.k3ql.k3dsa.qls.SectionHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.qls.SectionContentHtmlAspect#String htmlStyledDiv() from org.gemoc.ql.k3ql.k3dsa.qls.QuestionReferenceHtmlAspect
    		if (_self instanceof org.gemoc.qls.model.qls.QuestionReference){
    			result = org.gemoc.ql.k3ql.k3dsa.qls.QuestionReferenceHtmlAspect.htmlStyledDiv((org.gemoc.qls.model.qls.QuestionReference)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.qls.SectionContentHtmlAspect#String htmlStyledDiv() from org.gemoc.ql.k3ql.k3dsa.qls.QuestionReferenceHtmlAspect
    // #DispatchPointCut_before# String htmlStyledDiv()
    if (_self instanceof org.gemoc.qls.model.qls.SectionContent){
    	result = org.gemoc.ql.k3ql.k3dsa.qls.SectionContentHtmlAspect._privk3_htmlStyledDiv(_self_, (org.gemoc.qls.model.qls.SectionContent)_self);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlStyledDiv(final SectionContentHtmlAspectSectionContentAspectProperties _self_, final SectionContent _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement htmlStyledDiv() for " + _self));
      throw new NotImplementedException(("not implemented, please implement htmlStyledDiv() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
