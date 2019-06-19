package cn.ccnu.file;

import java.util.Scanner;

public class ScannerDemo01 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);//空格为分隔符，空格后 的内容不显示
		scan.useDelimiter("\n");//修改分隔符，把回车当做分隔符
		System.out.println("输入数据：");
		String str=scan.next();
		System.out.println("输入的数据为:"+str);
	}

}
