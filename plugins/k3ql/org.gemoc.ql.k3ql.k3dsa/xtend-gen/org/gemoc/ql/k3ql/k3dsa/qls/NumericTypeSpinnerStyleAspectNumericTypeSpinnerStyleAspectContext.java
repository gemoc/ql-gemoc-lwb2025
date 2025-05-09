package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.NumericTypeSpinnerStyle;

@SuppressWarnings("all")
public class NumericTypeSpinnerStyleAspectNumericTypeSpinnerStyleAspectContext {
  public static final NumericTypeSpinnerStyleAspectNumericTypeSpinnerStyleAspectContext INSTANCE = new NumericTypeSpinnerStyleAspectNumericTypeSpinnerStyleAspectContext();

  public static NumericTypeSpinnerStyleAspectNumericTypeSpinnerStyleAspectProperties getSelf(final NumericTypeSpinnerStyle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.NumericTypeSpinnerStyleAspectNumericTypeSpinnerStyleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<NumericTypeSpinnerStyle, NumericTypeSpinnerStyleAspectNumericTypeSpinnerStyleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.NumericTypeSpinnerStyle, org.gemoc.ql.k3ql.k3dsa.qls.NumericTypeSpinnerStyleAspectNumericTypeSpinnerStyleAspectProperties>();

  public Map<NumericTypeSpinnerStyle, NumericTypeSpinnerStyleAspectNumericTypeSpinnerStyleAspectProperties> getMap() {
    return map;
  }
}
