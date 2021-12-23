package com.xworkz.inheritance.dtoAirlines;

public class Indigo extends Airlines{
			public String country;
			public int passengers;
			public String color;
			public int destination;
			public boolean lowcost;
			
			public Indigo() 
			{
				this("India",500);
				System.out.println("Invoking Indigo class");
			}
			public Indigo(String country,int passangers) {
				super();
				System.out.println(country + " " +passangers);
				
			}
			public String country(String country) {
				this.country=country;
				return country;
			}
			
			public int passengers(int passengers) {
				this.passengers=passengers;
				return passengers;
			}
			
			public String color(String color) {
				this.color=color;
				return color;
			}
			
			public boolean lowcost(boolean lowcost) {
				this.lowcost=lowcost;
				return lowcost;
			}
			
			public int destination(int destination) {
				this.destination=destination;
				return destination;
			}
		}


