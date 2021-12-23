package com.xworkz.inheritance.dtoforest;

public class Forest {
			public String country;
			public int animals;
			public String name;
			public int trees;
			public boolean rainy;
			
			public Forest() {
				this("India",360);
				System.out.println("Invoking Forest class");
			}
			
			public Forest(String country,int animals) {
				super();
				System.out.println(name + " " +animals);
				
			}
			public String country(String country) {
				this.country=country;
				return country;
			}
			
			public int animals(int animals) {
				this.animals=animals;
				return animals;
			}
			
			public String name(String name) {
				this.name=name;
				return name;
			}
			
			public boolean rainy(boolean rainy) {
				this.rainy=rainy;
				return rainy;
			}
			
			public int trees(int trees) {
				this.trees=trees;
				return trees;
			}
		}


