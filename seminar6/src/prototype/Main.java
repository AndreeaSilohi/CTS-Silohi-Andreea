package prototype;

public class Main {
	public static void main(String[] args) {
		String a="Ana";
		a=a+"are"+"mere";
		StringBuilder builder= new StringBuilder();
		
		builder.append("Ana").append("are").append("mere");
		
		Autobuz autobuz=new Autobuz("Ana");
		Autobuz autobuz2;
		try {
			autobuz2=(Autobuz) autobuz.copiaza();
		    autobuz2.setSofer("Matei");
		    System.out.println(((Autobuz) autobuz).getSofer());
		    System.out.println(((Autobuz) autobuz2).getSofer());
		}
		catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
	}

}
