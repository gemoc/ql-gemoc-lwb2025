package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.NamedElement;

@SuppressWarnings("all")
public class NamedElementAspectNamedElementAspectContext {
  public static final NamedElementAspectNamedElementAspectContext INSTANCE = new NamedElementAspectNamedElementAspectContext();

  public static NamedElementAspectNamedElementAspectProperties getSelf(final NamedElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.NamedElementAspectNamedElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<NamedElement, NamedElementAspectNamedElementAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.NamedElement, org.gemoc.ql.k3ql.k3dsa.ql.NamedElementAspectNamedElementAspectProperties>();

  public Map<NamedElement, NamedElementAspectNamedElementAspectProperties> getMap() {
    return map;
  }
}
