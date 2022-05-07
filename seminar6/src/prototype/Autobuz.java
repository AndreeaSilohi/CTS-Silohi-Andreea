package prototip;

public class Autobuz implements MijlocdeTransport {
	private String sofer;

	public Autobuz(String sofer) {
		super();
		this.sofer = sofer;
	}

	public String getSofer() {
		return this.sofer;
	}

	public void setSofer(String sofer) {
		this.sofer = sofer;
	}

	@Override
	public MijlocdeTransport copiaza() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (MijlocdeTransport) super.clone();
	}

	

}
