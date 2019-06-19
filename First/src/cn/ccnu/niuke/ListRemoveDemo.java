package cn.ccnu.niuke;

import java.util.ArrayList;
import java.util.List;
//会出现越界的情况
public class ListRemoveDemo {
	public static void main(String args[]){
		List<Integer> numberList=new ArrayList<Integer>();
		numberList.add(2);
		numberList.add(4);
		numberList.add(1);
		numberList.add(3);
		numberList.add(5);
		for(int i=0;i<numberList.size();++i){
			int v=numberList.get(i);
			if(v%2==0){
				numberList.remove(v);
			}		
		}
		System.out.println(numberList);
	}

}
