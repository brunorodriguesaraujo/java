package modelo;

public class Moldura {
	
	//atributos
	private Retangulo retInterno;
	private Retangulo retExterno;
	private float preco;
	
	//contrutor
	public Moldura(Retangulo retInt, Retangulo retExt, float p) {
		this.retInterno = retInt;
		this.retExterno = retExt;
		this.preco = p;
	}	
	
	public Moldura() {
		
	}
	
	//get e set
	public float getPreco() {
		return this.preco;
	}
	
	public void setPreco(float novoPreco) {
		this.preco = novoPreco;
	}
	
	//metodos
	public float calcularMold() {
		return this.retExterno.calcularArea() - this.retInterno.calcularArea();
		
	}
	
	public float calcularPreco() {
		return (this.retExterno.calcularArea() - this.retInterno.calcularArea()) * this.preco;
	}
	
	
}
