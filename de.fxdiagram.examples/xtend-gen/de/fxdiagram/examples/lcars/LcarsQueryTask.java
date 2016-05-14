package de.fxdiagram.examples.lcars;

import de.fxdiagram.examples.lcars.LcarsField;
import javafx.concurrent.Task;

@SuppressWarnings("all")
public class LcarsQueryTask extends Task<Void> {
  private LcarsField host;
  
  private String fieldName;
  
  private String fieldValue;
  
  private /* ChooserConnectionProvider */Object connectionProvider;
  
  public LcarsQueryTask(final LcarsField host, final String fieldName, final String fieldValue, final /* ChooserConnectionProvider */Object connectionProvider) {
    this.host = host;
    this.fieldName = fieldName;
    this.fieldValue = fieldValue;
    this.connectionProvider = connectionProvider;
  }
  
  @Override
  protected Void call() throws Exception {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field root is undefined for the type LcarsField"
      + "\nConnectedNodeChooser cannot be resolved."
      + "\nCoverFlowChoice cannot be resolved."
      + "\nThe method or field incomingConnections is undefined for the type LcarsNode"
      + "\nThe method or field domainObjectDescriptor is undefined"
      + "\nThe method or field source is undefined"
      + "\nThe method or field outgoingConnections is undefined for the type LcarsNode"
      + "\nThe method or field domainObjectDescriptor is undefined"
      + "\nThe method or field target is undefined"
      + "\nThe method or field domainObjectDescriptor is undefined"
      + "\nThe method or field id is undefined for the type LcarsEntryDescriptor"
      + "\nThe method width(Object) is undefined"
      + "\nThe method or field width is undefined for the type LcarsNode"
      + "\nThe method height(Object) is undefined"
      + "\nThe method or field height is undefined for the type LcarsNode"
      + "\nThe method or field root is undefined for the type LcarsField"
      + "\nType mismatch: cannot convert from String to TimeUnit"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\ngetDomainObjectProvider cannot be resolved"
      + "\ncreateLcarsConnectionDescriptor cannot be resolved"
      + "\nquery cannot be resolved"
      + "\nconnectionProvider cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\n== cannot be resolved"
      + "\nmap cannot be resolved"
      + "\n+ cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\n== cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\nmap cannot be resolved"
      + "\nid cannot be resolved"
      + "\ntoSet cannot be resolved"
      + "\nadd cannot be resolved"
      + "\nfilter cannot be resolved"
      + "\ncontains cannot be resolved"
      + "\n! cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\ncreateLcarsEntryDescriptor cannot be resolved"
      + "\naddChoice cannot be resolved"
      + "\ncurrentTool cannot be resolved");
  }
}
