package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.DateValue;

@SuppressWarnings("all")
public class DateValueAspectDateValueAspectContext {
  public static final DateValueAspectDateValueAspectContext INSTANCE = new DateValueAspectDateValueAspectContext();

  public static DateValueAspectDateValueAspectProperties getSelf(final DateValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.DateValueAspectDateValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DateValue, DateValueAspectDateValueAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.DateValue, org.gemoc.ql.k3ql.k3dsa.ql.DateValueAspectDateValueAspectProperties>();

  public Map<DateValue, DateValueAspectDateValueAspectProperties> getMap() {
    return map;
  }
}
