package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.gemoc.ql.model.ql.IntegerValueType;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = IntegerValueType.class)
@SuppressWarnings("all")
public class IntegerValueTypeHtmlAspect extends ValueTypeHtmlAspect {
  public static String htmlField(final IntegerValueType _self, final String id, final String label, final Value currentValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspectIntegerValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspectIntegerValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField(String,String,Value)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.IntegerValueType)_self,id,label,currentValue);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlField(final IntegerValueTypeHtmlAspectIntegerValueTypeAspectProperties _self_, final IntegerValueType _self, final String id, final String label, final Value currentValue) {
    String value = "";
    if ((currentValue != null)) {
      value = ValueAspect.valueToString(currentValue);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<label for=\"");
    _builder.append(id, "  ");
    _builder.append("\">");
    _builder.append(label, "  ");
    _builder.append("</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    _builder.append("<input type=\"number\" id=\"");
    _builder.append(id, "  ");
    _builder.append("\" name=\"");
    _builder.append(id, "  ");
    _builder.append("\" min=\"0\" step=\"1\" value=\"");
    _builder.append(value, "  ");
    _builder.append("\" oninput=\"onInput()\" onchange=\"onChange()\">");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    return _builder.toString();
  }
}
