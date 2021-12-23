package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoxworkz.Institute;
import com.xworkz.inheritance.dtoxworkz.Xworkz;

public class Testxworkz {

	public static void main(String []args) {
			
		Institute institute = new Institute();
			System.out.println(institute.name("xworkz"));
			System.out.println(institute.hr("akshara"));
			System.out.println(institute.placements(500));
			System.out.println(institute.goodquality(true));
			System.out.println(institute.classrooms(5));
			
			Xworkz xworkz = new Xworkz();
	
			System.out.println(xworkz.founder("omkar"));
			System.out.println(xworkz.workers((byte)7));
			System.out.println(xworkz.fees((long)(30000)));	
			System.out.println(xworkz.course("java"));
			System.out.println(xworkz.batch(10));
		}
	}

