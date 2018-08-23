package com.hp.phd.test.object;

public class Add {
	
	public int add(int a,int b){
		return a+b;
	}

	public double add(double a,double b){
		return a+b;
	}
	
	public int add(int a,int b,int c){
		return a+b+c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add addObject=new Add();
		double result1=addObject.add(1.5, 2.5);
		double result2=addObject.add(2, 1.5);
		int result3=addObject.add(1, 2);
		int result4=addObject.add(1,2,3);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
