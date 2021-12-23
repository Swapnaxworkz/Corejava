package com.xworkz.inheritance;

import com.xworkz.inheritance.dtometro.Metro;
import com.xworkz.inheritance.dtometro.Train;

public class Testmetro {
	public static void main(String []args) {
			
		Metro metro = new Metro();
			
			System.out.println(metro.station("Jaynagar"));
			System.out.println(metro.trains(8));
			System.out.println(metro.color("blue"));
			System.out.println(metro.workers(50));
			System.out.println(metro.lift(true));
			
			Train train = new Train();
			
			System.out.println(train.passengers((short)100));
			System.out.println(train.length((byte)(50)));
			System.out.println(train.route("Rajajinagar"));
			System.out.println(train.color("white"));
			System.out.println(train.speed(97.7f));
			
		}
	}

