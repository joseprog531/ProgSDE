package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ArrayList<Double> valores = new ArrayList<Double>();
		double valor;
		double total = 0;
		
		System.out.println("Digite o valor monetario(digite 0 para finalizar!)");
		while (true) {
			System.out.println("Valor: ");
			valor = leitor.nextDouble();
			if(valor == 0) {
				break;
			}
			valores.add(valor);
			total += valor;
		}
		System.out.println("Valores digitados: ");
		for (double v : valores) {
			System.out.println("R$ " + v);
		}
		System.out.println("Total a pagar: R$ " + total);
		leitor.close();
	}
}
