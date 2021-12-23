package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoforest.Nagarahole;
import com.xworkz.inheritance.dtoforest.Forest;

public class Testforest {

	public static void main(String []args) {
			
		Nagarahole nagarahole = new Nagarahole();
			System.out.println(nagarahole.type("Forest"));
			System.out.println(nagarahole.animals(170));
			System.out.println(nagarahole.place("Nagarahole"));
			System.out.println(nagarahole.birds(300));
			System.out.println(nagarahole.goodmaintenance(true));
			
			Forest forest = new Forest();
			
			System.out.println(forest.country("India"));
			System.out.println(forest.animals(360));
			System.out.println(forest.name("Bandipura"));
			System.out.println(forest.trees(570));
			System.out.println(forest.rainy(true));	
		}
	}
