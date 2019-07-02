package cn.ccnu.reflect;

public class Demo2 {
	public static void main(String[] args){
		boolean test=true;
		System.out.println("Before test(boolean):test= "+test);
		Test2 t=new Test2();
		t.callByValue(test);
		System.out.println("After test(boolean):test= "+test);
		
		StringBuffer str=new StringBuffer("Hello");
		t.callByInference(str);
		System.out.println(str);
	}

}
