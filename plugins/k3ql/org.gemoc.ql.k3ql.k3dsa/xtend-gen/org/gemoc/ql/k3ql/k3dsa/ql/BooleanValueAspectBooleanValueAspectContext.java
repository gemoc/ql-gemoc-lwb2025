package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.BooleanValue;

@SuppressWarnings("all")
public class BooleanValueAspectBooleanValueAspectContext {
  public static final BooleanValueAspectBooleanValueAspectContext INSTANCE = new BooleanValueAspectBooleanValueAspectContext();

  public static BooleanValueAspectBooleanValueAspectProperties getSelf(final BooleanValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanValue, BooleanValueAspectBooleanValueAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.BooleanValue, org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueAspectBooleanValueAspectProperties>();

  public Map<BooleanValue, BooleanValueAspectBooleanValueAspectProperties> getMap() {
    return map;
  }
}
