package clase;

public class Autobuz {
	private String nrInmatriculare;

	public Autobuz(String nrInmatriculare) {
		super();
		this.nrInmatriculare = nrInmatriculare;
	}
	
	
	public void plecareInCursa(int nrLinie) {
		System.out.println("Autobuzul cu numarul de inmatriculare "+nrInmatriculare +" a plecat pe linia "+nrLinie);

}
}
