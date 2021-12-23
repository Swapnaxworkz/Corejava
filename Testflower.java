package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoflower.Lotus;
import com.xworkz.inheritance.dtoflower.Flower;

public class Testflower {

		public static void main(String []args) {
			
			Lotus lotus = new Lotus();
			System.out.println(lotus.type("flower"));
			System.out.println(lotus.color("white"));
			System.out.println(lotus.price(30));
			System.out.println(lotus.favourite(true));
			System.out.println(lotus.petals(20));
			
			Flower flower = new Flower();
			
			System.out.println(flower.name("Rose"));
			System.out.println(flower.types(20));
			System.out.println(flower.height((byte)70));
			System.out.println(flower.width(10));
			System.out.println(flower.nicesmell(true));	
		}
	}

