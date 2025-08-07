package com.tnsif.dayseventeen.userdefinedobjects;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
	public static void main(String args[]) {
		Set<Student> studentSet = new HashSet<Student>();
		addElements(studentSet);
		System.out.println(studentSet);		
	}

	static void addElements(Set<Student> studentSet) {

		Student s1 = new Student("Swathi",78);
		studentSet.add(s1);
		s1 = new Student("Samu",66);
		studentSet.add(s1);
		s1 = new Student( "Thaya",73);
		studentSet.add(s1);
		s1 = new Student("Mohan",81);
		studentSet.add(s1);
		s1 = new Student("Dharani",81); 
		studentSet.add(s1); //duplicate element can't insert

	}

}