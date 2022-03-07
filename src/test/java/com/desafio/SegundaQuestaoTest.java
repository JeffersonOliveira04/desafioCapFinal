package com.desafio;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SegundaQuestaoTest {

	@Test
	public void test() {
		SegundaQuestao segunda = new SegundaQuestao(); 
		int[] numTest =  {1,5,4,7,1};
		int somaVetorTest = segunda.somaVetores(numTest);
		
		assertTrue(somaVetorTest%1 == 0);
	}

}
