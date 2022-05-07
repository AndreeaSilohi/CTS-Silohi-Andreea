package main;

import clase.Autobuz;
import clase.AutobuzFactory;

public class Main {
	public static void main(String[] args) {
		Autobuz a1=new Autobuz("Mercedes1",2000,100);
		Autobuz a2=new Autobuz("Mercedes2",2000,100);
		Autobuz a3=new Autobuz("Mercedes3",2015,100);
		Autobuz a4=new Autobuz("Mercedes4",2020,102);
		
		AutobuzFactory factory=new AutobuzFactory();
		factory.getLinie(137).afiseazaDescriere(a1);
		factory.getLinie(137).afiseazaDescriere(a2);
		factory.getLinie(168).afiseazaDescriere(a3);
		factory.getLinie(137).afiseazaDescriere(a4);
	}

}
