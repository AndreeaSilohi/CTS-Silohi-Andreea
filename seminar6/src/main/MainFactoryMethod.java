package main;

import factorymethod.FabricaAutobuz;
import factorymethod.FabricaTramvai;
import factorymethod.FabricaTroleibuz;
import mijlocdetransport.MijlocTransport;

public class MainFactoryMethod {
	public static void main(String [] args) {
		MijlocTransport autobuz=new FabricaAutobuz().returneazaMijlocTransport("B3jdh");
		MijlocTransport tramvai=new FabricaTramvai().returneazaMijlocTransport("B7jdh");
		MijlocTransport troleibuz=new FabricaTroleibuz().returneazaMijlocTransport("B3jdh");
		autobuz.afisareNrInmatriculare();
		troleibuz.afisareNrInmatriculare();
		tramvai.afisareNrInmatriculare();
	}

}
