package de.fxdiagram.mapping.shapes

import de.fxdiagram.annotations.properties.ModelNode
import de.fxdiagram.core.XNode
import de.fxdiagram.lib.anchors.RoundedRectangleAnchors
import de.fxdiagram.lib.nodes.RectangleBorderPane
import de.fxdiagram.mapping.ConnectionMapping
import de.fxdiagram.mapping.IMappedElementDescriptor
import de.fxdiagram.mapping.behavior.DefaultReconcileBehavior
import javafx.geometry.Insets
import javafx.scene.layout.StackPane
import javafx.scene.paint.Color
import javafx.scene.paint.CycleMethod
import javafx.scene.paint.LinearGradient
import javafx.scene.paint.Stop
import javafx.scene.text.Font
import javafx.scene.text.FontWeight

import static javafx.geometry.Side.*

import static extension de.fxdiagram.mapping.behavior.LazyConnectionMappingBehavior.*
import static extension de.fxdiagram.mapping.shapes.BaseShapeInitializer.*

/**
 * Base implementation for an {@link XNode} that belongs to an {@link IMappedElementDescriptor}.
 * 
 * If the descriptor is an {@link AbstractXtextDescriptor}, members are automatically injected using
 * the Xtext language's injector. 
 */
@ModelNode
class BaseNode<T> extends XNode implements INodeWithLazyMappings {
	
	new() {
		initializeLazily
	}

	new(IMappedElementDescriptor<T> descriptor) {
		super(descriptor)
	}
	
	override IMappedElementDescriptor<T> getDomainObjectDescriptor() {
		super.domainObjectDescriptor as IMappedElementDescriptor<T>
	}
	
	override protected createNode() {
		new RectangleBorderPane => [
			if(!labels.empty) {
				children += labels
				labels.forEach[node] // eagerly initialize nodes
				styleLabels
			}
			backgroundPaint = new LinearGradient(
				0, 0, 1, 1, 
				true, CycleMethod.NO_CYCLE,
				#[
					new Stop(0, Color.rgb(158, 188, 227)), 
					new Stop(1, Color.rgb(220, 230, 255))
				])
		] 
	}
	
	protected def styleLabels() {
		StackPane.setMargin(labels.head, new Insets(10, 20, 10, 20))
		val font = labels.head.text.font
		labels.head.text.font = Font.font(font.family, FontWeight.BOLD, font.size * 1.1)		
	}
	
	override protected createAnchors() {
		new RoundedRectangleAnchors(this, 6, 6)
	}
	
	override doActivate() {
		super.doActivate
		addLazyBehavior(domainObjectDescriptor)
		addBehavior(new DefaultReconcileBehavior(this))
	}
	
	override getButtonSides(ConnectionMapping<?> mapping) {
		#[ TOP, BOTTOM, LEFT, RIGHT ]
	}
	
}	
