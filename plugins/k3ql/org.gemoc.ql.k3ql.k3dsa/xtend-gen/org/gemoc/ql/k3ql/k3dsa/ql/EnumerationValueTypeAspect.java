package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Objects;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.ql.model.ql.EnumerationCall;
import org.gemoc.ql.model.ql.EnumerationLiteral;
import org.gemoc.ql.model.ql.EnumerationValueType;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = EnumerationValueType.class)
@SuppressWarnings("all")
public class EnumerationValueTypeAspect extends ValueTypeAspect {
  public static Value createValue(final EnumerationValueType _self, final String internalValue) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspectEnumerationValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspectEnumerationValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value createValue(String)
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect._privk3_createValue(_self_, (org.gemoc.ql.model.ql.EnumerationValueType)_self,internalValue);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static Value createDefaultValue(final EnumerationValueType _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspectEnumerationValueTypeAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspectEnumerationValueTypeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value createDefaultValue()
    if (_self instanceof org.gemoc.ql.model.ql.EnumerationValueType){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspect._privk3_createDefaultValue(_self_, (org.gemoc.ql.model.ql.EnumerationValueType)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  protected static Value _privk3_createValue(final EnumerationValueTypeAspectEnumerationValueTypeAspectProperties _self_, final EnumerationValueType _self, final String internalValue) {
    final Function1<EnumerationLiteral, Boolean> _function = (EnumerationLiteral e) -> {
      String _name = e.getName();
      return Boolean.valueOf(Objects.equals(_name, internalValue));
    };
    final EnumerationLiteral literal = IterableExtensions.<EnumerationLiteral>findFirst(_self.getEnumerationLiterals(), _function);
    if ((literal != null)) {
      final EnumerationCall aValue = QlFactory.eINSTANCE.createEnumerationCall();
      aValue.setEnumerationLiteral(literal);
      return aValue;
    } else {
      return null;
    }
  }

  protected static Value _privk3_createDefaultValue(final EnumerationValueTypeAspectEnumerationValueTypeAspectProperties _self_, final EnumerationValueType _self) {
    boolean _isEmpty = _self.getEnumerationLiterals().isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      final EnumerationCall aValue = QlFactory.eINSTANCE.createEnumerationCall();
      aValue.setEnumerationLiteral(_self.getEnumerationLiterals().get(0));
      return aValue;
    } else {
      return null;
    }
  }
}
