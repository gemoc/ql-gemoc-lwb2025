package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.EnumerationCall;

@SuppressWarnings("all")
public class EnumerationCallAspectEnumerationCallAspectContext {
  public static final EnumerationCallAspectEnumerationCallAspectContext INSTANCE = new EnumerationCallAspectEnumerationCallAspectContext();

  public static EnumerationCallAspectEnumerationCallAspectProperties getSelf(final EnumerationCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<EnumerationCall, EnumerationCallAspectEnumerationCallAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.EnumerationCall, org.gemoc.ql.k3ql.k3dsa.ql.EnumerationCallAspectEnumerationCallAspectProperties>();

  public Map<EnumerationCall, EnumerationCallAspectEnumerationCallAspectProperties> getMap() {
    return map;
  }
}
