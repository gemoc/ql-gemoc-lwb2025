package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.EnumerationLiteral;

@SuppressWarnings("all")
public class EnumerationLiteralAspectEnumerationLiteralAspectContext {
  public static final EnumerationLiteralAspectEnumerationLiteralAspectContext INSTANCE = new EnumerationLiteralAspectEnumerationLiteralAspectContext();

  public static EnumerationLiteralAspectEnumerationLiteralAspectProperties getSelf(final EnumerationLiteral _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.EnumerationLiteralAspectEnumerationLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<EnumerationLiteral, EnumerationLiteralAspectEnumerationLiteralAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.EnumerationLiteral, org.gemoc.ql.k3ql.k3dsa.ql.EnumerationLiteralAspectEnumerationLiteralAspectProperties>();

  public Map<EnumerationLiteral, EnumerationLiteralAspectEnumerationLiteralAspectProperties> getMap() {
    return map;
  }
}
