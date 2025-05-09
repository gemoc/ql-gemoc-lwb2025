package org.gemoc.ql.k3ql.k3dsa.qls;

import java.util.Map;
import org.gemoc.qls.model.qls.Import;

@SuppressWarnings("all")
public class ImportAspectImportAspectContext {
  public static final ImportAspectImportAspectContext INSTANCE = new ImportAspectImportAspectContext();

  public static ImportAspectImportAspectProperties getSelf(final Import _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.gemoc.ql.k3ql.k3dsa.qls.ImportAspectImportAspectProperties());
    		return INSTANCE.map.get(_self);
  }

  private Map<Import, ImportAspectImportAspectProperties> map = new java.util.WeakHashMap<org.gemoc.qls.model.qls.Import, org.gemoc.ql.k3ql.k3dsa.qls.ImportAspectImportAspectProperties>();

  public Map<Import, ImportAspectImportAspectProperties> getMap() {
    return map;
  }
}
