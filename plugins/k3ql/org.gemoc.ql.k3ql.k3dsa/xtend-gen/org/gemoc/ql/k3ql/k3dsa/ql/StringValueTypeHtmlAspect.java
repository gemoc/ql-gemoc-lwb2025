package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.gemoc.ql.model.ql.StringValueType;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.qls.model.qls.QlsFactory;
import org.gemoc.qls.model.qls.QuestionStyle;
import org.gemoc.qls.model.qls.TextTypeStyle;
import org.gemoc.qls.model.qls.TypeStyle;

@Aspect(className = StringValueType.class)
@SuppressWarnings("all")
public class StringValueTypeHtmlAspect extends ValueTypeHtmlAspect {
  public static String htmlField(final StringValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle, final boolean readonly) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspectStringValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspectStringValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField(String,String,Value,QuestionStyle,boolean)
    if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.StringValueType)_self,id,label,currentValue,qStyle,readonly);
    };
    return (java.lang.String)result;
  }

  public static TypeStyle createDefaultTypeStyle(final StringValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspectStringValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspectStringValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TypeStyle createDefaultTypeStyle()
    if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect._privk3_createDefaultTypeStyle(_self_, (org.gemoc.ql.model.ql.StringValueType)_self);
    };
    return (org.gemoc.qls.model.qls.TypeStyle)result;
  }

  protected static String _privk3_htmlField(final StringValueTypeHtmlAspectStringValueTypeAspectProperties _self_, final StringValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle, final boolean readonly) {
    String value = "";
    if ((currentValue != null)) {
      value = ValueAspect.valueToString(currentValue);
    }
    if (readonly) {
      return ValueTypeHtmlAspect.htmlReadonlyField(_self, id, label, value, qStyle);
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div>");
      _builder.newLine();
      _builder.append("\t\t      ");
      String _htmlLabel = ValueTypeHtmlAspect.htmlLabel(_self, id, label, qStyle.getLabelStyle());
      _builder.append(_htmlLabel, "\t\t      ");
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

  protected static TypeStyle _privk3_createDefaultTypeStyle(final StringValueTypeHtmlAspectStringValueTypeAspectProperties _self_, final StringValueType _self) {
    final TextTypeStyle typeStype = QlsFactory.eINSTANCE.createTextTypeStyle();
    typeStype.setMultiline(false);
    return typeStype;
  }
}
