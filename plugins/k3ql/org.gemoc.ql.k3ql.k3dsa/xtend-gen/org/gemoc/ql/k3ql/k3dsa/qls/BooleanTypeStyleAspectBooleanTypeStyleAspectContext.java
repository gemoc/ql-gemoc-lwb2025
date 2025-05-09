package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.BooleanTypeStyle;

@SuppressWarnings("all")
public class BooleanTypeStyleAspectBooleanTypeStyleAspectContext {
  public static final BooleanTypeStyleAspectBooleanTypeStyleAspectContext INSTANCE = new BooleanTypeStyleAspectBooleanTypeStyleAspectContext();

  public static BooleanTypeStyleAspectBooleanTypeStyleAspectProperties getSelf(final BooleanTypeStyle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.BooleanTypeStyleAspectBooleanTypeStyleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<BooleanTypeStyle, BooleanTypeStyleAspectBooleanTypeStyleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.BooleanTypeStyle, org.gemoc.ql.k3ql.k3dsa.qls.BooleanTypeStyleAspectBooleanTypeStyleAspectProperties>();

  public Map<BooleanTypeStyle, BooleanTypeStyleAspectBooleanTypeStyleAspectProperties> getMap() {
    return map;
  }
}
