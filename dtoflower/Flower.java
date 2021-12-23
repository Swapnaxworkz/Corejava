package com.xworkz.inheritance.dtoflower;

public class Flower extends Lotus {
			public String name;
			public int types;
			public byte height;
			public int width;
			public boolean nicesmell;
			
			public Flower() {
				this("Rose",20);
				System.out.println("Invoking Flower class");
			}
			
			public Flower(String name,int types) {
				super();
				System.out.println(name + " " +types);
				
			}
			
			public String name(String name) {
				this.name=name;
				return name;
			}
			
			public int types(int types) {
				this.types=types;
				return types;
			}
			
			public byte height(byte height) {
				this.height=height;
				return height;
			}
			public int width(int width) {
				this.width=width;
				return width;
			}
			public boolean nicesmell(boolean nicesmell) {
				this.nicesmell=nicesmell;
				return nicesmell;
			}
		}

