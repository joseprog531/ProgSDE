package main;

import java.util.Scanner;

public class Atividade1a {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um nome :");

		String nome = leitor.nextLine();
		String vogaisEncontradas = "";
		int qtdVogais = 0, qtdConsoantes = 0;
		int contador = 0;

		System.out.println("a quantidade de vogais encontradas " + contador);

		for (int i = 0; i < nome.length(); i++) {
			char letra = nome.toLowerCase().charAt(i);

			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
				contador++;

				vogaisEncontradas += letra;
			} else {
				qtdConsoantes++;

			}

			System.out.println("A quantidade de vogais encontradas foi: " + qtdVogais);
			System.out.println("Vogais encontradas:" + vogaisEncontradas);
			System.out.println("A quantidade de consoantes encontradas foi: " + qtdConsoantes);

		}

	}
}
