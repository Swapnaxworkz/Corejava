package com.xworkz.inheritance.dtotable;

public class Table extends Wood{

			public byte width;
			public int price;
			public String color;
			public int height;
			public short weight;
			
			public Table() {
				this((byte)20,1000);
				System.out.println("Invoking Table class");
			}
			public Table(byte width,int price) {
				super();
				System.out.println(width + " " +price);
			}
			
			public byte width(byte width) {
				this.width=width;
				return width;
			}
			
			public int price(int price) {
				this.price=price;
				return price;
			}
			
			public String color(String color) {
				this.color=color;
				return color;
			}
			
			public int height(int height) {
				this.height=height;
				return height;
			}
			
			public short weight(short weight) {
				this.weight=weight;
				return weight;
			}
		}
