package modelo;

public class Retangulo {

	//atributos
	private float base;
	private float altura;
	
	//construtor
	public Retangulo(float b, float a) {
		this.base = b;
		this.altura = a;
	}
	
	public Retangulo() {}
	
	//get e set
	public float getBase() {
		return this.base;
	}
	
	public void setBase(float novaBase) {
		this.base = novaBase;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public void setAltura(float novaAltura) {
		this.altura = novaAltura;
	}
	
	//metodos
	public float calcularArea() {
		return this.base * this.altura;
		
	}
}
