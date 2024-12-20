package biblioteca;

public class Livro {
    private String nome;
    private String autor;
    private int ano;

    
    public Livro(String nome, String autor, int ano) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano; 
    }


    public String getNome() {
        return nome;
    }

    
    public String getAutor() {
        return autor;
    }

    
    public int getAno() {
        return ano;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public String exibirDetalhe() {
        System.out.println("---------------------------------------------------");
        return "Nome: " + nome + "\n" + "Autor: " + autor + "\n" + "Ano de publicação: " + ano;
    }
}
