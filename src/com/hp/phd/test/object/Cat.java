package com.hp.phd.test.object;

public class Cat extends Animal{
	public void shout(){
		System.out.println("miao~");
	}
	public void eatFish(){
		System.out.println("eat fish");
	}
	public static void main(String[] args){
		Cat cat=new Cat();
		cat.shout();
		Animal cat2=new Cat();
		cat2.shout();
		Animal cat3=new Animal();
		cat3.shout();
	}
}
