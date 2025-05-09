package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.NumericSpinnerStyle;

@SuppressWarnings("all")
public class NumericSpinnerStyleAspectNumericSpinnerStyleAspectContext {
  public static final NumericSpinnerStyleAspectNumericSpinnerStyleAspectContext INSTANCE = new NumericSpinnerStyleAspectNumericSpinnerStyleAspectContext();

  public static NumericSpinnerStyleAspectNumericSpinnerStyleAspectProperties getSelf(final NumericSpinnerStyle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.NumericSpinnerStyleAspectNumericSpinnerStyleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<NumericSpinnerStyle, NumericSpinnerStyleAspectNumericSpinnerStyleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.NumericSpinnerStyle, org.gemoc.ql.k3ql.k3dsa.qls.NumericSpinnerStyleAspectNumericSpinnerStyleAspectProperties>();

  public Map<NumericSpinnerStyle, NumericSpinnerStyleAspectNumericSpinnerStyleAspectProperties> getMap() {
    return map;
  }
}
