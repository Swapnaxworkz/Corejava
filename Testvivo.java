package com.xworkz.inheritance;

import com.xworkz.inheritance.dtovivo.Vivo;
import com.xworkz.inheritance.dtovivo.Phone;

public class Testvivo {
	
		public static void main(String []args) {
			
			    Vivo vivo = new Vivo();
				System.out.println(vivo.company("vivo"));
				System.out.println(vivo.profit((long)(30000)));
				System.out.println(vivo.founder("abc"));
				System.out.println(vivo.models(9));
				System.out.println(vivo.quality(true));
				
				Phone phone = new Phone();
				
				System.out.println(phone.color("black"));
				System.out.println(phone.height(97.3f));
				System.out.println(phone.price((long)280000));
				System.out.println(phone.width((byte)(40)));
				System.out.println(phone.name("Bagalkot"));
				
			}
	}
