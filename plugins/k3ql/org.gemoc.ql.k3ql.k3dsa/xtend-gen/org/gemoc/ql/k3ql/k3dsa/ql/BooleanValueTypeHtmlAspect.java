package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.BooleanValueType;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.qls.model.qls.BooleanStyleKind;
import org.gemoc.qls.model.qls.BooleanTypeStyle;
import org.gemoc.qls.model.qls.QlsFactory;
import org.gemoc.qls.model.qls.QuestionStyle;
import org.gemoc.qls.model.qls.TypeStyle;

@Aspect(className = BooleanValueType.class)
@SuppressWarnings("all")
public class BooleanValueTypeHtmlAspect extends ValueTypeHtmlAspect {
  public static String htmlField(final BooleanValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle, final boolean readonly) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspectBooleanValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspectBooleanValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField(String,String,Value,QuestionStyle,boolean)
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.BooleanValueType)_self,id,label,currentValue,qStyle,readonly);
    };
    return (java.lang.String)result;
  }

  public static TypeStyle createDefaultTypeStyle(final BooleanValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspectBooleanValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspectBooleanValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TypeStyle createDefaultTypeStyle()
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect._privk3_createDefaultTypeStyle(_self_, (org.gemoc.ql.model.ql.BooleanValueType)_self);
    };
    return (org.gemoc.qls.model.qls.TypeStyle)result;
  }

  protected static String _privk3_htmlField(final BooleanValueTypeHtmlAspectBooleanValueTypeAspectProperties _self_, final BooleanValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle, final boolean readonly) {
    BooleanStyleKind _xifexpression = null;
    if (((qStyle != null) && (qStyle.getTypeStyle() != null))) {
      TypeStyle _typeStyle = qStyle.getTypeStyle();
      _xifexpression = ((BooleanTypeStyle) _typeStyle).getBooleanStyleKind();
    } else {
      _xifexpression = BooleanStyleKind.CHECKBOX;
    }
    final BooleanStyleKind booleanStyleKind = _xifexpression;
    if (booleanStyleKind != null) {
      switch (booleanStyleKind) {
        case TWO_RADIO:
          boolean isChecked = false;
          if ((currentValue != null)) {
            isChecked = ((BooleanValue) currentValue).isBooleanValue();
          }
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<div>");
          _builder.newLine();
          _builder.append("\t\t\t\t    \t");
          String _htmlLabel = ValueTypeHtmlAspect.htmlLabel(_self, id, label, qStyle.getLabelStyle());
          _builder.append(_htmlLabel, "\t\t\t\t    \t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t      \t");
          _builder.append("<input type=\"radio\" id=\"");
          _builder.append(id, "\t\t\t\t      \t");
          _builder.append("\" name=\"");
          _builder.append(id, "\t\t\t\t      \t");
          _builder.append("\" value=\"true\" ");
          {
            if (isChecked) {
              _builder.append("checked");
            }
          }
          _builder.append(" oninput=\"onInput()\" onchange=\"onChange()\"");
          {
            if (readonly) {
              _builder.append(" readonly");
            }
          }
          _builder.append("> <label for=\"");
          _builder.append(id, "\t\t\t\t      \t");
          _builder.append("_true\">Yes</label>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t      \t");
          _builder.append("<input type=\"radio\" id=\"");
          _builder.append(id, "\t\t\t\t      \t");
          _builder.append("_false\" name=\"");
          _builder.append(id, "\t\t\t\t      \t");
          _builder.append("\" value=\"false\" ");
          {
            if ((!isChecked)) {
              _builder.append("checked");
            }
          }
          _builder.append(" oninput=\"onInput()\" onchange=\"onChange()\"");
          {
            if (readonly) {
              _builder.append(" readonly");
            }
          }
          _builder.append("> <label for=\"");
          _builder.append(id, "\t\t\t\t      \t");
          _builder.append("_false\">No</label>");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t    ");
          _builder.append("</div>");
          return _builder.toString();
        default:
          {
            String checked = "";
            if ((currentValue != null)) {
              boolean _isBooleanValue = ((BooleanValue) currentValue).isBooleanValue();
              if (_isBooleanValue) {
                checked = "checked";
              }
            }
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("<div>");
            _builder_1.newLine();
            _builder_1.append("\t\t\t\t\t      ");
            String _htmlLabel_1 = ValueTypeHtmlAspect.htmlLabel(_self, id, label, qStyle.getLabelStyle());
            _builder_1.append(_htmlLabel_1, "\t\t\t\t\t      ");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t\t\t\t\t      ");
            _builder_1.append("<input type=\"checkbox\" id=\"");
            _builder_1.append(id, "\t\t\t\t\t      ");
            _builder_1.append("\" name=\"");
            _builder_1.append(id, "\t\t\t\t\t      ");
            _builder_1.append("\" ");
            _builder_1.append(checked, "\t\t\t\t\t      ");
            _builder_1.append(" oninput=\"onInput()\" onchange=\"onChange()\"");
            {
              if (readonly) {
                _builder_1.append(" readonly");
              }
            }
            _builder_1.append(">");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t\t\t\t\t    ");
            _builder_1.append("</div>");
            return _builder_1.toString();
          }
      }
    } else {
      {
        String checked = "";
        if ((currentValue != null)) {
          boolean _isBooleanValue = ((BooleanValue) currentValue).isBooleanValue();
          if (_isBooleanValue) {
            checked = "checked";
          }
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<div>");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t      ");
        String _htmlLabel_1 = ValueTypeHtmlAspect.htmlLabel(_self, id, label, qStyle.getLabelStyle());
        _builder_1.append(_htmlLabel_1, "\t\t\t\t\t      ");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t\t\t\t      ");
        _builder_1.append("<input type=\"checkbox\" id=\"");
        _builder_1.append(id, "\t\t\t\t\t      ");
        _builder_1.append("\" name=\"");
        _builder_1.append(id, "\t\t\t\t\t      ");
        _builder_1.append("\" ");
        _builder_1.append(checked, "\t\t\t\t\t      ");
        _builder_1.append(" oninput=\"onInput()\" onchange=\"onChange()\"");
        {
          if (readonly) {
            _builder_1.append(" readonly");
          }
        }
        _builder_1.append(">");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t\t\t\t\t    ");
        _builder_1.append("</div>");
        return _builder_1.toString();
      }
    }
  }

  protected static TypeStyle _privk3_createDefaultTypeStyle(final BooleanValueTypeHtmlAspectBooleanValueTypeAspectProperties _self_, final BooleanValueType _self) {
    final BooleanTypeStyle typeStype = QlsFactory.eINSTANCE.createBooleanTypeStyle();
    typeStype.setBooleanStyleKind(BooleanStyleKind.CHECKBOX);
    return typeStype;
  }
}
