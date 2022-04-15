package clase;

public class AutobuzNocturn implements MijlocTransport{
	Autobuz autobuz;

	public AutobuzNocturn(Autobuz autobuz) {
		super();
		this.autobuz = autobuz;
	}

	@Override
	public void OpresteStatie() {
		if(autobuz.getNumarPasageri()>0) {
			autobuz.OpresteStatie();
			
		}
		else System.out.print("nu opreste");
	}


@Override
public void setNrPasageri(int i) {
	// TODO Auto-generated method stub
	
}
}
