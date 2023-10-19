package javafundamentals;

public class ConversaoExplicita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = (int) (Math.random() * 10);
		System.out.println(numero);
		
		int raiz = (int) Math.sqrt(625);
		System.out.println("raiz de 625 é: " + raiz);
		
		double pi = Math.PI;
		System.out.println(pi);
	}

}
