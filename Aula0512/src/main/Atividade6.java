package main;

import java.util.Scanner;

public class Atividade6 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero, divisores = 0;

        System.out.println("Digite um numero: ");
        numero = leitor.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i + " É um dos divisores");
                divisores++;
            }
        }

        if (divisores <= 2) {
            System.out.println("É primo");
        } else {
            System.out.println("Não é primo");
        }

    }

}
