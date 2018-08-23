package com.hp.phd.test.sentence;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入1+2+...+n的n");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
			sum+=i;
		}
		System.out.println("1-"+num+"之间的和为"+sum);
	}

}
