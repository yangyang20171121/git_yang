package cn.ccnu.extend;

public class Person {
	private String name;
	private int age;
	public Person(){
		System.out.println("父类Person中的构造");
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	
}
