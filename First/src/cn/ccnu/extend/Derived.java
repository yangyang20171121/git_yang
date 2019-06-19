package cn.ccnu.extend;
class Base{
	public Base(String s){
		System.out.println("B");
	}
}
public class Derived  {
	
	public Derived(String s){
		System.out.println("D");
	}
	public static void main(String args[]){
		new Derived("c");
	}

}
