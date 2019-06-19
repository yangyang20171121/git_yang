package cn.ccnu.file;

import java.io.InputStream;
//指定大小，会有空间限制
public class SystemDemo04 {
	public static void main(String args[])throws Exception{
		InputStream input=System.in;
		byte b[]=new byte[1024];
		System.out.print("请输入内容: ");
		int len=input.read(b);
		System.out.println("输入的内容为:"+new String(b,0,len));
		input.close();
	}

}
