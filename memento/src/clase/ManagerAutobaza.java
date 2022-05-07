package clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobaza {
List<AutobuzMemento>listaAutobuzMemento;



public ManagerAutobaza() {
	listaAutobuzMemento=new ArrayList();
}



public ManagerAutobaza(List<AutobuzMemento> listaAutobuzMemento) {
	super();
	this.listaAutobuzMemento = listaAutobuzMemento;
}



public void add(AutobuzMemento am) {
	listaAutobuzMemento.add(am);
	
}



public Object getMemento(int i) {
	
	return listaAutobuzMemento.get(i);
}

}
