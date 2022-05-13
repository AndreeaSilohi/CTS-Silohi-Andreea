package clase;

public class ComandaPlecareInCursa implements Comanda{
	int nrLinie;
	Autobuz autobuz;
	
	

	public ComandaPlecareInCursa(int nrLinie, Autobuz autobuz) {
		super();
		this.nrLinie = nrLinie;
		this.autobuz = autobuz;
	}



	@Override
	public void executa() {
		autobuz.plecareInCursa(nrLinie);
		
	}

}
