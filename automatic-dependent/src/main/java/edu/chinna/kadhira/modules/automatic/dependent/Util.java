package edu.chinna.kadhira.modules.automatic.dependent;

public class Util {
	public String sayHi(String name) {
		System.out.println(" Module Name " + Util.class.getModule().getName());
		return "Hi " + name;
	}
}
