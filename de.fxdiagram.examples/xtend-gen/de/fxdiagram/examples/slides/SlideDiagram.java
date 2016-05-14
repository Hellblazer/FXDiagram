package de.fxdiagram.examples.slides;

import de.fxdiagram.examples.slides.Slide;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/* @ModelNode("slides") */@SuppressWarnings("all")
public class SlideDiagram /* implements XDiagram  */{
  /* @FxProperty
   */private ObservableList<Slide> slides = FXCollections.<Slide>observableArrayList();
  
  /* @FxProperty
   */private Slide currentSlide;
  
  public SlideDiagram() {
  }
  
  public boolean operator_add(final Slide slide) {
    return this.slides.add(slide);
  }
  
  @Override
  public Slide doActivate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\nThe method backgroundPaint(Color) is undefined"
      + "\nThe method addBehavior(SlideNavigation) is undefined"
      + "\ndoActivate cannot be resolved");
  }
  
  public boolean next() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getBehavior(Object) is undefined"
      + "\nThe method or field CloseBehavior is undefined"
      + "\nclose cannot be resolved");
  }
  
  public boolean previous() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method getBehavior(Object) is undefined"
      + "\nThe method or field CloseBehavior is undefined"
      + "\nclose cannot be resolved");
  }
  
  protected Slide showSlide(final Slide newSlide) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field millis is undefined for the type int"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method selected(boolean) is undefined for the type Slide"
      + "\nThe method or field millis is undefined for the type int"
      + "\nType mismatch: cannot convert from Slide to Node"
      + "\nType mismatch: cannot convert from Slide to Node"
      + "\n-= cannot be resolved"
      + "\n+= cannot be resolved");
  }
}
