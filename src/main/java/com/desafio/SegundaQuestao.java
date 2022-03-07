package com.desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SegundaQuestao {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			int num0, num1, num2, num3, num4;

			System.out.println("Entre com um n�mero da posi��o 0: ");
			num0 = scan.nextInt();

			System.out.println("Entre com um n�mero da posi��o 1: ");
			num1 = scan.nextInt();

			System.out.println("Entre com um n�mero da posi��o 2: ");
			num2 = scan.nextInt();

			System.out.println("Entre com um n�mero da posi��o 3: ");
			num3 = scan.nextInt();

			System.out.println("Entre com um n�mero da posi��o 4: ");
			num4 = scan.nextInt();

			int[] num = new int[5];
			num[0] = num0;
			num[1] = num1;
			num[2] = num2;
			num[3] = num3;
			num[4] = num4;

			somaVetores(num);
		} catch (InputMismatchException e) {
			System.out.println("Digite um n�mero inteiro");
		}

	}

	public static void somaVetores(int elementos[]) {
		int cont1, cont2, soma, resultadoSoma, numeroSomas = 0;

		System.out.println("Digite um n�mero que se deseja ver como resultado da soma de dois vetores: ");
		resultadoSoma = scan.nextInt();

		for (cont1 = 0; cont1 <= elementos.length; cont1++) {
			for (cont2 = cont1 + 1; cont2 <= elementos.length - 1; cont2++) {
				soma = elementos[cont1] + elementos[cont2];
				System.out.println("Resultado da soma da posi��o " + cont1 + "(" + elementos[cont1] + ")" + " + "
						+ "o resultado da posi��o " + cont2 + "(" + (elementos[cont2]) + ")" + " = " + soma);
				if (soma == resultadoSoma) {
					numeroSomas++;
				}
			}
		}
		System.out.println("N�mero de somas com o valor " + resultadoSoma + " � " + numeroSomas);
	}

}


