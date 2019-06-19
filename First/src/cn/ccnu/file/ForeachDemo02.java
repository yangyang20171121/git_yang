package cn.ccnu.file;

import java.util.HashMap;
import java.util.Map;

public class ForeachDemo02 {
	public static void main(String args[]){
		Map<String,String> map=new HashMap<String,String>();
		map.put("C", "English");
		map.put("A", "Chinese");
		map.put("B", "Math");
		for(Map.Entry<String, String> me:map.entrySet()){
			System.out.println(me.getKey()+"-->"+me.getValue());
		}
	}

}
