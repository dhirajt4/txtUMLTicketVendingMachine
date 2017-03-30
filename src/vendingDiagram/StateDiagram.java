package vendingDiagram;

import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.StateMachineDiagram;
import model.VendingMachine;
import model.VendingMachine.Available;
import model.VendingMachine.Cancel;
import model.VendingMachine.CheckTicket;
import model.VendingMachine.GetTicket;
import model.VendingMachine.Init;
import model.VendingMachine.NotAvailable;
import model.VendingMachine.SelectOrder;


public class StateDiagram extends StateMachineDiagram<VendingMachine>  {
	
	@Row ({Init.class, SelectOrder.class, CheckTicket.class, Available.class, GetTicket.class })
	@Row ({Cancel.class, NotAvailable.class })
	@Column ({NotAvailable.class})
	@Column ({Cancel.class})
	
	class StateLayout extends Layout {}

}
