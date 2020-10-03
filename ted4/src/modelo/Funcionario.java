package modelo;

public class Funcionario {
	
	//atributos
	private int identificador;
	private int setor;
	private int salario;
	private int rg;
	private boolean empregado;
	
	
	//construtor
	public Funcionario(int i, int s, int sal, int rg, boolean e) {
		this.identificador = i;
		this.setor = s;
		this.salario = sal;
		this.rg = rg;
		this.empregado = e;
	}
	
	
	public Funcionario() {}
	
	//get e set
	public int getIdentificador() {
		return this.identificador;
	}
	
	public void setIdentificador(int novoIdentificador) {
		this.identificador = novoIdentificador;
	}
	
	public int getSetor() {
		return this.setor;
	}
	
	public void setSetor(int novoSetor) {
		this.setor = novoSetor;
	}
	
	public int getSalario() {
		return this.salario;
	}
	
	public void setSalario(int novoSalario) {
		this.salario = novoSalario;
	}
	
	public int getRg() {
		return this.rg;
	}
	
	public void setRG(int novoRG) {
		this.rg = novoRG;
	}
	
	public boolean getEmpregado() {
		return this.empregado;
	}
	
	public void setEmpregado(boolean novoEmpregado) {
		this.empregado = novoEmpregado;
	}
	
	//metodos
	public int bonifica (int aumento) {
		return this.salario += aumento;
	}
	
	public boolean demite() {
		return this.empregado = false;
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

