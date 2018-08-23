package com.hp.phd.test.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.hp.phd.test.object.Person;

public class PersonMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1=new Person("ZhangSan","male",20);
		Person person2=new Person("LiSi","female",21);
		Person person3=new Person("WangWu","male",22);
		
		Map<String,Person> map=new HashMap<String,Person>();
		map.put(person1.getName(), person1);
		map.put(person2.getName(), person2);
		map.put(person3.getName(), person3);
		System.out.println(map.get("ZhangSan").getSex());
		System.out.println(map.get("ZhangSan").getAge());
		
		Iterator<Entry<String,Person>> it1=map.entrySet().iterator();
		while(it1.hasNext()){
			Entry<String,Person> entry=it1.next();
			System.out.println(entry.getKey()+" "+entry.getValue().getAge());
		}
	}

}
