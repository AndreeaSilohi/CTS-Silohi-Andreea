package clase;

public class InCursa implements State{

	@Override
	public void schimbaStare(Autobuz autobuz) {
		if(autobuz.getStare() instanceof LaCapatDeLinie) {
			System.out.println("Autobuzul cu numarul"+ autobuz.getNrAutobuz()+" a plecat in cursa");
			autobuz.setStare(this);
		}
		else {
			System.out.println("Autobuzul nu poate sa plece in cursa");
		}
		
	}

}
