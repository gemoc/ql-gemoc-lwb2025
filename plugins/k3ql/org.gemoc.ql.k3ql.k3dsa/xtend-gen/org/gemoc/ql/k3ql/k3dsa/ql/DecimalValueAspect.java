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

  public static BooleanValue lower(final DecimalValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue lower(Value)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_lower(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static BooleanValue lowerOrEquals(final DecimalValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue lowerOrEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_lowerOrEquals(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static BooleanValue greater(final DecimalValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue greater(Value)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_greater(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static BooleanValue greaterOrEquals(final DecimalValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue greaterOrEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_greaterOrEquals(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static Value plus(final DecimalValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value plus(Value)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_plus(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value minus(final DecimalValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value minus(Value)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_minus(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value uminus(final DecimalValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value uminus()
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_uminus(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value mult(final DecimalValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value mult(Value)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_mult(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value div(final DecimalValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value div(Value)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_div(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static DecimalValue toDecimalValue(final DecimalValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# DecimalValue toDecimalValue()
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspect._privk3_toDecimalValue(_self_, (org.gemoc.ql.model.ql.DecimalValue)_self);
    };
    return (org.gemoc.ql.model.ql.DecimalValue)result;
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
    if ((rhs == null)) {
      return null;
    }
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    if ((rhs instanceof DecimalValue)) {
      double _decimalValue = _self.getDecimalValue();
      double _decimalValue_1 = ((DecimalValue) rhs).getDecimalValue();
      boolean _equals = (_decimalValue == _decimalValue_1);
      bValue.setBooleanValue(_equals);
    } else {
      bValue.setBooleanValue(false);
    }
    return bValue;
  }

  protected static BooleanValue _privk3_lower(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self, final Value rhs) {
    if ((rhs == null)) {
      return null;
    }
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    double _decimalValue = _self.getDecimalValue();
    double _decimalValue_1 = ValueAspect.toDecimalValue(rhs).getDecimalValue();
    boolean _lessThan = (_decimalValue < _decimalValue_1);
    bValue.setBooleanValue(_lessThan);
    return bValue;
  }

  protected static BooleanValue _privk3_lowerOrEquals(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self, final Value rhs) {
    if ((rhs == null)) {
      return null;
    }
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    double _decimalValue = _self.getDecimalValue();
    double _decimalValue_1 = ValueAspect.toDecimalValue(rhs).getDecimalValue();
    boolean _lessEqualsThan = (_decimalValue <= _decimalValue_1);
    bValue.setBooleanValue(_lessEqualsThan);
    return bValue;
  }

  protected static BooleanValue _privk3_greater(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self, final Value rhs) {
    if ((rhs == null)) {
      return null;
    }
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    double _decimalValue = _self.getDecimalValue();
    double _decimalValue_1 = ValueAspect.toDecimalValue(rhs).getDecimalValue();
    boolean _greaterThan = (_decimalValue > _decimalValue_1);
    bValue.setBooleanValue(_greaterThan);
    return bValue;
  }

  protected static BooleanValue _privk3_greaterOrEquals(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self, final Value rhs) {
    if ((rhs == null)) {
      return null;
    }
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    double _decimalValue = _self.getDecimalValue();
    double _decimalValue_1 = ValueAspect.toDecimalValue(rhs).getDecimalValue();
    boolean _greaterEqualsThan = (_decimalValue >= _decimalValue_1);
    bValue.setBooleanValue(_greaterEqualsThan);
    return bValue;
  }

  protected static Value _privk3_plus(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self, final Value rhs) {
    if ((rhs == null)) {
      return null;
    }
    final DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
    double _decimalValue = _self.getDecimalValue();
    double _decimalValue_1 = ValueAspect.toDecimalValue(rhs).getDecimalValue();
    double _plus = (_decimalValue + _decimalValue_1);
    fValue.setDecimalValue(_plus);
    return fValue;
  }

  protected static Value _privk3_minus(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self, final Value rhs) {
    if ((rhs == null)) {
      return null;
    }
    final DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
    double _decimalValue = _self.getDecimalValue();
    double _decimalValue_1 = ValueAspect.toDecimalValue(rhs).getDecimalValue();
    double _minus = (_decimalValue - _decimalValue_1);
    fValue.setDecimalValue(_minus);
    return fValue;
  }

  protected static Value _privk3_uminus(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self) {
    final DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
    double _decimalValue = _self.getDecimalValue();
    double _minus = (-_decimalValue);
    fValue.setDecimalValue(_minus);
    return fValue;
  }

  protected static Value _privk3_mult(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self, final Value rhs) {
    if ((rhs == null)) {
      return null;
    }
    final DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
    double _decimalValue = _self.getDecimalValue();
    double _decimalValue_1 = ValueAspect.toDecimalValue(rhs).getDecimalValue();
    double _multiply = (_decimalValue * _decimalValue_1);
    fValue.setDecimalValue(_multiply);
    return fValue;
  }

  protected static Value _privk3_div(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self, final Value rhs) {
    if ((rhs == null)) {
      return null;
    }
    final DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
    double _decimalValue = _self.getDecimalValue();
    double _decimalValue_1 = ValueAspect.toDecimalValue(rhs).getDecimalValue();
    double _divide = (_decimalValue / _decimalValue_1);
    fValue.setDecimalValue(_divide);
    return fValue;
  }

  protected static DecimalValue _privk3_toDecimalValue(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self) {
    final DecimalValue fValue = QlFactory.eINSTANCE.createDecimalValue();
    fValue.setDecimalValue(_self.getDecimalValue());
    return _self;
  }

  protected static String _privk3_valueToString(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self) {
    return Double.valueOf(_self.getDecimalValue()).toString();
  }

  protected static Object _privk3_rawValue(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self) {
    return Double.valueOf(_self.getDecimalValue());
  }

  protected static Boolean _privk3_isKindOf(final DecimalValueAspectDecimalValueAspectProperties _self_, final DecimalValue _self, final ValueType type) {
    return Boolean.valueOf((type instanceof BooleanValueType));
  }
}
