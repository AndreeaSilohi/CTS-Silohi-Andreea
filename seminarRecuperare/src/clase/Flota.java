package clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements Item {
	
	private String nume;
	private List<Item>items;
	
	

	@Override
	public void adaugaItem(Item item) throws Exception {
		items.add(item);
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flota [nume=");
		builder.append(nume);
		builder.append(", items=");
		builder.append(items);
		builder.append("]");
		return builder.toString();
	}

	public Flota(String nume) {
		super();
		this.nume = nume;
        items=new ArrayList<>();
	}

	@Override
	public void stergeItem(Item item) throws Exception {
		items.remove(item);
		
	}

	@Override
	public void descriereItem() {
		System.out.println(this.toString());//afisare nodcurent
		for(Item item :items) {
			item.descriereItem();
		}
	}


	@Override
	public Item getItem(int pozitie)throws Exception {
		return items.get(pozitie);
		
	}

	@Override
	public float calculeazaSumaGarantata(float pretPerLoc) {
		float sum=0;
		for(Item item:items) {
			sum+=item.calculeazaSumaGarantata(pretPerLoc);
		}
		return sum;
		
	}
	
	

}
