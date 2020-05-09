package edu.chinna.kadhira.fibonacci;

import edu.chinna.kadhira.util.Fibonacci;

public class FibonacciRecursive implements Fibonacci {

	@Override
	public int fib(int val) {
		if (val < 3)
			return 1;
		return fib(val - 1) + fib(val - 2);
	}
	
	public void hidden() {
		System.out.println(" Hello ---- i am a hidden method....");
	}

}
