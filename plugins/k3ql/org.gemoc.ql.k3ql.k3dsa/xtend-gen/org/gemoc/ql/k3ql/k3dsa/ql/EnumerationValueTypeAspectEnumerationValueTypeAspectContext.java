package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.EnumerationValueType;

@SuppressWarnings("all")
public class EnumerationValueTypeAspectEnumerationValueTypeAspectContext {
  public static final EnumerationValueTypeAspectEnumerationValueTypeAspectContext INSTANCE = new EnumerationValueTypeAspectEnumerationValueTypeAspectContext();

  public static EnumerationValueTypeAspectEnumerationValueTypeAspectProperties getSelf(final EnumerationValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspectEnumerationValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<EnumerationValueType, EnumerationValueTypeAspectEnumerationValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.EnumerationValueType, org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeAspectEnumerationValueTypeAspectProperties>();

  public Map<EnumerationValueType, EnumerationValueTypeAspectEnumerationValueTypeAspectProperties> getMap() {
    return map;
  }
}
