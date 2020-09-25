package modelo;

public class Moldura {
	private float base;
	private float altura;
	private float espessura;
	private float preco;
	
	
	public Moldura(float b, float a, float e, float p) {
		base = b;
		altura = a;
		espessura = e;
		preco = p;
				
	}
	
	public float calcularMold() {
		return base*altura - (base - espessura)*(altura - espessura);
	}
		
	public float calcularPreco() {
		return (base*altura - (base - espessura)*(altura - espessura)) * preco;
	}
		
}
