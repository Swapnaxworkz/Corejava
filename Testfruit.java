package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoBanana.Banana;
import com.xworkz.inheritance.dtoBanana.Fruits;

public class Testfruit {
		public static void main(String []args) {
			
			Banana banana = new Banana();
			System.out.println(banana.color("yellow"));
			System.out.println(banana.width((byte)(30)));
			System.out.println(banana.healthy(true));
			System.out.println(banana.type("fruits"));
			System.out.println(banana.height(90.6f));
			
			Fruits fruits = new Fruits();
			
			System.out.println(fruits.color("green"));
			System.out.println(fruits.tasty(true));
			System.out.println(fruits.price(50));
			System.out.println(fruits.types(40));
			System.out.println(fruits.name("kiwi"));
		}
	}

