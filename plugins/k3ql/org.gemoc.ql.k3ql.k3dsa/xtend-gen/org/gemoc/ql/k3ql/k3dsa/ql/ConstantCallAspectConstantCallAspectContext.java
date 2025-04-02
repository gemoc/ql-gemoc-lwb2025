package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.ConstantCall;

@SuppressWarnings("all")
public class ConstantCallAspectConstantCallAspectContext {
  public static final ConstantCallAspectConstantCallAspectContext INSTANCE = new ConstantCallAspectConstantCallAspectContext();

  public static ConstantCallAspectConstantCallAspectProperties getSelf(final ConstantCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspectConstantCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ConstantCall, ConstantCallAspectConstantCallAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.ConstantCall, org.gemoc.ql.k3ql.k3dsa.ql.ConstantCallAspectConstantCallAspectProperties>();

  public Map<ConstantCall, ConstantCallAspectConstantCallAspectProperties> getMap() {
    return map;
  }
}
