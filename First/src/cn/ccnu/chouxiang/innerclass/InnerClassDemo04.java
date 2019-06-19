package cn.ccnu.chouxiang.innerclass;

class Outer1{
	private String info="hello world!";
	class Inner{
		public void print(){
			System.out.println(info);
		}	
	}
}
public class InnerClassDemo04 {
	public static void main(String args[]){
		Outer1 out=new Outer1();
		Outer1.Inner in=out.new Inner();
		in.print();
	}

}
