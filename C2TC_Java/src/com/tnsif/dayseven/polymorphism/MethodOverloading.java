package com.tnsif.dayseven.polymorphism;

public class MethodOverloading {
public static void main(String[] args) {
	Addition a=new Addition();
	a.add();
	System.out.println(a.add(6));
	System.out.println(a.add(6.7));
	System.out.println(a.add(6,7));
	a.show(101, "Dharani");
	a.show("Dharani", 101);
}
}
