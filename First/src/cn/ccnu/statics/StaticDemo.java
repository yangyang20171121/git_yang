package cn.ccnu.statics;
class Demo{
	private static int count=0;
	public Demo(){
		count++;
		System.out.println("产生了"+count+"个对象");
	}
}
public class StaticDemo {
	public static void main(String args[]){
		new Demo();//实例化对象，调用构造函数
		new Demo();
		new Demo();
	}

}
