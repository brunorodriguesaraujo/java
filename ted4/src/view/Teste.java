package view;

import java.util.Scanner;

import modelo.Funcionario;

public class Teste {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Funcionario listaFunc [] = new Funcionario [5];
		
		for (int i = 0; i < listaFunc.length; i++) {
			System.out.println("Funcionario " + (i+1));
			
			System.out.print("Qual o n�mero do seu identificador? ");
			int identificador = entrada.nextInt();
			
			System.out.print("Qual o n�mero do seu setor? ");
			int setor = entrada.nextInt();
			
			System.out.print("Qual o valor do seu sal�rio? ");
			int salario = entrada.nextInt();
			
			System.out.print("Qual o n�mero do seu RG? ");
			int rg = entrada.nextInt();
			
			System.out.println("Funcion�rio "+ (i+1)+ " cadastrado com sucesso!\n");
			
			listaFunc[i] = new Funcionario(identificador, setor, salario, rg, true);
			
		
		}
		
		
		listaFunc[3].demite();
		System.out.println("O funcion�rio 4 est� empregado? "+ listaFunc[3].getEmpregado());
		System.out.println("O Funcion�rio 2 recebeu uma bonifica��o de 900R$ e seu sal�rio total ficou de "
				+ listaFunc[1].bonifica(900)+"R$"); 
				
				
		
			
		
		
		entrada.close();	
	}
}
