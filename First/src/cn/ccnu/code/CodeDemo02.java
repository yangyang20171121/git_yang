package cn.ccnu.code;
class Demo{
	private int age;
	public Demo(){
		System.out.println("2构造函数");
	}
	public Demo(int age){
		this.age=age;
	}
	{					//定义构造块
		System.out.println("1 构造块");
	}
	
}
public class CodeDemo02 {
	public static void main(String args[]){
		new Demo();
		new Demo();
		new Demo();
		new Demo(30);
	}

}
