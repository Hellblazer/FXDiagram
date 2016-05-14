package de.fxdiagram.examples;

import de.fxdiagram.examples.BrickBreakerNode;
import de.fxdiagram.examples.ecore.EClassNode;
import de.fxdiagram.examples.java.JavaTypeNode;
import de.fxdiagram.examples.login.LoginNode;
import de.fxdiagram.examples.neonsign.NeonSignNode;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Application to demonstarte the capabilities of FXDiagram in standalone (non-OSGi) mode.
 * I used this for various talks on FXDiagram that's why it also contains some slides.
 * 
 * Have a look at {@link #createScene()} as a starting point if you want to create your own
 * FXDiagram application.
 */
@SuppressWarnings("all")
public class Demo extends Application {
  private /* XRoot */Object root;
  
  private /* ClassLoaderProvider */Object classLoaderProvider;
  
  public static void main(final String... args) {
    Application.launch(args);
  }
  
  @Override
  public void start(final Stage it) {
    it.setTitle("FXDiagram Demo");
    Scene _createScene = this.createScene();
    it.setScene(_createScene);
    it.show();
  }
  
  /**
   * Sets up the scene with an {@link XRoot} and configures its services and actions.
   * Then sets up the initial diagram.
   */
  public Scene createScene() {
    throw new Error("Unresolved compilation problems:"
      + "\nXRoot cannot be resolved."
      + "\nXDiagram cannot be resolved."
      + "\nClassLoaderProvider cannot be resolved."
      + "\nThe method rootClassLoader(ClassLoader) is undefined"
      + "\nCenterAction cannot be resolved."
      + "\nExitAction cannot be resolved."
      + "\nDeleteAction cannot be resolved."
      + "\nLayoutAction cannot be resolved."
      + "\nThe method or field LayoutType is undefined"
      + "\nExportSvgAction cannot be resolved."
      + "\nRedoAction cannot be resolved."
      + "\nUndoAction cannot be resolved."
      + "\nRevealAction cannot be resolved."
      + "\nLoadAction cannot be resolved."
      + "\nSaveAction cannot be resolved."
      + "\nSelectAllAction cannot be resolved."
      + "\nZoomToFitAction cannot be resolved."
      + "\nNavigatePreviousAction cannot be resolved."
      + "\nNavigateNextAction cannot be resolved."
      + "\nOpenAction cannot be resolved."
      + "\nCloseAction cannot be resolved."
      + "\nFullScreenAction cannot be resolved."
      + "\nUndoRedoPlayerAction cannot be resolved."
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nOpenableDiagramNode cannot be resolved."
      + "\nThe method innerDiagram(LazyExampleDiagram) is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nOpenableDiagramNode cannot be resolved."
      + "\nThe method innerDiagram(Object) is undefined"
      + "\nXDiagram cannot be resolved."
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method layoutOnActivate(boolean) is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nSimpleNode cannot be resolved."
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method layoutX(double) is undefined for the type Object"
      + "\nThe method or field layoutBounds is undefined for the type Object"
      + "\nThe method layoutY(double) is undefined for the type Object"
      + "\nThe method or field layoutBounds is undefined for the type Object"
      + "\nXConnection cannot be resolved."
      + "\nType mismatch: cannot convert from Object to byte"
      + "\nType mismatch: cannot convert from Object to byte"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nactivate cannot be resolved"
      + "\nrootDiagram cannot be resolved"
      + "\n=> cannot be resolved"
      + "\ndomainObjectProviders cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ndiagramActionRegistry cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nDOT cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\ngetDomainObjectProvider cannot be resolved"
      + "\ncanConnect cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nnodes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nsize cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nwidth cannot be resolved"
      + "\n/ cannot be resolved"
      + "\nheight cannot be resolved"
      + "\n/ cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nconnections cannot be resolved"
      + "\n+= cannot be resolved"
      + "\nget cannot be resolved"
      + "\nget cannot be resolved"
      + "\ncenterDiagram cannot be resolved");
  }
  
  public Object newGalleryDiagramNode() {
    throw new Error("Unresolved compilation problems:"
      + "\nOpenableDiagramNode cannot be resolved."
      + "\nThe method innerDiagram(Object) is undefined"
      + "\nXDiagram cannot be resolved."
      + "\nThe method contentsInitializer((Object)=>Object) is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nSimpleNode cannot be resolved."
      + "\nThe method or field nodes is undefined"
      + "\nOpenableDiagramNode cannot be resolved."
      + "\nThe method innerDiagram(LazyExampleDiagram) is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nLevelOfDetailDiagramNode cannot be resolved."
      + "\nThe method innerDiagram(LazyExampleDiagram) is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\nThe method or field nodes is undefined"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  public Object newLcarsDiagramNode() {
    throw new Error("Unresolved compilation problems:"
      + "\nOpenableDiagramNode cannot be resolved."
      + "\nThe method innerDiagram(LcarsDiagram) is undefined"
      + "\n=> cannot be resolved");
  }
  
  protected Object openableDiagram(final String name, final /* XNode */Object node) {
    throw new Error("Unresolved compilation problems:"
      + "\nOpenableDiagramNode cannot be resolved."
      + "\nThe method innerDiagram(Object) is undefined"
      + "\nXDiagram cannot be resolved."
      + "\nThe method or field nodes is undefined"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved");
  }
  
  public LoginNode newLoginNode() {
    return new LoginNode("Login");
  }
  
  public EClassNode newEClassNode() {
    throw new Error("Unresolved compilation problems:"
      + "\ngetDomainObjectProvider cannot be resolved"
      + "\ncreateEClassDescriptor cannot be resolved");
  }
  
  public JavaTypeNode newJavaTypeNode() {
    throw new Error("Unresolved compilation problems:"
      + "\ngetDomainObjectProvider cannot be resolved"
      + "\ncreateJavaTypeDescriptor cannot be resolved");
  }
  
  public NeonSignNode newNeonSignNode() {
    return new NeonSignNode("NeonSign");
  }
  
  public Object newMovieNode() {
    throw new Error("Unresolved compilation problems:"
      + "\nMovieNode cannot be resolved."
      + "\nThe method width(int) is undefined"
      + "\nThe method height(int) is undefined"
      + "\n=> cannot be resolved");
  }
  
  public Object newBrowserNode() {
    throw new Error("Unresolved compilation problems:"
      + "\nBrowserNode cannot be resolved."
      + "\nThe method width(int) is undefined"
      + "\nThe method height(int) is undefined"
      + "\nThe method pageUrl(URL) is undefined"
      + "\n=> cannot be resolved");
  }
  
  public BrickBreakerNode newBrickBreakerNode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method width(int) is undefined"
      + "\nThe method height(int) is undefined");
  }
  
  public Object newRecursiveImageNode() {
    throw new Error("Unresolved compilation problems:"
      + "\nRecursiveImageNode cannot be resolved."
      + "\nThe method x(int) is undefined"
      + "\nThe method y(int) is undefined"
      + "\nThe method scale(double) is undefined"
      + "\nThe method width(int) is undefined"
      + "\nThe method height(int) is undefined"
      + "\n=> cannot be resolved");
  }
  
  public Object newImageNode() {
    throw new Error("Unresolved compilation problems:"
      + "\nImageNode cannot be resolved."
      + "\nThe method width(int) is undefined"
      + "\n=> cannot be resolved");
  }
  
  protected void warmUpLayouter() {
    throw new Error("Unresolved compilation problems:"
      + "\nLayouter cannot be resolved.");
  }
  
  protected Object newResource(final String name, final String relativePath) {
    throw new Error("Unresolved compilation problems:"
      + "\ncreateResourceDescriptor cannot be resolved");
  }
}
