package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.gemoc.ql.model.ql.DecimalValueType;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = DecimalValueType.class)
@SuppressWarnings("all")
public class DecimalValueTypeHtmlAspect extends ValueTypeHtmlAspect {
  public static String htmlField(final DecimalValueType _self, final String id, final String label, final Value currentValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspectDecimalValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspectDecimalValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField(String,String,Value)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.DecimalValueType)_self,id,label,currentValue);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlField(final DecimalValueTypeHtmlAspectDecimalValueTypeAspectProperties _self_, final DecimalValueType _self, final String id, final String label, final Value currentValue) {
    String value = "";
    if ((currentValue != null)) {
      value = ValueAspect.valueToString(currentValue);
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div>");
    _builder.newLine();
    _builder.append("\t\t        ");
    _builder.append("<label for=\"");
    _builder.append(id, "\t\t        ");
    _builder.append("\">");
    _builder.append(label, "\t\t        ");
    _builder.append("</label>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t        ");
    _builder.append("<input type=\"number\" id=\"");
    _builder.append(id, "\t\t        ");
    _builder.append("\" name=\"");
    _builder.append(id, "\t\t        ");
    _builder.append("\" min=\"0\" step=\"0.1\" value=\"");
    _builder.append(value, "\t\t        ");
    _builder.append("\"  onchange=\"onInputChange()\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("</div>");
    return _builder.toString();
  }
}
