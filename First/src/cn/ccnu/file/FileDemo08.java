package cn.ccnu.file;

import java.io.File;

public class FileDemo08 {
	public static void main(String args[]){
		File f=new File("f:\\");
		File files[]=f.listFiles();
		for(int i=0;i<files.length;i++){
			System.out.println(files[i]);
		}
	}

}
