package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.BasicUnaryExpression;

@SuppressWarnings("all")
public class BasicUnaryExpressionAspectBasicUnaryExpressionAspectContext {
  public static final BasicUnaryExpressionAspectBasicUnaryExpressionAspectContext INSTANCE = new BasicUnaryExpressionAspectBasicUnaryExpressionAspectContext();

  public static BasicUnaryExpressionAspectBasicUnaryExpressionAspectProperties getSelf(final BasicUnaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspectBasicUnaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BasicUnaryExpression, BasicUnaryExpressionAspectBasicUnaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.BasicUnaryExpression, org.gemoc.ql.k3ql.k3dsa.ql.BasicUnaryExpressionAspectBasicUnaryExpressionAspectProperties>();

  public Map<BasicUnaryExpression, BasicUnaryExpressionAspectBasicUnaryExpressionAspectProperties> getMap() {
    return map;
  }
}
