package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.ConditionnalElement;

@SuppressWarnings("all")
public class ConditionnalElementAspectConditionnalElementAspectContext {
  public static final ConditionnalElementAspectConditionnalElementAspectContext INSTANCE = new ConditionnalElementAspectConditionnalElementAspectContext();

  public static ConditionnalElementAspectConditionnalElementAspectProperties getSelf(final ConditionnalElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.ConditionnalElementAspectConditionnalElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<ConditionnalElement, ConditionnalElementAspectConditionnalElementAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.ConditionnalElement, org.gemoc.ql.k3ql.k3dsa.ql.ConditionnalElementAspectConditionnalElementAspectProperties>();

  public Map<ConditionnalElement, ConditionnalElementAspectConditionnalElementAspectProperties> getMap() {
    return map;
  }
}
