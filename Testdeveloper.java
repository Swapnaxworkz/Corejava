package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoDeveloper.Developer;
import com.xworkz.inheritance.dtoDeveloper.Employee;

public class Testdeveloper {
		public static void main(String []args) {
			
			Developer developer = new Developer();
			System.out.println(developer.type("Python"));
			System.out.println(developer.salary((long)(70000)));
			System.out.println(developer.company("TCS"));
			System.out.println(developer.servicebond(2));
			System.out.println(developer.future(true));
			
			Employee employee = new Employee();
			
			System.out.println(employee.name("Roopa"));
			System.out.println(employee.contact((long)(986754328)));
			System.out.println(employee.address("Banglore"));
			System.out.println(employee.gender('F'));
			System.out.println(employee.goodjob(true));
		}
	}

