package cn.ccnu.reflect;

public class People {
	int age;
	String name;
	String address;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "People [age=" + age + ", name=" + name + ", address=" + address
				+ "]";
	}
	public People(){
		
	}
	public People(int age,String name){
		this.age=age;
		this.name=name;
	}
	public void sayHello(String name){
		System.out.println(name+" say hello");
	}

}
