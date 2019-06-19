package cn.ccnu.file;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;
//保存属性到普通文件中
public class PropertiesDemo02 {
	public static void main(String args[]){
		Properties pro=new Properties();
		pro.setProperty("BJ", "BeiJing");
		pro.setProperty("TJ", "TianJing");
		pro.setProperty("NJ", "NanJing");
		File file=new File("f:\\ccnu\\area.properties");
		try{
			pro.store(new FileOutputStream(file), "Area Info");
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
