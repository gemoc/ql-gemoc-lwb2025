package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = ValueType.class)
@SuppressWarnings("all")
public class ValueTypeAspect extends DataTypeAspect {
  public static Value createValue(final ValueType _self, final String internalValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspectValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspectValueTypeAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect.createValue((org.gemoc.ql.model.ql.BooleanValueType)_self,internalValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect.createValue((org.gemoc.ql.model.ql.IntegerValueType)_self,internalValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect.createValue((org.gemoc.ql.model.ql.StringValueType)_self,internalValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect.createValue((org.gemoc.ql.model.ql.DecimalValueType)_self,internalValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect
    // #DispatchPointCut_before# Value createValue(String)
    if (_self instanceof org.gemoc.ql.model.ql.ValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect._privk3_createValue(_self_, (org.gemoc.ql.model.ql.ValueType)_self,internalValue);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  protected static Value _privk3_createValue(final ValueTypeAspectValueTypeAspectProperties _self_, final ValueType _self, final String internalValue) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement createValue() for " + _self));
      throw new NotImplementedException(("not implemented, please implement createValue() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
