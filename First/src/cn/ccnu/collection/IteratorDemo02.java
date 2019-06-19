package cn.ccnu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo02 {
	public static void main(String args[]){
		List<String> all=new ArrayList<String>();
		all.add("hello");
		all.add("yangyang");
		all.add("world");
		Iterator<String>iterator=all.iterator();
		while(iterator.hasNext()){
			String str=iterator.next();
			if("yangyang".equals(str)){
				iterator.remove();
			}else{
				System.out.print(str+"、");
			}
		}	

	}

}
