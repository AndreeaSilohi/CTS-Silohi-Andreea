package testare.dubluri;

import acs.ase.clase.IPersoana;

public class PersoanaFake implements IPersoana{
	String sex;
	int varsta;
	boolean checkCNP;
	
	

	public boolean isCheckCNP() {
		return checkCNP;
	}

	public void setCheckCNP(boolean checkCNP) {
		this.checkCNP = checkCNP;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String getSex() {
		
		return this.sex;
	}

	@Override
	public int getVarsta() {
		
		return this.varsta;
	}

	@Override
	public boolean checkCNP() {
		// TODO Auto-generated method stub
		return false;
	}

}
