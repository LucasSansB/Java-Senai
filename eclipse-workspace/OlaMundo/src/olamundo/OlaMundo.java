package olamundo;

import java.util.Scanner;

public class OlaMundo {

	public static void main (String[] args) {
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("digite o ano");
			int ano = teclado.nextInt();
					
			String nossoAno = "estamos no ano de " + ano;
			System.out.println(nossoAno);
		}
		
	}
}

