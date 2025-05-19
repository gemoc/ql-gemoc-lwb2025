package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.SectionContent;

@SuppressWarnings("all")
public class SectionContentHtmlAspectSectionContentAspectContext {
  public static final SectionContentHtmlAspectSectionContentAspectContext INSTANCE = new SectionContentHtmlAspectSectionContentAspectContext();

  public static SectionContentHtmlAspectSectionContentAspectProperties getSelf(final SectionContent _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.SectionContentHtmlAspectSectionContentAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<SectionContent, SectionContentHtmlAspectSectionContentAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.SectionContent, org.gemoc.ql.k3ql.k3dsa.qls.SectionContentHtmlAspectSectionContentAspectProperties>();

  public Map<SectionContent, SectionContentHtmlAspectSectionContentAspectProperties> getMap() {
    return map;
  }
}
