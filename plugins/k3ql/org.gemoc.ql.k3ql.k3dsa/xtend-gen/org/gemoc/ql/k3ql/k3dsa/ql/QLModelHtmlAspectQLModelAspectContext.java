package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.QLModel;

@SuppressWarnings("all")
public class QLModelHtmlAspectQLModelAspectContext {
  public static final QLModelHtmlAspectQLModelAspectContext INSTANCE = new QLModelHtmlAspectQLModelAspectContext();

  public static QLModelHtmlAspectQLModelAspectProperties getSelf(final QLModel _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.QLModelHtmlAspectQLModelAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<QLModel, QLModelHtmlAspectQLModelAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.QLModel, org.gemoc.ql.k3ql.k3dsa.ql.QLModelHtmlAspectQLModelAspectProperties>();

  public Map<QLModel, QLModelHtmlAspectQLModelAspectProperties> getMap() {
    return map;
  }
}
