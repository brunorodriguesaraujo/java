package view;

import java.util.ArrayList;

import modelo.Conta;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double maiorSaldo = 0;
		int contaMaiorSaldo = 0;
		
		ArrayList<Double> saldoConta = new ArrayList<Double>();
		saldoConta.add(2000.00);
		saldoConta.add(3000.00);
		saldoConta.add(2800.00);
		
		ArrayList<Integer> numConta = new ArrayList<Integer>();
		numConta.add(1033);
		numConta.add(1220);
		numConta.add(9218);
		
		for (int i=0; i<saldoConta.size(); i++) {
			if(saldoConta.get(i)>maiorSaldo) {
				maiorSaldo = saldoConta.get(i);
				contaMaiorSaldo = numConta.get(i);
					
			}
		}
		
		System.out.println("A conta com maior saldo é: "+contaMaiorSaldo);
	}	
		
}		
		







		//testando
		/*double maiorSaldo = 0;
		
		ArrayList<Double> saldoConta = new ArrayList<Double>();
		saldoConta.add(2000.00);
		saldoConta.add(1500.00);
		saldoConta.add(2800.00);
		
		ArrayList<Integer> numConta = new ArrayList<Integer>();
		numConta.add(1033);
		numConta.add(1220);
		numConta.add(9218);
		
		ArrayList<Conta> conta = new ArrayList<Conta>();
		conta.add(new Conta(saldoConta.get(0), numConta.get(0)));
		conta.add(new Conta(saldoConta.get(1), numConta.get(1)));
		conta.add(new Conta(saldoConta.get(2), numConta.get(2)));

		
		for (int i=0; i<saldoConta.size(); i++) {
			if(saldoConta.get(i)>maiorSaldo) {
				maiorSaldo = saldoConta.get(i);
				if(conta.get(i).equals(maiorSaldo)) {
					System.out.println(conta.get(i));
				}

			}
		}
		
		
		ArrayList<Conta> num  = new ArrayList<Conta>();
		num.add(new Conta(2000.00, 1033));
		num.add(new Conta(1500.00, 1220));
		num.add(new Conta(3000.00, 9218));
		
		for(int i=0; i<num.size(); i++) {
			Object n = num.get(i);
			System.out.println(n);*/
			
			
		
		
		
		
		
		
		
	
		
		
		
		


		
		
		
	
	
	
	
	
	
	
	
	


