package com.hp.phd.test.sentence;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int positive=0;
		int negative=0;
		int number=sc.nextInt();
		while(number!=0){
			if(number>0)
				positive++;
			else negative++;
			number=sc.nextInt();
		}
		System.out.println("正数的个数为"+positive);
		System.out.println("负数的个数为"+negative);
	}

}
