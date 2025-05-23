package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = ValueType.class)
@SuppressWarnings("all")
public class ValueTypeAspect extends NamedElementAspect {
  public static Value createValue(final ValueType _self, final String internalValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspectValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspectValueTypeAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect.createValue((org.gemoc.ql.model.ql.IntegerValueType)_self,internalValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect.createValue((org.gemoc.ql.model.ql.EnumerationValueType)_self,internalValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect.createValue((org.gemoc.ql.model.ql.DecimalValueType)_self,internalValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect.createValue((org.gemoc.ql.model.ql.BooleanValueType)_self,internalValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect.createValue((org.gemoc.ql.model.ql.StringValueType)_self,internalValue);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createValue(String) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect
    // #DispatchPointCut_before# Value createValue(String)
    if (_self instanceof org.gemoc.ql.model.ql.ValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect._privk3_createValue(_self_, (org.gemoc.ql.model.ql.ValueType)_self,internalValue);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value createDefaultValue(final ValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspectValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspectValueTypeAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createDefaultValue() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect.createDefaultValue((org.gemoc.ql.model.ql.DecimalValueType)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createDefaultValue() from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createDefaultValue() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect.createDefaultValue((org.gemoc.ql.model.ql.StringValueType)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createDefaultValue() from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createDefaultValue() from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect.createDefaultValue((org.gemoc.ql.model.ql.EnumerationValueType)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createDefaultValue() from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createDefaultValue() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect.createDefaultValue((org.gemoc.ql.model.ql.BooleanValueType)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createDefaultValue() from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createDefaultValue() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect.createDefaultValue((org.gemoc.ql.model.ql.IntegerValueType)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#Value createDefaultValue() from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect
    // #DispatchPointCut_before# Value createDefaultValue()
    if (_self instanceof org.gemoc.ql.model.ql.ValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect._privk3_createDefaultValue(_self_, (org.gemoc.ql.model.ql.ValueType)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static boolean isCompatible(final ValueType _self, final ValueType otherValueType) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspectValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspectValueTypeAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#boolean isCompatible(ValueType) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect.isCompatible((org.gemoc.ql.model.ql.DecimalValueType)_self,otherValueType);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#boolean isCompatible(ValueType) from org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#boolean isCompatible(ValueType) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect.isCompatible((org.gemoc.ql.model.ql.BooleanValueType)_self,otherValueType);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#boolean isCompatible(ValueType) from org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#boolean isCompatible(ValueType) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect.isCompatible((org.gemoc.ql.model.ql.StringValueType)_self,otherValueType);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#boolean isCompatible(ValueType) from org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#boolean isCompatible(ValueType) from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect.isCompatible((org.gemoc.ql.model.ql.EnumerationValueType)_self,otherValueType);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#boolean isCompatible(ValueType) from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#boolean isCompatible(ValueType) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IntegerValueType){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect.isCompatible((org.gemoc.ql.model.ql.IntegerValueType)_self,otherValueType);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect#boolean isCompatible(ValueType) from org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect
    // #DispatchPointCut_before# boolean isCompatible(ValueType)
    if (_self instanceof org.gemoc.ql.model.ql.ValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspect._privk3_isCompatible(_self_, (org.gemoc.ql.model.ql.ValueType)_self,otherValueType);
    };
    return (boolean)result;
  }

  protected static Value _privk3_createValue(final ValueTypeAspectValueTypeAspectProperties _self_, final ValueType _self, final String internalValue) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement createValue() for " + _self));
      throw new NotImplementedException(("not implemented, please implement createValue() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static Value _privk3_createDefaultValue(final ValueTypeAspectValueTypeAspectProperties _self_, final ValueType _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement createDefaultValue() for " + _self));
      throw new NotImplementedException(("not implemented, please implement createValue() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static boolean _privk3_isCompatible(final ValueTypeAspectValueTypeAspectProperties _self_, final ValueType _self, final ValueType otherValueType) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement isCompatible() for " + _self));
      throw new NotImplementedException(("not implemented, please implement isCompatible() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
