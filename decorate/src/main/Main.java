package main;

import clase.Decorator;
import clase.Imprimanta;
import clase.ImprimantaDeBilete;

public class Main {
public static void main(String[]args) {
	Imprimanta i=new ImprimantaDeBilete(5);
	i.printeazaBilet();
	
	Decorator decorator=new Decorator(i,"Paste Fericit!");
	decorator.printeazaBilet();
	decorator.printeazaVerso();
}
}
