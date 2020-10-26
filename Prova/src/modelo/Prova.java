package modelo;

import java.util.ArrayList;

import modelo.Aluno;

public class Prova {
	
	//atributos
	private int idProva;
	private ArrayList<Integer> pesos;
	private ArrayList<Float> pontuacoesQuestoes;
	private ArrayList<String> respostaCerta;
	private ArrayList<String> perguntas;
	private ArrayList<String> respostas;
	private Aluno aluno;

	
	//contrutor sem e com campos
	public Prova() {}
	
	public Prova(int idProva, Aluno aluno, ArrayList<Integer> pesos, ArrayList<String> perguntas, 
			ArrayList<String> respostas, ArrayList<String> respostaCerta, ArrayList<Float> pontuacoesQuestoes) {
		this.aluno = aluno;
		this.pesos = pesos;
		this.perguntas = perguntas;
		this.respostas = respostas;
		this.respostaCerta = respostaCerta;
		this.pontuacoesQuestoes = pontuacoesQuestoes;
	}
	
	//metodos
	int somaPesos = 0;
	float media, m;
	int i = 0;
	public float calcularNota() {
		for(int i=0; i<5; i++) {
			m += this.pesos.get(i)*this.pontuacoesQuestoes.get(i);
			somaPesos += this.pesos.get(i);
		media = m/somaPesos;
		}
		
		return media;
	}
	
	//get e set
	public int getIdProvas() {
		return this.idProva;
	}
	
	public void setIdProva(int novoIdProva) {
		this.idProva = novoIdProva;
	}
	
	public ArrayList<Integer> getPesos(){
		return this.pesos;
	}
	
	public void setPesos(ArrayList<Integer> novoPeso) {
		this.pesos = novoPeso;
	}
	
	public ArrayList<Float> getPontuacoesQuestoes(){
		return this.pontuacoesQuestoes;
	}
	
	public void setPontuacoesQuestoes(ArrayList<Float> novaPontuacoesQuestoes) {
		this.pontuacoesQuestoes = novaPontuacoesQuestoes;
	}
	
	public ArrayList<String> getRespostaCerta() {
		return this.respostaCerta;
	}
	
	public void setRespostaCerta(ArrayList<String> novaResposta) {
		this.respostaCerta = novaResposta;
	}
	
	public ArrayList<String> getPerguntas() {
		return this.perguntas;
	}
	
	public void setPerguntas(ArrayList<String> novaPergunta) {
		this.perguntas = novaPergunta;
	}
	
	public ArrayList<String> getRespostas() {
		return this.respostas;
	}
	
	public void setRespostas(ArrayList<String> novaResposta) {
		this.respostas = novaResposta;
	}
	
	//toString
	public String toString () {
		return "Pesos: "+this.pesos+"\nPerguntas: "+this.perguntas+"\nRespostas: "+this.respostas+"\nRespostas certas: "
				+this.respostaCerta+"\nPontuações: "+this.pontuacoesQuestoes;
	}
	
	
	
}














