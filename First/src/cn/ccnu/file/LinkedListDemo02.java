package cn.ccnu.file;

import java.util.LinkedList;
//找表头元素
public class LinkedListDemo02 {
	public static void main(String args[]){
		LinkedList<String> link=new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		System.out.println("1.element()方法找到表头"+link.element());
		System.out.println("1.element()操作之后链表的内容:"+link);
		System.out.println("2.peek()方法找到表头"+link.peek());
		System.out.println("2.peek()找到表头后链表的内容"+link);
		System.out.println("3.poll()方法找到表头并删除表头"+link.poll());
		System.out.println("3.poll()找完之后的链表内容:"+link);
	}

}
