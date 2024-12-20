package main;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um nome :");
		String nome = leitor.nextLine().toLowerCase();
		int contador = 0;

		for (char c : nome.toCharArray()) {
			if ("aeiou".contains(c + "")) {
				contador++;
				System.out.println("Suas vogais são: " + c);

			}

		}
		System.out.println(contador);

	}

}
