package de.fxdiagram.examples.lcars;

import com.google.common.collect.Iterables;
import com.mongodb.DBObject;
import de.fxdiagram.examples.lcars.LcarsEntryDescriptor;
import de.fxdiagram.examples.lcars.LcarsExtensions;
import de.fxdiagram.examples.lcars.LcarsField;
import de.fxdiagram.examples.lcars.NameShortener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/* @Logging
@ModelNode */@SuppressWarnings("all")
public class LcarsNode /* implements XNode  */{
  private final static Map<String, List<String>> PAGE_STRUCTURE = Collections.<String, List<String>>unmodifiableMap(CollectionLiterals.<String, List<String>>newHashMap(Pair.<String, List<String>>of("person", Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("gender", "species", "born", "status", "died", "marital_status"))), Pair.<String, List<String>>of("profession", Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("occupation", "affiliation", "rank", "serial_number"))), Pair.<String, List<String>>of("family", Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("spouses", "children", "mother", "father", "siblings", "other_relatives")))));
  
  private final static List<String> pageOrder = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("person", "profession", "family", "other"));
  
  @Extension
  private NameShortener _nameShortener = new NameShortener();
  
  private Map<String, List<LcarsField>> pages;
  
  private List<String> imageUrls = CollectionLiterals.<String>newArrayList();
  
  private String currentImageUrl;
  
  /* @FxProperty
   */private double imageRatio = 0.7;
  
  private VBox vbox;
  
  private HBox infoBox;
  
  private Text nameField;
  
  private Pane infoTextBox;
  
  private ImageView imageView;
  
  private ChangeListener<Bounds> nameShortener;
  
  public LcarsNode(final LcarsEntryDescriptor descriptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(LcarsEntryDescriptor) is undefined");
  }
  
  @Override
  public LcarsEntryDescriptor getDomainObjectDescriptor() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\ngetDomainObjectDescriptor cannot be resolved");
  }
  
  @Override
  protected Object createNode() {
    throw new Error("Unresolved compilation problems:"
      + "\nRectangleBorderPane cannot be resolved."
      + "\nThe method backgroundRadius(int) is undefined"
      + "\nThe method borderRadius(int) is undefined"
      + "\nThe method backgroundPaint(Color) is undefined"
      + "\nThe method borderPaint(Color) is undefined"
      + "\nThe method or field children is undefined"
      + "\nThe method alignment(Pos) is undefined"
      + "\nThe method or field name is undefined"
      + "\nThe method or field children is undefined"
      + "\nRectangleBorderPane cannot be resolved."
      + "\nThe method backgroundPaint(Color) is undefined"
      + "\nThe method backgroundRadius(int) is undefined"
      + "\nThe method borderPaint(Color) is undefined"
      + "\nThe method borderRadius(int) is undefined"
      + "\nThe method or field children is undefined"
      + "\nThe method or field widthProperty is undefined"
      + "\nThe method or field heightProperty is undefined"
      + "\n- cannot be resolved."
      + "\nType mismatch: cannot convert implicit first argument from Object to Node"
      + "\nType mismatch: cannot convert from int to String"
      + "\nType mismatch: cannot convert from String to ObservableValue<? extends Number>"
      + "\nget cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n- cannot be resolved"
      + "\n- cannot be resolved");
  }
  
  protected Object createBox(final Color color) {
    throw new Error("Unresolved compilation problems:"
      + "\nRectangleBorderPane cannot be resolved."
      + "\nThe method borderPaint(Color) is undefined"
      + "\nThe method backgroundPaint(Color) is undefined"
      + "\nThe method borderRadius(int) is undefined"
      + "\nThe method backgroundRadius(int) is undefined"
      + "\nThe method setMaxSize(double, double) is undefined"
      + "\nThe method alignment(Pos) is undefined"
      + "\n=> cannot be resolved");
  }
  
  protected Text createButtonText(final String buttonText, final VPos alignment) {
    Text _text = new Text();
    final Procedure1<Text> _function = (Text it) -> {
      Font _lcarsFont = LcarsExtensions.lcarsFont(4);
      it.setFont(_lcarsFont);
      it.setText(buttonText);
      it.setFill(Color.BLACK);
      it.setTextOrigin(VPos.TOP);
      if (alignment != null) {
        switch (alignment) {
          case TOP:
            Insets _insets = new Insets(0, 0, 5, 3);
            StackPane.setMargin(it, _insets);
            break;
          case BOTTOM:
            Insets _insets_1 = new Insets(5, 0, 0, 3);
            StackPane.setMargin(it, _insets_1);
            break;
          default:
            Insets _insets_2 = new Insets(1, 0, 1, 3);
            StackPane.setMargin(it, _insets_2);
            break;
        }
      } else {
        Insets _insets_2 = new Insets(1, 0, 1, 3);
        StackPane.setMargin(it, _insets_2);
      }
    };
    return ObjectExtensions.<Text>operator_doubleArrow(_text, _function);
  }
  
  protected LinkedHashMap<String, List<LcarsField>> createPages(final DBObject data) {
    LinkedHashMap<String, List<LcarsField>> _xblockexpression = null;
    {
      final LinkedHashMap<String, List<LcarsField>> pages = CollectionLiterals.<String, List<LcarsField>>newLinkedHashMap();
      final HashSet<String> handledKeys = CollectionLiterals.<String>newHashSet();
      CollectionExtensions.<String>addAll(handledKeys, "name", "_id", "images");
      Set<String> _keySet = LcarsNode.PAGE_STRUCTURE.keySet();
      for (final String pageTitle : _keySet) {
        {
          List<String> _get = LcarsNode.PAGE_STRUCTURE.get(pageTitle);
          final ArrayList<LcarsField> page = this.createPageText(data, _get);
          boolean _isEmpty = page.isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            pages.put(pageTitle, page);
          }
          List<String> _get_1 = LcarsNode.PAGE_STRUCTURE.get(pageTitle);
          handledKeys.addAll(_get_1);
        }
      }
      Set<String> _keySet_1 = data.keySet();
      final Function1<String, Boolean> _function = (String it) -> {
        boolean _contains = handledKeys.contains(it);
        return Boolean.valueOf((!_contains));
      };
      final Iterable<String> otherKeys = IterableExtensions.<String>filter(_keySet_1, _function);
      boolean _isEmpty = IterableExtensions.isEmpty(otherKeys);
      boolean _not = (!_isEmpty);
      if (_not) {
        ArrayList<LcarsField> _createPageText = this.createPageText(data, otherKeys);
        pages.put("other", _createPageText);
      }
      _xblockexpression = pages;
    }
    return _xblockexpression;
  }
  
  protected ArrayList<LcarsField> createPageText(final DBObject data, final Iterable<String> keys) {
    ArrayList<LcarsField> _xblockexpression = null;
    {
      final ArrayList<LcarsField> fields = CollectionLiterals.<LcarsField>newArrayList();
      for (final String key : keys) {
        boolean _containsField = data.containsField(key);
        if (_containsField) {
          Object _get = data.get(key);
          String _string = _get.toString();
          LcarsField _lcarsField = new LcarsField(this, key, _string);
          fields.add(_lcarsField);
        }
      }
      _xblockexpression = fields;
    }
    return _xblockexpression;
  }
  
  public void showImage(final String imageUrl) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field ImageCache is undefined"
      + "\nget cannot be resolved"
      + "\ngetImage cannot be resolved"
      + "\nget cannot be resolved"
      + "\n!= cannot be resolved"
      + "\nwidth cannot be resolved"
      + "\n/ cannot be resolved"
      + "\nheight cannot be resolved"
      + "\n< cannot be resolved"
      + "\nwidth cannot be resolved"
      + "\n/ cannot be resolved"
      + "\nheight cannot be resolved"
      + "\n- cannot be resolved"
      + "\nwidth cannot be resolved"
      + "\nheight cannot be resolved"
      + "\nwidth cannot be resolved"
      + "\n- cannot be resolved"
      + "\nheight cannot be resolved");
  }
  
  public void showPage(final String page) {
    final List<LcarsField> fields = this.pages.get(page);
    ObservableList<Node> _children = this.infoTextBox.getChildren();
    _children.clear();
    ObservableList<Node> _children_1 = this.infoTextBox.getChildren();
    Iterables.<Node>addAll(_children_1, fields);
    final Timeline timeline = new Timeline();
    final Consumer<LcarsField> _function = (LcarsField it) -> {
      it.addAnimation(timeline);
    };
    fields.forEach(_function);
    timeline.play();
  }
  
  @Override
  public Transition doActivate() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field super is undefined"
      + "\nThe method or field name is undefined"
      + "\nThe method or field children is undefined"
      + "\nThe method onMousePressed((Object)=>Object) is undefined"
      + "\nThe method onMouseReleased((Object)=>Object) is undefined"
      + "\nThe method or field children is undefined"
      + "\nThe method onMousePressed((Object)=>Object) is undefined"
      + "\nThe method onMouseReleased((Object)=>Object) is undefined"
      + "\nThe method or field children is undefined"
      + "\nThe method onMousePressed((Object)=>Object) is undefined"
      + "\nThe method onMouseReleased((Object)=>Object) is undefined"
      + "\nType mismatch: cannot convert implicit first argument from Object to Node"
      + "\nType mismatch: cannot convert implicit first argument from Object to Node"
      + "\nType mismatch: cannot convert implicit first argument from Object to Node"
      + "\nType mismatch: cannot convert implicit first argument from Object to Node"
      + "\ndoActivate cannot be resolved"
      + "\ncreatePages cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved"
      + "\n+= cannot be resolved"
      + "\n=> cannot be resolved");
  }
  
  public Transition inflateInfoTextBox() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field millis is undefined for the type int");
  }
  
  protected Object invertColors(final /* RectangleBorderPane */Object box) {
    throw new Error("Unresolved compilation problems:"
      + "\nchildren cannot be resolved"
      + "\nhead cannot be resolved"
      + "\nbackgroundPaint cannot be resolved"
      + "\nbackgroundPaint cannot be resolved"
      + "\nborderPaint cannot be resolved");
  }
  
  public Object getData() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field domainObject is undefined for the type LcarsEntryDescriptor");
  }
  
  @Override
  public Object selectionFeedback(final boolean isSelected) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field outgoingConnections is undefined"
      + "\nThe method or field incomingConnections is undefined"
      + "\nThe method or field toFront is undefined"
      + "\n+ cannot be resolved"
      + "\nforEach cannot be resolved");
  }
}
