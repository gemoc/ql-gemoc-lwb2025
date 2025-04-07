package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.IntegerValueType;

@SuppressWarnings("all")
public class IntegerValueTypeHtmlAspectIntegerValueTypeAspectContext {
  public static final IntegerValueTypeHtmlAspectIntegerValueTypeAspectContext INSTANCE = new IntegerValueTypeHtmlAspectIntegerValueTypeAspectContext();

  public static IntegerValueTypeHtmlAspectIntegerValueTypeAspectProperties getSelf(final IntegerValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspectIntegerValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<IntegerValueType, IntegerValueTypeHtmlAspectIntegerValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.IntegerValueType, org.gemoc.ql.k3ql.k3dsa.ql.IntegerValueTypeHtmlAspectIntegerValueTypeAspectProperties>();

  public Map<IntegerValueType, IntegerValueTypeHtmlAspectIntegerValueTypeAspectProperties> getMap() {
    return map;
  }
}
