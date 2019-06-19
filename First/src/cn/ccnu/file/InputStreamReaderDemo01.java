package cn.ccnu.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
//将字节输入流变为字符输入流
public class InputStreamReaderDemo01 {
	public static void main(String args[])throws Exception{
		File f=new File("f:\\ccnu\\test.txt");
		Reader reader=new InputStreamReader(new FileInputStream(f));
		char c[]=new char[1024];
		int len=reader.read(c);
		reader.close();
		System.out.println(new String(c,0,len));
	}

}
