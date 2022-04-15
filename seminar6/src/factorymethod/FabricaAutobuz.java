package factorymethod;

import mijlocdetransport.Autobuz;
import mijlocdetransport.MijlocTransport;

public class FabricaAutobuz implements AbstractFactory {
	@Override
	public MijlocTransport returneazaMijlocTransport(String numarInmatriculare) {
		return new Autobuz(numarInmatriculare);
		
	}

}
