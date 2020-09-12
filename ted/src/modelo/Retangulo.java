package modelo;

public class Retangulo {

	private float base;
	private float altura;
	
	
	public Retangulo(float b, float a) {
		base = b;
		altura = a;
				
	}
	
	public float calcularArea() {
		return base*altura;
		
	}
}
