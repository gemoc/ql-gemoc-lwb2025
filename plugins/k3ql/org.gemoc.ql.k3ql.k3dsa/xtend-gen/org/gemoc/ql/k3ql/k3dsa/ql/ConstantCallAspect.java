package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.ConstantCall;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = ConstantCall.class)
@SuppressWarnings("all")
public class ConstantCallAspect extends CallAspect {
  public static Value evaluate(final ConstantCall _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspectConstantCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspectConstantCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.ConstantCall){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.ConstantCall)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static ValueType inferredValueType(final ConstantCall _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspectConstantCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspectConstantCallAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ValueType inferredValueType()
    if (_self instanceof org.gemoc.ql.model.ql.ConstantCall){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect._privk3_inferredValueType(_self_, (org.gemoc.ql.model.ql.ConstantCall)_self);
    };
    return (org.gemoc.ql.model.ql.ValueType)result;
  }

  protected static Value _privk3_evaluate(final ConstantCallAspectConstantCallAspectProperties _self_, final ConstantCall _self) {
    return ValueAspect.evaluate(_self.getValue());
  }

  protected static ValueType _privk3_inferredValueType(final ConstantCallAspectConstantCallAspectProperties _self_, final ConstantCall _self) {
    return ValueAspect.getValueType(_self.getValue());
  }
}
