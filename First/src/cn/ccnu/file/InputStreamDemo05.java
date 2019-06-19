package cn.ccnu.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo05 {
	public static void main(String args[])throws Exception{
		File f=new File("f:\\ccnu\\test.txt");
		InputStream input=new FileInputStream(f);
		int len=0;
		byte b[]=new byte[1024];
		int temp=0;
		while((temp=input.read())!=-1){
			b[len]=(byte)temp;
			len++;
		}
		input.close();
		System.out.println("内容为："+new String(b,0,len));
	}

}
