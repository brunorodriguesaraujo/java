package modelo;

public class Conta {
		
	//atributos
	private int numero;
	private double saldo;
	
	//construtor vazio e com campos
	public Conta() {}
	
	public Conta(double s, int n) {
		this.saldo = s;
		this.numero = n;
		
	}
	
	// get e set
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	//toString
	public String toString() {
		return "Número: " + this.numero + "\nSaldo: " + this.saldo;
	}
	
	
	
	
	
}
