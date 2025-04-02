package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.DateValueType;

@SuppressWarnings("all")
public class DateValueTypeAspectDateValueTypeAspectContext {
  public static final DateValueTypeAspectDateValueTypeAspectContext INSTANCE = new DateValueTypeAspectDateValueTypeAspectContext();

  public static DateValueTypeAspectDateValueTypeAspectProperties getSelf(final DateValueType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeAspectDateValueTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DateValueType, DateValueTypeAspectDateValueTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.DateValueType, org.gemoc.ql.k3ql.k3dsa.ql.DateValueTypeAspectDateValueTypeAspectProperties>();

  public Map<DateValueType, DateValueTypeAspectDateValueTypeAspectProperties> getMap() {
    return map;
  }
}
