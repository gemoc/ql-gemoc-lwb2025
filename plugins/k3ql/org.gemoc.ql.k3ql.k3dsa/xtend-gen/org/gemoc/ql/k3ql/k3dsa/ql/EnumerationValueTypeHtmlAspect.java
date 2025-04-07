package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.gemoc.ql.model.ql.EnumerationLiteral;
import org.gemoc.ql.model.ql.EnumerationValueType;

@Aspect(className = EnumerationValueType.class)
@SuppressWarnings("all")
public class EnumerationValueTypeHtmlAspect extends ValueTypeHtmlAspect {
  public static String htmlField(final EnumerationValueType _self, final String id, final String label) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlField(String,String)
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.EnumerationValueType)_self,id,label);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlField(final EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectProperties _self_, final EnumerationValueType _self, final String id, final String label) {
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
    _builder.append("<select id=\"");
    _builder.append(id, "\t\t      ");
    _builder.append("\" name=\"");
    _builder.append(id, "\t\t      ");
    _builder.append("\" onchange=\"onUserChange(this)\">");
    _builder.newLineIfNotEmpty();
    {
      EList<EnumerationLiteral> _enumerationLiterals = _self.getEnumerationLiterals();
      for(final EnumerationLiteral lit : _enumerationLiterals) {
        _builder.append("\t\t      ");
        _builder.append("<option value=\"");
        String _name = lit.getName();
        _builder.append(_name, "\t\t      ");
        _builder.append("\">");
        String _name_1 = lit.getName();
        _builder.append(_name_1, "\t\t      ");
        _builder.append("</option>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t      ");
    _builder.append("</select>");
    _builder.newLine();
    _builder.append("\t\t    ");
    _builder.append("</div>");
    return _builder.toString();
  }
}
