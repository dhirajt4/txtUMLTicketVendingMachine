package model;

import hu.elte.txtuml.api.model.Association;
import model.Orders_Detail;
import model.Ticket;

@SuppressWarnings("all")
public class Ticket_Order extends Association {
  public class ticket extends Association.One<Ticket> {
  }
  
  public class orders_detail extends Association.One<Orders_Detail> {
  }
}
