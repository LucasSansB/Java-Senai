package javafundamentals;
import java.util.Scanner;

public class Escansor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Escrever um nome");
		String nome = entrada.next();
		System.out.println("Escrever um número");
		int numero = entrada.nextInt();
		System.out.println(nome + ", o número que ele colocou é: " + numero);
		entrada.close();
	}

}
