package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.BasicBinaryExpression;

@SuppressWarnings("all")
public class BasicBinaryExpressionAspectBasicBinaryExpressionAspectContext {
  public static final BasicBinaryExpressionAspectBasicBinaryExpressionAspectContext INSTANCE = new BasicBinaryExpressionAspectBasicBinaryExpressionAspectContext();

  public static BasicBinaryExpressionAspectBasicBinaryExpressionAspectProperties getSelf(final BasicBinaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspectBasicBinaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BasicBinaryExpression, BasicBinaryExpressionAspectBasicBinaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.BasicBinaryExpression, org.gemoc.ql.k3ql.k3dsa.ql.BasicBinaryExpressionAspectBasicBinaryExpressionAspectProperties>();

  public Map<BasicBinaryExpression, BasicBinaryExpressionAspectBasicBinaryExpressionAspectProperties> getMap() {
    return map;
  }
}
