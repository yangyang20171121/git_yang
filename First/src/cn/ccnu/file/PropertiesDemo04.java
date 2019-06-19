package cn.ccnu.file;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

import org.junit.Test;

//将属性保存在XML文件中
public class PropertiesDemo04 {
	@Test
	public void test(){
		Properties pro=new Properties();
		pro.setProperty("BJ","BeiJing");
		pro.setProperty("TJ", "TianJin");
		pro.setProperty("NJ", "NanJIng");
		File file=new File("f:\\ccnu\\area.xml");
		try{
			pro.storeToXML(new FileOutputStream(file),"Area Info");
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	}
		
	
	
