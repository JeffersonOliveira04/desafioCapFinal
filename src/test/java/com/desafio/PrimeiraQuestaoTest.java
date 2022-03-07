package com.desafio;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeiraQuestaoTest {

	@Test
	public void test() {
	PrimeiraQuestao primeira = new PrimeiraQuestao(); 
	  int[] numTes =  {1,5,4,7,1};
	  int medianaTes = primeira.calculaMediana(numTes);
	
	  assertTrue(medianaTes%1 == 0);
	  
	}

}
