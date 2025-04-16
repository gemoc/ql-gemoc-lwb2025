package org.gemoc.ql.k3ql.k3dsa.ql;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.StringValue;
import org.gemoc.ql.model.ql.StringValueType;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = StringValue.class)
@SuppressWarnings("all")
public class StringValueAspect extends ValueAspect {
  public static Value evaluate(final StringValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.StringValue)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value copy(final StringValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect._privk3_copy(_self_, (org.gemoc.ql.model.ql.StringValue)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static BooleanValue bEquals(final StringValue _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue bEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect._privk3_bEquals(_self_, (org.gemoc.ql.model.ql.StringValue)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static String valueToString(final StringValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String valueToString()
    if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect._privk3_valueToString(_self_, (org.gemoc.ql.model.ql.StringValue)_self);
    };
    return (java.lang.String)result;
  }

  public static Object rawValue(final StringValue _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object rawValue()
    if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect._privk3_rawValue(_self_, (org.gemoc.ql.model.ql.StringValue)_self);
    };
    return (java.lang.Object)result;
  }

  public static Boolean isKindOf(final StringValue _self, final ValueType type) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isKindOf(ValueType)
    if (_self instanceof org.gemoc.ql.model.ql.StringValue){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspect._privk3_isKindOf(_self_, (org.gemoc.ql.model.ql.StringValue)_self,type);
    };
    return (java.lang.Boolean)result;
  }

  protected static Value _privk3_evaluate(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self) {
    return _self;
  }

  protected static Value _privk3_copy(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self) {
    final StringValue aValue = QlFactory.eINSTANCE.createStringValue();
    aValue.setStringValue(_self.getStringValue());
    return aValue;
  }

  protected static BooleanValue _privk3_bEquals(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self, final Value rhs) {
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    if ((rhs instanceof StringValue)) {
      String _stringValue = _self.getStringValue();
      String _stringValue_1 = ((StringValue) rhs).getStringValue();
      boolean _equals = Objects.equal(_stringValue, _stringValue_1);
      bValue.setBooleanValue(_equals);
    } else {
      bValue.setBooleanValue(false);
    }
    return bValue;
  }

  protected static String _privk3_valueToString(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self) {
    return _self.getStringValue().toString();
  }

  protected static Object _privk3_rawValue(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self) {
    return _self.getStringValue();
  }

  protected static Boolean _privk3_isKindOf(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self, final ValueType type) {
    return Boolean.valueOf((type instanceof StringValueType));
  }
}
