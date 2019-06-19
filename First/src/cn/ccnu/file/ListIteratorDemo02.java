package cn.ccnu.file;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo02 {
	public static void main(String args[]){
		List<String> all=new ArrayList<String>();
		all.add("hello");
		all.add("_");
		all.add("world");
		ListIterator<String>iter=all.listIterator();
		System.out.println("从左往右输出:");
		while(iter.hasNext()){
			String str=iter.next();
			System.out.print(str+"、");
			iter.set("happy"+str);
		}
		System.out.println("\n从右往左输出:");
		iter.add("yangyang");
		while(iter.hasPrevious()){
			String str=iter.previous();
			System.out.print(str+"、");
		}
	}

}
