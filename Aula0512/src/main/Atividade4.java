package main;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int altura, largura;

        String linha = "", retangulo = "";

        System.out.println("Digite a largura do retangulo: ");
        largura = leitor.nextInt();

        System.out.println("Digite a altura do retangulo: ");
        altura = leitor.nextInt();

        for (int i = 1; i <= largura; i++) {
            linha += "#";
        }

        for (int i = 1; i <= altura; i++) {
            retangulo += linha + "\n";
        }
        System.out.println(retangulo);

    }

}
