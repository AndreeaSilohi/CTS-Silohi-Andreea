package prototip;

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

	@Override
	public void setSoferAutobuz(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char[] getSofer() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
