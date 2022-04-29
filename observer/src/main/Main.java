package main;

import clase.Autobuz;
import clase.Calator;

public class Main {
	public static void main(String[]args) {
		
		Autobuz autobuz=new Autobuz("autobuzul a plecat din statie");
		
		Calator c1=new Calator("Ion Popescu");
		Calator c2=new Calator("Ion Vasilescu");
		
		Calator c3=new Calator("Maria Ion");
		Calator c4=new Calator("Enescu Maria");
		
		autobuz.adaugaObserver(c1);
		autobuz.adaugaObserver(c2);
		autobuz.adaugaObserver(c3);
		
		
		autobuz.anuntaCalator();
		
		
	}

}
