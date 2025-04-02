package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.UnaryExpression;

@SuppressWarnings("all")
public class UnaryExpressionAspectUnaryExpressionAspectContext {
  public static final UnaryExpressionAspectUnaryExpressionAspectContext INSTANCE = new UnaryExpressionAspectUnaryExpressionAspectContext();

  public static UnaryExpressionAspectUnaryExpressionAspectProperties getSelf(final UnaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.UnaryExpressionAspectUnaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<UnaryExpression, UnaryExpressionAspectUnaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.UnaryExpression, org.gemoc.ql.k3ql.k3dsa.ql.UnaryExpressionAspectUnaryExpressionAspectProperties>();

  public Map<UnaryExpression, UnaryExpressionAspectUnaryExpressionAspectProperties> getMap() {
    return map;
  }
}
