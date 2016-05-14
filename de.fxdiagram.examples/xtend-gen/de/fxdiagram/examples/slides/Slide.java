package de.fxdiagram.examples.slides;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure0;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/* @ModelNode */@SuppressWarnings("all")
public class Slide /* implements XNode  */{
  /* @FxProperty
   */private Image backgroundImage;
  
  private ImageView imageView;
  
  private Procedure0 onActivate;
  
  public Slide(final String name) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(String) is undefined");
  }
  
  public Slide(final String name, final Image backgroundImage) {
    this(name);
    this.backgroundImage = backgroundImage;
  }
  
  @Override
  protected StackPane createNode() {
    StackPane _stackPane = new StackPane();
    final Procedure1<StackPane> _function = (StackPane it) -> {
      ObservableList<Node> _children = it.getChildren();
      ImageView _imageView = new ImageView();
      final Procedure1<ImageView> _function_1 = (ImageView it_1) -> {
        ColorAdjust _colorAdjust = new ColorAdjust();
        final Procedure1<ColorAdjust> _function_2 = (ColorAdjust it_2) -> {
          it_2.setBrightness((-0.5));
          it_2.setSaturation(0);
          it_2.setContrast((-0.1));
        };
        ColorAdjust _doubleArrow = ObjectExtensions.<ColorAdjust>operator_doubleArrow(_colorAdjust, _function_2);
        it_1.setEffect(_doubleArrow);
      };
      ImageView _doubleArrow = ObjectExtensions.<ImageView>operator_doubleArrow(_imageView, _function_1);
      _children.add((this.imageView = _doubleArrow));
    };
    return ObjectExtensions.<StackPane>operator_doubleArrow(_stackPane, _function);
  }
  
  @Override
  public void doActivate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\nZoomToFitAction cannot be resolved."
      + "\nThe method or field root is undefined"
      + "\ndoActivate cannot be resolved"
      + "\nperform cannot be resolved");
  }
  
  public Procedure0 setOnActivate(final Procedure0 onActivate) {
    return this.onActivate = onActivate;
  }
  
  public StackPane getStackPane() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field node is undefined");
  }
  
  @Override
  public Object selectionFeedback(final boolean isSelected) {
    return null;
  }
}
