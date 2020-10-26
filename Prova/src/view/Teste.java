package view;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Aluno;
import modelo.Prova;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//criando arraylist
		ArrayList<Integer> pesos = new ArrayList<Integer>();
		pesos.add(2);
		pesos.add(2);
		pesos.add(2);
		pesos.add(2);
		pesos.add(2);
		
		ArrayList<String> perguntas = new ArrayList<String>();
		perguntas.add("Perg 1: ");
		perguntas.add("Perg 2: ");
		perguntas.add("Perg 3: ");
		perguntas.add("Perg 4: ");
		perguntas.add("perg 5: ");
		
		ArrayList<String> respostas = new ArrayList<String>();
		System.out.println("Responda com: a, b, c, d ou e");
		System.out.print(perguntas.get(0));
		respostas.add(entrada.next());
		System.out.print(perguntas.get(1));		
		respostas.add(entrada.next());
		System.out.print(perguntas.get(2));		
		respostas.add(entrada.next());
		System.out.print(perguntas.get(3));		
		respostas.add(entrada.next());
		System.out.print(perguntas.get(4));		
		respostas.add(entrada.next());
		
		ArrayList<String> respostaCerta = new ArrayList<String>();
		respostaCerta.add("a");
		respostaCerta.add("b");
		respostaCerta.add("c");
		respostaCerta.add("d");
		respostaCerta.add("e");
		
		ArrayList<Float> pontuacoesQuestoes = new ArrayList<Float>();
		
		//instaciando as classes
		Aluno aluno = new Aluno("Bruno", 2020, "Sistemas para internet");
		Prova prova = new Prova(10, aluno, pesos, perguntas, respostas, respostaCerta, pontuacoesQuestoes);
		
		//tratando as pontuações
		for (int i=0; i<pesos.size(); i++) {
			if (respostas.get(i).equals(respostaCerta.get(i))) {
				pontuacoesQuestoes.add(10f);
				}else {
					pontuacoesQuestoes.add(0f);
				}
						
		}		
			
		System.out.println("Gabarito: "+prova.getRespostaCerta());
		System.out.println(aluno.toString()+"\nObteve a nota de: "+prova.calcularNota());
		
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
