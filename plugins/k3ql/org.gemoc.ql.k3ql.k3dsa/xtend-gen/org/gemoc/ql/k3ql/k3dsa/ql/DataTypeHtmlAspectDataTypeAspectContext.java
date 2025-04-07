package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.DataType;

@SuppressWarnings("all")
public class DataTypeHtmlAspectDataTypeAspectContext {
  public static final DataTypeHtmlAspectDataTypeAspectContext INSTANCE = new DataTypeHtmlAspectDataTypeAspectContext();

  public static DataTypeHtmlAspectDataTypeAspectProperties getSelf(final DataType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspectDataTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DataType, DataTypeHtmlAspectDataTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.DataType, org.gemoc.ql.k3ql.k3dsa.ql.DataTypeHtmlAspectDataTypeAspectProperties>();

  public Map<DataType, DataTypeHtmlAspectDataTypeAspectProperties> getMap() {
    return map;
  }
}
