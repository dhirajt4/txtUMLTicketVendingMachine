package vendingDiagram;

import hu.elte.txtuml.api.layout.ClassDiagram;
import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;
import model.Customer;
import model.Maintenance;
import model.Order;
import model.Orders_Detail;
import model.Ticket;
import model.Ticket_Cart;
import model.Travel_Info;
import model.User;
import model.VendingMachine;

public class VendingMachineDiagram extends ClassDiagram {
	@Row (VendingMachine.class)
	 @Row({Ticket_Cart.class,Customer.class, User.class,Maintenance.class})
	  @Row({Ticket.class, Order.class,Travel_Info.class})
	  @Row({ Orders_Detail.class})
	  @Column({Ticket_Cart.class, Ticket.class})
	  @Column({Customer.class, Order.class,Orders_Detail.class})
	  @Column({VendingMachine.class,User.class,Travel_Info.class})
	  @Column(Maintenance.class)
	class MyLayout extends Layout {};
}
