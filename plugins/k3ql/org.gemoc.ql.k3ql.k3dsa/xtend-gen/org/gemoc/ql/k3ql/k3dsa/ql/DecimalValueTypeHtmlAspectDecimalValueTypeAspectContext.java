package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.DecimalValueType;

@SuppressWarnings("all")
public class DecimalValueTypeHtmlAspectDecimalValueTypeAspectContext {
  public static final DecimalValueTypeHtmlAspectDecimalValueTypeAspectContext INSTANCE = new DecimalValueTypeHtmlAspectDecimalValueTypeAspectContext();

  public static DecimalValueTypeHtmlAspectDecimalValueTypeAspectProperties getSelf(final DecimalValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspectDecimalValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DecimalValueType, DecimalValueTypeHtmlAspectDecimalValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.DecimalValueType, org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeHtmlAspectDecimalValueTypeAspectProperties>();

  public Map<DecimalValueType, DecimalValueTypeHtmlAspectDecimalValueTypeAspectProperties> getMap() {
    return map;
  }
}
