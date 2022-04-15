package mijlocdetransport;

public class Troleibuz extends MijlocTransport{

	public Troleibuz(String nrInmatriculare) {
		super(nrInmatriculare);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afisareNrInmatriculare() {
	System.out.println("Troleibuzul are numarul de inmatriculare" +super.getNrInmatriculare());
		
	}
	
	

}
