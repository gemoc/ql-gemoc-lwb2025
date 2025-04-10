package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.BooleanValueType;
import org.gemoc.ql.model.ql.DecimalValue;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = DecimalValue.class)
@SuppressWarnings("all")
public class DecimalValueAspect extends ValueAspect {
  public static Value evaluate(final DecimalValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value copy(final DecimalValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_copy(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static BooleanValue bEquals(final DecimalValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue bEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_bEquals(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static String valueToString(final DecimalValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String valueToString()
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_valueToString(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self);
    };
    return (java.lang.String)result;
  }

  public static Object rawValue(final DecimalValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object rawValue()
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_rawValue(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self);
    };
    return (java.lang.Object)result;
  }

  public static Boolean isKindOf(final DecimalValue _self, final ValueType type) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isKindOf(ValueType)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_isKindOf(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self,type);
    };
    return (java.lang.Boolean)result;
  }

  protected static Value _privk3_evaluate(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self) {
    return _self;
  }

  protected static Value _privk3_copy(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self) {
    final DecimalValue aValue = QlFactory.eINSTANCE.createDecimalValue();
    aValue.setDecimalValue(_self.getDecimalValue());
    return aValue;
  }

  protected static BooleanValue _privk3_bEquals(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self, final Value rhs) {
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    if ((rhs instanceof DecimalValue)) {
      float _decimalValue = _self.getDecimalValue();
      float _decimalValue_1 = ((DecimalValue) rhs).getDecimalValue();
      boolean _equals = (_decimalValue == _decimalValue_1);
      bValue.setBooleanValue(_equals);
    } else {
      bValue.setBooleanValue(false);
    }
    return bValue;
  }

  protected static String _privk3_valueToString(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self) {
    return Float.valueOf(_self.getDecimalValue()).toString();
  }

  protected static Object _privk3_rawValue(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self) {
    return Float.valueOf(_self.getDecimalValue());
  }

  protected static Boolean _privk3_isKindOf(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self, final ValueType type) {
    return Boolean.valueOf((type instanceof BooleanValueType));
  }
}
