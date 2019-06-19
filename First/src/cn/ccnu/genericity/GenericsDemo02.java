package cn.ccnu.genericity;

public class GenericsDemo02 {
	public static void main(String args[]){
//		Point01<Integer> p=new Point01<Integer>();
//		p.setVar(20);
//		System.out.println(p.getVar());
		
		Point01<String> p=new Point01<String>();
		p.setVar("李兴华");
		System.out.println(p.getVar().length());
		
		
	}

}
