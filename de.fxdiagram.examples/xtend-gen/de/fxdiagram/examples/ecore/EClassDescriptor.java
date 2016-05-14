package de.fxdiagram.examples.ecore;

import de.fxdiagram.examples.ecore.EcoreDomainObjectProvider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.xbase.lib.Extension;

/* @ModelNode */@SuppressWarnings("all")
public class EClassDescriptor /* implements CachedDomainObjectDescriptor<EClass>  */{
  public EClassDescriptor(final EClass eClass, @Extension final EcoreDomainObjectProvider provider) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(EClass, String, EcoreDomainObjectProvider) is undefined");
  }
  
  @Override
  public String getName() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field provider is undefined"
      + "\nThe method getDomainObject() is undefined");
  }
  
  @Override
  public EClass resolveDomainObject() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field id is undefined");
  }
}
