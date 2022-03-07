package com.desafio;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TerceiraQuestao {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			String mensagem, encriptada;

			System.out.println("Escreva uma mensagem para ser encriptada");
			mensagem = scan.nextLine();
						
			encriptada = mensagem.replace(" ", "");
			System.out.println(encriptada);
			int numeroLetras = encriptada.length();
			System.out.println("Número de letras: " + numeroLetras);
			
			int raiz = (int) Math.ceil(Math.sqrt(numeroLetras));
			System.out.println("Raiz dos caracteres: " + raiz);
			
			String [] encriptadaArray = encriptada.split("");
			System.out.println("Frase sem encriptar: " + Arrays.toString(encriptadaArray));		
			
			//não consegui embaralhar o Array
						
					
		} catch (InputMismatchException e) {
			System.out.println("Digite um texto");
		}		
		
}

}
