package cn.ccnu.thiss;

public class Person {
	private String name;
	private int age;
	public Person(){
		System.out.println("一个新的Person对象被实例化");
	}
	public Person(String name,int age){
		this();
		this.name=name;
		this.age=age;
	}
	public String getInfo(){
		return "姓名:"+ name +",年龄:"+age;
	}

}
