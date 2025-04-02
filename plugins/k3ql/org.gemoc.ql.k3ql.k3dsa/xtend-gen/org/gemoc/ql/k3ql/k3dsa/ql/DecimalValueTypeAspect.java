package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.DecimalValue;
import org.gemoc.ql.model.ql.DecimalValueType;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = DecimalValueType.class)
@SuppressWarnings("all")
public class DecimalValueTypeAspect extends ValueTypeAspect {
  public static Value createValue(final DecimalValueType _self, final String internalValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspectDecimalValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspectDecimalValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value createValue(String)
    if (_self instanceof org.gemoc.ql.model.ql.DecimalValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspect._privk3_createValue(_self_, (org.gemoc.ql.model.ql.DecimalValueType)_self,internalValue);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  protected static Value _privk3_createValue(final DecimalValueTypeAspectDecimalValueTypeAspectProperties _self_, final DecimalValueType _self, final String internalValue) {
    final DecimalValue aValue = QlFactory.eINSTANCE.createDecimalValue();
    aValue.setDecimalValue(Float.parseFloat(internalValue));
    return aValue;
  }
}
