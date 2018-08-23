package com.hp.phd.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hp.phd.test.object.Person;

public class PersonListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1=new Person("ZhangSan","male",20);
		Person person2=new Person("LiSi","female",21);
		Person person3=new Person("WangWu","male",22);
		
		List<Person> personList=new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		
		Person person4=personList.get(0);
		
		for(int i=0;i<personList.size();i++){
			System.out.println("name:"+personList.get(i).getName());
			System.out.println("age:"+personList.get(i).getAge());
			if(personList.get(i).getName().equals("ZhangSan")){
				System.out.println("found");
			}
		}
		
		for(Person p:personList){
			System.out.println("name:"+p.getName());
			System.out.println("age:"+p.getAge());
			if(p.getName().equals("ZhangSan")){
				System.out.println("found");
			}
		}
		
		Iterator<Person> it=personList.iterator();
		while(it.hasNext()){
			Person person=it.next();
			System.out.println("name:"+person.getName());
			System.out.println("age:"+person.getAge());
			if(person.getName().equals("ZhangSan")){
				System.out.println("found");
			}
		}
	}

}
