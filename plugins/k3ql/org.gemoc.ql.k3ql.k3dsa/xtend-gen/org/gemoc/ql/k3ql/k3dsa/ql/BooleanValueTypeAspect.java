package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.BooleanValueType;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = BooleanValueType.class)
@SuppressWarnings("all")
public class BooleanValueTypeAspect extends ValueTypeAspect {
  public static Value createValue(final BooleanValueType _self, final String internalValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspectBooleanValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspectBooleanValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value createValue(String)
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect._privk3_createValue(_self_, (org.gemoc.ql.model.ql.BooleanValueType)_self,internalValue);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value createDefaultValue(final BooleanValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspectBooleanValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspectBooleanValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value createDefaultValue()
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect._privk3_createDefaultValue(_self_, (org.gemoc.ql.model.ql.BooleanValueType)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static boolean isCompatible(final BooleanValueType _self, final ValueType otherValueType) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspectBooleanValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspectBooleanValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isCompatible(ValueType)
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspect._privk3_isCompatible(_self_, (org.gemoc.ql.model.ql.BooleanValueType)_self,otherValueType);
    };
    return (boolean)result;
  }

  protected static Value _privk3_createValue(final BooleanValueTypeAspectBooleanValueTypeAspectProperties _self_, final BooleanValueType _self, final String internalValue) {
    final BooleanValue aValue = QlFactory.eINSTANCE.createBooleanValue();
    aValue.setBooleanValue(Boolean.parseBoolean(internalValue));
    return aValue;
  }

  protected static Value _privk3_createDefaultValue(final BooleanValueTypeAspectBooleanValueTypeAspectProperties _self_, final BooleanValueType _self) {
    final BooleanValue aValue = QlFactory.eINSTANCE.createBooleanValue();
    aValue.setBooleanValue(false);
    return aValue;
  }

  protected static boolean _privk3_isCompatible(final BooleanValueTypeAspectBooleanValueTypeAspectProperties _self_, final BooleanValueType _self, final ValueType otherValueType) {
    boolean _matched = false;
    if (otherValueType instanceof BooleanValueType) {
      _matched=true;
      return true;
    }
    return false;
  }
}
