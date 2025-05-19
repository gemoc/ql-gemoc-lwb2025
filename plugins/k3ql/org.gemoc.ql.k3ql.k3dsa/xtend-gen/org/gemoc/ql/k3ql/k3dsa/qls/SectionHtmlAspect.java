package org.gemoc.ql.k3ql.k3dsa.qls;

import com.google.common.collect.Iterators;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.gemoc.qls.model.qls.QuestionReference;
import org.gemoc.qls.model.qls.Section;
import org.gemoc.qls.model.qls.SectionContent;

@Aspect(className = Section.class)
@SuppressWarnings("all")
public class SectionHtmlAspect extends SectionContentHtmlAspect {
  public static String htmlStyledDiv(final Section _self) {
    final org.gemoc.ql.k3ql.k3dsa.qls.SectionHtmlAspectSectionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.qls.SectionHtmlAspectSectionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlStyledDiv()
    if (_self instanceof org.gemoc.qls.model.qls.Section){
    	result = org.gemoc.ql.k3ql.k3dsa.qls.SectionHtmlAspect._privk3_htmlStyledDiv(_self_, (org.gemoc.qls.model.qls.Section)_self);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlStyledDiv(final SectionHtmlAspectSectionAspectProperties _self_, final Section _self) {
    final Function1<QuestionReference, Boolean> _function = (QuestionReference qr) -> {
      return Boolean.valueOf(qr.getQuestion().isIsDisplayed());
    };
    boolean _exists = IteratorExtensions.<QuestionReference>exists(Iterators.<QuestionReference>filter(_self.eAllContents(), QuestionReference.class), _function);
    if (_exists) {
      _self.getSectionContents();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div style=\"border: 1px solid #ccc; padding: 15px; margin-bottom: 10px;\">");
      _builder.newLine();
      _builder.append("\t\t\t  ");
      _builder.append("<h3>");
      String _title = _self.getTitle();
      _builder.append(_title, "\t\t\t  ");
      _builder.append("</h3>");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t  \t");
      {
        EList<SectionContent> _sectionContents = _self.getSectionContents();
        for(final SectionContent sectionContent : _sectionContents) {
          String _htmlStyledDiv = SectionContentHtmlAspect.htmlStyledDiv(sectionContent);
          _builder.append(_htmlStyledDiv, "\t\t\t  \t");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t  ");
      _builder.append("</div>");
      return _builder.toString();
    } else {
      return "";
    }
  }
}
