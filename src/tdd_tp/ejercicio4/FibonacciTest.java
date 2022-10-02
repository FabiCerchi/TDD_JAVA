package tdd_tp.ejercicio4;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	Fibonacci fibo = new Fibonacci(10);
	
	@Test
	public void test() {
		assertTrue(fibo.sumaDePares() == 44);
	}

}
