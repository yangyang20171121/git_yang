package cn.ccnu.file;

import java.util.HashMap;
import java.util.Map;
//containsKey(Object key)、containsValue(Object value)判断指定的key或value是否存在
public class HashMapDemo02 {
	public static void main(String args[]){
		Map<String,String> map=new HashMap<String,String>();
		map.put("ctgu", "www.ctgu.edu.cn");
		map.put("ccnu", "www.ccnu.edu.cn");
		map.put("baidu", "www.baidu");
		if(map.containsKey("ccnu")){
			System.out.println("搜索的key存在");
		}else{
			System.out.println("搜索的key不存在");
		}
		if(map.containsValue("www.baidu")){
			System.out.println("搜索的value存在");
		}else{
			System.out.println("搜索的value不存在");
		}
	}

}
