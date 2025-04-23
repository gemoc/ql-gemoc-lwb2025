package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.IfExpression;

@SuppressWarnings("all")
public class IfExpressionAspectIfExpressionAspectContext {
  public static final IfExpressionAspectIfExpressionAspectContext INSTANCE = new IfExpressionAspectIfExpressionAspectContext();

  public static IfExpressionAspectIfExpressionAspectProperties getSelf(final IfExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.IfExpressionAspectIfExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IfExpression, IfExpressionAspectIfExpressionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.IfExpression, org.gemoc.ql.k3ql.k3dsa.ql.IfExpressionAspectIfExpressionAspectProperties>();

  public Map<IfExpression, IfExpressionAspectIfExpressionAspectProperties> getMap() {
    return map;
  }
}
