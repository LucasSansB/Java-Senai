package javafundamentals;

public class TestarAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		
		aluno.definirNome("Hian");
		aluno.setId(001);
		aluno.setCurso("Engenharia da computação");
		aluno.setMedia(9.5);
		
		aluno2.definirNome("Natalia");
		aluno2.setId(002);
		aluno2.setCurso("Jornalismo");
		aluno2.setMedia(10);
		
		aluno3.definirNome("Joao");
		aluno3.setId(003);
		aluno3.setCurso("Licenciatura em Quimica");
		aluno3.setMedia(9);
		
		aluno4.definirNome("Paulo");
		aluno4.setId(004);
		aluno4.setCurso("Publicidade e Propaganda");
		aluno4.setMedia(8.5);
				

		
		System.out.println("nome: " + aluno.obterNome());
		System.out.println("ID: " +aluno.getId());
		System.out.println("Curso: " +aluno.getCurso());
		System.out.println("Nota: " +aluno.getMedia());
		
		System.out.println("--------------------");
		
		System.out.println("nome: " + aluno2.obterNome());
		System.out.println("ID: " +aluno2.getId());
		System.out.println("Curso: " +aluno2.getCurso());
		System.out.println("Nota: " +aluno2.getMedia());
		
		System.out.println("----------------");
		
		System.out.println("nome: " + aluno3.obterNome());
		System.out.println("ID: " +aluno3.getId());
		System.out.println("Curso: " +aluno3.getCurso());
		System.out.println("Nota: " +aluno3.getMedia());
		
		System.out.println("----------------");
		
		System.out.println("nome: " + aluno4.obterNome());
		System.out.println("ID: " +aluno4.getId());
		System.out.println("Curso: " +aluno4.getCurso());
		System.out.println("Nota: " +aluno4.getMedia());
		

	}

}
