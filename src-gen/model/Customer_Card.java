package model;

import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Composition;
import model.Customer;
import model.Ticket_Cart;

@SuppressWarnings("all")
public class Customer_Card extends Composition {
  public class customer extends Composition.Container<Customer> {
  }
  
  public class ticket_cart extends Association.Many<Ticket_Cart> {
  }
}
