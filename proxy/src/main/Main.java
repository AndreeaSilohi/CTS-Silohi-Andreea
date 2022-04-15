package main;

import clase.Autobuz;
import clase.AutobuzNocturn;
import clase.MijlocTransport;

public class Main {
	public static void main(String[]args) {
		MijlocTransport autobuz=new Autobuz(5,2);
		autobuz.OpresteStatie();
		
	  AutobuzNocturn autobuzNocturn=new AutobuzNocturn((Autobuz)autobuz);
	  autobuzNocturn.OpresteStatie();
	  
	  
autobuz.setNrPasageri(0);
autobuzNocturn.OpresteStatie();

}
}
