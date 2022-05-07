package clase;

public class AutobuzHandler extends MijlocTransportHandler{
	public AutobuzHandler(int pragSuperior) {
		super(pragSuperior);
	}
	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta<pragSuperior) {
			System.out.println("Vom folosi autobuzul ca mijloc de transport pentru distanta "+distanta);
		}
		else {
			super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
		}
		
	}

}
