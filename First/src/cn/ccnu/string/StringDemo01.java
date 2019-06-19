package cn.ccnu.string;

public class StringDemo01 {
	public static void main(String args[]){
		String str1="hello";
		char c[]=str1.toCharArray();
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+"\t");
		}
		System.out.println("");
		String str2=new String(c);
		String str3=new String(c,0,3);
		System.out.println(str2);
		System.out.println(str3);
	}

}
