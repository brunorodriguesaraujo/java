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
		String p_string = JOptionPane.showInputDialog("Pre�o do m�: ");
		float b_interna = Float.parseFloat(bInt_string);
		float a_interna = Float.parseFloat(aInt_string);
		float b_externa = Float.parseFloat(bExt_string);
		float a_externa = Float.parseFloat(aExt_string);
		float preco = Float.parseFloat(p_string);
		
		Retangulo interno = new Retangulo(b_interna, a_interna);
		Retangulo externo = new Retangulo(b_externa, a_externa);
		Moldura m = new Moldura(interno, externo, preco);
		
		JOptionPane.showMessageDialog(null, "A �rea � da Moldura � de: "+ m.calcularMold()+"m�"
				+ " e o valor total que voc� ir� pagar �: R$"+ m.calcularPreco());
			
		

		
	}

}
