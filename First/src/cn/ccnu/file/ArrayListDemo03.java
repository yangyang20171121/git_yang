package cn.ccnu.file;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo03 {
	public static void main(String args[]){
		List<String> allList=new ArrayList<String>();
		allList.add("hello");
		allList.add("hello");
		allList.add(0,"World");
		allList.add("www.ccnu.edu.cn");
		System.out.println("从左往右输出：");
		for(int i=0;i<allList.size();i++){
			System.out.print(allList.get(i)+"、");
		}
		System.out.println("\n从右往左输出:");
		for(int i=allList.size()-1;i>=0;i--){
			System.out.print(allList.get(i)+"、");
		}
	}

}
