package builder;

public class Autobuz {
	private String model;
	private String numeSofer;
	private boolean oprireCapat;
	private boolean deschideUsi;
	private String textDerulat;
	private String nrInmatriculare;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [model=");
		builder.append(model);
		builder.append(", numeSofer=");
		builder.append(numeSofer);
		builder.append(", oprireCapat=");
		builder.append(oprireCapat);
		builder.append(", deschideUsi=");
		builder.append(deschideUsi);
		builder.append(", textDerulat=");
		builder.append(textDerulat);
		builder.append(", nrInmatriculare=");
		builder.append(nrInmatriculare);
		builder.append("]");
		return builder.toString();
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNumeSofer() {
		return numeSofer;
	}

	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	public boolean isOprireCapat() {
		return oprireCapat;
	}

	 void setOprireCapat(boolean oprireCapat) {
		this.oprireCapat = oprireCapat;
	}

	 boolean isDeschideUsi() {
		return deschideUsi;
	}

     void setDeschideUsi(boolean deschideUsi) {
		this.deschideUsi = deschideUsi;
	}

	 String getTextDerulat() {
		return textDerulat;
	}

	 void setTextDerulat(String textDerulat) {
		this.textDerulat = textDerulat;
	}

	public String getNrInmatriculare() {
		return nrInmatriculare;
	}

	 void setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}

	public Autobuz() {
		this.model = "Mercedes";
		this.numeSofer = "Dorel";
		this.oprireCapat = true;
		this.deschideUsi = true;
		this.textDerulat = "stb";
		this.nrInmatriculare ="B789STB";
	}

}
