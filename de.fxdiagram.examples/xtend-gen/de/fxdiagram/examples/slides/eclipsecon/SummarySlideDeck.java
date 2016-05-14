package de.fxdiagram.examples.slides.eclipsecon;

import de.fxdiagram.examples.slides.Animations;
import de.fxdiagram.examples.slides.eclipsecon.EclipseConSlideFactory;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/* @ModelNode */@SuppressWarnings("all")
public class SummarySlideDeck /* implements OpenableDiagramNode  */{
  public SummarySlideDeck() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(String) is undefined");
  }
  
  @Override
  public Object doActivate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method innerDiagram(SlideDiagram) is undefined"
      + "\nThe method or field ImageCache is undefined"
      + "\nThe method or field super is undefined"
      + "\nThe field slides is not visible"
      + "\nThe field slides is not visible"
      + "\nThe field slides is not visible"
      + "\nThe field slides is not visible"
      + "\nThe field slides is not visible"
      + "\nget cannot be resolved"
      + "\ngetImage cannot be resolved"
      + "\ndoActivate cannot be resolved");
  }
  
  protected HBox createMixedText(final String jungleText, final String normalText) {
    HBox _hBox = new HBox();
    final Procedure1<HBox> _function = (HBox it) -> {
      it.setAlignment(Pos.CENTER);
      it.setSpacing(16);
      ObservableList<Node> _children = it.getChildren();
      Text _createJungleText = EclipseConSlideFactory.createJungleText(jungleText, 36);
      final Procedure1<Text> _function_1 = (Text it_1) -> {
        Color _jungleDarkGreen = EclipseConSlideFactory.jungleDarkGreen();
        Color _jungleDarkestGreen = EclipseConSlideFactory.jungleDarkestGreen();
        Animations.breathe(it_1, _jungleDarkGreen, _jungleDarkestGreen);
      };
      Text _doubleArrow = ObjectExtensions.<Text>operator_doubleArrow(_createJungleText, _function_1);
      _children.add(_doubleArrow);
      ObservableList<Node> _children_1 = it.getChildren();
      Text _createText = EclipseConSlideFactory.createText(normalText, 36);
      _children_1.add(_createText);
    };
    return ObjectExtensions.<HBox>operator_doubleArrow(_hBox, _function);
  }
}
