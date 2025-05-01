package org.gemoc.ql.k3ql.k3dsa.ql;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.gemoc.ql.k3ql.k3dsa.NotImplementedException;
import org.gemoc.ql.model.ql.BasicBinaryExpression;
import org.gemoc.ql.model.ql.BinaryOperatorKind;
import org.gemoc.ql.model.ql.BooleanValue;
import org.gemoc.ql.model.ql.BooleanValueType;
import org.gemoc.ql.model.ql.QlFactory;
import org.gemoc.ql.model.ql.Value;
import org.gemoc.ql.model.ql.ValueType;

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

  public static ValueType inferredValueType(final BasicBinaryExpression _self) {
    final org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspectBasicBinaryExpressionAspectProperties _self_ = org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspectBasicBinaryExpressionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# ValueType inferredValueType()
    if (_self instanceof org.gemoc.ql.model.ql.BasicBinaryExpression){
    	result = org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspect._privk3_inferredValueType(_self_, (org.gemoc.ql.model.ql.BasicBinaryExpression)_self);
    };
    return (org.gemoc.ql.model.ql.ValueType)result;
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

  protected static ValueType _privk3_inferredValueType(final BasicBinaryExpressionAspectBasicBinaryExpressionAspectProperties _self_, final BasicBinaryExpression _self) {
    final ValueType lhsValueType = ExpressionAspect.inferredValueType(_self.getLhsOperand());
    final ValueType rhsValueType = ExpressionAspect.inferredValueType(_self.getRhsOperand());
    BinaryOperatorKind _operator = _self.getOperator();
    boolean _matched = false;
    if (Objects.equal(_operator, BinaryOperatorKind.OR)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_operator, BinaryOperatorKind.AND)) {
        _matched=true;
      }
    }
    if (_matched) {
      if (((lhsValueType instanceof BooleanValueType) && (rhsValueType instanceof BooleanValueType))) {
        return lhsValueType;
      } else {
        return null;
      }
    }
    if (!_matched) {
      if (Objects.equal(_operator, BinaryOperatorKind.PLUS)) {
        _matched=true;
      }
      if (!_matched) {
        if (Objects.equal(_operator, BinaryOperatorKind.MINUS)) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (Objects.equal(_operator, BinaryOperatorKind.MULT)) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (Objects.equal(_operator, BinaryOperatorKind.DIV)) {
          _matched=true;
        }
      }
      if (_matched) {
        boolean _isCompatible = ValueTypeAspect.isCompatible(lhsValueType, rhsValueType);
        if (_isCompatible) {
          return lhsValueType;
        } else {
          return null;
        }
      }
    }
    if (!_matched) {
      if (Objects.equal(_operator, BinaryOperatorKind.EQUAL)) {
        _matched=true;
      }
      if (!_matched) {
        if (Objects.equal(_operator, BinaryOperatorKind.NOTEQUAL)) {
          _matched=true;
        }
      }
      if (!_matched) {
        _matched=true;
      }
      if (_matched) {
        final BooleanValueType vt = QlFactory.eINSTANCE.createBooleanValueType();
        int _hashCode = vt.hashCode();
        String _plus = ("internal_ValueType_" + Integer.valueOf(_hashCode));
        vt.setName(_plus);
        return vt;
      }
    }
    if (!_matched) {
      if (Objects.equal(_operator, BinaryOperatorKind.GREATER)) {
        _matched=true;
      }
      if (!_matched) {
        if (Objects.equal(_operator, BinaryOperatorKind.GREATEROREQUAL)) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (Objects.equal(_operator, BinaryOperatorKind.LOWER)) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (Objects.equal(_operator, BinaryOperatorKind.LOWEROREQUAL)) {
          _matched=true;
        }
      }
      if (_matched) {
        boolean _isCompatible_1 = ValueTypeAspect.isCompatible(lhsValueType, rhsValueType);
        if (_isCompatible_1) {
          final BooleanValueType vt_1 = QlFactory.eINSTANCE.createBooleanValueType();
          int _hashCode_1 = vt_1.hashCode();
          String _plus_1 = ("internal_ValueType_" + Integer.valueOf(_hashCode_1));
          vt_1.setName(_plus_1);
          return vt_1;
        } else {
          return null;
        }
      }
    }
    return null;
  }
}
