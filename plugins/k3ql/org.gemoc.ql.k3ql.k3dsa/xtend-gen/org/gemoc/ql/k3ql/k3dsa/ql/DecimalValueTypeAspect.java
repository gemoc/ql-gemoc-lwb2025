package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.model.ql.DecimalValue;
import org.gemoc.ql.model.ql.DecimalValueType;
import org.gemoc.ql.model.ql.IntegerValueType;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = DecimalValueType.class)
@SuppressWarnings("all")
public class DecimalValueTypeAspect extends ValueTypeAspect {
  public static Value createValue(final DecimalValueType _self, final String internalValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspectDecimalValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspectDecimalValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value createValue(String)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect._privk3_createValue(_self_, (org.gemoc.ql.model.ql.DecimalValueType)_self,internalValue);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value createDefaultValue(final DecimalValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspectDecimalValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspectDecimalValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value createDefaultValue()
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect._privk3_createDefaultValue(_self_, (org.gemoc.ql.model.ql.DecimalValueType)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static boolean isCompatible(final DecimalValueType _self, final ValueType otherValueType) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspectDecimalValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspectDecimalValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isCompatible(ValueType)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect._privk3_isCompatible(_self_, (org.gemoc.ql.model.ql.DecimalValueType)_self,otherValueType);
    };
    return (boolean)result;
  }

  protected static Value _privk3_createValue(final DecimalValueTypeAspectDecimalValueTypeAspectProperties _self_, final DecimalValueType _self, final String internalValue) {
    final DecimalValue aValue = QlFactory.eINSTANCE.createDecimalValue();
    try {
      aValue.setDecimalValue(Double.parseDouble(internalValue));
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return aValue;
  }

  protected static Value _privk3_createDefaultValue(final DecimalValueTypeAspectDecimalValueTypeAspectProperties _self_, final DecimalValueType _self) {
    final DecimalValue aValue = QlFactory.eINSTANCE.createDecimalValue();
    aValue.setDecimalValue(0);
    return aValue;
  }

  protected static boolean _privk3_isCompatible(final DecimalValueTypeAspectDecimalValueTypeAspectProperties _self_, final DecimalValueType _self, final ValueType otherValueType) {
    boolean _matched = false;
    if (otherValueType instanceof DecimalValueType) {
      _matched=true;
    }
    if (!_matched) {
      if (otherValueType instanceof IntegerValueType) {
        _matched=true;
      }
    }
    if (_matched) {
      return true;
    }
    return false;
  }
}
