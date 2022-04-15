package clase;

public abstract class DecoratorAbstract implements Imprimanta{
private Imprimanta imprimanta;
	@Override
	public void printeazaBilet() {
		imprimanta.printeazaBilet();
		
	}
	
	
	public DecoratorAbstract(Imprimanta imprimanta) {
		super();
		this.imprimanta = imprimanta;
	}


	public abstract void printeazaVerso();

}
