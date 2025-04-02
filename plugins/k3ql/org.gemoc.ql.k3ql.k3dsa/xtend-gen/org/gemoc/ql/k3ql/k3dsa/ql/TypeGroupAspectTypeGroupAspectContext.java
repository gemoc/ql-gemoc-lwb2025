package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.TypeGroup;

@SuppressWarnings("all")
public class TypeGroupAspectTypeGroupAspectContext {
  public static final TypeGroupAspectTypeGroupAspectContext INSTANCE = new TypeGroupAspectTypeGroupAspectContext();

  public static TypeGroupAspectTypeGroupAspectProperties getSelf(final TypeGroup _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.TypeGroupAspectTypeGroupAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TypeGroup, TypeGroupAspectTypeGroupAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.TypeGroup, org.gemoc.ql.k3ql.k3dsa.ql.TypeGroupAspectTypeGroupAspectProperties>();

  public Map<TypeGroup, TypeGroupAspectTypeGroupAspectProperties> getMap() {
    return map;
  }
}
