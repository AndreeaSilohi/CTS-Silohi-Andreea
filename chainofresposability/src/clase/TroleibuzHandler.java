package clase;

public class TroleibuzHandler extends MijlocTransportHandler{
	public TroleibuzHandler(int pragSuperior) {
		super(pragSuperior);
	}
	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta<super.pragSuperior) {
			System.out.println("Trebuie sa iei troleibuzul pentru distanta "+distanta);
		} else
		{
			
			super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
		}
		
	}

}
