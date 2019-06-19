package cn.ccnu.xunfei;

import java.util.Scanner;

public class ForSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();// 清除缓存区
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}
		for (int i = 0; i < n; i++) {
			if (str[i].length() <10) {
				System.out.println(str[i]);
			}else{
				int len=str[i].length()-2;
//				System.out.print(str[i].charAt(0));
//				System.out.print(str[i].length()-2);
//				System.out.print(str[i].charAt(str[i].length()-1));
				System.out.println(str[i].charAt(0)+""+len+str[i].charAt(str[i].length()-1));
				
			}
			System.out.println(Math.floor(Math.log(37)/Math.log(5)));
		}
	}

}
