package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.EnumerationValueType;

@SuppressWarnings("all")
public class EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectContext {
  public static final EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectContext INSTANCE = new EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectContext();

  public static EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectProperties getSelf(final EnumerationValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<EnumerationValueType, EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.EnumerationValueType, org.gemoc.ql.k3ql.k3dsa.ql.EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectProperties>();

  public Map<EnumerationValueType, EnumerationValueTypeHtmlAspectEnumerationValueTypeAspectProperties> getMap() {
    return map;
  }
}
