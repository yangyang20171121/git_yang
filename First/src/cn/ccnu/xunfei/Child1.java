package cn.ccnu.xunfei;

public class Child1 extends Father {
	public Child1(){
		System.out.println("我是子类");
	}
	public static void main(String[] args){
		Father a=new Father();
		Child1 b=new Child1();
	}

}
