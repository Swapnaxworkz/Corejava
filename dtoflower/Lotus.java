package com.xworkz.inheritance.dtoflower;

public class Lotus {
			public String type;
			public String color;
			public int price;
			public boolean favourite;
			public int petals;
			
			public Lotus() {
				System.out.println("Invoking Lotus class");
			}
			
			public String type(String type) {
				this.type=type;
				return type;
			}
			public String color(String color) {
				this.color=color;
				return color;
			}
			public int price(int price) {
				this.price=price;
				return price;
			}
			public boolean favourite(boolean favourite) {
				this.favourite=favourite;
				return favourite;
			}
			public int petals(int petals) {
				this.petals=petals;
				return petals;
			}
		}

