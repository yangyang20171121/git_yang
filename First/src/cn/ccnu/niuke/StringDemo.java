package cn.ccnu.niuke;

public class StringDemo {
	public static final String MESSAGE="taobao";
	public static void main(String args[]){
		String a="tao"+"bao";
		String b="tao";
		String c="bao";
		System.out.println(a==MESSAGE);
		System.out.println((b+c)==MESSAGE);
	}

}
