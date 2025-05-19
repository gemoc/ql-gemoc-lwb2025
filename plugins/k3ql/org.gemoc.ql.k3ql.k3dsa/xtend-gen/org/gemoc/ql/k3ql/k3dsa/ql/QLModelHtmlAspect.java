package org.gemoc.ql.k3ql.k3dsa.ql;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.gemoc.ql.k3ql.k3dsa.qls.SectionHtmlAspect;
import org.gemoc.ql.model.ql.QLModel;
import org.gemoc.ql.model.ql.QuestionDefinition;
import org.gemoc.qls.model.qls.QLSModel;
import org.gemoc.qls.model.qls.QuestionReference;
import org.gemoc.qls.model.qls.Section;

/**
 * Aspects used by HTML Form presentation
 */
@Aspect(className = QLModel.class)
@SuppressWarnings("all")
public class QLModelHtmlAspect {
  /**
   * Minimalistic rendering of all displayed questions without styling
   */
  public static String htmlDiv(final QLModel _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelHtmlAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelHtmlAspectQLModelAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlDiv()
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.QLModelHtmlAspect._privk3_htmlDiv(_self_, (org.gemoc.ql.model.ql.QLModel)_self);
    };
    return (java.lang.String)result;
  }

  /**
   * Rendering of all displayed questions using provided styling
   */
  public static String htmlStyledDiv(final QLModel _self, final QLSModel qlsModel) {
    final org.gemoc.ql.k3ql.k3dsa.ql.QLModelHtmlAspectQLModelAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.QLModelHtmlAspectQLModelAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlStyledDiv(QLSModel)
    if (_self instanceof org.gemoc.ql.model.ql.QLModel){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.QLModelHtmlAspect._privk3_htmlStyledDiv(_self_, (org.gemoc.ql.model.ql.QLModel)_self,qlsModel);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlDiv(final QLModelHtmlAspectQLModelAspectProperties _self_, final QLModel _self) {
    final StringBuffer sb = new StringBuffer();
    final Function1<QuestionDefinition, Boolean> _function = (QuestionDefinition qd) -> {
      return Boolean.valueOf(qd.isIsDisplayed());
    };
    final Procedure1<QuestionDefinition> _function_1 = (QuestionDefinition qd) -> {
      sb.append(QuestionDefinitionHtmlAspect.htmlField(qd));
      sb.append("\n");
    };
    IteratorExtensions.<QuestionDefinition>forEach(IteratorExtensions.<QuestionDefinition>filter(Iterators.<QuestionDefinition>filter(_self.eAllContents(), QuestionDefinition.class), _function), _function_1);
    return sb.toString();
  }

  protected static String _privk3_htmlStyledDiv(final QLModelHtmlAspectQLModelAspectProperties _self_, final QLModel _self, final QLSModel qlsModel) {
    final StringBuffer sb = new StringBuffer();
    final Consumer<Section> _function = (Section s) -> {
      sb.append(SectionHtmlAspect.htmlStyledDiv(s));
      sb.append("\n");
    };
    qlsModel.getSections().forEach(_function);
    final Function1<QuestionDefinition, Boolean> _function_1 = (QuestionDefinition qd) -> {
      return Boolean.valueOf(qd.isIsDisplayed());
    };
    final Procedure1<QuestionDefinition> _function_2 = (QuestionDefinition qd) -> {
      final Function1<QuestionReference, Boolean> _function_3 = (QuestionReference qs) -> {
        QuestionDefinition _question = qs.getQuestion();
        return Boolean.valueOf(Objects.equal(_question, qd));
      };
      boolean _exists = IteratorExtensions.<QuestionReference>exists(Iterators.<QuestionReference>filter(qlsModel.eAllContents(), QuestionReference.class), _function_3);
      boolean _not = (!_exists);
      if (_not) {
        sb.append(QuestionDefinitionHtmlAspect.htmlStyledField(qd, qlsModel));
        sb.append("\n");
      }
    };
    IteratorExtensions.<QuestionDefinition>forEach(IteratorExtensions.<QuestionDefinition>filter(Iterators.<QuestionDefinition>filter(_self.eAllContents(), QuestionDefinition.class), _function_1), _function_2);
    return sb.toString();
  }
}
