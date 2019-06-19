package cn.ccnu.pattern;

//饿汉模式
public class Singleton1 {
	//1.构造方法私有化
	private Singleton1(){
		
	}
	//2.实例化，静态成员，类加载时就实例化
	private static Singleton1 instance=new Singleton1();
	//3.get方法
	public static Singleton1 getInstance(){
		return instance;
	}

}
