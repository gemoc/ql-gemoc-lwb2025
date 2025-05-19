package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;
import org.gemoc.qls.model.qls.LabelStyle;
import org.gemoc.qls.model.qls.QuestionStyle;
import org.gemoc.qls.model.qls.TypeStyle;

@Aspect(className = ValueType.class)
@SuppressWarnings("all")
public class ValueTypeHtmlAspect {
  public static String htmlLabel(final ValueType _self, final String id, final String label, final LabelStyle style) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspectValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspectValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String htmlLabel(String,String,LabelStyle)
    if (_self instanceof org.gemoc.ql.model.ql.ValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect._privk3_htmlLabel(_self_, (org.gemoc.ql.model.ql.ValueType)_self,id,label,style);
    };
    return (java.lang.String)result;
  }

  public static String htmlField(final ValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle, final boolean readonly) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspectValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspectValueTypeAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DateValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.DateValueType)_self,id,label,currentValue,qStyle,readonly);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.DecimalValueType)_self,id,label,currentValue,qStyle,readonly);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.StringValueType)_self,id,label,currentValue,qStyle,readonly);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.BooleanValueType)_self,id,label,currentValue,qStyle,readonly);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.IntegerValueType)_self,id,label,currentValue,qStyle,readonly);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.EnumerationValueType)_self,id,label,currentValue,qStyle,readonly);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value,QuestionStyle,boolean) from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect
    // #DispatchPointCut_before# String htmlField(String,String,Value,QuestionStyle,boolean)
    if (_self instanceof org.gemoc.ql.model.ql.ValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.ValueType)_self,id,label,currentValue,qStyle,readonly);
    };
    return (java.lang.String)result;
  }

  public static TypeStyle createDefaultTypeStyle(final ValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspectValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspectValueTypeAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect.createDefaultTypeStyle((org.gemoc.ql.model.ql.BooleanValueType)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect.createDefaultTypeStyle((org.gemoc.ql.model.ql.DecimalValueType)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect.createDefaultTypeStyle((org.gemoc.ql.model.ql.StringValueType)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect.createDefaultTypeStyle((org.gemoc.ql.model.ql.IntegerValueType)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect.createDefaultTypeStyle((org.gemoc.ql.model.ql.EnumerationValueType)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DateValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect.createDefaultTypeStyle((org.gemoc.ql.model.ql.DateValueType)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#TypeStyle createDefaultTypeStyle() from org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect
    // #DispatchPointCut_before# TypeStyle createDefaultTypeStyle()
    if (_self instanceof org.gemoc.ql.model.ql.ValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect._privk3_createDefaultTypeStyle(_self_, (org.gemoc.ql.model.ql.ValueType)_self);
    };
    return (org.gemoc.qls.model.qls.TypeStyle)result;
  }

  protected static String _privk3_htmlLabel(final ValueTypeHtmlAspectValueTypeAspectProperties _self_, final ValueType _self, final String id, final String label, final LabelStyle style) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isBold = style.isBold();
      if (_isBold) {
        _builder.append("<b>");
      }
    }
    {
      boolean _isItalic = style.isItalic();
      if (_isItalic) {
        _builder.append("<i>");
      }
    }
    _builder.append("<label for=\"");
    _builder.append(id);
    _builder.append("\">");
    _builder.append(label);
    _builder.append("</label>");
    {
      boolean _isItalic_1 = style.isItalic();
      if (_isItalic_1) {
        _builder.append("</i>");
      }
    }
    {
      boolean _isBold_1 = style.isBold();
      if (_isBold_1) {
        _builder.append("</b>");
      }
    }
    return _builder.toString();
  }

  protected static String _privk3_htmlField(final ValueTypeHtmlAspectValueTypeAspectProperties _self_, final ValueType _self, final String id, final String label, final Value currentValue, final QuestionStyle qStyle, final boolean readonly) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement evaluate() for " + _self));
      throw new NotImplementedException(("not implemented, please implement evaluate() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static TypeStyle _privk3_createDefaultTypeStyle(final ValueTypeHtmlAspectValueTypeAspectProperties _self_, final ValueType _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement createDefaultTypeStyle() for " + _self));
      throw new NotImplementedException(("not implemented, please implement createDefaultTypeStyle() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
