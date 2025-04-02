package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.StringValueType;

@SuppressWarnings("all")
public class StringValueTypeAspectStringValueTypeAspectContext {
  public static final StringValueTypeAspectStringValueTypeAspectContext INSTANCE = new StringValueTypeAspectStringValueTypeAspectContext();

  public static StringValueTypeAspectStringValueTypeAspectProperties getSelf(final StringValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspectStringValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StringValueType, StringValueTypeAspectStringValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.StringValueType, org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeAspectStringValueTypeAspectProperties>();

  public Map<StringValueType, StringValueTypeAspectStringValueTypeAspectProperties> getMap() {
    return map;
  }
}
