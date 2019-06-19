package cn.ccnu.xunfei;

//class A {
//	public A() {
//		System.out.println("class A");
//	}
//
//	{
//		System.out.println("I'm A class");
//	}
//	static {
//		System.out.println("class A static");
//	}
//}

public class B extends A {
	public B() {

		System.out.println("class B");

	}

	{
		System.out.println("I'm B class");
	}

	static {
		System.out.println("class B static");
	}
	static{
		System.out.println("class B2 static");
	}

	public static void main(String[] args) {
		int a=100;
		int b=50;
		int c=a-(--b);
		int d=a-(--b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		new B();
		int i=5;
		int s=(i++)+(++i)+(i--)+(--i);
		System.out.println(s);
		

	}

}
