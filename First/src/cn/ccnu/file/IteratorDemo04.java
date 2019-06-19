package cn.ccnu.file;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//使用Iterator输出Map实例
public class IteratorDemo04 {
	public static void main(String args[]){
		Map<String,String> map=new HashMap<String,String>();
		map.put("C", "English");
		map.put("A", "Chinese");
		map.put("B", "Math");
		Set<Map.Entry<String,String>> allSet=map.entrySet();
		Iterator<Map.Entry<String,String>>iter=allSet.iterator();
		while(iter.hasNext()){
			Map.Entry<String,String>me=iter.next();
			System.out.println(me.getKey()+"-->"+me.getValue());
		}
		
	}

}
