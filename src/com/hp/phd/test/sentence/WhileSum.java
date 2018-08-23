package com.hp.phd.test.sentence;

public class WhileSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2,sum=0;
		while(i<=100){
			sum+=i;
			i+=2;
		}
		System.out.println("2+4+...+100="+sum);
	}

}
