package com.desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeiraQuestao {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			int num0, num1, num2, num3, num4;

			System.out.println("Entre com um número da posição 1: ");
			num0 = scan.nextInt();

			System.out.println("Entre com um número da posição 2: ");
			num1 = scan.nextInt();

			System.out.println("Entre com um número da posição 3: ");
			num2 = scan.nextInt();

			System.out.println("Entre com um número da posição 4: ");
			num3 = scan.nextInt();

			System.out.println("Entre com um número da posição 5: ");
			num4 = scan.nextInt();

			int[] num = new int[5];
			num[0] = num0;
			num[1] = num1;
			num[2] = num2;
			num[3] = num3;
			num[4] = num4;

			// sem ordenar
			System.out.println("array baguncado: ");
			for (int i = 0; i < num.length; i++) {
				System.out.println(num[i]);
			}

			calculaMediana(num);

			// ordenado
			System.out.println("array ordenado: ");
			for (int i = 0; i < num.length; i++) {
				System.out.println(num[i]);
			}

			
		} catch (InputMismatchException e) {
			System.out.println("Digite um número inteiro: ");
		} 
	}

	public static void ordena(int elementos[]) {
		int cont1, cont2, aux;
		for (cont1 = 0; cont1 < elementos.length; cont1++) {
			for (cont2 = 0; cont2 < elementos.length - 1; cont2++) {
				if (elementos[cont2] > elementos[cont2 + 1]) {
					aux = elementos[cont2];
					elementos[cont2] = elementos[cont2 + 1];
					elementos[cont2 + 1] = aux;
				}
			}
		}
	}

	public static int calculaMediana(int elementos[]) {		
		ordena(elementos);
		int aux = elementos.length;
		int ajudaMediana = (aux - 1) / 2;
		int mediana = elementos[ajudaMediana];
		System.out.println("A mediana é o número: " + mediana);
		return mediana;
	}
}


