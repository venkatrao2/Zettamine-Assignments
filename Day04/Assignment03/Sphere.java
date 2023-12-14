package com.zettamine.java.day04.assignment03;

public class Sphere extends Shape implements Spatial {
	
   private double radius;
   
   
   

   public Sphere(double radius) {
	super();
	this.radius=radius;
	
}

public double getRadius() {
	return radius;
}

   public void setRadius(double radius) {
	this.radius = radius;
}

@Override
   public double area() {
  
	return (4*Math.PI*Math.pow(radius, 3))/3;
}

  @Override
   public double volume() {
     
	 return  (4*Math.PI*Math.pow(radius, 3))/3; 
}
   
   
}
