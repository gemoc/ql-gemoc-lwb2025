package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.DecimalValue;
import org.gemoc.ql.model.ql.EnumerationCall;
import org.gemoc.ql.model.ql.IntegerValue;
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

  protected static Value _privk3_evaluate(final EnumerationCallAspectEnumerationCallAspectProperties _self_, final EnumerationCall _self) {
    return _self;
  }

  public static Value copy(final EnumerationCall _self) {
    return ValueAspect.copy(_self);
  }

  public static BooleanValue bEquals(final EnumerationCall _self, final Value rhs) {
    return ValueAspect.bEquals(_self,rhs);
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

  public static Boolean isKindOf(final EnumerationCall _self, final ValueType type) {
    return ValueAspect.isKindOf(_self,type);
  }

  public static String valueToString(final EnumerationCall _self) {
    return ValueAspect.valueToString(_self);
  }

  public static Object rawValue(final EnumerationCall _self) {
    return ValueAspect.rawValue(_self);
  }
}
