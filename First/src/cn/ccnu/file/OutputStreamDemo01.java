package cn.ccnu.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
//向文件中写入字符串
public class OutputStreamDemo01 {
	public static void main(String[] args)throws Exception{
		File f=new File("f:\\ccnu\\test.txt");
		OutputStream out=new FileOutputStream(f,true);
		String str="\r\nhello yangyang!!";
		byte[] b=str.getBytes();
		out.write(b);
		out.close();
	}

}
