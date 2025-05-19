package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.gemoc.ql.model.ql.EnumerationLiteral;
import org.gemoc.ql.model.ql.EnumerationValueType;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.qls.model.qls.EnumerationStyleKind;
import org.gemoc.qls.model.qls.EnumerationTypeStyle;
import org.gemoc.qls.model.qls.QlsFactory;
import org.gemoc.qls.model.qls.QuestionStyle;
import org.gemoc.qls.model.qls.TypeStyle;

@Aspect(className = EnumerationValueType.class)
@SuppressWarnings("all")
public class EnumerationValueTypeHtmlAspect extends ValueTypeHtmlAspect {
  public static String htmlField(final EnumerationValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle, final boolean readonly) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField(String,String,Value,QuestionStyle,boolean)
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.EnumerationValueType)_self,id,label,currentValue,qStyle,readonly);
    };
    return (java.lang.String)result;
  }

  public static TypeStyle createDefaultTypeStyle(final EnumerationValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# TypeStyle createDefaultTypeStyle()
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect._privk3_createDefaultTypeStyle(_self_, (org.gemoc.ql.model.ql.EnumerationValueType)_self);
    };
    return (org.gemoc.qls.model.qls.TypeStyle)result;
  }

  protected static String _privk3_htmlField(final EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectProperties _self_, final EnumerationValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle, final boolean readonly) {
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
      _builder.append("\t\t\t      ");
      String _htmlLabel = ValueTypeHtmlAspect.htmlLabel(_self, id, label, qStyle.getLabelStyle());
      _builder.append(_htmlLabel, "\t\t\t      ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t      ");
      _builder.append("<select id=\"");
      _builder.append(id, "\t\t\t      ");
      _builder.append("\" name=\"");
      _builder.append(id, "\t\t\t      ");
      _builder.append("\" onchange=\"onChange()\">");
      _builder.newLineIfNotEmpty();
      {
        EList<EnumerationLiteral> _enumerationLiterals = _self.getEnumerationLiterals();
        for(final EnumerationLiteral lit : _enumerationLiterals) {
          _builder.append("\t\t\t      ");
          _builder.append("<option value=\"");
          String _name = lit.getName();
          _builder.append(_name, "\t\t\t      ");
          _builder.append("\" ");
          {
            boolean _equals = lit.getName().equals(value);
            if (_equals) {
              _builder.append(" selected");
            }
          }
          _builder.append(">");
          String _name_1 = lit.getName();
          _builder.append(_name_1, "\t\t\t      ");
          _builder.append("</option>");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("\t\t\t      ");
      _builder.append("</select>");
      _builder.newLine();
      _builder.append("\t\t\t    ");
      _builder.append("</div>");
      return _builder.toString();
    }
  }

  protected static TypeStyle _privk3_createDefaultTypeStyle(final EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectProperties _self_, final EnumerationValueType _self) {
    final EnumerationTypeStyle typeStype = QlsFactory.eINSTANCE.createEnumerationTypeStyle();
    typeStype.setEnumerationStyleKing(EnumerationStyleKind.DROPDOWN);
    return typeStype;
  }
}
