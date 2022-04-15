package mijlocdetransport;

public class Tramvai extends MijlocTransport {

	public Tramvai(String nrInmatriculare) {
		super(nrInmatriculare);
		
	}

	@Override
	public void afisareNrInmatriculare() {
	System.out.print("Tramvaiul are numarul de inmatriculare" +super.getNrInmatriculare());
		
	}
	

}
