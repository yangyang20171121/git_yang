package cn.ccnu.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamDemo03 {
	public static void main(String args[])throws Exception{
		File f=new File("f:\\ccnu\\test.txt");
		InputStream input=new FileInputStream(f);
		byte b[]=new byte[(int)f.length()];
		input.read(b);
		input.close();
		System.out.println("内容为:"+new String(b));
	}

}
