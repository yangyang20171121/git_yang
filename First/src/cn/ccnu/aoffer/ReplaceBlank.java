package cn.ccnu.aoffer;

import java.util.Scanner;

public class ReplaceBlank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int p1 = str.length() - 1;
		StringBuffer buffer = new StringBuffer(str);
		for (int i = 0; i <= p1; i++) {
			if (buffer.charAt(i) == ' ')
				buffer.append("  ");//追加两个空格
		}
		int p2=buffer.length()-1;
		while(p1>=0 && p2>p1){
			char c=buffer.charAt(p1--);
			if(c==' '){
				buffer.setCharAt(p2--,'0');
				buffer.setCharAt(p2--,'2');
				buffer.setCharAt(p2--,'%');
			}else{
				buffer.setCharAt(p2--,c);
			}
		}
		System.out.println(buffer.toString());
	}

}
