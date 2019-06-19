
package cn.ccnu.file;

import java.util.HashSet;
import java.util.Set;
//HashSet散列存储，没有顺序
public class HashSetDemo01 {
	public static void main(String args[]){
		Set<String> allSet=new HashSet<String>();
		allSet.add("A");
		allSet.add("B");
		allSet.add("C");
		allSet.add("C");
		allSet.add("D");
		allSet.add("E");
		System.out.println(allSet);
	}
}
