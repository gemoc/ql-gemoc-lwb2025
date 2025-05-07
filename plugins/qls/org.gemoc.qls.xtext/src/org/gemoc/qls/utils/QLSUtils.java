package org.gemoc.qls.utils;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class QLSUtils {

	public static URI resolveImportURI(String importURI, Resource importLocalResource) {
		return resolveImportURI(URI.createURI(importURI), importLocalResource);
	}
	
	public static URI resolveImportURI(URI importURI, Resource importLocalResource) {
		return importURI.isRelative() ? importURI.resolve(importLocalResource.getURI()) : importURI;
	}
}
