package javafundamentals;

public class Aluno {
	private String nome = "";
	private int identificacao = 0;
	private String curso = "";
	private double media = 0;
	public final int CFP_AUTOMOBILISTICA = 113;
	
	public void definirNome(String nome) {
		this.nome = nome;
	}
	
	public void setId(int id) {
		identificacao=id;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void setMedia(double med) {
		media = med;
	}
	
	public String obterNome() {
		return nome;
	}
	
	public int getId() {
		return identificacao;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public double getMedia() {
		return media;
	}
}
