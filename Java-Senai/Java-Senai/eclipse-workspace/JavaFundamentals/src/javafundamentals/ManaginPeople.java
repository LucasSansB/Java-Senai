package javafundamentals;

public class ManaginPeople {

	public static void main(String[] args) {
		Person p1 = new Person("Hian", 22);
		Person p2 = new Person("Thiago", 19);
		
		if(p1.getIdadePessoa() == p2.getIdadePessoa()) {
			System.out.println(p1.getNomePessoa() + " tem a mesma idade que " + p2.getNomePessoa());
		} else {
			System.out.println(p1.getNomePessoa() + " tem a idade diferente de " + p2.getNomePessoa());
		}
	}
}
