package cn.ccnu.file;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//反转
public class CollectionDemo03 {
	public static void main(String args[]){
		List<String> all=new ArrayList<String>();
		Collections.addAll(all, "Chinese","Math","English");
		Collections.reverse(all);
		Iterator<String> iter=all.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+"、");
		}
	}

}
