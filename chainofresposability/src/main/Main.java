package main;

import clase.AutobuzHandler;
import clase.MetrouHandler;
import clase.MijlocTransportHandler;
import clase.TramvaiHandler;
import clase.TroleibuzHandler;

public class Main {
	public static void main(String[]args) {
		MijlocTransportHandler handlerAutobuz=new AutobuzHandler(5);
		MijlocTransportHandler handlerMetrou=new MetrouHandler(10000);
		MijlocTransportHandler handlerTroleibuz=new TroleibuzHandler(10);
		MijlocTransportHandler handlerTramvai=new TramvaiHandler(3);
		
		
		handlerTroleibuz.setMijlocTransportUrmator(handlerAutobuz);
		handlerAutobuz.setMijlocTransportUrmator(handlerTramvai);
		handlerTramvai.setMijlocTransportUrmator(handlerMetrou);
		
		handlerTroleibuz.recomandaMijlocTransport(2);
		handlerTroleibuz.recomandaMijlocTransport(4);
		handlerTroleibuz.recomandaMijlocTransport(8);
		handlerTroleibuz.recomandaMijlocTransport(12);
		
		MijlocTransportHandler handlerAutobuzCluj = new AutobuzHandler(2);
		MijlocTransportHandler handlerMetrouCluj = new MetrouHandler(10000000);
		MijlocTransportHandler handlerTramvaiCluj = new MetrouHandler(4);
		MijlocTransportHandler handlerTroleibuzCluj = new MetrouHandler(6);
		
		handlerMetrouCluj.setMijlocTransportUrmator(handlerTramvaiCluj);
		handlerTramvaiCluj.setMijlocTransportUrmator(handlerTroleibuzCluj);
		handlerTroleibuzCluj.setMijlocTransportUrmator(handlerAutobuzCluj);
		
		handlerMetrouCluj.recomandaMijlocTransport(5);
		handlerMetrouCluj.recomandaMijlocTransport(1);
		handlerMetrouCluj.recomandaMijlocTransport(25);
		
	}

}
