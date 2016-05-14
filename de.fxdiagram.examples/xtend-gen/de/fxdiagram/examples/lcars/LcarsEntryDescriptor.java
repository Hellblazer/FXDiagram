package de.fxdiagram.examples.lcars;

import com.mongodb.DBObject;
import de.fxdiagram.examples.lcars.LcarsModelProvider;

/* @ModelNode */@SuppressWarnings("all")
public class LcarsEntryDescriptor /* implements CachedDomainObjectDescriptor<DBObject>  */{
  public LcarsEntryDescriptor(final String dbId, final String name, final LcarsModelProvider provider) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(Object, String, LcarsModelProvider) is undefined");
  }
  
  @Override
  public Object getName() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getDomainObject() is undefined"
      + "\nget cannot be resolved"
      + "\ntoString cannot be resolved");
  }
  
  @Override
  public DBObject resolveDomainObject() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field provider is undefined");
  }
}
