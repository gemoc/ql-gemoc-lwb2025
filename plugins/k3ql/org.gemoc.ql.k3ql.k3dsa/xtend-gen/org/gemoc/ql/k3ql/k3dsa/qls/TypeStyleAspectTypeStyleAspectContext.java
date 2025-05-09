package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.TypeStyle;

@SuppressWarnings("all")
public class TypeStyleAspectTypeStyleAspectContext {
  public static final TypeStyleAspectTypeStyleAspectContext INSTANCE = new TypeStyleAspectTypeStyleAspectContext();

  public static TypeStyleAspectTypeStyleAspectProperties getSelf(final TypeStyle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.TypeStyleAspectTypeStyleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TypeStyle, TypeStyleAspectTypeStyleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.TypeStyle, org.gemoc.ql.k3ql.k3dsa.qls.TypeStyleAspectTypeStyleAspectProperties>();

  public Map<TypeStyle, TypeStyleAspectTypeStyleAspectProperties> getMap() {
    return map;
  }
}
