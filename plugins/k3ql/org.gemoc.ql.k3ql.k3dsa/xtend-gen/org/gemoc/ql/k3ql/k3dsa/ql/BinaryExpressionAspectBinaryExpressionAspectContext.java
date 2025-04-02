package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.BinaryExpression;

@SuppressWarnings("all")
public class BinaryExpressionAspectBinaryExpressionAspectContext {
  public static final BinaryExpressionAspectBinaryExpressionAspectContext INSTANCE = new BinaryExpressionAspectBinaryExpressionAspectContext();

  public static BinaryExpressionAspectBinaryExpressionAspectProperties getSelf(final BinaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.BinaryExpressionAspectBinaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BinaryExpression, BinaryExpressionAspectBinaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.BinaryExpression, org.gemoc.ql.k3ql.k3dsa.ql.BinaryExpressionAspectBinaryExpressionAspectProperties>();

  public Map<BinaryExpression, BinaryExpressionAspectBinaryExpressionAspectProperties> getMap() {
    return map;
  }
}
