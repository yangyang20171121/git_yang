package cn.ccnu.file;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo01 {
	public static void main(String args[])throws Exception{
		
			File f=new File("f:\\ccnu\\writer.txt");
			Reader reader=new FileReader(f);
			char c[]=new char[1024];
			int len=reader.read(c);
			reader.close();
			System.out.println("内容为:"+new String(c,0,len));
		}
	}


