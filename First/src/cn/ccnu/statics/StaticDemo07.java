package cn.ccnu.statics;
class Demo1{
	private String name;
	private static int count=0;
	public Demo1(){
		count++;
		this.name="Demo_"+count;
	}
	public Demo1(String name){
		this.name=name;
		}
	public String getName(){
		return this.name;
	}
	
}
public class StaticDemo07 {
	public static void main(String args[]){
	Demo1 d1=new Demo1();
	Demo1 d2=new Demo1("yangyang");
	Demo1 d3=new Demo1();
	Demo1 d4=new Demo1("xiaowen");
	System.out.println(d1.getName());//ctrl+alt+向下箭头：向下复制
	System.out.println(d2.getName());
	System.out.println(d3.getName());
	System.out.println(d4.getName());
	}
	

}
