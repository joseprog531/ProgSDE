package senac;

import java.lang.classfile.instruction.ReturnInstruction;
import java.security.PublicKey;

public class Produto {
	// Atributos da classe
	private String nome;
	private double preco;
	private int quantidade;

	// Construtor padrao
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;

	}

	// Construtor Parametrizado
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Construtor Com Parametro
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;

	}

	// Métodos da classe
	public String exibirDetalhes() {
		System.out.println("-------------------------------------");

		return "Nome: " + nome + " Preço:" + preco + "Quantidade: " + quantidade;
	}

	// Método para retornar a receita monetária do produto

	public double receitaMonetaria() {
		return preco * quantidade;

	}

}
