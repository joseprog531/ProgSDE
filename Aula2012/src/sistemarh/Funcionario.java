ackage sistemarh;

public class Funcionario extends Pessoa {
	
	private String cargo;
	private double salario;


public Funcionario(String nome, String dataDeNascimento, String cpf, double peso, double altura , String  cargo, double salario) {
		super(nome, dataDeNascimento, cpf, peso, altura);
		this.cargo = cargo;
		this.salario = salario;
		}

 public String getCargo() {
	 return cargo; 
}
 public void setCargo(String cargo) {
	 this.cargo = cargo;
	  }
 public double getSalario() {
	 return salario; 
}
 public void setSalario(double salario) {
	 this.salario = salario;
 
 
 
 
 //




//public Funcionario(String nome, String dataDeNascimento, String cpf, double peso, double altura, String cargo) {
//super(nome, dataDeNascimento, cpf, peso, altura);

}