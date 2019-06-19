package cn.ccnu.collection;

import java.util.HashSet;
import java.util.Set;
//HashSet是Set的子类，不能存放重复的元素，且是无序的
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
