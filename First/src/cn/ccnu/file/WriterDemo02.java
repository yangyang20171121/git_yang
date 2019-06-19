package cn.ccnu.file;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

//使用FileWriter追加文件的内容
public class WriterDemo02 {
	public static void main(String args[])throws Exception{
		File f=new File("f:\\ccnu\\writer.txt");
		Writer out=new FileWriter(f,true);
		String str="\r\nJava开发实战经典";
		out.write(str);
		out.close();
	}
	

}
