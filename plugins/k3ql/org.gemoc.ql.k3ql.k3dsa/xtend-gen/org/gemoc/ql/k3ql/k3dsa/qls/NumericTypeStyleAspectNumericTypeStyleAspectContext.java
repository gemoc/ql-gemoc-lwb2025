package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.NumericTypeStyle;

@SuppressWarnings("all")
public class NumericTypeStyleAspectNumericTypeStyleAspectContext {
  public static final NumericTypeStyleAspectNumericTypeStyleAspectContext INSTANCE = new NumericTypeStyleAspectNumericTypeStyleAspectContext();

  public static NumericTypeStyleAspectNumericTypeStyleAspectProperties getSelf(final NumericTypeStyle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.NumericTypeStyleAspectNumericTypeStyleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<NumericTypeStyle, NumericTypeStyleAspectNumericTypeStyleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.NumericTypeStyle, org.gemoc.ql.k3ql.k3dsa.qls.NumericTypeStyleAspectNumericTypeStyleAspectProperties>();

  public Map<NumericTypeStyle, NumericTypeStyleAspectNumericTypeStyleAspectProperties> getMap() {
    return map;
  }
}
