package org.gemoc.ql.k3ql.k3dsa.ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.gemoc.ql.k3ql.k3dsa.Activator;

@SuppressWarnings("all")
public class EObjectAspect {
  public static final String MESSAGE_GROUP = "FCL_XDSML";

  public static void devDebug(final EObject _self, final String message) {
    Activator.getDefault().getMessaggingSystem().log(MessagingSystem.Kind.DevDEBUG, message, EObjectAspect.MESSAGE_GROUP);
  }

  public static void devDebug(final EObject _self) {
    Activator.getDefault().getMessaggingSystem().log(MessagingSystem.Kind.DevDEBUG, _self.toString(), EObjectAspect.MESSAGE_GROUP);
  }

  public static void devInfo(final EObject _self, final String message) {
    Activator.getDefault().getMessaggingSystem().devInfo(message, EObjectAspect.MESSAGE_GROUP);
  }

  public static void devInfo(final EObject _self) {
    Activator.getDefault().getMessaggingSystem().devInfo(_self.toString(), EObjectAspect.MESSAGE_GROUP);
  }

  public static void devWarn(final EObject _self, final String message) {
    Activator.getDefault().getMessaggingSystem().log(MessagingSystem.Kind.DevWARNING, message, EObjectAspect.MESSAGE_GROUP);
  }

  public static void devError(final EObject _self, final String message) {
    Activator.getDefault().getMessaggingSystem().log(MessagingSystem.Kind.DevERROR, message, EObjectAspect.MESSAGE_GROUP);
  }

  public static void info(final EObject _self, final String message) {
    Activator.getDefault().getMessaggingSystem().info(message, EObjectAspect.MESSAGE_GROUP);
  }

  public static void important(final EObject _self, final String message) {
    Activator.getDefault().getMessaggingSystem().important(message, EObjectAspect.MESSAGE_GROUP);
  }

  public static void warn(final EObject _self, final String message) {
    Activator.getDefault().getMessaggingSystem().warn(message, EObjectAspect.MESSAGE_GROUP);
  }

  public static void error(final EObject _self, final String message) {
    Activator.getDefault().getMessaggingSystem().error(message, EObjectAspect.MESSAGE_GROUP);
  }

  public static String getQualifiedName(final EObject eObject) {
    final StringBuilder sb = new StringBuilder();
    EObject _eContainer = eObject.eContainer();
    boolean _tripleNotEquals = (_eContainer != null);
    if (_tripleNotEquals) {
      sb.append(EObjectAspect.getQualifiedName(eObject.eContainer()));
      sb.append("/");
    }
    final Function1<EAttribute, Boolean> _function = (EAttribute att) -> {
      return Boolean.valueOf(att.getName().equals("name"));
    };
    final EAttribute feat = IterableExtensions.<EAttribute>findFirst(eObject.eClass().getEAllAttributes(), _function);
    if ((feat != null)) {
      sb.append(eObject.eGet(feat));
    } else {
      String _fragment = EcoreUtil.getURI(eObject).fragment();
      int _lastIndexOf = EcoreUtil.getURI(eObject).fragment().lastIndexOf("/");
      int _plus = (_lastIndexOf + 1);
      final String lastFragmentPart = _fragment.substring(_plus);
      sb.append(lastFragmentPart);
    }
    return sb.toString();
  }

  public static <T extends EObject> T getContainerOfType(final EObject eObject, final Class containerType) {
    EObject current = eObject.eContainer();
    while ((current != null)) {
      {
        boolean _isInstance = containerType.isInstance(current);
        if (_isInstance) {
          return ((T) current);
        }
        current = current.eContainer();
      }
    }
    return null;
  }
}
