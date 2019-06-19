package cn.ccnu.file;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo02 {
	public static void main(String args[]){
		List<String> allList=new ArrayList<String>();
		allList.add("World");
		allList.add(0,"Hello");
		allList.add("yangyang");
		allList.add("how are you");
		System.out.println(allList);
		//allList.remove(0);//删除指定位置的元素
		System.out.println(allList);
		allList.remove("World");//删除元素
		System.out.println(allList);
	}

}
