package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.DecimalValueType;

@SuppressWarnings("all")
public class DecimalValueTypeAspectDecimalValueTypeAspectContext {
  public static final DecimalValueTypeAspectDecimalValueTypeAspectContext INSTANCE = new DecimalValueTypeAspectDecimalValueTypeAspectContext();

  public static DecimalValueTypeAspectDecimalValueTypeAspectProperties getSelf(final DecimalValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspectDecimalValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DecimalValueType, DecimalValueTypeAspectDecimalValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.DecimalValueType, org.gemoc.ql.k3ql.k3dsa.ql.DecimalValueTypeAspectDecimalValueTypeAspectProperties>();

  public Map<DecimalValueType, DecimalValueTypeAspectDecimalValueTypeAspectProperties> getMap() {
    return map;
  }
}
