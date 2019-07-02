package cn.ccnu.interviewguide;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ZuHe {
	public static void main(String[] args){
		String [] str={"1","2"};
		listAll(Arrays.asList(str),"");
		for(int i=0;i<=10;i++){
			Integer k=new Integer(i);
		}			
		System.out.println("hello world");
		
		
	}
	public static void listAll(List candidate,String prefix){
		System.out.println(prefix);
		for(int i=0;i<candidate.size();i++){
			List temp=new LinkedList(candidate);
			listAll(temp,prefix+temp.remove(i));
		}
	}

}
