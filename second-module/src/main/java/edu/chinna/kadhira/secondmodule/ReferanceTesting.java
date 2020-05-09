package edu.chinna.kadhira.secondmodule;

public class ReferanceTesting {

	public void sayHello() {
		System.out.println(" Hello Method...");
	}

	public String sayHi(String name) {
		return "Hello   " + name;
	}
	
	public static ReferanceTesting getReferanceObj() {
		return new ReferanceTesting();
	}
}
