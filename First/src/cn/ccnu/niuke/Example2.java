package cn.ccnu.niuke;

public class Example2 {
	public static Example2 e1=new Example2();
	{
		System.out.println("blockA");
	}
	static
	{
		System.out.println("blockB");
	}
	public static void main(String args[]){
		Example2 e2=new Example2();
	}

}
