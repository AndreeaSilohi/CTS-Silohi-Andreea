package prototype;

public class Tramvai implements MijlocdeTransport {
	private String vatman;

	@Override
	public MijlocdeTransport copiaza() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (MijlocdeTransport) super.clone();
	}

	public String getVatman() {
		return vatman;
	}

	public void setVatman(String vatman) {
		this.vatman = vatman;
	}

	public Tramvai(String vatman) {
		super();
		this.vatman = vatman;
	}


	public void setSoferAutobuz(String vatman) {
		
		this.vatman=vatman;
	}



	

}
