package cn.ccnu.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestPeople {
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException,
			NoSuchMethodException, SecurityException, IllegalArgumentException,
			InvocationTargetException {
		// 获取类的Class对象，方法一 Class.forName("类的全路径名");
		//Class c = Class.forName("cn.ccnu.reflect.People");

		// 方法二:类的class属性
		// Class c=People.class;

		// 方法三:调用对象的getClass()方法
		People people=new People();
		 Class c=people.getClass();
		
		
		//实例化对象，方法一:
		People p = (People) c.newInstance();//newInstance实例化对象,要求类要有无参构造方法
//		p.sayHello("yangyang");
		
//		Constructor cons=c.getConstructor(int.class,String.class);
//		People p1=(People) cons.newInstance(24,"小哈");		
//		System.out.println(p1.toString());

		Method m = c.getMethod("sayHello", String.class);
		m.invoke(p, "xiaotian");
		System.out.println(c.getName());
		c.getDeclaredMethod("setAge", int.class).invoke(p, 18);
		System.out.println(p);
		
		System.out.printf("%+.2f",10000.0/3.0);
		
		
	}

}
