package cn.ccnu.io1;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class FileDemo01 {
	@Test
	public void testCreateNewFile(){
		File f=new File("f:\\ccnu\\test01.txt");
		try{
			f.createNewFile();
		}catch(IOException e){
			e.printStackTrace();
			
		}
	}

}
