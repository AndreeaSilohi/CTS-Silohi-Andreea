package clase;

public class MetrouHandler extends MijlocTransportHandler{

	public MetrouHandler(int pragSuperior) {
		super(pragSuperior);
	}
	
	@Override
	public void recomandaMijlocTransport(double distanta) {
		if(distanta<super.pragSuperior) {
		
		System.out.println("Vom folosi metroul ca mijloc de transport pentru distanta de"+distanta);
		
		
	}else {
		super.getMijlocTransportUrmator().recomandaMijlocTransport(distanta);
	}


}
	}