package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.Value;

@SuppressWarnings("all")
public class ValueAspectValueAspectContext {
  public static final ValueAspectValueAspectContext INSTANCE = new ValueAspectValueAspectContext();

  public static ValueAspectValueAspectProperties getSelf(final Value _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Value, ValueAspectValueAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.Value, org.gemoc.ql.k3ql.k3dsa.ql.ValueAspectValueAspectProperties>();

  public Map<Value, ValueAspectValueAspectProperties> getMap() {
    return map;
  }
}
