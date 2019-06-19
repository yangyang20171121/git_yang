package cn.ccnu.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
//将字符输出流编程字节输出流
public class OutputStreamWriterDemo01 {
	public static void main(String args[])throws Exception{
		File f=new File("f:\\ccnu\\test.txt");
		Writer out=new OutputStreamWriter(new FileOutputStream(f,true));
		out.write("将字符输出流编程字节输出流");
		out.close();
	}

}
