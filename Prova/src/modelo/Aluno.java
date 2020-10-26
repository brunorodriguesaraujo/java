package modelo;

public class Aluno {

	//atributos
	private String nome;
	private int matricula;
	private String curso;
	
	//contrutor vazio e com campos
	public Aluno() {}
	
	public Aluno(String n, int m, String c) {
		this.nome = n;
		this.matricula = m;
		this.curso = c;
	}
	
	//get e set
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int novaMatricula) {
		this.matricula = novaMatricula;
	}
	
	public String getCurso() {
		return this.curso;
	}
	
	public void setCurso(String novoCurso) {
		this.curso = novoCurso;
	}
	
	public String toString() {
		return "Nome: "+ this.nome + "\nMatricula: " + this.matricula + "\nCurso: " + this.curso;
	}
	
	
	
	
	
}
