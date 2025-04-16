package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.gemoc.ql.model.ql.DateValueType;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = DateValueType.class)
@SuppressWarnings("all")
public class DateValueTypeHtmlAspect extends ValueTypeHtmlAspect {
  public static String htmlField(final DateValueType _self, final String id, final String label, final Value currentValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspectDateValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspectDateValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField(String,String,Value)
    if (_self instanceof org.gemoc.ql.model.ql.DateValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.DateValueType)_self,id,label,currentValue);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlField(final DateValueTypeHtmlAspectDateValueTypeAspectProperties _self_, final DateValueType _self, final String id, final String label, final Value currentValue) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("<label for=\"");
    _builder.append(id, "\t\t      ");
    _builder.append("\">");
    _builder.append(label, "\t\t      ");
    _builder.append("</label>");
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
}
