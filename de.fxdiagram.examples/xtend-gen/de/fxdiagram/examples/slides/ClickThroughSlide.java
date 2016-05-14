package de.fxdiagram.examples.slides;

import de.fxdiagram.examples.slides.Slide;
import javafx.animation.FadeTransition;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/* @ModelNode */@SuppressWarnings("all")
public class ClickThroughSlide extends Slide {
  private Pane pane;
  
  private Node currentNode;
  
  public ClickThroughSlide(final String name) {
    super(name);
  }
  
  public ClickThroughSlide(final String name, final Image backgroundImage) {
    super(name, backgroundImage);
  }
  
  @Override
  public Node initializeGraphics() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method initializeGraphics() is undefined for the type Slide");
  }
  
  @Override
  protected StackPane createNode() {
    StackPane _xblockexpression = null;
    {
      final StackPane node = super.createNode();
      ObservableList<Node> _children = node.getChildren();
      Pane _pane = new Pane();
      _children.add((this.pane = _pane));
      _xblockexpression = node;
    }
    return _xblockexpression;
  }
  
  @Override
  public void doActivate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field scene is undefined"
      + "\nThe method or field scene is undefined"
      + "\nThe method addBehavior(RevealBehavior) is undefined"
      + "\nwidth cannot be resolved"
      + "\nheight cannot be resolved");
  }
  
  public FadeTransition getRevealTransition(final Node childNode) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field millis is undefined for the type int");
  }
  
  public boolean next() {
    final ObservableList<Node> children = this.pane.getChildren();
    boolean _isEmpty = children.isEmpty();
    if (_isEmpty) {
      return false;
    } else {
      int _indexOf = children.indexOf(this.currentNode);
      final int nextIndex = (_indexOf + 1);
      int _size = children.size();
      boolean _equals = (nextIndex == _size);
      if (_equals) {
        return false;
      }
      Node _get = children.get(nextIndex);
      this.currentNode = _get;
      FadeTransition _revealTransition = this.getRevealTransition(this.currentNode);
      _revealTransition.play();
      return true;
    }
  }
  
  public boolean previous() {
    final ObservableList<Node> children = this.pane.getChildren();
    boolean _isEmpty = children.isEmpty();
    if (_isEmpty) {
      return false;
    } else {
      int _indexOf = children.indexOf(this.currentNode);
      final int previousIndex = (_indexOf - 1);
      if ((previousIndex < 0)) {
        return false;
      }
      this.currentNode.setOpacity(0);
      Node _get = children.get(previousIndex);
      this.currentNode = _get;
      return true;
    }
  }
  
  public Pane getPane() {
    return this.pane;
  }
}
