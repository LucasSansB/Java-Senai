package javafundamentals;
import java.util.Scanner;

public class BuqueBidimensional {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		int[][] numero = new int [3][2];
		
		for(int i = 0; i < numero.length; i++) {
			for(int j = 0; j < numero[i].length; j++) {
				System.out.println("Entre com o valor da linha " + i + ", coluna " + j);
				numero[i][j] = entrada.nextInt();
			}
		}
		for(int i = 0; i < numero.length; i++) {
			for(int j = 0; j < numero[i].length; j++) {
				System.out.println(numero[i][j] + " ");
				
			}
			System.out.println("");
		}
		entrada.close();
	}

}
