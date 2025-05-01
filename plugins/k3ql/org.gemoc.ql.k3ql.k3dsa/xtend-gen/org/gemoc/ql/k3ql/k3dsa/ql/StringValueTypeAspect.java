package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.StringValue;
import org.gemoc.ql.model.ql.StringValueType;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = StringValueType.class)
@SuppressWarnings("all")
public class StringValueTypeAspect extends ValueTypeAspect {
  public static Value createValue(final StringValueType _self, final String internalValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspectStringValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspectStringValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value createValue(String)
    if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect._privk3_createValue(_self_, (org.gemoc.ql.model.ql.StringValueType)_self,internalValue);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value createDefaultValue(final StringValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspectStringValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspectStringValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value createDefaultValue()
    if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect._privk3_createDefaultValue(_self_, (org.gemoc.ql.model.ql.StringValueType)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static boolean isCompatible(final StringValueType _self, final ValueType otherValueType) {
    final org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspectStringValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspectStringValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isCompatible(ValueType)
    if (_self instanceof org.gemoc.ql.model.ql.StringValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspect._privk3_isCompatible(_self_, (org.gemoc.ql.model.ql.StringValueType)_self,otherValueType);
    };
    return (boolean)result;
  }

  protected static Value _privk3_createValue(final StringValueTypeAspectStringValueTypeAspectProperties _self_, final StringValueType _self, final String internalValue) {
    final StringValue aValue = QlFactory.eINSTANCE.createStringValue();
    aValue.setStringValue(internalValue);
    return aValue;
  }

  protected static Value _privk3_createDefaultValue(final StringValueTypeAspectStringValueTypeAspectProperties _self_, final StringValueType _self) {
    final StringValue aValue = QlFactory.eINSTANCE.createStringValue();
    aValue.setStringValue("");
    return aValue;
  }

  protected static boolean _privk3_isCompatible(final StringValueTypeAspectStringValueTypeAspectProperties _self_, final StringValueType _self, final ValueType otherValueType) {
    boolean _matched = false;
    if (otherValueType instanceof StringValueType) {
      _matched=true;
      return true;
    }
    return false;
  }
}
