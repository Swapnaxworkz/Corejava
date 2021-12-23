package com.xworkz.inheritance;

import com.xworkz.inheritance.dtoAirlines.Indigo;
import com.xworkz.inheritance.dtoAirlines.Airlines;

public class Testindigo {
		public static void main(String []args) {
				
			Airlines airlines = new Airlines();
				System.out.println(airlines.place("India"));
				System.out.println(airlines.ratings(500));
				System.out.println(airlines.manager("brown"));
				System.out.println(airlines.workers(35000));
				System.out.println(airlines.safety(true));
				
				Indigo indigo = new Indigo();
				
				System.out.println(indigo.country("Banglore"));
				System.out.println(indigo.passengers(100));
				System.out.println(indigo.color("Blue"));
				System.out.println(indigo.destination(9));
				System.out.println(indigo.lowcost((false)));	
			}
		}
