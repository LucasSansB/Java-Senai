package javafundamentals;

public class Corintiano {
	public String nome;
	private String lema;
	
	public Corintiano(String lema) {
		this.lema = lema;
	}
	public Corintiano() {
		
	}
	
	public void setLema(String lema) {
		this.lema = lema;
	}
	
	public String dizerLema() {
		return lema;
	}

}
