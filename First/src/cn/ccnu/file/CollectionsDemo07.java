package cn.ccnu.file;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo07 {
	public static void main(String args[]){
		List<String> all=new ArrayList<String>();
		Collections.addAll(all,"1.Chinese","2.Math","3.English");
		System.out.print("交换之前的集合：");
		Iterator<String>iter=all.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+"、");
		}
		Collections.swap(all, 0, 2);//交换指定位置的内容
		System.out.print("\n交换之后的集合");
		iter=all.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+"、");
		}
	}

}
