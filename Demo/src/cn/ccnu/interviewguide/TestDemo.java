package cn.ccnu.interviewguide;

import org.junit.Test;

public class TestDemo {
	@Test
	public void testFatherAndChild(){
		Father father=new Father();
		Child child=new Child();
		System.out.println(father.getName());
		System.out.println(child.getName());
	}
	
	@Test
	public void testFather1AndChild1(){
		Father1 f1=new Father1();
		Child1 c1=new Child1();
		System.out.println(f1.getName());
		System.out.println(c1.getName());
	}

}
