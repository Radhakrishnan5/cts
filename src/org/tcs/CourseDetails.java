package org.tcs;

import java.util.ArrayList;
import java.util.List;

public class CourseDetails {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(80);
		l.add(70);
		
		System.out.println(l);
		
		boolean b = l.add(60);
		System.out.println(l);
		
		boolean c = l.add(50);
		System.out.println(l);
		
		boolean d = l.add(100);
		System.out.println(l);
		
        Integer e = l.set(0, 20);		
		System.out.println(l);
		
		Integer f = l.set(1, 10);
System.out.println(l);		
		
	}

	
}
