package cn.ccnu.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo05 {
	public static void main(String args[]){
		List<String> allList=new ArrayList<String>();
		System.out.println("集合是否为空？"+allList.isEmpty());
		allList.add("hello");
		allList.add(0,"world");
		allList.add("MLDN");
		allList.add("www.mldn.cn");
		System.out.println(allList.contains("hello")?"\"hello\"存在":"\"hello\"不存在");
		List<String> subList=allList.subList(2, 3);
		System.out.println("集合截取");
		for(int i=0;i<subList.size();i++){
			System.out.print(subList.get(i)+"、");
		}
		System.out.println("");
		System.out.println("MLDN的位置"+allList.indexOf("MLDN"));
		System.out.println("集合操作后是否为空"+allList.isEmpty());
		}

}
