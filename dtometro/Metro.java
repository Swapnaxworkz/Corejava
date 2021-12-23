package com.xworkz.inheritance.dtometro;

public class Metro extends Train{
			public String station;
			public int trains;
			public String color;
			public int workers;
			public boolean lift;
			
			public Metro() {
				this("Jaynagar",8);
				System.out.println("Invoking Metro class");
			}
			
			public Metro(String station,int trains) {
				super();
				System.out.println(station + " " +trains);
				
			}
			public String station(String station) {
				this.station=station;
				return station;
			}
			
			public int trains(int trains) {
				this.trains=trains;
				return trains;
			}
			
			public String color(String color) {
				this.color=color;
				return color;
			}
			
			public boolean lift(boolean lift) {
				this.lift=lift;
				return lift;
			}
			
			public int workers(int workers) {
				this.workers=workers;
				return workers;
			}
		}
