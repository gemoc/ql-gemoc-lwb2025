package org.gemoc.ql.k3ql.k3dsa.ql;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException;
import org.gemoc.ql.k3ql.k3dsa.NullValueException;
import org.gemoc.ql.k3ql.k3dsa.QLException;
import org.gemoc.ql.k3ql.k3dsa.ecore.EObjectAspect;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.Expression;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public abstract class ExpressionAspect {
  /**
   * evaluate the expression and get the boolean
   * if not a boolean raise an exception
   */
  public static boolean evaluateAsBoolean(final Expression _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean evaluateAsBoolean()
    if (_self instanceof org.gemoc.ql.model.ql.Expression){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect._privk3_evaluateAsBoolean(_self_, (org.gemoc.ql.model.ql.Expression)_self);
    };
    return (boolean)result;
  }

  public static Value evaluate(final Expression _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect
    		if (_self instanceof org.gemoc.ql.model.ql.EnumerationCall){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect.evaluate((org.gemoc.ql.model.ql.EnumerationCall)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BasicUnaryExpression){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspect.evaluate((org.gemoc.ql.model.ql.BasicUnaryExpression)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect
    		if (_self instanceof org.gemoc.ql.model.ql.ConstantCall){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect.evaluate((org.gemoc.ql.model.ql.ConstantCall)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BasicBinaryExpression){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspect.evaluate((org.gemoc.ql.model.ql.BasicBinaryExpression)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.CallAspect
    		if (_self instanceof org.gemoc.ql.model.ql.Call){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.CallAspect.evaluate((org.gemoc.ql.model.ql.Call)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.CallAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspect
    		if (_self instanceof org.gemoc.ql.model.ql.QuestionCall){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspect.evaluate((org.gemoc.ql.model.ql.QuestionCall)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.IfExpressionAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IfExpression){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IfExpressionAspect.evaluate((org.gemoc.ql.model.ql.IfExpression)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#Value evaluate() from org.gemoc.ql.k3ql.k3dsa.ql.IfExpressionAspect
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.Expression){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.Expression)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  protected static boolean _privk3_evaluateAsBoolean(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self) {
    try {
      final Value internalResult = ExpressionAspect.evaluate(_self);
      boolean result = false;
      if ((internalResult instanceof BooleanValue)) {
        result = ((BooleanValue)internalResult).isBooleanValue();
      } else {
        if ((internalResult == null)) {
          throw new NullValueException(("expected a boolean but got " + internalResult));
        } else {
          throw new QLException(("expected a boolean but got " + internalResult));
        }
      }
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static Value _privk3_evaluate(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement evaluate() for " + _self));
      throw new NotImplementedException(("not implemented, please implement evaluate() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
