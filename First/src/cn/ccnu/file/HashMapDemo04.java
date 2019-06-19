package cn.ccnu.file;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo04 {
	public static void main(String args[]){
		Map<String,String> map=new HashMap<String,String>();
		map.put("mldn", "www.mldn.cn");
		map.put("ctgu", "www.ctgu.cn");
		map.put("ccnu", "www.ccnu.cn");
		Collection<String> values=map.values();
		Iterator<String>iter=values.iterator();
		System.out.println("全部的value:");
		while(iter.hasNext()){
			String str=iter.next();
			System.out.print(str+"、");
		}
	}

}
