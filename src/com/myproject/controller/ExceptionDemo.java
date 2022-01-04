package com.myproject.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExceptionDemo {

	public static void main(String[] args) {

		Student stu1 = new Student(1, "Pragya", 450);
		Student stu2 = new Student(3, "Ashish", 420);
		Student stu3 = new Student(4, "pooja", 410);
		Student stu4 = new Student(2, "Ganga", 400);
		Student stu5 = new Student(1, "Pragya", 450);

		
		List<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);

		Collections.sort(list, new CompareStudent());
		
		for (Student temp : list) {
			System.out.println(temp.getRollNo());
		}

	}
	
	
	public void print(int x, String y) {
		System.out.println(x+y);
	}

}
