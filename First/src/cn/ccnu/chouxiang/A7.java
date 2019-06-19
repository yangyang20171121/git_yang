package cn.ccnu.chouxiang;

public class A7 implements Printable,Showable {

//	@Override
//	public void show() {
//		System.out.println("welcome!");
//		
//	}

	@Override
	public void print() {
		System.out.println("hello!");
		
	}
	public static void main(String args[]){
		A7 a=new A7();
		a.print();
//		a.show();
	}


}
