package com.hp.phd.test.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.hp.phd.test.object.Menu;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap();
		map.put("userName", "root");
		map.put("pwd", "root");
		map.put("port", 3306);
		map.put(1, "ZhangSan");
		map.put(2, "LiSi");
		map.put("port", 3307);
		/*
		 * map中获取某一key的值用get
		 * map中key是唯一的，如果对同一个key存了两次，最新的会覆盖原有的
		 */
		System.out.println(map.get("port"));
		Menu menu=new Menu(1, "红烧羊肉", "肉", "羊肉", "good", 80, 2, 70, 1, "img.jpg");
		Menu menu2=new Menu(1, "葡萄鸡丁", "肉", "鸡肉", "good", 30, 2, 25, 1, "img2.jpg");
		Menu menu3=new Menu(1, "糁汤", "汤", "羊肉", "good", 5, 2, 3, 1, "img3.jpg");
		Map<String,Menu> menuMap=new HashMap<String,Menu>();
		menuMap.put(menu.getName(), menu);
		menuMap.put(menu2.getName(), menu2);
		menuMap.put(menu3.getName(), menu3);
		System.out.println(menuMap.get("红烧羊肉").getMaterial());//直接获取key的值
		
		/*
		 * key-value称为entry
		 * 多个键值对-entry的集合：entrySet
		 * 集合框架：List,Set,Map
		 */
		Iterator<Entry<String, Menu>> it=menuMap.entrySet().iterator();
		while(it.hasNext()){
			Entry<String, Menu> entry=it.next();
			System.out.println(entry.getKey()+"@@@"+entry.getValue().getIntroduction());
		}
	}

}
