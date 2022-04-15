package clase;

public class Autobuz implements MijlocTransport {
	int numarPasageri;
	int numarLinie;
	
	
	
	public int getNumarPasageri() {
		return numarPasageri;
	}



	public void setNumarPasageri(int numarPasageri) {
		this.numarPasageri = numarPasageri;
	}



	public int getNumarLinie() {
		return numarLinie;
	}



	public void setNumarLinie(int numarLinie) {
		this.numarLinie = numarLinie;
	}



	public Autobuz(int numarPasageri, int numarLinie) {
		super();
		this.numarPasageri = numarPasageri;
		this.numarLinie = numarLinie;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [numarPasageri=");
		builder.append(numarPasageri);
		builder.append(", numarLinie=");
		builder.append(numarLinie);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public void OpresteStatie() {
		System.out.println("Opreste");
		
	}



	@Override
	public void setNrPasageri(int i) {
		// TODO Auto-generated method stub
		
	}
	
	

}
