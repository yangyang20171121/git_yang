package cn.ccnu.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo03 {
	public static void main(String args[]){
		List<String> allList=null;
		allList=new ArrayList<String>();
		allList.add("hello");
		allList.add("hello");
		allList.add(0,"Worlds");
		allList.add("MLDN");
		allList.add("www.mldn.cn");
		System.out.println("从前往后输出：");
		for(int i=0;i<allList.size();i++){
			System.out.print(allList.get(i)+"、");
		}
	}

}
