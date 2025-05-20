package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.gemoc.ql.model.ql.DecimalValueType;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.qls.model.qls.NumericTypeSpinnerStyle;
import org.gemoc.qls.model.qls.NumericTypeTextFieldStyle;
import org.gemoc.qls.model.qls.QlsFactory;
import org.gemoc.qls.model.qls.QuestionStyle;
import org.gemoc.qls.model.qls.TypeStyle;

@Aspect(className = DecimalValueType.class)
@SuppressWarnings("all")
public class DecimalValueTypeHtmlAspect extends ValueTypeHtmlAspect {
  public static String htmlField(final DecimalValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle, final boolean readonly) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspectDecimalValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspectDecimalValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField(String,String,Value,QuestionStyle,boolean)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.DecimalValueType)_self,id,label,currentValue,qStyle,readonly);
    };
    return (java.lang.String)result;
  }

  public static TypeStyle createDefaultTypeStyle(final DecimalValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspectDecimalValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspectDecimalValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TypeStyle createDefaultTypeStyle()
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect._privk3_createDefaultTypeStyle(_self_, (org.gemoc.ql.model.ql.DecimalValueType)_self);
    };
    return (org.gemoc.qls.model.qls.TypeStyle)result;
  }

  protected static String _privk3_htmlField(final DecimalValueTypeHtmlAspectDecimalValueTypeAspectProperties _self_, final DecimalValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle, final boolean readonly) {
    String value = "";
    if ((currentValue != null)) {
      value = ValueAspect.valueToString(currentValue);
    }
    if (readonly) {
      return ValueTypeHtmlAspect.htmlReadonlyField(_self, id, label, value, qStyle);
    } else {
      TypeStyle _xifexpression = null;
      if (((qStyle != null) && (qStyle.getTypeStyle() != null))) {
        _xifexpression = qStyle.getTypeStyle();
      } else {
        _xifexpression = null;
      }
      final TypeStyle typeStyle = _xifexpression;
      boolean _matched = false;
      if (typeStyle instanceof NumericTypeSpinnerStyle) {
        _matched=true;
        final double step = ((NumericTypeSpinnerStyle)typeStyle).getStep();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<div>");
        _builder.newLine();
        _builder.append("\t\t\t\t    \t");
        String _htmlLabel = ValueTypeHtmlAspect.htmlLabel(_self, id, label, qStyle.getLabelStyle());
        _builder.append(_htmlLabel, "\t\t\t\t    \t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t      \t");
        _builder.append("<input type=\"number\" id=\"");
        _builder.append(id, "\t\t\t\t      \t");
        _builder.append("\" name=\"");
        _builder.append(id, "\t\t\t\t      \t");
        _builder.append("\" step=\"");
        _builder.append(step, "\t\t\t\t      \t");
        _builder.append("\" value=\"");
        _builder.append(value, "\t\t\t\t      \t");
        _builder.append("\" oninput=\"onInput()\" onchange=\"onChange()\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t    ");
        _builder.append("</div>");
        return _builder.toString();
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<div>");
      _builder.newLine();
      _builder.append("\t\t\t\t    \t");
      String _htmlLabel = ValueTypeHtmlAspect.htmlLabel(_self, id, label, qStyle.getLabelStyle());
      _builder.append(_htmlLabel, "\t\t\t\t    \t");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t      \t");
      _builder.append("<input type=\"text\" id=\"");
      _builder.append(id, "\t\t\t\t      \t");
      _builder.append("\" name=\"");
      _builder.append(id, "\t\t\t\t      \t");
      _builder.append("\" value=\"");
      _builder.append(value, "\t\t\t\t      \t");
      _builder.append("\" oninput=\"onInput()\" onchange=\"onChange()\">");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t    ");
      _builder.append("</div>");
      return _builder.toString();
    }
  }

  protected static TypeStyle _privk3_createDefaultTypeStyle(final DecimalValueTypeHtmlAspectDecimalValueTypeAspectProperties _self_, final DecimalValueType _self) {
    final NumericTypeTextFieldStyle typeStype = QlsFactory.eINSTANCE.createNumericTypeTextFieldStyle();
    return typeStype;
  }
}
