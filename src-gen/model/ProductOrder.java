package model;

import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Composition;
import model.Order;
import model.Ticket;

@SuppressWarnings("all")
public class ProductOrder extends Composition {
  public class orders extends Composition.Container<Order> {
  }
  
  public class ticket extends Association.Many<Ticket> {
  }
}
