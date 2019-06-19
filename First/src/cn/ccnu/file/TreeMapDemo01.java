package cn.ccnu.file;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo01 {
	public static void main(String args[]){
		Map<String,String> map=new TreeMap<String,String>();
		map.put("C", "English");
		map.put("A", "Chinese");
		map.put("B", "Math");
		Set<String> keys=map.keySet();
		Iterator<String> iter=keys.iterator();
		while(iter.hasNext()){
			String str=iter.next();
			System.out.println(str+"-->"+map.get(str));
		}
		
	}

}
