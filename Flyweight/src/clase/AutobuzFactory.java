package clase;

import java.util.HashMap;
import java.util.Map;

public class LineFactory {
	Map <Integer,Liniee>mapFactory;

	public LineFactory() {
	this.mapFactory=new HashMap();
	}
	
	
	
	public Liniee getLinie(int nrLinie) {
	if(mapFactory.containsKey(nrLinie)) {
		return mapFactory.get(nrLinie) ;
	}
	else {
		Liniee linie=new Liniee(nrLinie,"prima statie","ultima sttaie");
		mapFactory.put(nrLinie, linie);
		return linie;
	}


	}

}
