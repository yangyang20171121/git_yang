package cn.ccnu.reflect;

import org.junit.Test;

public class Test2 {
	@Test
	public void test1() {
		int j = 0;
		for (int i = 0; i < 100; i++) {
			j = j++;
		}
		int t = "abc".length();
		char c = 17;

		System.out.println(c);
		System.out.println(t);
		System.out.println(j);
	}

	@Test
	public void autoIncrement(){
		int i=0;
		i=i++ + ++i;
		int j=0;
		j=++j+j+++j+++j++;
		int k=0;
		k=k++ + k++ + k++ + ++k;
		int h=0;
		h=++h + ++h;
		int p1=0,p2=0;
		int q1=0,q2=0;
		q1=++p1;
		q2=p2++;

		System.out.println("i "+i);
		System.out.println("j "+j);
		System.out.println("k "+k);
		System.out.println("h "+h);
		System.out.println("p1 "+p1);
		System.out.println("p2 "+p2);
		System.out.println("q1 "+q1);
		System.out.println("q2 "+q2);
		
	}
	@Test
	public void testPrecision(){
		int a=5;
		//因为前面10.9的存在，9会自动转型为9.0
		System.out.println("value is "+((a<5)?10.9:9));
	}
	@Test
	public void test44_4(){
		char x='x';
		int i=10;
		System.out.println(false?i:x);
		System.out.println(false?10:x);
	}
	@Test
	public void callByValue(boolean test){
		test=!test;
		System.out.println("In test(boolean):test="+test);
	}
	@Test
	public void callByInference(StringBuffer str){
		str.append(",World!");
	}
}
