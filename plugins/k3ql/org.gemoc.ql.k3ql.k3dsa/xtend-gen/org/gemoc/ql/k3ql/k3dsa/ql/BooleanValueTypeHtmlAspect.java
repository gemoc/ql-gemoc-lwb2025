package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.BooleanValueType;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = BooleanValueType.class)
@SuppressWarnings("all")
public class BooleanValueTypeHtmlAspect extends ValueTypeHtmlAspect {
  public static String htmlField(final BooleanValueType _self, final String id, final String label, final Value currentValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspectBooleanValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspectBooleanValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField(String,String,Value)
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.BooleanValueType)_self,id,label,currentValue);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlField(final BooleanValueTypeHtmlAspectBooleanValueTypeAspectProperties _self_, final BooleanValueType _self, final String id, final String label, final Value currentValue) {
    String checked = "";
    if ((currentValue != null)) {
      boolean _isBooleanValue = ((BooleanValue) currentValue).isBooleanValue();
      if (_isBooleanValue) {
        checked = "checked";
      }
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
    _builder.append("<input type=\"checkbox\" id=\"");
    _builder.append(id, "\t\t      ");
    _builder.append("\" name=\"");
    _builder.append(id, "\t\t      ");
    _builder.append("\" ");
    _builder.append(checked, "\t\t      ");
    _builder.append(" onchange=\"onInputChange()\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t    ");
    _builder.append("</div>");
    return _builder.toString();
  }
}
