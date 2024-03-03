package progeto_maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test_calcolatrice {

	@Test
	void test1() {
		
		double risultato;
		
		
		risultato = calcolatrice.somma(4, 5);
		
		assertEquals(risultato,9);
		
	}
    
	
	@Test
	void test2() {
		
		double risultato;
		 
		
		risultato = calcolatrice.moltiplicazione(4, 5);
		
		assertEquals(risultato,20);
		
	}
}
