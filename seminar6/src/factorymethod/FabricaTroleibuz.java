package factorymethod;

import mijlocdetransport.Autobuz;
import mijlocdetransport.MijlocTransport;
import mijlocdetransport.Troleibuz;



	public class FabricaTroleibuz implements AbstractFactory {
		@Override
		public MijlocTransport returneazaMijlocTransport(String numarInmatriculare) {
			return new Troleibuz(numarInmatriculare);
			
		}
}
