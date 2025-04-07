package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.BooleanValueType;

@SuppressWarnings("all")
public class BooleanValueTypeHtmlAspectBooleanValueTypeAspectContext {
  public static final BooleanValueTypeHtmlAspectBooleanValueTypeAspectContext INSTANCE = new BooleanValueTypeHtmlAspectBooleanValueTypeAspectContext();

  public static BooleanValueTypeHtmlAspectBooleanValueTypeAspectProperties getSelf(final BooleanValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspectBooleanValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanValueType, BooleanValueTypeHtmlAspectBooleanValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.BooleanValueType, org.gemoc.ql.k3ql.k3dsa.ql.BooleanValueTypeHtmlAspectBooleanValueTypeAspectProperties>();

  public Map<BooleanValueType, BooleanValueTypeHtmlAspectBooleanValueTypeAspectProperties> getMap() {
    return map;
  }
}
