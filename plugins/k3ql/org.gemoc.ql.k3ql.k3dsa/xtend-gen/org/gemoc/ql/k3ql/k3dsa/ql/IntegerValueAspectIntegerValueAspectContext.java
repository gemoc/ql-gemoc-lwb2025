package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.IntegerValue;

@SuppressWarnings("all")
public class IntegerValueAspectIntegerValueAspectContext {
  public static final IntegerValueAspectIntegerValueAspectContext INSTANCE = new IntegerValueAspectIntegerValueAspectContext();

  public static IntegerValueAspectIntegerValueAspectProperties getSelf(final IntegerValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IntegerValue, IntegerValueAspectIntegerValueAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.IntegerValue, org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueAspectIntegerValueAspectProperties>();

  public Map<IntegerValue, IntegerValueAspectIntegerValueAspectProperties> getMap() {
    return map;
  }
}
