package com.xworkz.inheritance.dtoPeacock;

public class Birds extends Peacock{
	        public String color;
			public float flyingDistance;
			public String species;
			public boolean laysEgg;
			public boolean swim;
			
			public Birds() {
				this("gray",7.5f);
				System.out.println("Invoking Birds class");
			}
			public Birds(String color,float flyingDistance) {
				super();
				System.out.println(species + " " +flyingDistance);
				
			}
			public String species(String species) {
				this.species=species;
				return species;
			}
			
			public float flyingDistance(float flyingDistance) {
				this.flyingDistance=flyingDistance;
				return flyingDistance;
			}
			
			public String color(String color) {
				this.color=color;
				return color;
			}
			
			public boolean laysEgg(boolean laysEgg) {
				this.laysEgg=laysEgg;
				return laysEgg;
			}
			
			public boolean swim(boolean swim) {
				this.swim=swim;
				return swim;
			}
		}


