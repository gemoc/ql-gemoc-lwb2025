package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.DataType;
import org.gemoc.ql.model.ql.DecimalValue;
import org.gemoc.ql.model.ql.IntegerValue;
import org.gemoc.ql.model.ql.IntegerValueType;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = IntegerValue.class)
@SuppressWarnings("all")
public class IntegerValueAspect extends ValueAspect {
  public static Value evaluate(final IntegerValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value copy(final IntegerValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_copy(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static BooleanValue bEquals(final IntegerValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue bEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_bEquals(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static BooleanValue lower(final IntegerValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue lower(Value)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_lower(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static BooleanValue lowerOrEquals(final IntegerValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue lowerOrEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_lowerOrEquals(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static BooleanValue greater(final IntegerValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue greater(Value)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_greater(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static BooleanValue greaterOrEquals(final IntegerValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue greaterOrEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_greaterOrEquals(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static Value plus(final IntegerValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value plus(Value)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_plus(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value minus(final IntegerValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value minus(Value)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_minus(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value uminus(final IntegerValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value uminus()
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_uminus(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value mult(final IntegerValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value mult(Value)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_mult(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value div(final IntegerValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value div(Value)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_div(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static DecimalValue toDecimalValue(final IntegerValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# DecimalValue toDecimalValue()
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_toDecimalValue(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self);
    };
    return (org.gemoc.ql.model.ql.DecimalValue)result;
  }

  public static IntegerValue toIntegerValue(final IntegerValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# IntegerValue toIntegerValue()
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_toIntegerValue(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self);
    };
    return (org.gemoc.ql.model.ql.IntegerValue)result;
  }

  public static String valueToString(final IntegerValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String valueToString()
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_valueToString(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self);
    };
    return (java.lang.String)result;
  }

  public static Object rawValue(final IntegerValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object rawValue()
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_rawValue(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self);
    };
    return (java.lang.Object)result;
  }

  public static Boolean isKindOf(final IntegerValue _self, final DataType type) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isKindOf(DataType)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspect._privk3_isKindOf(_self_, (org.gemoc.ql.model.ql.IntegerValue)_self,type);
    };
    return (java.lang.Boolean)result;
  }

  protected static Value _privk3_evaluate(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self) {
    return _self;
  }

  protected static Value _privk3_copy(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self) {
    final IntegerValue aValue = QlFactory.eINSTANCE.createIntegerValue();
    aValue.setIntValue(_self.getIntValue());
    return aValue;
  }

  protected static BooleanValue _privk3_bEquals(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self, final Value rhs) {
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    int _intValue = _self.getIntValue();
    int _intValue_1 = ValueAspect.toIntegerValue(rhs).getIntValue();
    boolean _equals = (_intValue == _intValue_1);
    bValue.setBooleanValue(_equals);
    return bValue;
  }

  protected static BooleanValue _privk3_lower(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self, final Value rhs) {
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    int _intValue = _self.getIntValue();
    int _intValue_1 = ValueAspect.toIntegerValue(rhs).getIntValue();
    boolean _lessThan = (_intValue < _intValue_1);
    bValue.setBooleanValue(_lessThan);
    return bValue;
  }

  protected static BooleanValue _privk3_lowerOrEquals(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self, final Value rhs) {
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    int _intValue = _self.getIntValue();
    int _intValue_1 = ValueAspect.toIntegerValue(rhs).getIntValue();
    boolean _lessEqualsThan = (_intValue <= _intValue_1);
    bValue.setBooleanValue(_lessEqualsThan);
    return bValue;
  }

  protected static BooleanValue _privk3_greater(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self, final Value rhs) {
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    int _intValue = _self.getIntValue();
    int _intValue_1 = ValueAspect.toIntegerValue(rhs).getIntValue();
    boolean _greaterThan = (_intValue > _intValue_1);
    bValue.setBooleanValue(_greaterThan);
    return bValue;
  }

  protected static BooleanValue _privk3_greaterOrEquals(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self, final Value rhs) {
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    int _intValue = _self.getIntValue();
    int _intValue_1 = ValueAspect.toIntegerValue(rhs).getIntValue();
    boolean _greaterEqualsThan = (_intValue >= _intValue_1);
    bValue.setBooleanValue(_greaterEqualsThan);
    return bValue;
  }

  protected static Value _privk3_plus(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self, final Value rhs) {
    final IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
    int _intValue = _self.getIntValue();
    int _intValue_1 = ValueAspect.toIntegerValue(rhs).getIntValue();
    int _plus = (_intValue + _intValue_1);
    iValue.setIntValue(_plus);
    return iValue;
  }

  protected static Value _privk3_minus(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self, final Value rhs) {
    final IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
    int _intValue = _self.getIntValue();
    int _intValue_1 = ValueAspect.toIntegerValue(rhs).getIntValue();
    int _minus = (_intValue - _intValue_1);
    iValue.setIntValue(_minus);
    return iValue;
  }

  protected static Value _privk3_uminus(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self) {
    final IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
    int _intValue = _self.getIntValue();
    int _minus = (-_intValue);
    iValue.setIntValue(_minus);
    return iValue;
  }

  protected static Value _privk3_mult(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self, final Value rhs) {
    final IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
    int _intValue = _self.getIntValue();
    int _intValue_1 = ValueAspect.toIntegerValue(rhs).getIntValue();
    int _multiply = (_intValue * _intValue_1);
    iValue.setIntValue(_multiply);
    return iValue;
  }

  protected static Value _privk3_div(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self, final Value rhs) {
    final IntegerValue iValue = QlFactory.eINSTANCE.createIntegerValue();
    int _intValue = _self.getIntValue();
    int _intValue_1 = ValueAspect.toIntegerValue(rhs).getIntValue();
    int _divide = (_intValue / _intValue_1);
    iValue.setIntValue(_divide);
    return iValue;
  }

  protected static DecimalValue _privk3_toDecimalValue(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self) {
    final DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
    fValue.setDecimalValue(_self.getIntValue());
    return fValue;
  }

  protected static IntegerValue _privk3_toIntegerValue(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self) {
    return _self;
  }

  protected static String _privk3_valueToString(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self) {
    return Integer.valueOf(_self.getIntValue()).toString();
  }

  protected static Object _privk3_rawValue(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self) {
    return Integer.valueOf(_self.getIntValue());
  }

  protected static Boolean _privk3_isKindOf(final IntegerValueAspectIntegerValueAspectProperties _self_, final IntegerValue _self, final DataType type) {
    return Boolean.valueOf((type instanceof IntegerValueType));
  }
}
