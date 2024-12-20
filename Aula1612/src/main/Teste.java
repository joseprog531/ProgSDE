package main;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa ("Josefina", 30, 1.75, 60.5);
		Pessoa p2 = new Pessoa ("Christian", 35, 1.80, 90);
		Pessoa p2 = new Pessoa ("Joana", 20, 1.55, 50);
		
		p1.apresentar();
		p2.apresentar();	
		
		System.out.println(p1.nome);
		p1.nome = "Fenix";
		
		pessoas.add(p1);
		pessoas.add(p2);
		
		System.out.println(p1.nome);
		System.out.println(p1.idade);
		System.out.println(p1.altura);
		System.out.println(p1.peso);
		

	}

}
