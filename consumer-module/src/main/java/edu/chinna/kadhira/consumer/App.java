package edu.chinna.kadhira.consumer;

import static edu.chinna.kadhira.util.CalcUtil.add;
import static edu.chinna.kadhira.util.CalcUtil.fib;
import static edu.chinna.kadhira.util.CalcUtil.getFibonacci;

import java.lang.reflect.Method;

import edu.chinna.kadhira.secondmodule.ReferanceTesting;
import edu.chinna.kadhira.util.CalcUtil;
import edu.chinna.kadhira.util.Fibonacci;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			System.out.println(" Add :  " + add(4, 5));
			System.out.println(" Fibanacci val :  " + fib(5));
			Fibonacci fibonacci = getFibonacci();

			Method method = fibonacci.getClass().getMethod("hidden");
			System.out.println(method);
			method.invoke(fibonacci, null);
			ReferanceTesting referanceTesting = CalcUtil.getReferanceTesting();
			System.out.println(referanceTesting);
			System.out.println(" Module Name : "+App.class.getModule());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
