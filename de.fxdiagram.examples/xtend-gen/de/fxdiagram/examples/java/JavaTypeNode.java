package de.fxdiagram.examples.java;

import com.google.common.base.Objects;
import de.fxdiagram.examples.java.JavaTypeDescriptor;
import de.fxdiagram.examples.java.JavaTypeModel;
import java.util.List;
import javafx.scene.layout.VBox;

/* @ModelNode */@SuppressWarnings("all")
public class JavaTypeNode /* implements XNode  */{
  private final VBox propertyCompartment = new VBox();
  
  private final VBox operationCompartment = new VBox();
  
  private final VBox contentArea = new VBox();
  
  private JavaTypeModel model;
  
  public JavaTypeNode(final JavaTypeDescriptor domainObject) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(JavaTypeDescriptor) is undefined"
      + "\nThe method placementHint(Side) is undefined");
  }
  
  @Override
  protected Object createNode() {
    throw new Error("Unresolved compilation problems:"
      + "\nRectangleBorderPane cannot be resolved."
      + "\nThe method or field children is undefined"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nsimpleName cannot be resolved");
  }
  
  public Object getJavaType() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field domainObject is undefined for the type JavaTypeDescriptor"
      + "\nThe method or field domainObjectDescriptor is undefined");
  }
  
  public JavaTypeModel getJavaTypeModel() {
    JavaTypeModel _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.model, null);
      if (_equals) {
        Object _javaType = this.getJavaType();
        JavaTypeModel _javaTypeModel = new JavaTypeModel(_javaType);
        this.model = _javaTypeModel;
      }
      _xblockexpression = this.model;
    }
    return _xblockexpression;
  }
  
  @Override
  protected Object createAnchors() {
    throw new Error("Unresolved compilation problems:"
      + "\nRoundedRectangleAnchors cannot be resolved.");
  }
  
  public void populateCompartments() {
    throw new Error("Unresolved compilation problems:"
      + "\nsimpleName cannot be resolved");
  }
  
  protected <T extends Object> List<T> limit(final List<T> list) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field isActive is undefined");
  }
  
  @Override
  public Object doActivate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\nInflator cannot be resolved."
      + "\nThe method addBehavior(AddSuperTypeRapidButtonBehavior) is undefined"
      + "\nThe method addBehavior(AddReferenceRapidButtonBehavior) is undefined"
      + "\nThe method or field root is undefined"
      + "\ndoActivate cannot be resolved"
      + "\naddInflatable cannot be resolved"
      + "\naddInflatable cannot be resolved"
      + "\ncommandStack cannot be resolved"
      + "\nexecute cannot be resolved"
      + "\ninflateCommand cannot be resolved");
  }
  
  @Override
  public String toString() {
    throw new Error("Unresolved compilation problems:"
      + "\nsimpleName cannot be resolved");
  }
}
