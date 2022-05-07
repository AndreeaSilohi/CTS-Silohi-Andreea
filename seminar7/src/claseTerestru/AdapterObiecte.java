package claseTerestru;

import claseSubteran.ValidatorMetrou;

public class AdapterObiecte implements ValidatorTerestru {

	private ValidatorMetrou validatorMetrou;
	
	public AdapterObiecte(ValidatorMetrou validatorMetrou) {
		super();
		this.validatorMetrou = validatorMetrou;
	}

	@Override
	public void validatorBilet() {
		validatorMetrou.valideazaCalatorie();
	}

	@Override
	public void validatorAbonament() {
		validatorMetrou.valideazaAbonament();

	}

	

}
