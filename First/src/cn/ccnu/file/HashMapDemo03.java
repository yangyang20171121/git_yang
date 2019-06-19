package cn.ccnu.file;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//keySet()方法，可以将Map接口中key变为一个set集合
public class HashMapDemo03 {
	public static void main(String args[]){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"one");
		map.put(2, "two");
		map.put(3,"three");
		Set<Integer> keys=map.keySet();
		Iterator<Integer> iter=keys.iterator();
		System.out.print("全部的key:");
		while(iter.hasNext()){
			int next=iter.next();
			System.out.print(next+"、");
			
		}
	}

}
