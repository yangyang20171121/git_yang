package cn.ccnu.file;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
//进行双向迭代
public class IteratorDemo01 {
	public static void main(String args[]){
		List<String> all=new ArrayList<String>();
		all.add("Hello");
		all.add("_");
		all.add("World");
		ListIterator<String> iter=all.listIterator();
		System.out.println("从左往右输出:");
		while(iter.hasNext()){
			String str=iter.next();
			System.out.print(str+"、");
		}
		System.out.println("\n从右往左输出:");
		while(iter.hasPrevious()){
			String str=iter.previous();
			System.out.print(str+"、");
		}
	}

}
