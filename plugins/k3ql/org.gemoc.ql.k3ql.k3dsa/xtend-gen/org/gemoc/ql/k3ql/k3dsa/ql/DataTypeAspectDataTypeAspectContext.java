package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.DataType;

@SuppressWarnings("all")
public class DataTypeAspectDataTypeAspectContext {
  public static final DataTypeAspectDataTypeAspectContext INSTANCE = new DataTypeAspectDataTypeAspectContext();

  public static DataTypeAspectDataTypeAspectProperties getSelf(final DataType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.DataTypeAspectDataTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<DataType, DataTypeAspectDataTypeAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.DataType, org.gemoc.ql.k3ql.k3dsa.ql.DataTypeAspectDataTypeAspectProperties>();

  public Map<DataType, DataTypeAspectDataTypeAspectProperties> getMap() {
    return map;
  }
}
