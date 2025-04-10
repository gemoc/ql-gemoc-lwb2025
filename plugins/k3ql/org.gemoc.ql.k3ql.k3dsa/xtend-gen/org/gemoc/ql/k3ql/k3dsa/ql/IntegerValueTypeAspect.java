package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
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

  public static Value createDefaultValue(final IntegerValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspectIntegerValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspectIntegerValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value createDefaultValue()
    if (_self instanceof org.gemoc.ql.model.ql.IntegerValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspect._privk3_createDefaultValue(_self_, (org.gemoc.ql.model.ql.IntegerValueType)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  protected static Value _privk3_createValue(final IntegerValueTypeAspectIntegerValueTypeAspectProperties _self_, final IntegerValueType _self, final String internalValue) {
    final IntegerValue aValue = QlFactory.eINSTANCE.createIntegerValue();
    try {
      aValue.setIntValue(Integer.parseInt(internalValue));
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return aValue;
  }

  protected static Value _privk3_createDefaultValue(final IntegerValueTypeAspectIntegerValueTypeAspectProperties _self_, final IntegerValueType _self) {
    final IntegerValue aValue = QlFactory.eINSTANCE.createIntegerValue();
    aValue.setIntValue(0);
    return aValue;
  }
}
