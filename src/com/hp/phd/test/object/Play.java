package com.hp.phd.test.object;

public class Play {

//	public void play(Cat cat){
//		cat.shout();
//	}
//	public void play(Dog dog){
//		dog.shout();
//	}
	public void play(Animal an){
		an.shout();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an=new Animal();
		Animal cat=new Cat();//重写
		Cat cat2=new Cat();//个性化信息
		Animal dog=new Dog();
		Play play=new Play();
		play.play(an);
		play.play(cat);
		play.play(dog);
		cat2.eatFish();
		((Cat)cat2).eatFish();//强制转换
	}

}
