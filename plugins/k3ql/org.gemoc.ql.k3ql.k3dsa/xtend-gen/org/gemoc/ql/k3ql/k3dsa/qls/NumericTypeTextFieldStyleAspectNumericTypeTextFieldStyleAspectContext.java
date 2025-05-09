package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.NumericTypeTextFieldStyle;

@SuppressWarnings("all")
public class NumericTypeTextFieldStyleAspectNumericTypeTextFieldStyleAspectContext {
  public static final NumericTypeTextFieldStyleAspectNumericTypeTextFieldStyleAspectContext INSTANCE = new NumericTypeTextFieldStyleAspectNumericTypeTextFieldStyleAspectContext();

  public static NumericTypeTextFieldStyleAspectNumericTypeTextFieldStyleAspectProperties getSelf(final NumericTypeTextFieldStyle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.NumericTypeTextFieldStyleAspectNumericTypeTextFieldStyleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<NumericTypeTextFieldStyle, NumericTypeTextFieldStyleAspectNumericTypeTextFieldStyleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.NumericTypeTextFieldStyle, org.gemoc.ql.k3ql.k3dsa.qls.NumericTypeTextFieldStyleAspectNumericTypeTextFieldStyleAspectProperties>();

  public Map<NumericTypeTextFieldStyle, NumericTypeTextFieldStyleAspectNumericTypeTextFieldStyleAspectProperties> getMap() {
    return map;
  }
}
