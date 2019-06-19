package cn.ccnu.xunfei;

public class Tester {
	public static void main(String[] args){
		Integer var1=new Integer(1);
		Integer var2=var1;
		doSomething(var2);
		System.out.println(var1.intValue());
		System.out.println(var1==var2);

		int it=3;
		if(it<5){
			System.out.println(it+"<5");
		}else if(it<6){
			System.out.println(it+"<6");
		}

	}
	
	public static void doSomething(Integer integer){
		integer=new Integer(2);
	}

}
