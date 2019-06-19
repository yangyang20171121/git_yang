package cn.ccnu.file;

import java.util.LinkedList;
//FiFO方式取内容
public class LinkedListDemo03 {
	public static void main(String args[]){
		LinkedList<String> link=new LinkedList<String>();
		link.add("A");
		link.add("B");
		link.add("C");
		System.out.println("以FIFO方式输出:");
		for(int i=0;i<=link.size()+1;i++){
			System.out.print(link.poll()+"、");
		}
	}

}
