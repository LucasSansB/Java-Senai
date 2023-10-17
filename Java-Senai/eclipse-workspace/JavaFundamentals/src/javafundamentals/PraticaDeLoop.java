package javafundamentals;
import java.util.Scanner;

public class PraticaDeLoop {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numEntrada = 0;
		int soma = 0;
		int numASerSomado;
		do {
			System.out.println("Entre com um numero: ");
			numASerSomado = entrada.nextInt();
			soma += numASerSomado;
			numEntrada++;
		}while(numEntrada < 10);
		System.out.println("A soma destes dez numeros é: " + soma);
		entrada.close();
	}

}
