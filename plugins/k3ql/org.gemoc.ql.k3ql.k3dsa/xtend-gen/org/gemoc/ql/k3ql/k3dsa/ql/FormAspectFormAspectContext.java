package org.gemoc.ql.k3ql.k3dsa.ql;

import java.util.Map;
import org.gemoc.ql.model.ql.Form;

@SuppressWarnings("all")
public class FormAspectFormAspectContext {
  public static final FormAspectFormAspectContext INSTANCE = new FormAspectFormAspectContext();

  public static FormAspectFormAspectProperties getSelf(final Form _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.ql.FormAspectFormAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Form, FormAspectFormAspectProperties> map = new java.util.WeakHashMap<org.gemoc.ql.model.ql.Form, org.gemoc.ql.k3ql.k3dsa.ql.FormAspectFormAspectProperties>();

  public Map<Form, FormAspectFormAspectProperties> getMap() {
    return map;
  }
}
