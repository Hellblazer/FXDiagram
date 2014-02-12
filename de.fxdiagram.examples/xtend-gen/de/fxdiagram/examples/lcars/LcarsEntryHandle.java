package de.fxdiagram.examples.lcars;

import com.mongodb.DBObject;
import de.fxdiagram.annotations.properties.ModelNode;
import de.fxdiagram.core.model.DomainObjectHandleImpl;
import de.fxdiagram.core.model.DomainObjectProvider;
import de.fxdiagram.core.model.ModelElementImpl;
import de.fxdiagram.examples.lcars.LcarsModelProvider;

@ModelNode({ "id", "name", "provider" })
@SuppressWarnings("all")
public class LcarsEntryHandle extends DomainObjectHandleImpl {
  public LcarsEntryHandle(final String dbId, final String name, final LcarsModelProvider provider) {
    super(dbId, name, provider);
  }
  
  public Object getDomainObject() {
    Object _domainObject = super.getDomainObject();
    return ((DBObject) _domainObject);
  }
  
  /**
   * Automatically generated by @ModelNode. Needed for deserialization.
   */
  public LcarsEntryHandle() {
  }
  
  public void populate(final ModelElementImpl modelElement) {
    modelElement.addProperty(idProperty(), String.class);
    modelElement.addProperty(nameProperty(), String.class);
    modelElement.addProperty(providerProperty(), DomainObjectProvider.class);
  }
}
