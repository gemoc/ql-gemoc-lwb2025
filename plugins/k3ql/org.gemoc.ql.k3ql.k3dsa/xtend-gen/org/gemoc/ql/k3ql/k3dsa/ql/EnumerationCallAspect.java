package org.gemoc.ql.k3ql.k3dsa.ql;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.DecimalValue;
import org.gemoc.ql.model.ql.EnumerationCall;
import org.gemoc.ql.model.ql.EnumerationLiteral;
import org.gemoc.ql.model.ql.EnumerationValueType;
import org.gemoc.ql.model.ql.IntegerValue;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = EnumerationCall.class, with = { ValueAspect.class })
@SuppressWarnings("all")
public class EnumerationCallAspect extends CallAspect {
  public static Value evaluate(final EnumerationCall _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationCall){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.EnumerationCall)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value copy(final EnumerationCall _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value copy()
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationCall){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect._privk3_copy(_self_, (org.gemoc.ql.model.ql.EnumerationCall)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static BooleanValue bEquals(final EnumerationCall _self, final Value rhs) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BooleanValue bEquals(Value)
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationCall){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect._privk3_bEquals(_self_, (org.gemoc.ql.model.ql.EnumerationCall)_self,rhs);
    };
    return (org.gemoc.ql.model.ql.BooleanValue)result;
  }

  public static String valueToString(final EnumerationCall _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String valueToString()
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationCall){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect._privk3_valueToString(_self_, (org.gemoc.ql.model.ql.EnumerationCall)_self);
    };
    return (java.lang.String)result;
  }

  public static Object rawValue(final EnumerationCall _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Object rawValue()
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationCall){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect._privk3_rawValue(_self_, (org.gemoc.ql.model.ql.EnumerationCall)_self);
    };
    return (java.lang.Object)result;
  }

  public static Boolean isKindOf(final EnumerationCall _self, final ValueType type) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Boolean isKindOf(ValueType)
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationCall){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect._privk3_isKindOf(_self_, (org.gemoc.ql.model.ql.EnumerationCall)_self,type);
    };
    return (java.lang.Boolean)result;
  }

  public static ValueType getValueType(final EnumerationCall _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ValueType getValueType()
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationCall){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect._privk3_getValueType(_self_, (org.gemoc.ql.model.ql.EnumerationCall)_self);
    };
    return (org.gemoc.ql.model.ql.ValueType)result;
  }

  public static ValueType inferredValueType(final EnumerationCall _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ValueType inferredValueType()
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationCall){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect._privk3_inferredValueType(_self_, (org.gemoc.ql.model.ql.EnumerationCall)_self);
    };
    return (org.gemoc.ql.model.ql.ValueType)result;
  }

  protected static Value _privk3_evaluate(final EnumerationCallAspectEnumerationCallAspectProperties _self_, final EnumerationCall _self) {
    return _self;
  }

  protected static Value _privk3_copy(final EnumerationCallAspectEnumerationCallAspectProperties _self_, final EnumerationCall _self) {
    final EnumerationCall aValue = QlFactory.eINSTANCE.createEnumerationCall();
    aValue.setEnumerationLiteral(_self.getEnumerationLiteral());
    return aValue;
  }

  protected static BooleanValue _privk3_bEquals(final EnumerationCallAspectEnumerationCallAspectProperties _self_, final EnumerationCall _self, final Value rhs) {
    if ((rhs == null)) {
      return null;
    }
    final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
    if ((rhs instanceof EnumerationCall)) {
      EnumerationLiteral _enumerationLiteral = _self.getEnumerationLiteral();
      EnumerationLiteral _enumerationLiteral_1 = ((EnumerationCall)rhs).getEnumerationLiteral();
      boolean _equals = Objects.equal(_enumerationLiteral, _enumerationLiteral_1);
      bValue.setBooleanValue(_equals);
      return bValue;
    } else {
      return null;
    }
  }

  protected static String _privk3_valueToString(final EnumerationCallAspectEnumerationCallAspectProperties _self_, final EnumerationCall _self) {
    return _self.getEnumerationLiteral().getName();
  }

  protected static Object _privk3_rawValue(final EnumerationCallAspectEnumerationCallAspectProperties _self_, final EnumerationCall _self) {
    return _self.getEnumerationLiteral();
  }

  protected static Boolean _privk3_isKindOf(final EnumerationCallAspectEnumerationCallAspectProperties _self_, final EnumerationCall _self, final ValueType type) {
    EObject _eContainer = _self.getEnumerationLiteral().eContainer();
    return Boolean.valueOf(Objects.equal(_eContainer, type));
  }

  protected static ValueType _privk3_getValueType(final EnumerationCallAspectEnumerationCallAspectProperties _self_, final EnumerationCall _self) {
    EObject _eContainer = _self.getEnumerationLiteral().eContainer();
    return ((EnumerationValueType) _eContainer);
  }

  protected static ValueType _privk3_inferredValueType(final EnumerationCallAspectEnumerationCallAspectProperties _self_, final EnumerationCall _self) {
    return EnumerationCallAspect.getValueType(_self);
  }

  public static Value plus(final EnumerationCall _self, final Value rhs) {
    return ValueAspect.plus(_self,rhs);
  }

  public static Value minus(final EnumerationCall _self, final Value rhs) {
    return ValueAspect.minus(_self,rhs);
  }

  public static Value mult(final EnumerationCall _self, final Value rhs) {
    return ValueAspect.mult(_self,rhs);
  }

  public static Value div(final EnumerationCall _self, final Value rhs) {
    return ValueAspect.div(_self,rhs);
  }

  public static BooleanValue greater(final EnumerationCall _self, final Value rhs) {
    return ValueAspect.greater(_self,rhs);
  }

  public static BooleanValue lower(final EnumerationCall _self, final Value rhs) {
    return ValueAspect.lower(_self,rhs);
  }

  public static BooleanValue greaterOrEquals(final EnumerationCall _self, final Value rhs) {
    return ValueAspect.greaterOrEquals(_self,rhs);
  }

  public static BooleanValue lowerOrEquals(final EnumerationCall _self, final Value rhs) {
    return ValueAspect.lowerOrEquals(_self,rhs);
  }

  public static Value uminus(final EnumerationCall _self) {
    return ValueAspect.uminus(_self);
  }

  public static DecimalValue toDecimalValue(final EnumerationCall _self) {
    return ValueAspect.toDecimalValue(_self);
  }

  public static IntegerValue toIntegerValue(final EnumerationCall _self) {
    return ValueAspect.toIntegerValue(_self);
  }
}
