package cn.ccnu.xunfei;
import java.util.Scanner;
/*
 * 输入:37
 * 输出:19
 * 当n 为 37 时，在 1-37 范围内，以下 19 个整数可以表示成某个素数的方幂：
 * 2，3，4，5，7，8，9，11，13，16，17，19，23，25，27，29，31，32，37。
 */
public class testPrime {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag;
		int count=0;
		for(int i=2;i<=n;i++){
			flag=isPrime(i);
			if(flag){
				System.out.print(i+" ");
				count+=Math.floor(Math.log(n)/Math.log(i));
			}
		}
		System.out.println();
		System.out.println(count);
		
	}
	public static boolean isPrime(int n){
		double m=Math.sqrt(n);
		boolean flag=false;
		int i;
		for(i=2;i<=m;i++){
			if(n%i==0){
				flag=false;
				break;
			}	
		}
		if(i>m){
			flag=true;
		}
		return flag;
	}

}
