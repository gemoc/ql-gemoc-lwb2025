package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.DecimalValue;

@SuppressWarnings("all")
public class DecimalValueAspectDecimalValueAspectContext {
  public static final DecimalValueAspectDecimalValueAspectContext INSTANCE = new DecimalValueAspectDecimalValueAspectContext();

  public static DecimalValueAspectDecimalValueAspectProperties getSelf(final DecimalValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DecimalValue, DecimalValueAspectDecimalValueAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.DecimalValue, org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueAspectDecimalValueAspectProperties>();

  public Map<DecimalValue, DecimalValueAspectDecimalValueAspectProperties> getMap() {
    return map;
  }
}
