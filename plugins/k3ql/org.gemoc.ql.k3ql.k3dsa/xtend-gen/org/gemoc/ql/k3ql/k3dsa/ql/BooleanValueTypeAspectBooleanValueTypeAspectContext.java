package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.BooleanValueType;

@SuppressWarnings("all")
public class BooleanValueTypeAspectBooleanValueTypeAspectContext {
  public static final BooleanValueTypeAspectBooleanValueTypeAspectContext INSTANCE = new BooleanValueTypeAspectBooleanValueTypeAspectContext();

  public static BooleanValueTypeAspectBooleanValueTypeAspectProperties getSelf(final BooleanValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspectBooleanValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanValueType, BooleanValueTypeAspectBooleanValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.BooleanValueType, org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeAspectBooleanValueTypeAspectProperties>();

  public Map<BooleanValueType, BooleanValueTypeAspectBooleanValueTypeAspectProperties> getMap() {
    return map;
  }
}
