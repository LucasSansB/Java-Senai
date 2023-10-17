package javafundamentals;

public class CalculaOnibus {

	public static void main(String[] args) {
		Excursao excursao = new Excursao();
		excursao.calcularBusEVans(100);
		
		System.out.println("O número de ônibus é: " + excursao.getNumOnibus());
		System.out.println("O número de pessoas em vans é: " + excursao.getNumPessVans());

	}

}
