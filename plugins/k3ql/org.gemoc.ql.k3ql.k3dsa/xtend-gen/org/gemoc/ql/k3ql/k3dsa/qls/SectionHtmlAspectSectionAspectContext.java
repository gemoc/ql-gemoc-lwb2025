package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.Section;

@SuppressWarnings("all")
public class SectionHtmlAspectSectionAspectContext {
  public static final SectionHtmlAspectSectionAspectContext INSTANCE = new SectionHtmlAspectSectionAspectContext();

  public static SectionHtmlAspectSectionAspectProperties getSelf(final Section _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.SectionHtmlAspectSectionAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Section, SectionHtmlAspectSectionAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.Section, org.gemoc.ql.k3ql.k3dsa.qls.SectionHtmlAspectSectionAspectProperties>();

  public Map<Section, SectionHtmlAspectSectionAspectProperties> getMap() {
    return map;
  }
}
