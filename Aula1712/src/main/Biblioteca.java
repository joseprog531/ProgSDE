package main;

import java.awt.SystemColor;

public class Biblioteca {

	public static void main(String[] args) {
		
		Livro l1 = new Livro("O Alquimista", "Paulo Coelho", "Motivando Corações", 28);
		System.out.println(l1.titulo);
		System.out.println(l1.autor);
		System.out.println(l1.editora);
		System.out.println(l1.estoque);
	
		

	}

}
