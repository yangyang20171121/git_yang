package cn.ccnu.pattern;
//饿汉模式类加载时慢，运行时获取对象快，线程安全
//懒汉模式类加载时快，运行时获取对象慢,线程不安全
public class SingletonTest {
	public static void main(String[] args) {
		Singleton1 s1=Singleton1.getInstance();
		Singleton1 s2=Singleton1.getInstance();
		if(s1==s2){
			System.out.println("s1和s2是同一个实例");
		}else{
			System.out.println("s1和s2不是同一实例");
		}
		
		Singleton2 s3=Singleton2.getInstance();
		Singleton2 s4=Singleton2.getInstance();
		if(s3==s4){
			System.out.println("s3和s4是同一个实例");
		}else{
			System.out.println("s3和s4不是同一实例");
		}
		
	}
	
}
