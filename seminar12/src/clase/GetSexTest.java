package clase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptii.CNPInvalidException;

public class GetSexTest {
@Test 
public void getSExRight() {
	Persoana pF=new Persoana("Iulia","6000452369857");
	assertEquals("F",pF.getSex());
	Persoana pM=new Persoana("Iulia","5000452369857");
	assertEquals("M",pM.getSex());
}


	@Test 
	public void getSexBounderyF() {
	Persoana pF=new Persoana("Iulia","6000452369857");
	assertEquals("F",pF.getSex());
	}
	@Test 
	public void getSexBounderyM() {
	Persoana pM=new Persoana("Iulia","1000452369857");
	assertEquals("M",pM.getSex());
}


@Test
public void getSexCrossCheck() {
	Persoana pM=new Persoana("Ana","6000569412398");
	int primaCifra=pM.CNP.charAt(0);
	assertEquals(primaCifra%2==0?"F":"M",pM.getSex());
	
	
}

@Test
public void testGetSexShouldThrowException() {
	Persoana persoana=new Persoana("Andrei","000123412345");
	try {
		persoana.getSex();
		fail("Metoda nu arunca exceptie");
		
	}catch(CNPInvalidException exceptie){
		
	}
}

@Test(expected=CNPInvalidException.class)
public void testGetSExShouldThrowExceptionJunit4() {
	Persoana p=new Persoana("Andrei","0569987123369");
	p.getSex();
	
}

@Test(expected=NullPointerException.class)
public void testGetSExShouldThrowExceptionJunit4NULL() {
	Persoana p=new Persoana("Andrei",null);
	p.getSex();
	
}

@Test(timeout=5)
public void testGetsexPerformance() {
	Persoana p=new Persoana("Andrei","5846932155585");
	p.getSex();
}

@Test
public void textGetSexConformance() {
	Persoana p=new Persoana("Andrei","5846932155585");
	assertEquals(1,p.getSex().length());
}

@Test
public void textGetSexRange() {
	Persoana p=new Persoana("Andrei","7746932155585");
	assertEquals("N/A",p.getSex());
}






}



