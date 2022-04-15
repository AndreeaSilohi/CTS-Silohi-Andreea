package mijlocdetransport;

public class Autobuz extends MijlocTransport {

	public Autobuz(String nrInmatriculare) {
		super(nrInmatriculare);
		
	}

	@Override
	public void afisareNrInmatriculare() {
	
		System.out.print("Autobuzul are numarul de inmatriculare" +super.getNrInmatriculare());
	}

}
