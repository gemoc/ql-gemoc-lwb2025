package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.Call;

@SuppressWarnings("all")
public class CallAspectCallAspectContext {
  public static final CallAspectCallAspectContext INSTANCE = new CallAspectCallAspectContext();

  public static CallAspectCallAspectProperties getSelf(final Call _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.CallAspectCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Call, CallAspectCallAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.Call, org.gemoc.ql.k3ql.k3dsa.ql.CallAspectCallAspectProperties>();

  public Map<Call, CallAspectCallAspectProperties> getMap() {
    return map;
  }
}
