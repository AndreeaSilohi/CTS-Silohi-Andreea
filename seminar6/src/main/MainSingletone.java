package main;

import singletone.Singletone;

public class Main {
	public static void main(String args[]) {
		Singletone s1;
		Singletone s2;
		
		s1=Singletone.returnareInstanta();
		s2=Singletone.returnareInstanta();
		
		System.out.println(s1);
		System.out.print(s2);
		
		
		
	
		
	}

}
