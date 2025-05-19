package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.gemoc.ql.model.ql.DateValueType;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.qls.model.qls.DateTypeStyle;
import org.gemoc.qls.model.qls.QlsFactory;
import org.gemoc.qls.model.qls.QuestionStyle;
import org.gemoc.qls.model.qls.TypeStyle;

@Aspect(className = DateValueType.class)
@SuppressWarnings("all")
public class DateValueTypeHtmlAspect extends ValueTypeHtmlAspect {
  public static String htmlField(final DateValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspectDateValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspectDateValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField(String,String,Value,QuestionStyle)
    if (_self instanceof org.gemoc.ql.model.ql.DateValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.DateValueType)_self,id,label,currentValue,qStyle);
    };
    return (java.lang.String)result;
  }

  public static TypeStyle createDefaultTypeStyle(final DateValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspectDateValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspectDateValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TypeStyle createDefaultTypeStyle()
    if (_self instanceof org.gemoc.ql.model.ql.DateValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect._privk3_createDefaultTypeStyle(_self_, (org.gemoc.ql.model.ql.DateValueType)_self);
    };
    return (org.gemoc.qls.model.qls.TypeStyle)result;
  }

  protected static String _privk3_htmlField(final DateValueTypeHtmlAspectDateValueTypeAspectProperties _self_, final DateValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("\t\t      ");
    String _htmlLabel = ValueTypeHtmlAspect.htmlLabel(_self, id, label, qStyle.getLabelStyle());
    _builder.append(_htmlLabel, "\t\t      ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t      ");
    _builder.append("<input type=\"date\" id=\"");
    _builder.append(id, "\t\t      ");
    _builder.append("\" name=\"");
    _builder.append(id, "\t\t      ");
    _builder.append("\" oninput=\"onInput()\" onchange=\"onChange()\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("</div>");
    return _builder.toString();
  }

  protected static TypeStyle _privk3_createDefaultTypeStyle(final DateValueTypeHtmlAspectDateValueTypeAspectProperties _self_, final DateValueType _self) {
    final DateTypeStyle typeStype = QlsFactory.eINSTANCE.createDateTypeStyle();
    return typeStype;
  }
}
