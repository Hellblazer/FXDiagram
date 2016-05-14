package de.fxdiagram.examples.slides.eclipsecon;

import de.fxdiagram.examples.slides.ClickThroughSlide;
import de.fxdiagram.examples.slides.Slide;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class EclipseConSlideFactory {
  public static Slide createSlide(final String slideName) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field initializeGraphics is undefined");
  }
  
  public static Slide createSlide(final String text, final int fontSize) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field initializeGraphics is undefined");
  }
  
  public static ClickThroughSlide createClickThroughSlide(final String slideName) {
    Object _backgroundImage = EclipseConSlideFactory.getBackgroundImage();
    ClickThroughSlide _clickThroughSlide = new ClickThroughSlide(slideName, _backgroundImage);
    final Procedure1<ClickThroughSlide> _function = (ClickThroughSlide it) -> {
      it.initializeGraphics();
    };
    return ObjectExtensions.<ClickThroughSlide>operator_doubleArrow(_clickThroughSlide, _function);
  }
  
  public static Object getBackgroundImage() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ImageCache is undefined"
      + "\nget cannot be resolved"
      + "\ngetImage cannot be resolved");
  }
  
  public static Text createText(final String text, final int fontSize) {
    return EclipseConSlideFactory.createText(text, "Gill Sans", fontSize);
  }
  
  public static Text createJungleText(final String text, final int fontSize) {
    return EclipseConSlideFactory.createText(text, "Chalkduster", fontSize);
  }
  
  public static Text createText(final String text, final String fontName, final int fontSize) {
    Text _text = new Text();
    final Procedure1<Text> _function = (Text it) -> {
      String _trim = text.trim();
      it.setText(_trim);
      it.setTextAlignment(TextAlignment.CENTER);
      Font _font = new Font(fontName, fontSize);
      it.setFont(_font);
      Color _jungleGreen = EclipseConSlideFactory.jungleGreen();
      it.setFill(_jungleGreen);
    };
    return ObjectExtensions.<Text>operator_doubleArrow(_text, _function);
  }
  
  public static Color jungleGreen() {
    return Color.rgb(224, 237, 214);
  }
  
  public static Color jungleDarkGreen() {
    return Color.rgb(161, 171, 74);
  }
  
  public static Color jungleDarkestGreen() {
    return Color.rgb(107, 114, 51);
  }
}
