package view;

import java.util.Scanner;

import modelo.Funcionario;

public class Teste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Funcionario listaFunc [] = new Funcionario [5];
		
		for (int i = 0; i < listaFunc.length; i++) {
			System.out.println("Funcionario " + (i+1));
			
			System.out.print("Qual o número do seu identificador? ");
			int identificador = entrada.nextInt();
			
			System.out.print("Qual o número do seu setor? ");
			int setor = entrada.nextInt();
			
			System.out.print("Qual o valor do seu salário? ");
			int salario = entrada.nextInt();
			
			System.out.print("Qual o número do seu RG? ");
			int rg = entrada.nextInt();
			
			System.out.println("Funcionário "+ (i+1)+ " cadastrado com sucesso!\n");
			
			listaFunc[i] = new Funcionario(identificador, setor, salario, rg, true);
			
		
		}
		
		
		listaFunc[3].demite();
		System.out.println("O funcionário 4 está empregado? "+ listaFunc[3].getEmpregado());
		System.out.println("O Funcionário 2 recebeu uma bonificação de 900R$ e seu salário total ficou de "
				+ listaFunc[1].bonifica(900)+"R$"); 
				
				
		
			
		
		
		entrada.close();	
	}
}
