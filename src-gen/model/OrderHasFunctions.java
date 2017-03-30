package model;

import hu.elte.txtuml.api.model.Association;
import hu.elte.txtuml.api.model.Composition;
import model.Order;
import model.Orders_Detail;

@SuppressWarnings("all")
public class OrderHasFunctions extends Composition {
  public class detail extends Composition.Container<Orders_Detail> {
  }
  
  public class orders extends Association.One<Order> {
  }
}
