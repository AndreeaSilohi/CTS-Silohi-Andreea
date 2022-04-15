package factorymethod;

import mijlocdetransport.MijlocTransport;

public interface AbstractFactory {
	public MijlocTransport returneazaMijlocTransport(String numarInmatriculare); 
	
}

