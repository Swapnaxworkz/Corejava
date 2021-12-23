package com.xworkz.inheritance.dtoxworkz;

public class Institute {

			public String name;
			public String hr;
			public int placements;
			public boolean quality;
			public int classrooms;
		
			public Institute() {
				System.out.println("Invoking Institute class");
			}
			
			public String name(String name) {
				this.name=name;
				return name;
			}
			public String hr(String hr) {
				this.hr=hr;
				return hr;
			}
			
			public boolean goodquality(boolean quality) {
				this.quality=quality;
				return quality;
			}
			
			public int placements(int placements) {
				this.placements=placements;
				return placements;
			}
			public int classrooms(int classrooms) {
				this.classrooms=classrooms;
				return classrooms;
			}
		}

