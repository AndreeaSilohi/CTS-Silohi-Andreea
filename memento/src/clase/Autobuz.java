package clase;

public class Autobuz {
	private String numeSofer;
	private float consumMediu;
	private int an;
	
	private String model;
	private int nrLoc;
	public Autobuz(String nume, float consumMediu, int an, String model, int nrLoc) {
		super();
		this.numeSofer= nume;
		this.consumMediu = consumMediu;
		this.an = an;
		this.model = model;
		this.nrLoc = nrLoc;
	}
	public String getNume() {
		return numeSofer;
	}
	public void setNume(String nume) {
		this.numeSofer = nume;
	}
	public float getConsumMediu() {
		return consumMediu;
	}
	public void setConsumMediu(float consumMediu) {
		this.consumMediu = consumMediu;
	}
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		this.an = an;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNrLoc() {
		return nrLoc;
	}
	public void setNrLoc(int nrLoc) {
		this.nrLoc = nrLoc;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [nume=");
		builder.append(numeSofer);
		builder.append(", consumMediu=");
		builder.append(consumMediu);
		builder.append(", an=");
		builder.append(an);
		builder.append(", model=");
		builder.append(model);
		builder.append(", nrLoc=");
		builder.append(nrLoc);
		builder.append("]");
		return builder.toString();
	}
	
	
	public AutobuzMemento save() {
		AutobuzMemento nou=new AutobuzMemento(this.numeSofer,this.consumMediu);
		return nou;
		
	}
	
	public void undo(AutobuzMemento a) {
		this.numeSofer = a.getNumeSofer();
		this.consumMediu = a.getConsum();
	}

}
