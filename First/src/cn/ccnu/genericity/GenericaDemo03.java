package cn.ccnu.genericity;

public class GenericaDemo03 {
	public static void main(String args[]){
		Point02<String> p=new Point02<String>("李兴华");
		System.out.println("内容:"+p.getVar());
		
	}

}
