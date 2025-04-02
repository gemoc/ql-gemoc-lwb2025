package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.StringValue;

@SuppressWarnings("all")
public class StringValueAspectStringValueAspectContext {
  public static final StringValueAspectStringValueAspectContext INSTANCE = new StringValueAspectStringValueAspectContext();

  public static StringValueAspectStringValueAspectProperties getSelf(final StringValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StringValue, StringValueAspectStringValueAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.StringValue, org.gemoc.ql.k3ql.k3dsa.ql.StringValueAspectStringValueAspectProperties>();

  public Map<StringValue, StringValueAspectStringValueAspectProperties> getMap() {
    return map;
  }
}
