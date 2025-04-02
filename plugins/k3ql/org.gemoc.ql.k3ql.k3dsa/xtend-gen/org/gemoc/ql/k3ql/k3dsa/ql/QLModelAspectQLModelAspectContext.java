package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.QLModel;

@SuppressWarnings("all")
public class QLModelAspectQLModelAspectContext {
  public static final QLModelAspectQLModelAspectContext INSTANCE = new QLModelAspectQLModelAspectContext();

  public static QLModelAspectQLModelAspectProperties getSelf(final QLModel _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<QLModel, QLModelAspectQLModelAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.QLModel, org.gemoc.ql.k3ql.k3dsa.ql.QLModelAspectQLModelAspectProperties>();

  public Map<QLModel, QLModelAspectQLModelAspectProperties> getMap() {
    return map;
  }
}
