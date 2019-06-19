package cn.ccnu.file;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo01 {
	public static void main(String args[]){
		Map<String,String> map=null;
		map=new HashMap<String,String>();
		map.put("ctgu", "www.ctgu.edu.cn");
		map.put("ccnu", "www.ccnu.edu.cn");
		map.put("baidu", "www.baidu");
		String val=map.get("ctgu");
		System.out.println("取出的内容是:"+val);
	}

}
