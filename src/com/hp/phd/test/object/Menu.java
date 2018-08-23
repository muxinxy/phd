package com.hp.phd.test.object;

public class Menu {
	private int id;
	private String name;
	private String types;
	private String material;
	private String introduction;
	private double commonPrice;
	private int num;
	private double discountPrice;
	private int discountNum;
	private String picture;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public double getCommonPrice() {
		return commonPrice;
	}
	public void setCommonPrice(double commonPrice) {
		this.commonPrice = commonPrice;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	public int getDiscountNum() {
		return discountNum;
	}
	public void setDiscountNum(int discountNum) {
		this.discountNum = discountNum;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public Menu(int id,String name,String types,String material,String introduction,double commonPrice,int num,double discountPrice,int discountNum,String picture){
		this.id=id;
		this.name=name;
		this.types=types;
		this.material=material;
		this.introduction=introduction;
		this.commonPrice=commonPrice;
		this.num=num;
		this.discountPrice=discountPrice;
		this.discountNum=discountNum;
		this.picture=picture;
	}
	
	public Menu(){
		
	}
	
	public static void main(String[] args){
		Menu menu=new Menu();
		Menu menu2=new Menu(1, "辣子鸡", "肉", "鸡", "good", 30, 2, 24, 1, "pic.jpg");
	}
}
