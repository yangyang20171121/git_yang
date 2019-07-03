package cn.ccnu.offers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 *  针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： 
 *  {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}，
 *  {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， 
 * {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 * @author Administrator
 *
 */

public class MaxValues {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String [] str=sc.nextLine().split(" ");	
		//数组
		int [] num=new int[str.length];
		for(int i=0;i<str.length;i++){
			num[i]=Integer.parseInt(str[i]);
		}
		//滑窗大小
		int size=sc.nextInt();
		ArrayList<Integer> array=new ArrayList<Integer>();
		array=maxInWindow(num, size);
		for (int i = 0; i < array.size(); i++) {
			System.out.print(array.get(i)+" ");
		}
	}
	public static ArrayList<Integer> maxInWindow(int [] num,int size){
		ArrayList<Integer> array=new ArrayList<Integer>();
		int max;
		for(int i=0;i<num.length;i++){
			if(i+size>num.length)
				break;
			max=num[i];
			for(int j=i;j<i+size;j++){
				if(num[j]>max)
					max=num[j];
			}
			array.add(max);//保存每一轮的最大值
		}
		return array;
	}

}
