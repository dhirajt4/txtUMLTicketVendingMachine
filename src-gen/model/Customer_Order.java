package model;

import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Composition;
import model.Customer;
import model.Order;

@SuppressWarnings("all")
public class Customer_Order extends Composition {
  public class customer extends Composition.Container<Customer> {
  }
  
  public class orders extends Association.Many<Order> {
  }
}
