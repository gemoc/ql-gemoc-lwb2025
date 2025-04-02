package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.IntegerValue;
import org.gemoc.ql.model.ql.IntegerValueType;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = IntegerValueType.class)
@SuppressWarnings("all")
public class IntegerValueTypeAspect extends ValueTypeAspect {
  public static Value createValue(final IntegerValueType _self, final String internalValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspectIntegerValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspectIntegerValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value createValue(String)
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect._privk3_createValue(_self_, (org.gemoc.ql.model.ql.IntegerValueType)_self,internalValue);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  protected static Value _privk3_createValue(final IntegerValueTypeAspectIntegerValueTypeAspectProperties _self_, final IntegerValueType _self, final String internalValue) {
    final IntegerValue aValue = QlFactory.eINSTANCE.createIntegerValue();
    aValue.setIntValue(Integer.parseInt(internalValue));
    return aValue;
  }
}
