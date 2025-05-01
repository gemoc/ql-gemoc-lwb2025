package org.gemoc.ql.k3ql.k3dsa.ql;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException;
import org.gemoc.ql.model.ql.BasicUnaryExpression;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.UnaryOperatorKind;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

@Aspect(className = BasicUnaryExpression.class)
@SuppressWarnings("all")
public class BasicUnaryExpressionAspect extends UnaryExpressionAspect {
  public static Value evaluate(final BasicUnaryExpression _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspectBasicUnaryExpressionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspectBasicUnaryExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.BasicUnaryExpression){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.BasicUnaryExpression)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  public static ValueType inferredValueType(final BasicUnaryExpression _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspectBasicUnaryExpressionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspectBasicUnaryExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ValueType inferredValueType()
    if (_self instanceof org.gemoc.ql.model.ql.BasicUnaryExpression){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspect._privk3_inferredValueType(_self_, (org.gemoc.ql.model.ql.BasicUnaryExpression)_self);
    };
    return (org.gemoc.ql.model.ql.ValueType)result;
  }

  protected static Value _privk3_evaluate(final BasicUnaryExpressionAspectBasicUnaryExpressionAspectProperties _self_, final BasicUnaryExpression _self) {
    try {
      final Value lhs = ExpressionAspect.evaluate(_self.getOperand());
      UnaryOperatorKind _operator = _self.getOperator();
      boolean _equals = Objects.equal(_operator, UnaryOperatorKind.UNARYMINUS);
      if (_equals) {
        return ValueAspect.uminus(lhs);
      } else {
        UnaryOperatorKind _operator_1 = _self.getOperator();
        boolean _equals_1 = Objects.equal(_operator_1, UnaryOperatorKind.NOT);
        if (_equals_1) {
          final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
          boolean _evaluateAsBoolean = ExpressionAspect.evaluateAsBoolean(_self.getOperand());
          boolean _not = (!_evaluateAsBoolean);
          bValue.setBooleanValue(_not);
          return bValue;
        } else {
          throw new NotImplementedException(("not implemented, please implement evaluate() for " + _self));
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  protected static ValueType _privk3_inferredValueType(final BasicUnaryExpressionAspectBasicUnaryExpressionAspectProperties _self_, final BasicUnaryExpression _self) {
    return ExpressionAspect.inferredValueType(_self.getOperand());
  }
}
