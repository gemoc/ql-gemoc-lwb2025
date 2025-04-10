package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = ValueType.class)
@SuppressWarnings("all")
public class ValueTypeHtmlAspect {
  public static String htmlField(final ValueType _self, final String id, final String label, final Value currentValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspectValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspectValueTypeAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.DecimalValueType)_self,id,label,currentValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.EnumerationValueType)_self,id,label,currentValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.IntegerValueType)_self,id,label,currentValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.StringValueType)_self,id,label,currentValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DateValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.DateValueType)_self,id,label,currentValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.BooleanValueType)_self,id,label,currentValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect#String htmlField(String,String,Value) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect
    // #DispatchPointCut_before# String htmlField(String,String,Value)
    if (_self instanceof org.gemoc.ql.model.ql.ValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.ValueType)_self,id,label,currentValue);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlField(final ValueTypeHtmlAspectValueTypeAspectProperties _self_, final ValueType _self, final String id, final String label, final Value currentValue) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement evaluate() for " + _self));
      throw new NotImplementedException(("not implemented, please implement evaluate() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
