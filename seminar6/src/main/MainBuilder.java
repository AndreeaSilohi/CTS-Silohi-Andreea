package main;

import builder.AutobuzBuilder;
import builder.Autobuz;

public class MainBuilder {

	public static void main(String []args) {
		Autobuz a1=new AutobuzBuilder().setModel("Ford").setNumeSofer("Vasile").build();
		Autobuz a2=new AutobuzBuilder().setNrInmatriculare("412626").build();
	}
}