package vending.main;

import java.io.IOException;

import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;
import model.ClickOnOrder;
import model.Reselect;
import model.Stop;
import model.VendingMachine;


public class Tester {
	static VendingMachine orderr ;
	static void init (){
		orderr = Action.create(VendingMachine.class);
		Action.start(orderr);
	}
	public static void main(String[] args) throws IOException {
		ModelExecutor.create().setTraceLogging(true).start(Tester::init);
		System.in.read();
		Action.send(new ClickOnOrder(), orderr);
		System.in.read();
		Action.send(new Stop(), orderr);
		System.in.read();
		Action.send(new ClickOnOrder(), orderr);
		System.in.read();
		Action.send(new ClickOnOrder(), orderr);
		System.in.read();
		Action.send(new Reselect(), orderr);
		System.in.read();
		ModelExecutor.create().setTraceLogging(true).start(Tester::init);
		System.in.read();
		Action.send(new ClickOnOrder(), orderr);
		System.in.read();
		Action.send(new Reselect(), orderr);
		System.in.read();	
	}
}
