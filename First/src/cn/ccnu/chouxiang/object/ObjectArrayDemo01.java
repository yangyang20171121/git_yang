package cn.ccnu.chouxiang.object;

class Person{
	private String name;
	public Person(String name){
		this.name=name;
		}
	public String getName(){
		return name;
	}
}
public class ObjectArrayDemo01 {
	public static void main(String args[]){
		Person per[]=new Person[3];
		System.out.println("====数组声明====");
		for(int i=0;i<per.length;i++){
			System.out.print(per[i]+"、");
		}
		//分别为数组中的元素初始化
		per[0]=new Person("张三");
		per[1]=new Person("李四");
		per[2]=new Person("王五");
		System.out.println("\n"+"===对象实例化===");
		for(int i=0;i<per.length;i++){
			System.out.print(per[i].getName()+"、");
		}
	}
}
