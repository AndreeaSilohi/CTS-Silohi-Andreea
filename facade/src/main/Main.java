package main;

import facade.Autobuz;
import facade.Facade;

public class Main {
public static void main(String[]args) {
	Autobuz a=new Autobuz();
	Facade.deschideUsi(a);
	Facade.punePeLiberUsi(a);
}
}
