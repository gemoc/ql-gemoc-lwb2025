package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.ValueType;

@SuppressWarnings("all")
public class ValueTypeHtmlAspectValueTypeAspectContext {
  public static final ValueTypeHtmlAspectValueTypeAspectContext INSTANCE = new ValueTypeHtmlAspectValueTypeAspectContext();

  public static ValueTypeHtmlAspectValueTypeAspectProperties getSelf(final ValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspectValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ValueType, ValueTypeHtmlAspectValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.ValueType, org.gemoc.ql.k3ql.k3dsa.ql.ValueTypeHtmlAspectValueTypeAspectProperties>();

  public Map<ValueType, ValueTypeHtmlAspectValueTypeAspectProperties> getMap() {
    return map;
  }
}
