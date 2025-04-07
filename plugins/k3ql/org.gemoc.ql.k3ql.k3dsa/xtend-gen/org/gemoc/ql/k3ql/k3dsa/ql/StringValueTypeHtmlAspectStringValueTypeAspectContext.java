package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.StringValueType;

@SuppressWarnings("all")
public class StringValueTypeHtmlAspectStringValueTypeAspectContext {
  public static final StringValueTypeHtmlAspectStringValueTypeAspectContext INSTANCE = new StringValueTypeHtmlAspectStringValueTypeAspectContext();

  public static StringValueTypeHtmlAspectStringValueTypeAspectProperties getSelf(final StringValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspectStringValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<StringValueType, StringValueTypeHtmlAspectStringValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.StringValueType, org.gemoc.ql.k3ql.k3dsa.ql.StringValueTypeHtmlAspectStringValueTypeAspectProperties>();

  public Map<StringValueType, StringValueTypeHtmlAspectStringValueTypeAspectProperties> getMap() {
    return map;
  }
}
