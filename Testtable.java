package com.xworkz.inheritance;

import com.xworkz.inheritance.dtotable.Table;
import com.xworkz.inheritance.dtotable.Wood;

public class Testtable {

		public static void main(String []args) {
			
			Table table = new Table();
				System.out.println(table.width((byte)(20)));
				System.out.println(table.price(1000));
				System.out.println(table.color("gray"));
				System.out.println(table.height(40));
				System.out.println(table.weight((short)(50)));
				
				Wood wood = new Wood();
				
				System.out.println(wood.name("chair"));
				System.out.println(wood.types(20));
				System.out.println(wood.color("gray"));
				System.out.println(wood.cost(2000));
				System.out.println(wood.helpful(true));	
			}
	}

