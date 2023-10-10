package javafundamentals;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resposta = 0;
		System.out.println("Entre com o 1º numero");
		int num1 = entrada.nextInt();
		System.out.println("Entre com o 2º numero");
		int num2 = entrada.nextInt();
		System.out.println("Entre com um operador (* / % + -): ");
		char operador = entrada.next().charAt(0);
		if(operador ==  '*') {
			resposta = num1 * num2;
		}else if(operador == '/') {
			resposta = num1 / num2;
		}else if(operador == '%') {
			resposta = num1 % num2;
		}else if(operador == '+') {
			resposta = num1 + num2;
		}else if(operador == '-') {
			resposta = num1 - num2;
		}else {
			System.out.println("Comando invalido");
		}
		System.out.println("O resultado é: " + resposta);
		entrada.close();
	}

}
