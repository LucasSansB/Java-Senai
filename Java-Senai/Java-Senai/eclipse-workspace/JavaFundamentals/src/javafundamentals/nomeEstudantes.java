package javafundamentals;

public class nomeEstudantes {
	
	public static void main(String[] args) {
		
		String[] nomeEstudantes;
	
		Estudante[][] grupo = new Estudante[3][5];
			int x = 0;
			for(int i = 0; i < grupo.length; i++) {
				for(int j = 0; j < grupo.length; j++) {
					String name = nomeEstudantes [x];
					grupo[i][j] = new Estudante(name);
					x++;
				}
			}
	}
}
