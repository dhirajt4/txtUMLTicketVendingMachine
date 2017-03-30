package model;

import hu.elte.txtuml.api.model.Association;
import model.User;
import model.VendingMachine;

@SuppressWarnings("all")
public class Vending_Users extends Association {
  public class vendingMachine extends Association.MaybeOne<VendingMachine> {
  }
  
  public class user extends Association.MaybeOne<User> {
  }
}
