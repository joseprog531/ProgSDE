package main;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Tabuada");
		System.out.println("Digite um numero:");

		int numero = leitor.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + "x" + i + " = " + (numero * i));

		}

	}

}
