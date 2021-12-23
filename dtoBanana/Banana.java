package com.xworkz.inheritance.dtoBanana;

public class Banana{

		public String color;
		public byte width;
		public boolean healthy;
		public String type;
		public float height;
			
			public Banana() {
				System.out.println("Invoking Banana class");
			}
			
			public String color(String color) {
				this.color=color;
				return color;
			}
			
			public byte width(byte width) {
				this.width=width;
				return width;
			}
			
			public boolean healthy(boolean healthy) {
				this.healthy=healthy;
				return healthy;
			}

			public String type(String type) {
				this.type=type;
				return type;
			}
			
			public float height(float height) {
				this.height=height;
				return height;
			}
			
				}
