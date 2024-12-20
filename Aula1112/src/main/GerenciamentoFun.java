package main;

import java.util.Scanner;

public class GerenciamentoFun {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao = -1;

		while (opcao != 0) {
			System.out.println(" ");
			System.out.println(" MENU: ");

			System.out.println(" 1. Inserir funcionario: ");

			System.out.println(" 2. Ver funcionario: ");

			System.out.println(" 3. Atualizar funcionario: ");

			System.out.println(" 4. Remover funcionario: ");

			System.out.println(" 0. SAIR: ");
			System.out.println(" ");
			System.out.println(" Escolha uma das opções : ");
			opcao = leitor.nextInt();
			System.out.println(" ");
			if (opcao == 1) {
				System.out.println(" Voce escolheu ,Inserir funcionario ");

			} else if (opcao == 2) {
				System.out.println(" Voce escolheu, ver funcionario ");

			} else if (opcao == 3) {
				System.out.println(" Voce escolheu, atualizar funcionario ");

			} else if (opcao == 4) {
				System.out.println(" Voce escolheu, Remover funcionario ");

			} else if (opcao == 0) {
				System.out.println(" SAIR ");
				break;

			} else {
				System.out.println(" Opcao invalida, tente novamente ");

			}
			System.out.println(" Tecle enter para continuar");
			leitor.nextInt();
		}
		
	}
}
