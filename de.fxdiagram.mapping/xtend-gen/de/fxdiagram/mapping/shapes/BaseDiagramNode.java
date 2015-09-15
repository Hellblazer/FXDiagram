package de.fxdiagram.mapping.shapes;

import de.fxdiagram.annotations.properties.ModelNode;
import de.fxdiagram.core.XDiagram;
import de.fxdiagram.core.XNode;
import de.fxdiagram.core.layout.LayoutType;
import de.fxdiagram.core.model.DomainObjectDescriptor;
import de.fxdiagram.core.model.ModelElementImpl;
import de.fxdiagram.lib.nodes.RectangleBorderPane;
import de.fxdiagram.lib.simple.OpenableDiagramNode;
import de.fxdiagram.mapping.IMappedElementDescriptor;
import de.fxdiagram.mapping.behavior.DefaultReconcileBehavior;
import de.fxdiagram.mapping.behavior.LazyConnectionMappingBehavior;
import java.util.Collections;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Base implementation for a {@link XNode} with a nested {@link XDiagram} that belongs to an
 * {@link IMappedElementDescriptor}.
 * 
 * If the descriptor is an {@link AbstractXtextDescriptor}, members are automatically injected using
 * the Xtext language's injector.
 */
@ModelNode
@SuppressWarnings("all")
public class BaseDiagramNode<T extends Object> extends OpenableDiagramNode {
  public BaseDiagramNode(final IMappedElementDescriptor<T> descriptor) {
    super(descriptor);
  }
  
  @Override
  public IMappedElementDescriptor<T> getDomainObjectDescriptor() {
    DomainObjectDescriptor _domainObjectDescriptor = super.getDomainObjectDescriptor();
    return ((IMappedElementDescriptor<T>) _domainObjectDescriptor);
  }
  
  @Override
  public void initializeGraphics() {
    super.initializeGraphics();
    RectangleBorderPane _pane = this.getPane();
    Color _rgb = Color.rgb(242, 236, 181);
    Stop _stop = new Stop(0, _rgb);
    Color _rgb_1 = Color.rgb(255, 248, 202);
    Stop _stop_1 = new Stop(1, _rgb_1);
    LinearGradient _linearGradient = new LinearGradient(
      0, 0, 1, 1, 
      true, CycleMethod.NO_CYCLE, 
      Collections.<Stop>unmodifiableList(CollectionLiterals.<Stop>newArrayList(_stop, _stop_1)));
    _pane.setBackgroundPaint(_linearGradient);
  }
  
  @Override
  public void doActivate() {
    super.doActivate();
    IMappedElementDescriptor<T> _domainObjectDescriptor = this.getDomainObjectDescriptor();
    LazyConnectionMappingBehavior.<T>addLazyBehavior(this, _domainObjectDescriptor);
    DefaultReconcileBehavior<BaseDiagramNode<T>> _defaultReconcileBehavior = new DefaultReconcileBehavior<BaseDiagramNode<T>>(this);
    this.addBehavior(_defaultReconcileBehavior);
    XDiagram _innerDiagram = this.getInnerDiagram();
    _innerDiagram.setLayoutOnActivate(LayoutType.DOT);
  }
  
  /**
   * Automatically generated by @ModelNode. Needed for deserialization.
   */
  public BaseDiagramNode() {
  }
  
  public void populate(final ModelElementImpl modelElement) {
    super.populate(modelElement);
  }
}
