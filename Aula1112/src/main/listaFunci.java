package main;

import java.util.ArrayList;
import java.util.Scanner;

public class listaFunci {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> funcionarios = new ArrayList<String>();
        String nome;

        System.out.println("Digite os nomes dos funcionários, (digite SAIR para encerrar):");

        while (true) {
            System.out.print("Nome do funcionário: ");
            nome = leitor.nextLine();

            if (nome.equalsIgnoreCase("SAIR")) {
                break;
            }

            funcionarios.add(nome);
        }

        System.out.println("Lista de funcionários:");
        System.out.println(funcionarios);

        leitor.close();
    }
}
