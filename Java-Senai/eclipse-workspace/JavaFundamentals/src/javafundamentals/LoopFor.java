package javafundamentals;
import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numEntradas = 10;
		int soma = 0;
		
		for(int i = 0; i < numEntradas; i++) {
			System.out.println("Entre com um numero inteiro: ");
			soma += entrada.nextInt();
		}
		System.out.println("A soma de destes dez numeros é: " + soma);
		entrada.close();
	}

}
