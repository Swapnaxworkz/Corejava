package com.xworkz.inheritance.dtoxworkz;

public class Xworkz extends Institute {

			public String founder;
			public byte workers;
			public long fees;
			public String course;
			public int batch;
	
			public Xworkz() {
				this("omkar",(long)7);
				System.out.println("Invoking Xworkz class");
			}
			public Xworkz(String founder,long workers) {
				super();
				System.out.println(founder + " " +workers);
			}
			public String founder(String founder) {
				this.founder=founder;
				return founder;
			}
			
			public int workers(byte workers) {
				this.workers=workers;
				return workers;
			}
			
			public long fees(long fees) {
				this.fees=fees;
				return fees;
			}

			public String course(String course) {
				this.course=course;
				return course;
			}
			
			public int batch(int batch) {
				this.batch=batch;
				return batch;
			}
			
	}

