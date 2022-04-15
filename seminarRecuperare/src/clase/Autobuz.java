package clase;

public class Autobuz implements Item {
	private String producator;
	private String model;
	private int nrLocuri;
	
	public Autobuz(String producator, String model, int nrLocuri) {
		super();
		this.producator = producator;
		this.model = model;
		this.nrLocuri = nrLocuri;
	}
	public String getProducator() {
		return producator;
	}
	public void setProducator(String producator) {
		this.producator = producator;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNrLocuri() {
		return nrLocuri;
	}
	public void setNrLocuri(int nrLocuri) {
		this.nrLocuri = nrLocuri;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [producator=");
		builder.append(producator);
		builder.append(", model=");
		builder.append(model);
		builder.append(", nrLocuri=");
		builder.append(nrLocuri);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public void adaugaItem(Item item)throws Exception {
            throw new Exception("");
		
	}
	@Override
	public void stergeItem(Item item)throws Exception {
		throw new Exception("");
		
	}
	@Override
	public void descriereItem() {
		System.out.println("nepermis");
		
	}
	@Override
	public Item getItem(int poz) throws Exception{
		
		throw new Exception(" ");
	}
	@Override
	public float calculeazaSumaGarantata(float pretPerLoc) {
	
		return 0;
	}
	

}
