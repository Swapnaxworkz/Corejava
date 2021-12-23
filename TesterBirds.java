package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoPeacock.Peacock;
import com.xworkz.inheritance.dtoPeacock.Birds;

public class TesterBirds {	
		public static void main(String []args) {
			
			Birds birds = new Birds();
			System.out.println(birds.color("gray"));
			System.out.println(birds.flyingDistance(7.5f));
			System.out.println(birds.species("9.9f"));
			System.out.println(birds.laysEgg(true));
			System.out.println(birds.swim(false));
			
			Peacock peacock = new Peacock();
			
			System.out.println(peacock.height((byte)(4)));
			System.out.println(peacock.count((byte)(50)));
			System.out.println(peacock.color("green"));
			System.out.println(peacock.weight(5.5f));
			System.out.println(peacock.noOfFethers((short)6000));
		}
	}

