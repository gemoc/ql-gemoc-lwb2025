package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.Call;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = Call.class)
@SuppressWarnings("all")
public abstract class CallAspect extends ExpressionAspect {
  public static Value evaluate(final Call _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.CallAspectCallAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.CallAspectCallAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.CallAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect
    		if (_self instanceof org.gemoc.ql.model.ql.ConstantCall){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect.evaluate((org.gemoc.ql.model.ql.ConstantCall)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.CallAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.Call){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.CallAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.Call)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  protected static Value _privk3_evaluate(final CallAspectCallAspectProperties _self_, final Call _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement evaluate() for " + _self));
      throw new NotImplementedException(("not implemented, please implement evaluate() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
