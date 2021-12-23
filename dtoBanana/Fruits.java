package com.xworkz.inheritance.dtoBanana;

public class Fruits extends Banana{

			public String name;
			public int price;
			public String color;
			public int types;
			public boolean tasty;
		
			public Fruits() {
				this("Yellow",30);
				System.out.println("Invoking Fruits class");
			}
			public Fruits(String name,int price) {
				super();
				System.out.println(name + " " +price);
				
			}
			
			public String name(String name) {
				this.name=name;
				return name;
			}
			
			public int price(int price) {
				this.price=price;
				return price;
			}
			
			public String color(String color) {
				this.color=color;
				return color;
			}
			
			public boolean tasty(boolean tasty) {
				this.tasty=tasty;
				return tasty;
			}
			
			public int types(int types) {
				this.types=types;
				return types;
			}
		}

