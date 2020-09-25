package view;

import javax.swing.JOptionPane;

import modelo.Retangulo;


public class Teste {

	public static void main(String[] args) {
		
		String r1_string = JOptionPane.showInputDialog("Base: ");
		String r2_string = JOptionPane.showInputDialog("Altura: ");
		float r1 = Float.parseFloat(r1_string);
		float r2 = Float.parseFloat(r2_string);
		
		Retangulo ret = new Retangulo(r1, r2);
		
		
		JOptionPane.showMessageDialog(null, "A área é de: "+ ret.calcularArea());
		
		

		
	}

}
