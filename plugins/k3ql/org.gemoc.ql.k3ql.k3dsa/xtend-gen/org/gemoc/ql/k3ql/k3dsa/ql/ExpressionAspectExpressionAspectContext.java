package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.Expression;

@SuppressWarnings("all")
public class ExpressionAspectExpressionAspectContext {
  public static final ExpressionAspectExpressionAspectContext INSTANCE = new ExpressionAspectExpressionAspectContext();

  public static ExpressionAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Expression, ExpressionAspectExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.Expression, org.gemoc.ql.k3ql.k3dsa.ql.ExpressionAspectExpressionAspectProperties>();

  public Map<Expression, ExpressionAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
