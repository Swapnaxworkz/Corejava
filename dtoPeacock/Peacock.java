package com.xworkz.inheritance.dtoPeacock;

public class Peacock {
		public byte height;
		public byte count;
	    public String color;
		public short noOfFethers;
		public float weight;
			
			
			public Peacock() {
				System.out.println("Invoking Peacock class");
			}

			public String color(String color) {
				this.color=color;
				return color;
			}
			
			public short noOfFethers(short noOfFethers) {
				this.noOfFethers=noOfFethers;
				return noOfFethers;
			}
			
			public float weight(float weight) {
				this.weight=weight;
				return weight;
			}
			
			public byte height(byte height) {
				this.height=height;
				return height;
			}
			
			public byte count(byte count) {
				this.count=count;
				return count;
			}
		}


