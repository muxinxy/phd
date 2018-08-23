package com.hp.phd.test.sentence;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score<=100 && score>=80){
			System.out.println("成绩优秀");
		}else if(score<80 && score>=60){
			System.out.println("成绩及格");
		}else if(score<60 && score>=0){
			System.out.println("成绩不及格");
		}else{
			System.out.println("输入不正确");
		}
	}

}
