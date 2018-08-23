package com.hp.phd.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.hp.phd.test.object.Menu;

public class ListTest extends Object{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//类名可以重复，包名.类名不重复
		Menu menu=new Menu(1, "红烧羊肉", "肉", "羊肉", "good", 80, 2, 70, 1, "img.jpg");
		Menu menu2=new Menu(1, "葡萄鸡丁", "肉", "鸡肉", "good", 30, 2, 25, 1, "img2.jpg");
		Menu menu3=new Menu(1, "糁汤", "汤", "羊肉", "good", 5, 2, 3, 1, "img3.jpg");
		List menuList=new ArrayList();
		menuList.add(menu);
		menuList.add(menu2);
		menuList.add(menu3);

		Menu menu4=(Menu) menuList.get(1);
		System.out.println("menuList的大小是"+menuList.size());
		menuList.remove(menu2);
		menuList.add("ZhangSan");
		menuList.add(123);
		
		List<Menu> menuList2=new ArrayList<Menu>();
		menuList2.add(menu);
		menuList2.add(menu2);
		menuList2.add(menu3);
		
		for(int i=0;i<menuList2.size();i++){
			Menu me=menuList2.get(i);
			System.out.println(me.getName());
		}
		for(Menu m:menuList2){
			System.out.println(m.getMaterial());
			if("红烧羊肉".equals(m.getName())){
				System.out.println("找到了");
				break;
			}
		}
		Iterator<Menu> it=menuList2.iterator();//迭代器
		while(it.hasNext()){
			Menu menu5=it.next();
			System.out.println(menu5.getIntroduction());
		}
	}
}
