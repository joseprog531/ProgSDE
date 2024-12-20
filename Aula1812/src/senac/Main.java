package senac;

public class Main {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Monitor AOC 21",499.99, 15);
		Produto p2 = new Produto("Mouse", 49.99 );
		Produto p3 = new Produto("teclado", 98, 4);
		
		System.out.println(p1.exibirDetalhes() + "\n\n");
		
		p1.setPreco(499.99 * 1.1);
		p1.setQuantidade(20);
		
		
		
		System.out.println(p1.exibirDetalhes());
		System.out.println(p2.exibirDetalhes());
		System.out.println(p3.exibirDetalhes());
		
		System.out.println("Receita do produto: " + p1.getNome() + "\nValor R$: " + p1.receitaMonetaria());
	
	/// metodo de acesso
	///
	///getters
	///ceteres os construtrosrs 
	}
}	
