package cn.ccnu.reflect;

public class Test1 {
	static{
		int x=5;
	}
	static int x,y;
	public static void main(String [] args){
		x--;
		System.out.println(x);
		myMethod();
		System.out.println(x+ y++ +x);
		int i=0;
		System.out.println(i+'0');
	}
	public static void myMethod(){
		y=x++ + ++x;
		System.out.println(y);
		System.out.println(x);
	}

}
