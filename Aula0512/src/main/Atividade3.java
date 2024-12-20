package main;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero, menor = 0, maior = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite um numero inteiro:");
			numero = leitor.nextInt();

			if (i == 1) {
				menor = numero;

			} else if (numero < menor) {
				maior = numero;
				System.out.println("numero substituido:");

			}
			System.out.println("O menor numero é  " + menor);
			System.out.println("O maior numero é  " + maior);
		}
	}

}


