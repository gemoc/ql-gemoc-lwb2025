package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.gemoc.ql.model.ql.StringValueType;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = StringValueType.class)
@SuppressWarnings("all")
public class StringValueTypeHtmlAspect extends ValueTypeHtmlAspect {
  public static String htmlField(final StringValueType _self, final String id, final String label, final Value currentValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspectStringValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspectStringValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField(String,String,Value)
    if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.StringValueType)_self,id,label,currentValue);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlField(final StringValueTypeHtmlAspectStringValueTypeAspectProperties _self_, final StringValueType _self, final String id, final String label, final Value currentValue) {
    String value = "";
    if ((currentValue != null)) {
      value = ValueAspect.valueToString(currentValue);
    }
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
    _builder.append("<input type=\"text\" id=\"");
    _builder.append(id, "\t\t      ");
    _builder.append("\" name=\"");
    _builder.append(id, "\t\t      ");
    _builder.append("\"  value=\"");
    _builder.append(value, "\t\t      ");
    _builder.append("\" oninput=\"onInput()\" onchange=\"onChange()\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("</div>");
    return _builder.toString();
  }
}
