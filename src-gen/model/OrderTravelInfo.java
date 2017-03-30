package model;

import hu.elte.txtuml.api.model.Association;
import model.Order;
import model.Travel_Info;

@SuppressWarnings("all")
public class OrderTravelInfo extends Association {
  public class orders extends Association.One<Order> {
  }
  
  public class travel_info extends Association.One<Travel_Info> {
  }
}
