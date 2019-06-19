package cn.ccnu.string;

public class StringDemo12 {
	public static void main(String args[]){
		String str="We Are Happy";
		String str1=str.replaceAll(" ", "20%");
		System.out.println(str1);
		String str2="Java技术学习班20070326";
		System.out.println(str2.replaceAll("0", ""));
		
	}

}
