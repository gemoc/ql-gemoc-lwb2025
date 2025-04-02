package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.DefinitionGroup;

@SuppressWarnings("all")
public class DefinitionGroupAspectDefinitionGroupAspectContext {
  public static final DefinitionGroupAspectDefinitionGroupAspectContext INSTANCE = new DefinitionGroupAspectDefinitionGroupAspectContext();

  public static DefinitionGroupAspectDefinitionGroupAspectProperties getSelf(final DefinitionGroup _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.DefinitionGroupAspectDefinitionGroupAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DefinitionGroup, DefinitionGroupAspectDefinitionGroupAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.DefinitionGroup, org.gemoc.ql.k3ql.k3dsa.ql.DefinitionGroupAspectDefinitionGroupAspectProperties>();

  public Map<DefinitionGroup, DefinitionGroupAspectDefinitionGroupAspectProperties> getMap() {
    return map;
  }
}
