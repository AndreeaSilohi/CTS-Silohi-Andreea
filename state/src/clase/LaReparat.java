package clase;

public class LaReparat implements State {

	@Override
	public void schimbaStare(Autobuz autobuz) {
      if(autobuz.getStare() instanceof LaCapatDeLinie) {
    	  System.out.println("Autobuzul cu numarul "+autobuz.getNrAutobuz()+" este in service");
    	  autobuz.setStare(this);
      }
      else {
    	  System.out.println("Autobuzul nu poate fi trimis la reparat");
      }
	}

}
