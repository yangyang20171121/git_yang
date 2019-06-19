package cn.ccnu.inner;
//方法中的内部类，不能直接访问方法中的参数，如果方法中的参数要想被内部类访问
//则参数前必须加上final关键字
public class Outer {
	private String info="hello";
	public void fun(final int temp){
		class Inner{
			public void print(){
				System.out.println("类中的属性:"+info);
				System.out.println("方法中的参数:"+temp);
			}
		}
		new Inner().print();
	}
}
