package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.IntegerValueType;

@SuppressWarnings("all")
public class IntegerValueTypeAspectIntegerValueTypeAspectContext {
  public static final IntegerValueTypeAspectIntegerValueTypeAspectContext INSTANCE = new IntegerValueTypeAspectIntegerValueTypeAspectContext();

  public static IntegerValueTypeAspectIntegerValueTypeAspectProperties getSelf(final IntegerValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspectIntegerValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IntegerValueType, IntegerValueTypeAspectIntegerValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.IntegerValueType, org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeAspectIntegerValueTypeAspectProperties>();

  public Map<IntegerValueType, IntegerValueTypeAspectIntegerValueTypeAspectProperties> getMap() {
    return map;
  }
}
