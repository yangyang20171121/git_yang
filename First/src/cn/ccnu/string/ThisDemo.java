package cn.ccnu.string;

class Person{
	public String getInfo(){
		System.out.println("Person类-->"+this);
		return null;
	}
}
public class ThisDemo {
	public static void main(String args[]){
		Person per1=new Person();
		Person per2=new Person();
		System.out.println("Main 方法-->"+per1);
		per1.getInfo();
		System.out.println("---------------");
		System.out.println("Main方法-->"+per2);
		per2.getInfo();
	}

}
