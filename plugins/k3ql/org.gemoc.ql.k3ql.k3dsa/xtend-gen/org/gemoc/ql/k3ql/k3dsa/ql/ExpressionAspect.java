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
import org.gemoc.ql.model.ql.ValueType;

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

  public static ValueType inferredValueType(final Expression _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BasicBinaryExpression){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspect.inferredValueType((org.gemoc.ql.model.ql.BasicBinaryExpression)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspect
    		if (_self instanceof org.gemoc.ql.model.ql.QuestionCall){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspect.inferredValueType((org.gemoc.ql.model.ql.QuestionCall)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.QuestionCallAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspect
    		if (_self instanceof org.gemoc.ql.model.ql.BasicUnaryExpression){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspect.inferredValueType((org.gemoc.ql.model.ql.BasicUnaryExpression)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect
    		if (_self instanceof org.gemoc.ql.model.ql.EnumerationCall){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect.inferredValueType((org.gemoc.ql.model.ql.EnumerationCall)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.IfExpressionAspect
    		if (_self instanceof org.gemoc.ql.model.ql.IfExpression){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.IfExpressionAspect.inferredValueType((org.gemoc.ql.model.ql.IfExpression)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.IfExpressionAspect
    	// BeginInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect
    		if (_self instanceof org.gemoc.ql.model.ql.ConstantCall){
    			result = org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect.inferredValueType((org.gemoc.ql.model.ql.ConstantCall)_self);
    		} else
    		// EndInjectInto org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect#ValueType inferredValueType() from org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspect
    // #DispatchPointCut_before# ValueType inferredValueType()
    if (_self instanceof org.gemoc.ql.model.ql.Expression){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect._privk3_inferredValueType(_self_, (org.gemoc.ql.model.ql.Expression)_self);
    };
    return (org.gemoc.ql.model.ql.ValueType)result;
  }

  public static ValueType inferredValueTypeCache(final Expression _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ValueType inferredValueTypeCache()
    if (_self instanceof org.gemoc.ql.model.ql.Expression){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect._privk3_inferredValueTypeCache(_self_, (org.gemoc.ql.model.ql.Expression)_self);
    };
    return (org.gemoc.ql.model.ql.ValueType)result;
  }

  public static void inferredValueTypeCache(final Expression _self, final ValueType inferredValueTypeCache) {
    final org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void inferredValueTypeCache(ValueType)
    if (_self instanceof org.gemoc.ql.model.ql.Expression){
    	org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspect._privk3_inferredValueTypeCache(_self_, (org.gemoc.ql.model.ql.Expression)_self,inferredValueTypeCache);
    };
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

  protected static ValueType _privk3_inferredValueType(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self) {
    try {
      EObjectAspect.devError(_self, ("not implemented, please ask language designer to implement inferredValueType() for " + _self));
      throw new NotImplementedException(("not implemented, please implement inferredValueType() for " + _self));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static ValueType _privk3_inferredValueTypeCache(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getInferredValueTypeCache") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.gemoc.ql.model.ql.ValueType) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.inferredValueTypeCache;
  }

  protected static void _privk3_inferredValueTypeCache(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final ValueType inferredValueTypeCache) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setInferredValueTypeCache")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, inferredValueTypeCache);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.inferredValueTypeCache = inferredValueTypeCache;
    }
  }
}
