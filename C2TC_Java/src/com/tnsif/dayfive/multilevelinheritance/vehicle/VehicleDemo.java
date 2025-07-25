package com.tnsif.dayfive.multilevelinheritance.vehicle;

public class VehicleDemo {

		public static void main(String[] args) {
			Car c;
			c=new Car();
			c.vehicleType();
			
			Maruthi m=new Maruthi();
			m.vehicleType();
			m.brand();
			m.speed();
			
			Maruthi800 m1=new Maruthi800();
			m1.vehicleType();
			m1.brand();
			m1.speed();
			
			
		}

	}


