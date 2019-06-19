package cn.ccnu.file;

import java.io.File;
//创建文件夹
public class FileDemo07 {
	public static void main(String args[]){
	File f=new File("f:\\ccnu");
	f.mkdir();
	}

}
