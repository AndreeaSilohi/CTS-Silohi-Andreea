import static org.junit.Assert.*;

import org.junit.Test;

import clase.Persoana;
import exceptii.CNPInvalidException;

public class GetVarstaTest {

	@Test
	public void getVarstaRight() {
		Persoana p=new Persoana("Maria", "6000831465897");
		assertEquals(21,p.getVarsta());
	}
	
	@Test
	public void getVarstaBoundaryInf() {
		Persoana p=new Persoana("Maria", "3000101465897");
		assertEquals(222,p.getVarsta());
	}
	
	@Test
	public void getVarstaBoundarySup() {
		Persoana p=new Persoana("Maria", "6220101465897");
		assertEquals(0,p.getVarsta());
	}
	
	@Test(expected=NullPointerException.class)
		public void getVarstaError() {
			Persoana p=new Persoana("Maria", null);
			assertEquals(0,p.getVarsta());
		}
	
	
@Test(expected=CNPInvalidException.class)
public void getVarstaErrorNull() {
	Persoana p=new Persoana("Maria", "6250101465897");
	p.getVarsta();
}

@Test(timeout=100)
public void getVarstaPerformance() {
	Persoana p=new Persoana("Maria", "6210101465897");
	p.getVarsta();
}

@Test
public void getVarstaOrder() {
	Persoana p1=new Persoana("Maria", "6200101465897");
	Persoana p2=new Persoana("Maria", "6210101465897");
	assertTrue(p1.getVarsta()>p2.getVarsta());
}

@Test
public void getVarstaCardinality() {
	Persoana p=new Persoana("Maria", "6210101465897");
	assertEquals(1,p.getVarsta());
}
}



