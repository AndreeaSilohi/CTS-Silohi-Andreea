package adapter;

import claseSubteran.ValidatorMetrou;
import claseTerestru.AdapterObiecte;
import claseTerestru.ValidatorAdapter;
import claseTerestru.ValidatorAutobuz;
import claseTerestru.ValidatorTerestru;

public class Main {
	static void valideazaBiletCalatorie(ValidatorTerestru validatorTerestru) {
		validatorTerestru.validatorBilet();
		
	}

	public static void main(String[] args) {
	
		//adapter obiecte
		ValidatorAutobuz validatorAutobuz = new ValidatorAutobuz();
		valideazaBiletCalatorie(validatorAutobuz);
		
		ValidatorMetrou validatorMetrou = new ValidatorMetrou();
		AdapterObiecte adapterObiecte = new AdapterObiecte(validatorMetrou);
		valideazaBiletCalatorie(adapterObiecte);
		
		
         //adapter de clase
		ValidatorAdapter validatorAdapter = new ValidatorAdapter();
		valideazaBiletCalatorie(validatorAdapter);
	}
	
}
