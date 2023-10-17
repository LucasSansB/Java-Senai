package javafundamentals;

public class Person {
	
	private String nomePessoa;
	private int idadePessoa;
	
	public Person(String nomePessoa, int idadePessoa) {
		this.nomePessoa = nomePessoa;		
		this.idadePessoa = idadePessoa;
	}
	
	public String getNomePessoa() {
		return nomePessoa;
	}
	
	public int getIdadePessoa() {
		return idadePessoa;
	}
	
	public void setIdadePessoa(int idadePessoa) {
		this.idadePessoa = idadePessoa;
	}
}
