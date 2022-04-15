package main;

import clase.Autobuz;
import clase.Flota;

public class Main {
	public static void main(String[]args) throws Exception {
		Autobuz a1=new Autobuz("Audi","A1",10);

		Autobuz a2=new Autobuz("Audi","A1",7);

		Autobuz a3=new Autobuz("Audi","A1",30);

	    Autobuz a4=new Autobuz("Audi","A1",100);

        Autobuz a5=new Autobuz("Audi","A1",30);

        Autobuz a6=new Autobuz("Audi","A1",45);



       Flota f1=new Flota("Flota1");
       Flota f2=new Flota("Flota2");
       Flota f3=new Flota("Flota3");
       Flota flotaMare=new Flota("Flota Companie");
       
       try {
    	   f1.adaugaItem(a1);
    	   f1.adaugaItem(a2);
    	   
    	   f2.adaugaItem(a3);
    	   
    	   f3.adaugaItem(a4);
    	   f3.adaugaItem(a5);
    	   f3.adaugaItem(a6);
    	   
    	   flotaMare.adaugaItem(f1);
    	   flotaMare.adaugaItem(f2);
    	   flotaMare.adaugaItem(f3);
    	   
    	   
    	   flotaMare.descriereItem();
    	   flotaMare.stergeItem(f2);
    	   
    	   f2.stergeItem(a2);
    	   
    	   System.out.println("Suma totala garantata: " +flotaMare.calculeazaSumaGarantata(3)+"lei");
    	   
    	   System.out.println("Suma totala garantata: " +flotaMare.calculeazaSumaGarantata(2)+"lei");
    	   
       }catch(Exception e) {
    	   e.printStackTrace();
    	   
       }




}
}
