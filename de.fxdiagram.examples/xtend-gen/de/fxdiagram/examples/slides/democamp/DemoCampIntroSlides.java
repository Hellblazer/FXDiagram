package de.fxdiagram.examples.slides.democamp;

import de.fxdiagram.examples.slides.democamp.DemoCampSlideFactory;
import javafx.collections.ObservableList;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/* @ModelNode */@SuppressWarnings("all")
public class DemoCampIntroSlides /* implements OpenableDiagramNode  */{
  public DemoCampIntroSlides() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(String) is undefined");
  }
  
  @Override
  public Object doActivate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method innerDiagram(SlideDiagram) is undefined"
      + "\nThe method or field seconds is undefined for the type int"
      + "\nThe method or field seconds is undefined for the type int"
      + "\nThe method or field seconds is undefined for the type int"
      + "\nThe method or field ImageCache is undefined"
      + "\nThe method or field ImageCache is undefined"
      + "\nThe method or field super is undefined"
      + "\nThe field slides is not visible"
      + "\nThe field slides is not visible"
      + "\nThe field slides is not visible"
      + "\nThe field slides is not visible"
      + "\nThe field slides is not visible"
      + "\nThe field slides is not visible"
      + "\nThe field slides is not visible"
      + "\nget cannot be resolved"
      + "\ngetImage cannot be resolved"
      + "\nget cannot be resolved"
      + "\ngetImage cannot be resolved"
      + "\ndoActivate cannot be resolved");
  }
  
  protected Pane addComparisonLeft(final Pane pane, final String left, final int size, final int y) {
    final Procedure1<Pane> _function = (Pane it) -> {
      ObservableList<Node> _children = it.getChildren();
      Text _createText = DemoCampSlideFactory.createText(left, size);
      final Procedure1<Text> _function_1 = (Text it_1) -> {
        it_1.setLayoutX(100);
        it_1.setLayoutY(y);
        it_1.setTextAlignment(TextAlignment.LEFT);
        it_1.setTextOrigin(VPos.TOP);
        Color _darkTextColor = DemoCampSlideFactory.getDarkTextColor();
        it_1.setFill(_darkTextColor);
      };
      Text _doubleArrow = ObjectExtensions.<Text>operator_doubleArrow(_createText, _function_1);
      _children.add(_doubleArrow);
    };
    return ObjectExtensions.<Pane>operator_doubleArrow(pane, _function);
  }
  
  protected Pane addComparisonRight(final Pane pane, final String right, final int size, final int y) {
    final Procedure1<Pane> _function = (Pane it) -> {
      ObservableList<Node> _children = it.getChildren();
      Text _createText = DemoCampSlideFactory.createText(right, size);
      final Procedure1<Text> _function_1 = (Text it_1) -> {
        it_1.setLayoutX(612);
        it_1.setLayoutY(y);
        it_1.setTextAlignment(TextAlignment.LEFT);
        it_1.setTextOrigin(VPos.TOP);
      };
      Text _doubleArrow = ObjectExtensions.<Text>operator_doubleArrow(_createText, _function_1);
      _children.add(_doubleArrow);
    };
    return ObjectExtensions.<Pane>operator_doubleArrow(pane, _function);
  }
}
