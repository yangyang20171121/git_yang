package cn.ccnu.xunfei;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		double sum=0;
		int m=0;
		while(scanner.hasNextDouble()){
			double x=scanner.nextDouble();
			m+=1;
			sum+=x;
		}
		System.out.println(m+"个数的和为"+sum);
		System.out.println(m+"个数的平均数为"+sum/m);
	}

}
