package javafundamentals;

public class TiposDeDados {
	
	public static void main(String[] args) {
		double x = 5.7;
		System.out.println("double x é: " + x);
		
		int y = 100;
		System.out.println("int y é: " +  y);
		
		int xy = (int)5.7;
		System.out.println(xy);
		
		boolean a = true;
		boolean b = false;
		boolean c;
		
		c = a && b;
		System.out.println(c);
		
		c = a || b;
		System.out.println(c);
		
		System.out.println(!a);
		
		c = a == b;
		System.out.println(c);
		
		c = a != b;
		System.out.println(c);
		
		int d = 10;
		int e = 15;
		
		c = d < e;
		System.out.println(c);
					
	}

}
