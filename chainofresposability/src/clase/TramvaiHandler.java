package clase;

public class TramvaiHandler extends MijlocTransportHandler{
	public TramvaiHandler(int pragSuperior) {
		super(pragSuperior);
	}
	@Override
	public void recomandaMijlocTransport(double distanta) {
	if(distanta<super.pragSuperior) {
		System.out.println("Trebuie sa iei tramvaiul pentru distanta "+distanta);
	} else
	{
		
		super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
	}
	}
	}


