package cn.ccnu.offers;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String [] str=sc.nextLine().split(" ");
		int [] num=new int[str.length];
		for(int i=0;i<str.length;i++)
			num[i]=Integer.parseInt(str[i]);
		int m=getDuplicate(num);
		System.out.println(m);
	}
	public static int getDuplicate(int [] num){
		int m;
		if(num==null || num.length==0)
			return -1;
		for(int i=0;i<num.length;i++){
			while(num[i]!=i){
				if(num[i]==num[num[i]]);
				m=num[i];
				return m;
			}
			int temp=num[i];
			num[i]=num[temp];
			num[temp]=temp;
		}
		return -1;
	}

}
