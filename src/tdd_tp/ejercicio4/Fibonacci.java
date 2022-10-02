package tdd_tp.ejercicio4;


public class Fibonacci {
	private int cantElem;
	
	public Fibonacci(int n) {
		 cantElem = n;
	}
		
		
	public int sumaDePares() {
	int a = 0, b = 1 , c;
	int total = 0;
				
		for ( int i = 0 ; i < cantElem ; i++) {
		
		c = a + b;
		a = b;
		b = c;
	
		if (a % 2 == 0) {
			total += a;
		}
		
	}
		return total;
		
	}
	
	
}
