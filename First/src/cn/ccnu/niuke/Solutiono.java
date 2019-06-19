package cn.ccnu.niuke;
//找出第一次重复一次的元素的位置，不存在返回-1
public class Solutiono {
	public static int FirstNotRepeatingChar(String str){
		if(str.length()==0){
			return -1;
		}
		char c='A';
		int len='z'-'A'+1;
		int[] counts =new int[len];
		for(int i=0 ; i<str.length();i++){
			counts[str.charAt(i)-c]++;
		}
		for(int i=0;i<str.length();i++){
			if(counts[str.charAt(i)-c]==1){
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		String str = "daacabd";
		int result=FirstNotRepeatingChar(str);
		System.out.println(result);
	}

}
