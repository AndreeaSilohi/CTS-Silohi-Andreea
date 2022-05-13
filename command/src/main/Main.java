package main;

import clase.Autobuz;
import clase.Comanda;
import clase.ComandaPlecareInCursa;
import clase.Operator;

public class Main {
	public static void main(String[]args) {
		Autobuz a1=new Autobuz("B22AAA");
		Autobuz a2=new Autobuz("B22ABC");
		Autobuz a3=new Autobuz("B22SAM");
		Operator operator=new Operator();
		Comanda comanda1=new ComandaPlecareInCursa(2,a1);
		Comanda comanda2=new ComandaPlecareInCursa(2,a2);	
		Comanda comanda3=new ComandaPlecareInCursa(2,a3);
		Comanda comanda4=new ComandaPlecareInCursa(2,a1);
		operator.adauga(comanda4);
		operator.adauga(comanda1);
		operator.adauga(comanda2);
		operator.adauga(comanda3);
		
	}

}
