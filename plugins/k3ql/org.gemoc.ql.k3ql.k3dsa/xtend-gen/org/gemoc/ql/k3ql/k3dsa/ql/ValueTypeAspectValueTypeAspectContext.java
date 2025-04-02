package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.ValueType;

@SuppressWarnings("all")
public class ValueTypeAspectValueTypeAspectContext {
  public static final ValueTypeAspectValueTypeAspectContext INSTANCE = new ValueTypeAspectValueTypeAspectContext();

  public static ValueTypeAspectValueTypeAspectProperties getSelf(final ValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspectValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ValueType, ValueTypeAspectValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.ValueType, org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeAspectValueTypeAspectProperties>();

  public Map<ValueType, ValueTypeAspectValueTypeAspectProperties> getMap() {
    return map;
  }
}
