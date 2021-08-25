package entities;

public class Funcionario {
	private String nome;
	private double salarioBasico;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, double salarioBasico) {
		this.nome = nome;
		this.salarioBasico = salarioBasico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBasico() {
		return salarioBasico;
	}

	public void setSalarioBasico(double salarioBasico) {
		this.salarioBasico = salarioBasico;
	}
	
	
}
