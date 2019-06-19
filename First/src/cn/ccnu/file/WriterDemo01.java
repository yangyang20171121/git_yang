package cn.ccnu.file;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
//字符流输出Writer
public class WriterDemo01 {
	public static void main(String args[])throws Exception{
		File f=new File("f:\\ccnu\\writer.txt");
		Writer out=new FileWriter(f);
		String str="good good study, day day up";
		out.write(str);
		out.close();
		
	}

}
