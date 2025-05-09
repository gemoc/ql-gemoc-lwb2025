package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.LabelStyle;

@SuppressWarnings("all")
public class LabelStyleAspectLabelStyleAspectContext {
  public static final LabelStyleAspectLabelStyleAspectContext INSTANCE = new LabelStyleAspectLabelStyleAspectContext();

  public static LabelStyleAspectLabelStyleAspectProperties getSelf(final LabelStyle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.LabelStyleAspectLabelStyleAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<LabelStyle, LabelStyleAspectLabelStyleAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.LabelStyle, org.gemoc.ql.k3ql.k3dsa.qls.LabelStyleAspectLabelStyleAspectProperties>();

  public Map<LabelStyle, LabelStyleAspectLabelStyleAspectProperties> getMap() {
    return map;
  }
}
