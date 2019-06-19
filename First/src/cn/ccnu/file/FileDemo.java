package cn.ccnu.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String args[]){
	File file=new File("f:\\ccnu\\first.txt");
	try{
		file.createNewFile();
	}catch(IOException e){
		e.printStackTrace();
	}
	}

}
