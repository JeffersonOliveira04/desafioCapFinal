package com.desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TerceiraQuestao {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			String mensagem, encriptada;

			System.out.println("Escreva uma mensagem para ser encriptada");
			mensagem = scan.nextLine();
			int numeroLetras = mensagem.length();

			System.out.println("Número de letras: " + numeroLetras);
			
			

		} catch (InputMismatchException e) {
			System.out.println("Digite um texto");
		}

		
		
		
	}

}
