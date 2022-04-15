package factorymethod;

import mijlocdetransport.MijlocTransport;
import mijlocdetransport.Tramvai;


	public class FabricaTramvai implements AbstractFactory {

		@Override
		public MijlocTransport returneazaMijlocTransport(String numarInmatriculare) {
			// TODO Auto-generated method stub
			return new Tramvai(numarInmatriculare);
		}
	

}
