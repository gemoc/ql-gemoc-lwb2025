package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.BooleanValueType;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;

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

  protected static Value _privk3_createValue(final BooleanValueTypeAspectBooleanValueTypeAspectProperties _self_, final BooleanValueType _self, final String internalValue) {
    final BooleanValue aValue = QlFactory.eINSTANCE.createBooleanValue();
    aValue.setBooleanValue(Boolean.parseBoolean(internalValue));
    return aValue;
  }
}
