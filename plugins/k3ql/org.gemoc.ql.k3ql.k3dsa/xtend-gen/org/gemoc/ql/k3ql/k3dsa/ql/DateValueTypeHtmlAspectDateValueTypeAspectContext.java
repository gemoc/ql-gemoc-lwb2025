package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.DateValueType;

@SuppressWarnings("all")
public class DateValueTypeHtmlAspectDateValueTypeAspectContext {
  public static final DateValueTypeHtmlAspectDateValueTypeAspectContext INSTANCE = new DateValueTypeHtmlAspectDateValueTypeAspectContext();

  public static DateValueTypeHtmlAspectDateValueTypeAspectProperties getSelf(final DateValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspectDateValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DateValueType, DateValueTypeHtmlAspectDateValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.DateValueType, org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeHtmlAspectDateValueTypeAspectProperties>();

  public Map<DateValueType, DateValueTypeHtmlAspectDateValueTypeAspectProperties> getMap() {
    return map;
  }
}
