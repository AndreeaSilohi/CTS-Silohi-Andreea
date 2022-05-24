package testare.dubluri;

import acs.ase.clase.IPachet;

public class PachetFake implements IPachet{
	
	Double pret;
	Boolean rezervare;

	
	public Boolean getRezervare() {
		return rezervare;
	}

	public void setRezervare(Boolean rezervare) {
		this.rezervare = rezervare;
	}

	public void setPret(Double pret) {
		this.pret = pret;
	}

	@Override
	public boolean poateRezerva() {
		
		return false;
	}

	@Override
	public void aplicaDiscountVarstnici(int procent) {
		
		
	}

	@Override
	public Double getPret() {
		
		return null;
	}

}
