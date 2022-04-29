package clase;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements Subiect {
	List<Observer>observers=new ArrayList<>();
	String anunt;

	public Autobuz(String string) {
		
	}

	@Override
	public void adaugaObserver(Observer obs) {
		observers.add(obs);
		
	}

	@Override
	public void eliminaObserver(Observer obs) {
		observers.remove(obs);
		
	}

	@Override
	public void anuntaCalator() {
		for(Observer obs:observers) {
			obs.primesteAnunt("Am plecat de la capat de linie");
		}
		
		
	}

}
