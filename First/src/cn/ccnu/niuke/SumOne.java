package cn.ccnu.niuke;

import java.util.Scanner;

public class SumOne {
	public static boolean Normal(int n){
		
		if(n>1 && n<10)
			return false;	
		int m=n;
		int temp;
		int sum=0;
		while(m!=0){
			temp=m%10;
			sum=sum+temp*temp;
			m/=10;
		}
		if(sum==1){
			return true;
		}
		return Normal(sum);
				
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=Normal(n);
		System.out.println(flag);
		
		
	}

}
