package cn.ccnu.file;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo01 {
	public static void main(String args[]){
		List<String> allList=new ArrayList<String>();
		Collection<String> allCollection=new ArrayList<String>();
		allList.add("World");
		allList.add(0, "Hello");//在指定位置插入一个元素
		System.out.println("allList:"+allList);
		allCollection.add("cn.ccnu");
		allCollection.add("yangyang");
		allList.addAll(allCollection);//插入一组元素
		allList.addAll(0,allCollection);
		System.out.println(allList);
	}

}
