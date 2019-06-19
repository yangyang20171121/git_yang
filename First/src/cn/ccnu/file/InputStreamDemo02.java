package cn.ccnu.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo02 {
	public static void main(String args[])throws Exception{
		File f=new File("f:\\ccnu\\test.txt");
		InputStream input=new FileInputStream(f);
		byte b[]=new byte[1024];
		int len=input.read(b);
		input.close();
		System.out.println("读入数据的长度:"+len);
		System.out.println("内容为:"+new String(b,0,len));
	}

}
