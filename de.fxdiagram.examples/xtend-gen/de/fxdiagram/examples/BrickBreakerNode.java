package de.fxdiagram.examples;

import brickbreaker.Config;
import brickbreaker.Main;
import com.google.common.base.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/* @ModelNode */@SuppressWarnings("all")
public class BrickBreakerNode /* implements FlipNode  */{
  public BrickBreakerNode(final String name) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(String) is undefined");
  }
  
  @Override
  protected Object createNode() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\nThe method front(Object) is undefined"
      + "\nRectangleBorderPane cannot be resolved."
      + "\nThe method or field children is undefined"
      + "\nThe method or field name is undefined"
      + "\nThe method back(Group) is undefined"
      + "\nThe method or field widthProperty is undefined"
      + "\nThe method or field heightProperty is undefined"
      + "\ncreateNode cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n/ cannot be resolved"
      + "\n/ cannot be resolved");
  }
  
  @Override
  public Object activate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\nThe method or field front is undefined"
      + "\nactivate cannot be resolved"
      + "\ntooltip cannot be resolved");
  }
  
  public Group createRoot() {
    try {
      Group _xblockexpression = null;
      {
        Config.initialize();
        Group _group = new Group();
        final Procedure1<Group> _function = (Group it) -> {
          Rectangle _rectangle = new Rectangle();
          final Procedure1<Rectangle> _function_1 = (Rectangle it_1) -> {
            it_1.setWidth(Config.SCREEN_WIDTH);
            it_1.setHeight(Config.SCREEN_HEIGHT);
          };
          Rectangle _doubleArrow = ObjectExtensions.<Rectangle>operator_doubleArrow(_rectangle, _function_1);
          it.setClip(_doubleArrow);
        };
        final Group root = ObjectExtensions.<Group>operator_doubleArrow(_group, _function);
        final Main main = new Main();
        final Constructor<Main.MainFrame> constructor = Main.MainFrame.class.getDeclaredConstructor(Main.class, Group.class);
        constructor.setAccessible(true);
        final Main.MainFrame mainFrame = constructor.newInstance(main, root);
        Field[] _declaredFields = Main.class.getDeclaredFields();
        final Function1<Field, Boolean> _function_1 = (Field it) -> {
          String _name = it.getName();
          return Boolean.valueOf(Objects.equal(_name, "mainFrame"));
        };
        Iterable<Field> _filter = IterableExtensions.<Field>filter(((Iterable<Field>)Conversions.doWrapArray(_declaredFields)), _function_1);
        final Field mainFrameField = IterableExtensions.<Field>head(_filter);
        mainFrameField.setAccessible(true);
        mainFrameField.set(main, mainFrame);
        mainFrame.changeState(Main.MainFrame.SPLASH);
        _xblockexpression = root;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
