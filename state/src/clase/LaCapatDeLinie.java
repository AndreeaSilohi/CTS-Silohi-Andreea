package clase;

public class LaCapatDeLinie implements State {

	@Override
	public void schimbaStare(Autobuz autobuz) {
	   if(!(autobuz.getStare() instanceof LaCapatDeLinie)) {
		   System.out.println("Autobuzul cu numarul "+ autobuz.getNrAutobuz()+" este la capat de linie");
		   autobuz.setStare(this);
	   }
	   else {
		   System.out.println("Autobuzul nu poate ajunge la capat de linie");
	   }
		
	}

}
