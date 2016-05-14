package de.fxdiagram.examples.slides;

import de.fxdiagram.examples.slides.SlideDiagram;

@SuppressWarnings("all")
public class SlideNavigation /* implements AbstractHostBehavior<SlideDiagram>, NavigationBehavior  */{
  public SlideNavigation(final SlideDiagram host) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(SlideDiagram) is undefined");
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
