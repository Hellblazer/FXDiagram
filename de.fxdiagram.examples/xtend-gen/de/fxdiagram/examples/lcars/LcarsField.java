package de.fxdiagram.examples.lcars;

import com.google.common.collect.Iterables;
import de.fxdiagram.examples.lcars.LcarsNode;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.util.Duration;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class LcarsField extends Parent {
  private FlowPane flowPane;
  
  private LcarsNode node;
  
  private Node queryProgress;
  
  public LcarsField(final LcarsNode node, final String name, final String value) {
    throw new Error("Unresolved compilation problems:"
      + "\nChooserConnectionProvider cannot be resolved to a type."
      + "\nThe method or field root is undefined for the type LcarsNode"
      + "\nXConnection cannot be resolved."
      + "\nThe method sourceArrowHead(Object) is undefined"
      + "\nTriangleArrowHead cannot be resolved."
      + "\nXConnectionLabel cannot be resolved."
      + "\nThe method or field text is undefined"
      + "\nThe method or field node is undefined for the type LcarsNode"
      + "\nThe method or field diagram is undefined"
      + "\nThe method or field data is undefined"
      + "\nThe method or field outgoingConnections is undefined"
      + "\nThe method or field target is undefined"
      + "\nThe method or field domainObjectDescriptor is undefined"
      + "\nThe method or field incomingConnections is undefined"
      + "\nThe method or field source is undefined"
      + "\nThe method or field domainObjectDescriptor is undefined"
      + "\nThe method or field root is undefined"
      + "\nThe method or field AddRemoveCommand is undefined"
      + "\nThe method or field diagram is undefined"
      + "\nLayoutAction cannot be resolved."
      + "\nThe method or field LayoutType is undefined"
      + "\nThe method or field root is undefined"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or use the closures in a more specific context."
      + "\ngetDomainObjectProvider cannot be resolved"
      + "\ncreateLcarsConnectionDescriptor cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\ntext cannot be resolved"
      + "\nnodes cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nget cannot be resolved"
      + "\n== cannot be resolved"
      + "\nexists cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n== cannot be resolved"
      + "\n! cannot be resolved"
      + "\nexists cannot be resolved"
      + "\n== cannot be resolved"
      + "\n&& cannot be resolved"
      + "\n== cannot be resolved"
      + "\n! cannot be resolved"
      + "\nmap cannot be resolved"
      + "\ngetConnection cannot be resolved"
      + "\ntoList cannot be resolved"
      + "\ncommandStack cannot be resolved"
      + "\nexecute cannot be resolved"
      + "\nnewAddCommand cannot be resolved"
      + "\nempty cannot be resolved"
      + "\n! cannot be resolved"
      + "\nDOT cannot be resolved"
      + "\nperform cannot be resolved");
  }
  
  public LcarsNode getLcarsNode() {
    return this.node;
  }
  
  protected Iterable<Text> getAllTextNodes() {
    ObservableList<Node> _children = this.flowPane.getChildren();
    return Iterables.<Text>filter(_children, Text.class);
  }
  
  protected boolean isSplitHere(final char c) {
    return Character.isWhitespace(c);
  }
  
  public Timeline addAnimation(final Timeline timeline) {
    Timeline _xblockexpression = null;
    {
      final Procedure1<Timeline> _function = (Timeline it) -> {
        Iterable<Text> _allTextNodes = this.getAllTextNodes();
        for (final Text textNode : _allTextNodes) {
          {
            String _text = textNode.getText();
            int _length = _text.length();
            ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
            for (final Integer index : _doubleDotLessThan) {
              ObservableList<KeyFrame> _keyFrames = it.getKeyFrames();
              Duration _cycleDuration = it.getCycleDuration();
              Duration _millis = Duration.millis(15);
              Duration _add = _cycleDuration.add(_millis);
              StringProperty _textProperty = textNode.textProperty();
              String _text_1 = textNode.getText();
              String _substring = _text_1.substring(0, ((index).intValue() + 1));
              KeyValue _keyValue = new <String>KeyValue(_textProperty, _substring);
              KeyFrame _keyFrame = new KeyFrame(_add, _keyValue);
              _keyFrames.add(_keyFrame);
            }
            textNode.setText("");
          }
        }
      };
      ObjectExtensions.<Timeline>operator_doubleArrow(timeline, _function);
      _xblockexpression = timeline;
    }
    return _xblockexpression;
  }
  
  public void resetVisuals() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field node is undefined for the type LcarsNode");
  }
  
  public Object createQueryProgress() {
    throw new Error("Unresolved compilation problems:"
      + "\nRectangleBorderPane cannot be resolved."
      + "\nThe method backgroundPaint(Color) is undefined"
      + "\nThe method backgroundRadius(int) is undefined"
      + "\nThe method borderWidth(int) is undefined"
      + "\n=> cannot be resolved");
  }
}
