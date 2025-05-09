package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.QLSModel;

@SuppressWarnings("all")
public class QLSModelAspectQLSModelAspectContext {
  public static final QLSModelAspectQLSModelAspectContext INSTANCE = new QLSModelAspectQLSModelAspectContext();

  public static QLSModelAspectQLSModelAspectProperties getSelf(final QLSModel _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.QLSModelAspectQLSModelAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<QLSModel, QLSModelAspectQLSModelAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.QLSModel, org.gemoc.ql.k3ql.k3dsa.qls.QLSModelAspectQLSModelAspectProperties>();

  public Map<QLSModel, QLSModelAspectQLSModelAspectProperties> getMap() {
    return map;
  }
}
