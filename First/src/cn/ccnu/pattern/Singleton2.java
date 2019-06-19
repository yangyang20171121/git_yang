package cn.ccnu.pattern;
//懒汉模式
public class Singleton2 {
	//1.构造方法私有化
	private Singleton2(){
		
	}
	
	//2.初始化，并没有实例化
	private static Singleton2 instance;
	
	//3.get方法
	public static Singleton2 getInstance(){
		if(instance==null){
			instance=new Singleton2();
		}
		return instance;
	}
	
	

}
