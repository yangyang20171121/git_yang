package cn.ccnu.file;

import java.util.Stack;

public class StackDemo {
	public static void main(String args[]){
		Stack<String> s=new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		while(!s.empty()){
			System.out.print(s.pop()+"、");
		}
	}

}
