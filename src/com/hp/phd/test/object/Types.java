package com.hp.phd.test.object;

public class Types {
	private int typeId;
	private String dishName;
	
	public int getTypeId(){
		return typeId;
	}
	
	public void setTypeId(int typeId){
		this.typeId=typeId;
	}
	
	public String getDishName(){
		return dishName;
	}
	
	public void setDishName(String dishName){
		this.dishName=dishName;
	}

	public static void main(String[] args){
		Types type1=new Types();
		System.out.println(type1.typeId);
		System.out.println(type1.dishName);
		type1.setTypeId(1);
		type1.setDishName("热菜");
		System.out.println(type1.getTypeId());
		System.out.println(type1.getDishName());
		
		Types type2=new Types();
		type2.setTypeId(2);
		type2.setDishName("凉菜");
		
	}
}