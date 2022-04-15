package simplefactory;

import mijlocdetransport.Autobuz;
import mijlocdetransport.MijlocTransport;
import mijlocdetransport.TipTransport;
import mijlocdetransport.Tramvai;
import mijlocdetransport.Troleibuz;

public class Fabrica {
	public MijlocTransport returnezaMijlocTransport (TipTransport tip,String numarInmatriculare) {
		switch(tip) {
		case Autobuz:
			
			return  new Autobuz(numarInmatriculare);
        case Tramvai:
			
			return  new Tramvai(numarInmatriculare);	
         case Troleibuz:
			
			return  new Troleibuz(numarInmatriculare);
			
			default:
				return null;
			
		}
		
	}

	
}
