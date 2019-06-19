package cn.ccnu.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApple {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class c=Class.forName("cn.ccnu.fanshe.Apple");
//		Method method=c.getMethod("setPrice", int.class);
//		Constructor constructor=c.getConstructor();
//		Object o=constructor.newInstance();
//		method.invoke(o, 1000);
//		Method method1=c.getMethod("getPrice");
//		System.out.println(method1.invoke(o));
		
		//获取Apple类的所有方法
		Method [] m=c.getDeclaredMethods();
		for(Method i:m){
			System.out.println(i.toString());
		}
		
		//获取Apple类的属性
		Field[] fields=c.getDeclaredFields();
		for(Field i:fields){
			System.out.println(i);
		}
		
		
		
	}

}
