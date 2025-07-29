package com.tnsif.dayeight;

public class Executor {
public static void main (String[] args) {
	Coder c1;//This is reference
	//Trainer object
	c1=new Trainer();
	c1.rules();
	//student object
	c1=new Student();
	c1.rules();
	
}
}
