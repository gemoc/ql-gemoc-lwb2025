package org.gemoc.ql.k3ql.k3dsa.ql;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException;
import org.gemoc.ql.model.ql.BasicBinaryExpression;
import org.gemoc.ql.model.ql.BinaryOperatorKind;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;

@Aspect(className = BasicBinaryExpression.class)
@SuppressWarnings("all")
public class BasicBinaryExpressionAspect extends BinaryExpressionAspect {
  public static Value evaluate(final BasicBinaryExpression _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspectBasicBinaryExpressionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspectBasicBinaryExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Value evaluate()
    if (_self instanceof org.gemoc.ql.model.ql.BasicBinaryExpression){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspect._privk3_evaluate(_self_, (org.gemoc.ql.model.ql.BasicBinaryExpression)_self);
    };
    return (org.gemoc.ql.model.ql.Value)result;
  }

  protected static Value _privk3_evaluate(final BasicBinaryExpressionAspectBasicBinaryExpressionAspectProperties _self_, final BasicBinaryExpression _self) {
    try {
      Value result = null;
      BinaryOperatorKind _operator = _self.getOperator();
      boolean _equals = Objects.equal(_operator, BinaryOperatorKind.OR);
      if (_equals) {
        final BooleanValue bValue = QlFactory.eINSTANCE.createBooleanValue();
        bValue.setBooleanValue((ExpressionAspect.evaluateAsBoolean(_self.getLhsOperand()) || ExpressionAspect.evaluateAsBoolean(_self.getRhsOperand())));
        result = bValue;
      } else {
        BinaryOperatorKind _operator_1 = _self.getOperator();
        boolean _equals_1 = Objects.equal(_operator_1, BinaryOperatorKind.AND);
        if (_equals_1) {
          final BooleanValue bValue_1 = QlFactory.eINSTANCE.createBooleanValue();
          bValue_1.setBooleanValue((ExpressionAspect.evaluateAsBoolean(_self.getLhsOperand()) && ExpressionAspect.evaluateAsBoolean(_self.getRhsOperand())));
          result = bValue_1;
        } else {
          final Value lhs = ExpressionAspect.evaluate(_self.getLhsOperand());
          final Value rhs = ExpressionAspect.evaluate(_self.getRhsOperand());
          BinaryOperatorKind _operator_2 = _self.getOperator();
          boolean _equals_2 = Objects.equal(_operator_2, BinaryOperatorKind.EQUAL);
          if (_equals_2) {
            result = ValueAspect.bEquals(lhs, rhs);
          } else {
            BinaryOperatorKind _operator_3 = _self.getOperator();
            boolean _equals_3 = Objects.equal(_operator_3, BinaryOperatorKind.PLUS);
            if (_equals_3) {
              result = ValueAspect.plus(lhs, rhs);
            } else {
              BinaryOperatorKind _operator_4 = _self.getOperator();
              boolean _equals_4 = Objects.equal(_operator_4, BinaryOperatorKind.MINUS);
              if (_equals_4) {
                result = ValueAspect.minus(lhs, rhs);
              } else {
                BinaryOperatorKind _operator_5 = _self.getOperator();
                boolean _equals_5 = Objects.equal(_operator_5, BinaryOperatorKind.MULT);
                if (_equals_5) {
                  result = ValueAspect.mult(lhs, rhs);
                } else {
                  BinaryOperatorKind _operator_6 = _self.getOperator();
                  boolean _equals_6 = Objects.equal(_operator_6, BinaryOperatorKind.DIV);
                  if (_equals_6) {
                    result = ValueAspect.div(lhs, rhs);
                  } else {
                    BinaryOperatorKind _operator_7 = _self.getOperator();
                    boolean _equals_7 = Objects.equal(_operator_7, BinaryOperatorKind.GREATER);
                    if (_equals_7) {
                      result = ValueAspect.greater(lhs, rhs);
                    } else {
                      BinaryOperatorKind _operator_8 = _self.getOperator();
                      boolean _equals_8 = Objects.equal(_operator_8, BinaryOperatorKind.LOWER);
                      if (_equals_8) {
                        result = ValueAspect.lower(lhs, rhs);
                      } else {
                        BinaryOperatorKind _operator_9 = _self.getOperator();
                        boolean _equals_9 = Objects.equal(_operator_9, BinaryOperatorKind.GREATEROREQUAL);
                        if (_equals_9) {
                          result = ValueAspect.greaterOrEquals(lhs, rhs);
                        } else {
                          BinaryOperatorKind _operator_10 = _self.getOperator();
                          boolean _equals_10 = Objects.equal(_operator_10, BinaryOperatorKind.LOWEROREQUAL);
                          if (_equals_10) {
                            result = ValueAspect.lowerOrEquals(lhs, rhs);
                          } else {
                            throw new NotImplementedException(("not implemented, please implement evaluate() for " + _self));
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      return result;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
