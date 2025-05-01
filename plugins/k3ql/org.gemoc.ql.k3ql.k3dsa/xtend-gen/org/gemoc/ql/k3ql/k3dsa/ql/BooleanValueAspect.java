package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.BooleanValueType;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = BooleanValue.class)
@SuppressWarnings("all")
public class BooleanValueAspect extends ValueAspect {
  public static Value evaluate(final BooleanValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.BooleanValue)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value copy(final BooleanValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect._privk3_copy(_self_, (org.gemoc.ql.model.ql.BooleanValue)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static BooleanValue bEquals(final BooleanValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue bEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect._privk3_bEquals(_self_, (org.gemoc.ql.model.ql.BooleanValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static String valueToString(final BooleanValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String valueToString()
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect._privk3_valueToString(_self_, (org.gemoc.ql.model.ql.BooleanValue)_self);
    };
    return (java.lang.String)result;
  }

  public static Object rawValue(final BooleanValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object rawValue()
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect._privk3_rawValue(_self_, (org.gemoc.ql.model.ql.BooleanValue)_self);
    };
    return (java.lang.Object)result;
  }

  public static Boolean isKindOf(final BooleanValue _self, final ValueType type) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isKindOf(ValueType)
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect._privk3_isKindOf(_self_, (org.gemoc.ql.model.ql.BooleanValue)_self,type);
    };
    return (java.lang.Boolean)result;
  }

  public static ValueType getValueType(final BooleanValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ValueType getValueType()
    if (_self instanceof org.gemoc.ql.model.ql.BooleanValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspect._privk3_getValueType(_self_, (org.gemoc.ql.model.ql.BooleanValue)_self);
    };
    return (org.gemoc.ql.model.ql.ValueType)result;
  }

  protected static Value _privk3_evaluate(final BooleanValueAspectBooleanValueAspectProperties _self_, final BooleanValue _self) {
    return _self;
  }

  protected static Value _privk3_copy(final BooleanValueAspectBooleanValueAspectProperties _self_, final BooleanValue _self) {
    final BooleanValue aValue = QlFactory.eINSTANCE.createBooleanValue();
    aValue.setBooleanValue(_self.isBooleanValue());
    return aValue;
  }

  protected static BooleanValue _privk3_bEquals(final BooleanValueAspectBooleanValueAspectProperties _self_, final BooleanValue _self, final Value rhs) {
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    if ((rhs instanceof BooleanValue)) {
      boolean _isBooleanValue = _self.isBooleanValue();
      boolean _isBooleanValue_1 = ((BooleanValue) rhs).isBooleanValue();
      boolean _equals = (_isBooleanValue == _isBooleanValue_1);
      bValue.setBooleanValue(_equals);
    } else {
      bValue.setBooleanValue(false);
    }
    return bValue;
  }

  protected static String _privk3_valueToString(final BooleanValueAspectBooleanValueAspectProperties _self_, final BooleanValue _self) {
    return Boolean.valueOf(_self.isBooleanValue()).toString();
  }

  protected static Object _privk3_rawValue(final BooleanValueAspectBooleanValueAspectProperties _self_, final BooleanValue _self) {
    return Boolean.valueOf(_self.isBooleanValue());
  }

  protected static Boolean _privk3_isKindOf(final BooleanValueAspectBooleanValueAspectProperties _self_, final BooleanValue _self, final ValueType type) {
    return Boolean.valueOf((type instanceof BooleanValueType));
  }

  protected static ValueType _privk3_getValueType(final BooleanValueAspectBooleanValueAspectProperties _self_, final BooleanValue _self) {
    final BooleanValueType vt = QlFactory.eINSTANCE.createBooleanValueType();
    int _hashCode = vt.hashCode();
    String _plus = ("internal_ValueType_" + Integer.valueOf(_hashCode));
    vt.setName(_plus);
    return vt;
  }
}
