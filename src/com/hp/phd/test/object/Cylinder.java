package com.hp.phd.test.object;

public class Cylinder extends Circle{
	private double height=1;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double findVolume(){
		return findArea()*height;
	}
	public static void main(String[] args){
		Cylinder cy=new Cylinder();
		cy.setRadius(2);
		cy.setHeight(2);
		System.out.println(cy.findVolume());
	}
}
