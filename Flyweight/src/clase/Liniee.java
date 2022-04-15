package clase;

public class Liniee implements Flyweight {
int nrLinie;
String primaStatie;
String ultimaStatie;
public Liniee(int nrLinie2, String string, String string2) {
	// TODO Auto-generated constructor stub
}




@Override
public void afiseazaDescriere(Autobuz autobuz) {
	System.out.println(autobuz.toString()+toString());
	
}




public int getNrLinie() {
	return nrLinie;
}
public void setNrLinie(int nrLinie) {
	this.nrLinie = nrLinie;
}




@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Liniee [nrLinie=");
	builder.append(nrLinie);
	builder.append(", primaStatie=");
	builder.append(primaStatie);
	builder.append(", ultimaStatie=");
	builder.append(ultimaStatie);
	builder.append("]");
	return builder.toString();
}



}
