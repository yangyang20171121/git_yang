package cn.ccnu.string;
//在String中使用equals()方法对内容进行比较
public class StringDemo05 {
	public static void main(String[] args){
		String str1="yangyang";
		String str2=new String("yangyang");
		String str3=str2;
		System.out.println("str1 equals str2:"+(str1.equals(str2)));
		System.out.println("str1 equals str3:"+(str1.equals(str3)));
		System.out.println("str2 equals str3:"+(str2.equals(str3)));
	}

}
