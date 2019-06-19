package cn.ccnu.file;

import java.io.InputStream;
//输入中文会有乱码，一个汉字是两个字节，此处是一个字节一个字节读的
public class SystemDemo05 {
	public static void main(String args[])throws Exception{
		InputStream input=System.in;
		StringBuffer buf=new StringBuffer();
		System.out.print("请输入内容:");
		int temp=0;
		while((temp=input.read())!=-1){
			char c=(char) temp;
			if(c=='\n'){
				break;
			}
			buf.append(c);
		}
		System.out.println("输入的内容为："+buf);
		input.close();
	}

}
