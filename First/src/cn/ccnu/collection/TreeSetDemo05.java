package cn.ccnu.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo05 {
	public static void main(String args[]){
		SortedSet<String> allSet=new TreeSet<String>();
		allSet.add("A");
		allSet.add("B");
		allSet.add("C");
		allSet.add("C");
		allSet.add("D");
		allSet.add("E");
		System.out.println("第一个元素"+allSet.first());
		System.out.println("最后一个元素"+allSet.last());
		System.out.println("headSet元素"+allSet.headSet("C"));//从开始到指定元素，不包括指定元素
		System.out.println("tailSet元素"+allSet.tailSet("C"));//从指定元素到结尾，包括指定元素
		System.out.println("subSet元素"+allSet.subSet("B", "D"));//subSet(form,to),含左不含右
	}

}
