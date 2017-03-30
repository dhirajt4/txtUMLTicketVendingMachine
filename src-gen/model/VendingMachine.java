package model;

import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.From;
import hu.elte.txtuml.api.model.ModelClass;
import hu.elte.txtuml.api.model.StateMachine;
import hu.elte.txtuml.api.model.To;
import hu.elte.txtuml.api.model.Trigger;
import model.Buy;
import model.ClickOnOrder;
import model.Reselect;
import model.Stop;

@SuppressWarnings("all")
public class VendingMachine extends ModelClass {
  int machine_id;
  
  String name;
  
  String description;
  
  int ticketNumber;
  
  public class Init extends StateMachine.Initial {
  }
  
  public class SelectOrder extends StateMachine.State {
  }
  
  public class CheckTicket extends StateMachine.Choice {
  }
  
  public class Available extends StateMachine.State {
  }
  
  public class NotAvailable extends StateMachine.State {
  }
  
  public class GetTicket extends StateMachine.State {
  }
  
  public class Cancel extends StateMachine.State {
  }
  
  @From(VendingMachine.Init.class)
  @To(VendingMachine.SelectOrder.class)
  public class Initialize extends StateMachine.Transition {
    @Override
    public void effect() {
      Action.log("Starting to chose.");
    }
  }
  
  @From(VendingMachine.SelectOrder.class)
  @To(VendingMachine.CheckTicket.class)
  @Trigger(ClickOnOrder.class)
  public class ChoseOrder extends StateMachine.Transition {
  }
  
  @From(VendingMachine.CheckTicket.class)
  @To(VendingMachine.Available.class)
  public class IfThereIs extends StateMachine.Transition {
    @Override
    public boolean guard() {
      return (VendingMachine.this.ticketNumber > 0);
    }
  }
  
  @From(VendingMachine.CheckTicket.class)
  @To(VendingMachine.NotAvailable.class)
  public class NotFind extends StateMachine.Transition {
    @Override
    public boolean guard() {
      return Else();
    }
  }
  
  @From(VendingMachine.NotAvailable.class)
  @To(VendingMachine.SelectOrder.class)
  @Trigger(Reselect.class)
  public class SelectAgain extends StateMachine.Transition {
  }
  
  @From(VendingMachine.NotAvailable.class)
  @To(VendingMachine.Cancel.class)
  @Trigger(Stop.class)
  public class Stopping extends StateMachine.Transition {
  }
  
  @From(VendingMachine.Available.class)
  @To(VendingMachine.Cancel.class)
  @Trigger(Stop.class)
  public class StoppingAvail extends StateMachine.Transition {
  }
  
  @From(VendingMachine.Available.class)
  @To(VendingMachine.GetTicket.class)
  @Trigger(Buy.class)
  public class Buying extends StateMachine.Transition {
  }
}
