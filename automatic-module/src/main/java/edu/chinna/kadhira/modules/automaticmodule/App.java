package edu.chinna.kadhira.modules.automaticmodule;

import edu.chinna.kadhira.modules.automatic.dependent.Util;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println(" Module Name " + App.class.getModule().getName());
		Util util = new Util();
		util.sayHi("Kondapalli");
	}
}
