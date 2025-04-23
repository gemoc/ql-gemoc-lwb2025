package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NullValueException;
import org.gemoc.ql.model.ql.Expression;
import org.gemoc.ql.model.ql.IfExpression;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = IfExpression.class)
@SuppressWarnings("all")
public class IfExpressionAspect extends ExpressionAspect {
  public static Value evaluate(final IfExpression _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.IfExpressionAspectIfExpressionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.IfExpressionAspectIfExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.IfExpression){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.IfExpressionAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.IfExpression)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  protected static Value _privk3_evaluate(final IfExpressionAspectIfExpressionAspectProperties _self_, final IfExpression _self) {
    try {
      boolean _booleanValue = Boolean.valueOf(ExpressionAspect.evaluateAsBoolean(_self.getCondition())).booleanValue();
      if (_booleanValue) {
        return ExpressionAspect.evaluate(_self.getThenExpression());
      } else {
        Expression _elseExpression = _self.getElseExpression();
        boolean _tripleNotEquals = (_elseExpression != null);
        if (_tripleNotEquals) {
          return ExpressionAspect.evaluate(_self.getElseExpression());
        } else {
          return null;
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof NullValueException) {
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
