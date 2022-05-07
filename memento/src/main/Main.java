package main;

import clase.Autobuz;
import clase.AutobuzMemento;
import clase.ManagerAutobaza;

public class Main {
	public static void main(String[]args) {
		Autobuz autobuz=new Autobuz("Andrei",3,2000, null, 0);
		ManagerAutobaza manager=new ManagerAutobaza();
		

		
		manager.add(autobuz.save());
		
		autobuz.setNume("Mihai");
		manager.add(autobuz.save());
		
		autobuz.setConsumMediu(5);
		manager.add(autobuz.save());
		
		System.out.println(autobuz.toString());
		
		autobuz.undo((AutobuzMemento) manager.getMemento(0));
		
		System.out.println(autobuz.toString());
	}

}
