package cn.ccnu.array;

public class NewDemo01 {
	public static void main(String args[]){
		System.out.println("不传递参数（fun()）:");
		fun();
		System.out.println("传递一个参数（fun(1)）:");
		fun(1);
		System.out.println("传递五个参数（fun(1,2,3,4,5)）:");
		fun(1,2,3,4,5);
	}
	public static void fun(int... arg){
		for(int i=0;i<arg.length;i++)
			System.out.print(arg[i]+"、");
		
	}

}
