package facade;

public class Facade {
	public static void deschideUsi(Autobuz a) {
		a.deschideUsaFata();
		a.deschideUsaMijloc();
		a.deschideUsaSpate();
		
	}
	public static void punePeLiberUsi(Autobuz a)
	{
		a.liberUsaFata();
		a.liberUsaMijloc();
		a.liberUsaSpate();
	}

}
