package edu.chinna.kadhira.util;

import java.lang.reflect.Method;

import edu.chinna.kadhira.fibonacci.FibonacciRecursive;
import edu.chinna.kadhira.secondmodule.ReferanceTesting;

public class CalcUtil {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int fib(int val) throws Exception {
		return getFibonacci().fib(val);
	}

	public static Fibonacci getFibonacci() {
		return new FibonacciRecursive();
	}

	public static ReferanceTesting getReferanceTesting() {
		return ReferanceTesting.getReferanceObj();
	}

}
