package cn.ccnu.file;

import java.io.FileOutputStream;
import java.io.PrintStream;

//为System.out输出重定向
public class SystemDemo06 {
	public static void main(String args[])throws Exception{
		//System.out输出重定向，输出时，不再向屏幕上输出，而是向指定的重定向位置输出
		System.setOut(new PrintStream(new FileOutputStream("f:\\ccnu\\text01.txt")));
		System.out.print("www.ccnu.edu.cn");
		System.out.println(",洋洋");
	}

}
