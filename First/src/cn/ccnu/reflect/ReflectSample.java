package cn.ccnu.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, IllegalAccessException{
		Class rc=Class.forName("cn.ccnu.reflect.Robot");//包名+源文件名（不要后缀）
		Robot r=(Robot)rc.newInstance();
		System.out.println("Class name is" +" "+ rc.getName());
		//r.sayHi("bob");
		Method getHello =rc.getDeclaredMethod("throwHello", String.class);
		getHello.setAccessible(true);
		Object str=getHello.invoke(r, "bob");
		System.out.println("getHello result is" +" "+ str);
	}

}
