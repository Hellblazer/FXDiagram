package de.fxdiagram.examples.slides;

import de.fxdiagram.examples.slides.ClickThroughSlide;

@SuppressWarnings("all")
public class RevealBehavior /* implements AbstractHostBehavior<ClickThroughSlide>, NavigationBehavior  */{
  public RevealBehavior(final ClickThroughSlide slide) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(ClickThroughSlide) is undefined");
  }
  
  @Override
  protected Object doActivate() {
    return null;
  }
  
  @Override
  public Object getBehaviorKey() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field NavigationBehavior is undefined");
  }
  
  @Override
  public Object next() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field host is undefined"
      + "\nnext cannot be resolved");
  }
  
  @Override
  public Object previous() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field host is undefined"
      + "\nprevious cannot be resolved");
  }
}
