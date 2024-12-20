package main;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero, contador = 0;

		System.out.println("Digite um numero:");

		for (int i = 1; i <= 10; i++) {
			numero = leitor.nextInt();

			if (numero >= 10 && numero <= 50) {
				System.out.println("numero esta no intervalo!");
				contador++;
				System.out.println("numeros no intervalo ate agora :" + contador);
			}
		}
		System.out.println("total de numeros no intervalo");
	
	}
}
