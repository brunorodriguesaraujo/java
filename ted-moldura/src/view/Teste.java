package view;

import javax.swing.JOptionPane;

import modelo.Moldura;

public class Teste {
	public static void main(String[] args) {
		
		String b_string = JOptionPane.showInputDialog("Base: ");
		String a_string = JOptionPane.showInputDialog("Altura: ");
		String e_string = JOptionPane.showInputDialog("Espessura: ");
		String p_string = JOptionPane.showInputDialog("Preço m²: ");
		float b = Float.parseFloat(b_string);
		float a = Float.parseFloat(a_string);
		float e = Float.parseFloat(e_string);
		float p = Float.parseFloat(p_string);
		Moldura m = new Moldura(b, a, e, p);
		
		
		JOptionPane.showMessageDialog(null, "A área da Moldura em m² é de: "+ m.calcularMold()+
		", e o valor ficou de: R$"+ m.calcularPreco());
	}
}
