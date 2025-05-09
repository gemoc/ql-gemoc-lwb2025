package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.TextTypeStyle;

@SuppressWarnings("all")
public class TextTypeStyleAspectTextTypeStyleAspectContext {
  public static final TextTypeStyleAspectTextTypeStyleAspectContext INSTANCE = new TextTypeStyleAspectTextTypeStyleAspectContext();

  public static TextTypeStyleAspectTextTypeStyleAspectProperties getSelf(final TextTypeStyle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.TextTypeStyleAspectTextTypeStyleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<TextTypeStyle, TextTypeStyleAspectTextTypeStyleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.TextTypeStyle, org.gemoc.ql.k3ql.k3dsa.qls.TextTypeStyleAspectTextTypeStyleAspectProperties>();

  public Map<TextTypeStyle, TextTypeStyleAspectTextTypeStyleAspectProperties> getMap() {
    return map;
  }
}
