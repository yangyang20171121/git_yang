package cn.ccnu.file;

import java.io.File;
//删除文件
public class FileDemo04 {
	public static void main(String args[]){
		File f=new File("d:\\test.txt");
		f.delete();
	}

}
