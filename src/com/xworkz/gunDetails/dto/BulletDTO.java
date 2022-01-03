package com.xworkz.gunDetails.dto;

public class BulletDTO {

		private float price;
		private byte weight;
		private String component;
		
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(byte weight) {
			this.weight = weight;
		}
		public String getComponent() {
			return component;
		}
		public void setComponent(String component) {
			this.component = component;
		}
		
		@Override
		public String toString() {
			return "BulletDTO [price=" + price + ", weight=" + weight + ", component=" + component + "]";
		}
		}
