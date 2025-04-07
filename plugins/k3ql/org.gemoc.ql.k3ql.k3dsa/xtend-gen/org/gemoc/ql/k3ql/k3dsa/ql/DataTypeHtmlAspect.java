package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.DataType;

@Aspect(className = DataType.class)
@SuppressWarnings("all")
public abstract class DataTypeHtmlAspect extends NamedElementAspect {
  @Abstract
  public static String htmlField(final DataType _self, final String id, final String label) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspectDataTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspectDataTypeAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.DecimalValueType)_self,id,label);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.IntegerValueType)_self,id,label);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DateValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.DateValueType)_self,id,label);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.EnumerationValueType)_self,id,label);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.BooleanValueType)_self,id,label);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect.htmlField((org.gemoc.ql.model.ql.StringValueType)_self,id,label);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect#String htmlField(String,String) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspect
    // #DispatchPointCut_before# String htmlField(String,String)
    if (_self instanceof org.gemoc.ql.model.ql.DataType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspect._privk3_htmlField(_self_, (org.gemoc.ql.model.ql.DataType)_self,id,label);
    };
    return (java.lang.String)result;
  }

  protected static String _privk3_htmlField(final DataTypeHtmlAspectDataTypeAspectProperties _self_, final DataType _self, final String id, final String label) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
