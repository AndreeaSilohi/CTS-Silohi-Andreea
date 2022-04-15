package singletone;

public class Singletone {
	
	private static Singletone  instanta=null;
	
	
	public synchronized static Singletone returnareInstanta() {
		if(instanta==null) {
			instanta=new Singletone();
		}
		return instanta;
	}
	
	private Singletone () {
		
	}
	

}
