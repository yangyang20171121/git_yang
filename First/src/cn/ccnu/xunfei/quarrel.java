package cn.ccnu.xunfei;

import java.util.Scanner;

public class quarrel {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		char[] chars=str.toCharArray();
		int r=-1;
		int l=-1;
		for(int i=0;i<chars.length;i++){
			if(chars[i]=='R'){
				r=i;
				break;
			}
		}
		for(int i=chars.length-1;i>=0;i--){
			if(chars[i]=='L'){
				l=i;
				break;
			}
		}
		
		System.out.println(chars.length-(l-r));
	}

}
