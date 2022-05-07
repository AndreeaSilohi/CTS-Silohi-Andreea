package clase;

public class AutobuzMemento {
private String numeSofer;
private float consum;
public AutobuzMemento(String numeSofer, float consum) {
	super();
	this.numeSofer = numeSofer;
	this.consum = consum;
}
public String getNumeSofer() {
	return numeSofer;
}
public void setNumeSofer(String numeSofer) {
	this.numeSofer = numeSofer;
}
public float getConsum() {
	return consum;
}
public void setConsum(float consum) {
	this.consum = consum;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("AutobuzMemento [numeSofer=");
	builder.append(numeSofer);
	builder.append(", consum=");
	builder.append(consum);
	builder.append("]");
	return builder.toString();
}
}



