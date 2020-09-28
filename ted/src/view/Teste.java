package view;

import javax.swing.JOptionPane;

import modelo.Moldura;
import modelo.Retangulo;


public class Teste {

	public static void main(String[] args) {
		
		String bInt_string = JOptionPane.showInputDialog("Base interna: ");
		String aInt_string = JOptionPane.showInputDialog("Altura interna: ");
		String bExt_string = JOptionPane.showInputDialog("Base externa: ");
		String aExt_string = JOptionPane.showInputDialog("Altura externa: ");
		String p_string = JOptionPane.showInputDialog("Preço do m²: ");
		float b_interna = Float.parseFloat(bInt_string);
		float a_interna = Float.parseFloat(aInt_string);
		float b_externa = Float.parseFloat(bExt_string);
		float a_externa = Float.parseFloat(aExt_string);
		float preco = Float.parseFloat(p_string);
		
		Retangulo interno = new Retangulo(b_interna, a_interna);
		Retangulo externo = new Retangulo(b_externa, a_externa);
		Moldura m = new Moldura(interno, externo, preco);
		
		JOptionPane.showMessageDialog(null, "A área é da Moldura é de: "+ m.calcularMold()+"m²"
				+ " e o valor total que você irá pagar é: R$"+ m.calcularPreco());
			
		

		
	}

}
