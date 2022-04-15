package adapter;

import claseSubteran.ValidatorMetrou;
import claseTerestru.AdapterObiecte;
import claseTerestru.ValidatorAdapter;
import claseTerestru.ValidatorAutobuz;
import claseTerestru.ValidatorTerestru;

public class Main {
	static void valideaza (ValidatorTerestru validatorTerestru) {
		validatorTerestru.validatorBilet();
		
	}

	public static void main(String []args) {
		ValidatorAutobuz validatorAutobuz=new ValidatorAutobuz();
		valideaza(validatorAutobuz);
		ValidatorMetrou validatorMetrou =new ValidatorMetrou();
		ValidatorAdapter adapter=new ValidatorAdapter();
		AdapterObiecte adapterObiecte=new AdapterObiecte(validatorMetrou);
	
    	valideaza(adapterObiecte);
		ValidatorAdapter validatorAdapter=new ValidatorAdapter();
		valideaza(adapter);
		
	}
	
}
