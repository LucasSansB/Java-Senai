package javafundamentals;


public class OrientacaoObtejo {
	
	public static class Estudante{
		private String nome;
		private int matricula;
		private double media;
		
		public Estudante(String nome, int matricula, double media) {
			this.nome = nome;
			this.matricula = matricula;
			this.media = media;
		}
		
	}

	public static void main(String[] args) {
		
		Estudante aluno = new Estudante("Hian",123456,10);
		
		
		System.out.println("Aluno: " + aluno.nome);
		System.out.println("Matricula: " +  aluno.matricula);
		System.out.println("Média: " + aluno.media);

		
	}
}
